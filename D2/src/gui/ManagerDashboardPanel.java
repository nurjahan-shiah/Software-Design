package gui;

// pre determined login
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.List;
import data.*;
import model.*;
import pattern.observer.*;
import pattern.state.*;

public class ManagerDashboardPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private MainFrame frame;
    protected User currentUser;

    protected EquipmentDAO equipDAO = new EquipmentDAO("data/equipment.csv");
    protected UserDAO userDAO       = new UserDAO("data/users.csv");
    protected BookingDAO bookDAO    = new BookingDAO("data/bookings.csv");

    protected DefaultTableModel equipModel, pendModel, bookModel;
    protected JTable equipTable, pendTable, bookTable;
    private JTextField eqID, eqName, eqDesc, eqType, eqBuilding, eqRoom;
    protected JLabel status;
    private JLabel navInfo;

    public ManagerDashboardPanel(MainFrame frame) { this(frame, true); }

    protected ManagerDashboardPanel(MainFrame frame, boolean standalone) {
        this.frame = frame;
        if (standalone) build();
    }

    public void setCurrentUser(User u) { this.currentUser = u; }

    public void refresh() {
        try { equipDAO.load(); userDAO.load(); bookDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        if (currentUser != null && navInfo != null)
            navInfo.setText("  Lab Manager  |  " + currentUser.getName());
        refreshEquip();
        refreshPending();
        refreshAllBookings();
    }

    protected void build() {
        setBackground(UI.BG);
        setLayout(new BorderLayout());

        JButton logout = UI.button("Logout", UI.DANGER);
        logout.addActionListener(e -> frame.showPanel(MainFrame.LOGIN));
        navInfo = new JLabel("  ");
        navInfo.setForeground(new Color(148,163,184));
        navInfo.setFont(new Font("SansSerif", Font.PLAIN, 12));
        JPanel nav = UI.navBar("🔧 Manager Console", "", logout);
        nav.add(navInfo, BorderLayout.CENTER);
        add(nav, BorderLayout.NORTH);

        JTabbedPane tabs = buildTabs();
        add(tabs, BorderLayout.CENTER);

        status = UI.statusBar();
        add(status, BorderLayout.SOUTH);
    }

    protected JTabbedPane buildTabs() {
        JTabbedPane tabs = new JTabbedPane();
        tabs.setFont(new Font("SansSerif", Font.BOLD, 12));
        tabs.addTab("⚠ Pending Approvals", buildPendingTab());
        tabs.addTab("🔬 Equipment", buildEquipTab());
        tabs.addTab("➕ Add Equipment", buildAddTab());
        tabs.addTab("📋 All Bookings", buildBookingsTab());
        return tabs;
    }

    protected JPanel buildPendingTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(UI.BG);
        p.setBorder(BorderFactory.createEmptyBorder(14,14,14,14));
        p.add(UI.heading("Pending Account Approvals (Req1)"), BorderLayout.NORTH);

        pendModel = UI.tableModel("User ID","Name","Email","Type","Staff/Cert ID","Department","Status");
        pendTable = UI.styledTable(pendModel);
        pendTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        p.add(new JScrollPane(pendTable), BorderLayout.CENTER);

        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 8));
        btns.setBackground(UI.BG);
        JButton approve = UI.button("✔ Approve", UI.SUCCESS);
        JButton reject  = UI.button("✘ Reject",  UI.DANGER);
        JButton refresh = UI.button("↻ Refresh", UI.YORKU_RED);
        approve.addActionListener(e -> approve());
        reject.addActionListener(e -> reject());
        refresh.addActionListener(e -> refreshPending());
        btns.add(approve); btns.add(reject); btns.add(refresh);
        p.add(btns, BorderLayout.SOUTH);
        return p;
    }

    protected JPanel buildEquipTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(UI.BG);
        p.setBorder(BorderFactory.createEmptyBorder(14,14,14,14));
        p.add(UI.heading("Equipment Management (Req6)"), BorderLayout.NORTH);

        equipModel = UI.tableModel("ID","Name","Description","Type","Status","Building","Room");
        equipTable = UI.styledTable(equipModel);
        equipTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        p.add(new JScrollPane(equipTable), BorderLayout.CENTER);

        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 8));
        btns.setBackground(UI.BG);
        JButton enable  = UI.button("✔ Enable",      UI.SUCCESS);
        JButton disable = UI.button("✘ Disable",     UI.WARNING);
        JButton maint   = UI.button("🔧 Maintenance", UI.DANGER);
        enable.addActionListener(e  -> changeStatus("AVAILABLE"));
        disable.addActionListener(e -> changeStatus("DISABLED"));
        maint.addActionListener(e   -> changeStatus("MAINTENANCE"));
        btns.add(enable); btns.add(disable); btns.add(maint);
        p.add(btns, BorderLayout.SOUTH);
        return p;
    }

    protected JPanel buildAddTab() {
        JPanel outer = new JPanel(new GridBagLayout());
        outer.setBackground(UI.BG);

        JPanel form = UI.card("Add New Equipment (Req6, Req7)");
        eqID       = addField(form, "Equipment ID (required — Req7)");
        eqName     = addField(form, "Name");
        eqDesc     = addField(form, "Description (required — Req7)");
        eqType     = addField(form, "Type");
        eqBuilding = addField(form, "Building Name (required — Req7)");
        eqRoom     = addField(form, "Room Number (required — Req7)");
        form.add(Box.createVerticalStrut(12));
        JButton add = UI.button("Add Equipment", UI.YORKU_RED);
        add.setAlignmentX(Component.LEFT_ALIGNMENT);
        add.addActionListener(e -> addEquipment());
        form.add(add);

        JPanel wrap = new JPanel(new BorderLayout());
        wrap.setBackground(UI.CARD);
        wrap.setBorder(BorderFactory.createLineBorder(UI.BORDER));
        wrap.add(form, BorderLayout.CENTER);
        outer.add(wrap);
        return outer;
    }

    protected JPanel buildBookingsTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(UI.BG);
        p.setBorder(BorderFactory.createEmptyBorder(14,14,14,14));
        p.add(UI.heading("All Bookings / Usage Report (Req5, Req8)"), BorderLayout.NORTH);

        bookModel = UI.tableModel("Booking ID","User","Equipment","Start","End","Status","Deposit","Payment");
        bookTable = UI.styledTable(bookModel);
        p.add(new JScrollPane(bookTable), BorderLayout.CENTER);

        JButton refresh = UI.button("↻ Refresh", UI.YORKU_RED);
        refresh.addActionListener(e -> refreshAllBookings());
        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 8));
        btns.setBackground(UI.BG);
        btns.add(refresh);
        p.add(btns, BorderLayout.SOUTH);
        return p;
    }

    protected void refreshEquip() {
        if (equipModel == null) return;
        equipModel.setRowCount(0);
        for (Equipment eq : equipDAO.getAllEquipment())
            equipModel.addRow(new Object[]{
                eq.getEquipmentID(), eq.getName(), eq.getDescription(),
                eq.getType(), eq.getStatus(), eq.getBuildingName(), eq.getRoomNumber()
            });
    }

    protected void refreshPending() {
        if (pendModel == null) return;
        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        pendModel.setRowCount(0);
        int count = 0;
        for (User u : userDAO.getAllUsers()) {
            if ("PENDING".equals(u.getStatus())) {
                pendModel.addRow(new Object[]{
                    u.getUserID(), u.getName(), u.getEmail(),
                    u.getUserType(), u.getStaffID(), u.getDepartment(), u.getStatus()
                });
                count++;
            }
        }
        if (status != null)
            UI.setStatus(status, count > 0 ? count + " pending approval(s)" : "No pending approvals", count > 0);
    }

    protected void refreshAllBookings() {
        if (bookModel == null) return;
        try { bookDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        bookModel.setRowCount(0);
        for (Reservation r : bookDAO.getAllBookings())
            bookModel.addRow(new Object[]{
                r.getBookingID(), r.getUserID(), r.getEquipmentID(),
                r.getStartTime(), r.getEndTime(), r.getStatus(),
                "$"+r.getDepositAmount(), r.getPaymentMethod()
            });
    }

    private void approve() {
        int row = pendTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a user to approve.", true); return; }
        String uid = (String) pendModel.getValueAt(row, 0);
        String name = (String) pendModel.getValueAt(row, 1);
        User u = userDAO.findByID(uid);
        if (u == null) return;
        u.setStatus("ACTIVE");
        userDAO.updateUser(u);
        try { userDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "✔ Approved: " + name + ". They can now log in.", false);
        refreshPending();
    }

    private void reject() {
        int row = pendTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a user to reject.", true); return; }
        String uid = (String) pendModel.getValueAt(row, 0);
        String name = (String) pendModel.getValueAt(row, 1);
        User u = userDAO.findByID(uid);
        if (u == null) return;
        u.setStatus("REJECTED");
        userDAO.updateUser(u);
        try { userDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "✘ Rejected: " + name, false);
        refreshPending();
    }

    protected void changeStatus(String newStatus) {
        int row = equipTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select equipment.", true); return; }
        String eqid = (String) equipModel.getValueAt(row, 0);
        Equipment eq = equipDAO.findByID(eqid);
        if (eq == null) return;

        EquipmentContext ctx = new EquipmentContext(eqid, eq.getStatus());
        List<User> affected = new java.util.ArrayList<>();
        for (Reservation r : bookDAO.getBookingsByEquipment(eqid))
            if ("CONFIRMED".equals(r.getStatus())) {
                User u = userDAO.findByID(r.getUserID());
                if (u != null) affected.add(u);
            }
        UserNotificationObserver notifier = new UserNotificationObserver(affected);
        ctx.registerObserver(notifier);

        switch (newStatus) {
            case "AVAILABLE":   ctx.enable(); break;
            case "DISABLED":    ctx.disable(); break;
            case "MAINTENANCE": ctx.markUnderMaintenance(); break;
        }
        eq.setStatus(ctx.getStatusString());
        equipDAO.updateEquipment(eq);
        try { equipDAO.save(); } catch (Exception e) { e.printStackTrace(); }

        String log = notifier.getNotificationLog();
        UI.setStatus(status, eqid + " → " + newStatus
            + (log.isEmpty() ? "" : " | Notified " + affected.size() + " user(s)"), false);
        refreshEquip();
    }

    private void addEquipment() {
        String id = eqID.getText().trim(), name = eqName.getText().trim();
        String desc = eqDesc.getText().trim(), type = eqType.getText().trim();
        String bld = eqBuilding.getText().trim(), room = eqRoom.getText().trim();
        if (id.isEmpty() || name.isEmpty() || desc.isEmpty() || bld.isEmpty() || room.isEmpty()) {
            UI.setStatus(status, "ID, Name, Description, Building and Room are required (Req7).", true); return;
        }
        if (equipDAO.findByID(id) != null) { UI.setStatus(status, "Equipment ID already exists.", true); return; }
        equipDAO.addEquipment(new Equipment(id, name, desc, type, "AVAILABLE", bld, room));
        try { equipDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "Equipment " + id + " added.", false);
        refreshEquip();
        eqID.setText(""); eqName.setText(""); eqDesc.setText(""); eqType.setText(""); eqBuilding.setText(""); eqRoom.setText("");
    }

    protected JTextField addField(JPanel form, String labelText) {
        form.add(UI.label(labelText));
        form.add(Box.createVerticalStrut(2));
        JTextField f = UI.field("");
        f.setMaximumSize(new Dimension(380, 34));
        form.add(f);
        form.add(Box.createVerticalStrut(10));
        return f;
    }
}
