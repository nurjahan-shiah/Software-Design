package gui;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import data.UserDAO;
import model.*;
import pattern.singleton.HeadLabCoordinatorSingleton;

public class CoordinatorDashboardPanel extends ManagerDashboardPanel {
    private static final long serialVersionUID = 1L;

    private DefaultTableModel allUsersModel;
    private JTable allUsersTable;
    private JTextField genID, genName, genEmail, genDept;
    private JLabel coordInfo;

    public CoordinatorDashboardPanel(MainFrame frame) {
        super(frame, false); // don't call build() yet
        build();
    }

    @Override
    public void refresh() {
        try { equipDAO.load(); userDAO.load(); bookDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        if (currentUser != null && coordInfo != null)
            coordInfo.setText("  Head Lab Coordinator  |  " + currentUser.getName());
        refreshEquip();
        refreshPending();
        refreshAllBookings();
        refreshAllUsers();
    }

    @Override
    protected void build() {
        setBackground(UI.BG);
        setLayout(new BorderLayout());

        JButton logout = UI.button("Logout", UI.DANGER);
        logout.addActionListener(e -> getFrame().showPanel(MainFrame.LOGIN));
        coordInfo = new JLabel("  ");
        coordInfo.setForeground(new Color(148,163,184));
        coordInfo.setFont(new Font("SansSerif", Font.PLAIN, 12));
        JPanel nav = UI.navBar("👑 Coordinator Console", "", logout);
        nav.add(coordInfo, BorderLayout.CENTER);
        add(nav, BorderLayout.NORTH);

        JTabbedPane tabs = new JTabbedPane();
        tabs.setFont(new Font("SansSerif", Font.BOLD, 12));
        tabs.addTab("⚠ Pending Approvals", buildPendingTab());
        tabs.addTab("🔬 Equipment",         buildEquipTab());
        tabs.addTab("➕ Add Equipment",     buildAddTab());
        tabs.addTab("📋 All Bookings",      buildBookingsTab());
        tabs.addTab("👥 All Users",         buildAllUsersTab());
        tabs.addTab("🔑 Generate Manager",  buildGenerateTab());
        add(tabs, BorderLayout.CENTER);

        status = UI.statusBar();
        add(status, BorderLayout.SOUTH);
    }

    private JPanel buildAllUsersTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(UI.BG);
        p.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
        p.add(UI.heading("All Registered Users"), BorderLayout.NORTH);

        allUsersModel = UI.tableModel("User ID","Name","Email","Type","Staff ID","Department","Status");
        allUsersTable = UI.styledTable(allUsersModel);
        p.add(new JScrollPane(allUsersTable), BorderLayout.CENTER);

        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 8));
        btns.setBackground(UI.BG);
        JButton refresh = UI.button("↻ Refresh", UI.ACCENT);
        refresh.addActionListener(e -> refreshAllUsers());

        JButton approve = UI.button("✔ Approve Selected", UI.SUCCESS);
        approve.addActionListener(e -> approveFromAllUsers());

        JButton reject = UI.button("✘ Reject Selected", UI.DANGER);
        reject.addActionListener(e -> rejectFromAllUsers());

        btns.add(refresh); btns.add(approve); btns.add(reject);
        p.add(btns, BorderLayout.SOUTH);
        return p;
    }

    private JPanel buildGenerateTab() {
        JPanel outer = new JPanel(new GridBagLayout());
        outer.setBackground(UI.BG);

        JPanel form = UI.card("Generate Lab Manager Account (Req2)");

        JLabel note = new JLabel("Only the Head Lab Coordinator can perform this action (Req2).");
        note.setFont(new Font("SansSerif", Font.ITALIC, 12));
        note.setForeground(UI.TEXT_MUTED);
        note.setAlignmentX(Component.LEFT_ALIGNMENT);
        form.add(note);
        form.add(Box.createVerticalStrut(12));

        genID    = addField(form, "Manager ID (e.g. M002)");
        genName  = addField(form, "Full Name");
        genEmail = addField(form, "Email Address");
        genDept  = addField(form, "Department");

        form.add(Box.createVerticalStrut(8));
        JButton gen = UI.button("Generate Manager Account", UI.ACCENT);
        gen.setAlignmentX(Component.LEFT_ALIGNMENT);
        gen.addActionListener(e -> generateManager());
        form.add(gen);

        JPanel wrap = new JPanel(new BorderLayout());
        wrap.setBackground(UI.CARD);
        wrap.setBorder(BorderFactory.createLineBorder(UI.BORDER));
        wrap.add(form, BorderLayout.CENTER);
        outer.add(wrap);
        return outer;
    }

    private void refreshAllUsers() {
        if (allUsersModel == null) return;
        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        allUsersModel.setRowCount(0);
        for (User u : userDAO.getAllUsers())
            allUsersModel.addRow(new Object[]{
                u.getUserID(), u.getName(), u.getEmail(),
                u.getUserType(), u.getStaffID(), u.getDepartment(), u.getStatus()
            });
    }

    private void approveFromAllUsers() {
        int row = allUsersTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a user.", true); return; }
        String uid  = (String) allUsersModel.getValueAt(row, 0);
        String name = (String) allUsersModel.getValueAt(row, 1);
        User u = userDAO.findByID(uid);
        if (u == null) return;
        u.setStatus("ACTIVE");
        userDAO.updateUser(u);
        try { userDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "✔ Approved: " + name, false);
        refreshAllUsers(); refreshPending();
    }

    private void rejectFromAllUsers() {
        int row = allUsersTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a user.", true); return; }
        String uid  = (String) allUsersModel.getValueAt(row, 0);
        String name = (String) allUsersModel.getValueAt(row, 1);
        User u = userDAO.findByID(uid);
        if (u == null) return;
        u.setStatus("REJECTED");
        userDAO.updateUser(u);
        try { userDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "✘ Rejected: " + name, false);
        refreshAllUsers(); refreshPending();
    }

    private void generateManager() {
        if (currentUser == null || !"COORDINATOR".equals(currentUser.getUserType())) {
            UI.setStatus(status, "Only the Head Lab Coordinator can do this (Req2).", true); return;
        }
        String id   = genID.getText().trim();
        String name = genName.getText().trim();
        String email = genEmail.getText().trim();
        String dept = genDept.getText().trim();
        if (id.isEmpty() || name.isEmpty() || email.isEmpty()) {
            UI.setStatus(status, "All fields required.", true); return;
        }
        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        if (userDAO.emailExists(email)) {
            UI.setStatus(status, "Email already exists.", true); return;
        }

        String tempPass = "temp" + id;
        LabManager mgr = HeadLabCoordinatorSingleton.getInstance()
            .generateManagerAccount(id, name, email, tempPass, dept);
        userDAO.addUser(mgr);
        try { userDAO.save(); } catch (Exception e) { e.printStackTrace(); }

        UI.setStatus(status,
            "✔ Manager account created! Email: " + email + "  |  Temp Password: " + tempPass, false);
        genID.setText(""); genName.setText(""); genEmail.setText(""); genDept.setText("");
        refreshAllUsers();
    }

    private MainFrame getFrame() {
        Container c = getParent();
        while (c != null && !(c instanceof MainFrame)) c = c.getParent();
        return (MainFrame) c;
    }
}
