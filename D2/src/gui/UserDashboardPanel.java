package gui;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import data.*;
import model.*;
import pattern.command.*;
import pattern.singleton.BookingSystem;
import pattern.strategy.*;

public class UserDashboardPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private MainFrame frame;
    private User currentUser;

    private EquipmentDAO equipDAO = new EquipmentDAO("../data/equipment.csv");
    private BookingDAO bookDAO    = new BookingDAO("../data/bookings.csv");
    private ReservationService svc = new ReservationService();

    private DefaultTableModel equipModel, bookModel;
    private JTable equipTable, bookTable;
    private JTextField startField, endField, extendField, modifyStartField, modifyEndField;
    private JComboBox<String> payCombo;
    private JLabel status, userInfo;

    public UserDashboardPanel(MainFrame frame) {
        this.frame = frame;
        build();
    }

    public void setCurrentUser(User u) { this.currentUser = u; }

    public void refresh() {
        try { equipDAO.load(); bookDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        if (currentUser != null)
            userInfo.setText("  " + currentUser.getUserType() + "  |  " + currentUser.getName()
                + "  |  Fee: $" + currentUser.getFeeRate() + "/hr  |  ID: " + currentUser.getStaffID());
        refreshEquip();
        refreshBookings();
    }

    private void build() {
        setBackground(UI.BG);
        setLayout(new BorderLayout());

        // Nav
        JButton logout = UI.button("Logout", UI.DANGER);
        logout.addActionListener(e -> frame.showPanel(MainFrame.LOGIN));
        userInfo = new JLabel("  ");
        userInfo.setFont(new Font("SansSerif", Font.PLAIN, 12));
        userInfo.setForeground(new Color(148, 163, 184));
        JPanel nav = UI.navBar("🔬 Lab Equipment Reservation", "", logout);
        nav.add(userInfo, BorderLayout.CENTER);
        add(nav, BorderLayout.NORTH);

        // Content
        JTabbedPane tabs = new JTabbedPane();
        tabs.setFont(new Font("SansSerif", Font.BOLD, 12));
        tabs.setBackground(UI.BG);
        tabs.addTab("Browse & Reserve Equipment", buildBrowseTab());
        tabs.addTab("My Bookings", buildBookingsTab());
        add(tabs, BorderLayout.CENTER);

        // Status
        status = UI.statusBar();
        add(status, BorderLayout.SOUTH);
    }

    private JPanel buildBrowseTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(UI.BG);
        p.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));

        // Equipment table
        equipModel = UI.tableModel("ID", "Name", "Description", "Type", "Status", "Location");
        equipTable = UI.styledTable(equipModel);
        equipTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scroll = new JScrollPane(equipTable);
        scroll.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(UI.BORDER), "Available Equipment (Req3)"));
        p.add(scroll, BorderLayout.CENTER);

        // Booking form
        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(UI.CARD);
        form.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createTitledBorder(BorderFactory.createLineBorder(UI.BORDER),
                "Make a Reservation (Req3, Req4, Req10)"),
            BorderFactory.createEmptyBorder(10, 12, 10, 12)
        ));

        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(4, 6, 4, 6);
        gc.fill = GridBagConstraints.HORIZONTAL;

        gc.gridx=0; gc.gridy=0; form.add(new JLabel("Start (yyyy-MM-dd HH:mm):"), gc);
        gc.gridx=1; startField = UI.field("2026-04-10 09:00"); form.add(startField, gc);

        gc.gridx=2; form.add(new JLabel("End (yyyy-MM-dd HH:mm):"), gc);
        gc.gridx=3; endField = UI.field("2026-04-10 11:00"); form.add(endField, gc);

        gc.gridx=4; form.add(new JLabel("Payment Method (Req10):"), gc);
        gc.gridx=5; payCombo = new JComboBox<>(new String[]{"CREDIT","DEBIT","INSTITUTIONAL","GRANT"});
        payCombo.setFont(new Font("SansSerif", Font.PLAIN, 12));
        form.add(payCombo, gc);

        gc.gridx=6;
        JButton resBtn = UI.button("Reserve Selected", UI.YORKU_RED);
        resBtn.addActionListener(e -> reserve());
        form.add(resBtn, gc);

        p.add(form, BorderLayout.SOUTH);
        return p;
    }

    private JPanel buildBookingsTab() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBackground(UI.BG);
        p.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));

        bookModel = UI.tableModel("Booking ID","Equipment","Start","End","Status","Deposit","Payment","Extended");
        bookTable = UI.styledTable(bookModel);
        bookTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scroll = new JScrollPane(bookTable);
        scroll.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(UI.BORDER), "My Bookings"));
        p.add(scroll, BorderLayout.CENTER);

        // Action buttons
        JPanel actions = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 8));
        actions.setBackground(UI.CARD);
        actions.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(UI.BORDER), "Booking Actions (Req8, Req9, Req4)"));

        JButton cancelBtn = UI.button("Cancel Booking (Req8)", UI.DANGER);
        cancelBtn.addActionListener(e -> cancelBooking());
        actions.add(cancelBtn);

        actions.add(new JLabel("  Modify — New Start:"));
        modifyStartField = UI.field("2026-04-10 10:00");
        modifyStartField.setPreferredSize(new Dimension(150, 32));
        actions.add(modifyStartField);

        actions.add(new JLabel("New End:"));
        modifyEndField = UI.field("2026-04-10 12:00");
        modifyEndField.setPreferredSize(new Dimension(150, 32));
        actions.add(modifyEndField);

        JButton modifyBtn = UI.button("Modify Booking (Req8)", UI.INFO);
        modifyBtn.addActionListener(e -> modifyBooking());
        actions.add(modifyBtn);

        actions.add(new JLabel("  Extend to (yyyy-MM-dd HH:mm):"));
        extendField = UI.field("2026-04-10 13:00");
        extendField.setPreferredSize(new Dimension(160, 32));
        actions.add(extendField);

        JButton extBtn = UI.button("Extend Reservation (Req9)", UI.YORKU_RED);
        extBtn.addActionListener(e -> extend());
        actions.add(extBtn);

        JButton forfeitBtn = UI.button("Simulate No-Show / Forfeit Deposit (Req4)", UI.WARNING);
        forfeitBtn.addActionListener(e -> forfeit());
        actions.add(forfeitBtn);

        p.add(actions, BorderLayout.SOUTH);
        return p;
    }

    private void refreshEquip() {
        equipModel.setRowCount(0);
        for (Equipment eq : equipDAO.getAllEquipment())
            equipModel.addRow(new Object[]{
                eq.getEquipmentID(), eq.getName(), eq.getDescription(),
                eq.getType(), eq.getStatus(),
                eq.getBuildingName() + " Rm " + eq.getRoomNumber()
            });
    }

    private void refreshBookings() {
        bookModel.setRowCount(0);
        if (currentUser == null) return;
        for (Reservation r : bookDAO.getBookingsByUser(currentUser.getUserID()))
            bookModel.addRow(new Object[]{
                r.getBookingID(), r.getEquipmentID(),
                r.getStartTime(), r.getEndTime(), r.getStatus(),
                "$" + r.getDepositAmount(), r.getPaymentMethod(),
                r.isExtended() ? "Yes" : "No"
            });
    }

    private void reserve() {
        int row = equipTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select equipment first.", true); return; }
        String eqID   = (String) equipModel.getValueAt(row, 0);
        String eqStat = (String) equipModel.getValueAt(row, 4);
        if (!"AVAILABLE".equals(eqStat)) { UI.setStatus(status, "Equipment is not available.", true); return; }

        String start = startField.getText().trim();
        String end   = endField.getText().trim();
        String pay   = (String) payCombo.getSelectedItem();
        if (start.isEmpty() || end.isEmpty()) { UI.setStatus(status, "Enter start and end times.", true); return; }

        double deposit = currentUser.getFeeRate();
        PaymentStrategy strategy = payStrategy(pay);
        String bkID = "B" + System.currentTimeMillis();
        PaymentTransaction txn = new PaymentTransaction("T" + System.currentTimeMillis(), bkID, deposit, pay);
        if (!new PaymentProcessor(strategy).processPayment(txn)) {
            UI.setStatus(status, "Payment failed.", true); return;
        }

        Reservation r = new Reservation(bkID, currentUser.getUserID(), eqID, start, end, pay, deposit);
        new ReserveCommand(svc, r).execute();
        bookDAO.addBooking(r);
        BookingSystem.getInstance().addBooking(r);
        try { bookDAO.save(); } catch (Exception e) { e.printStackTrace(); }

        UI.setStatus(status, "✔ Reserved " + eqID + " | Booking: " + bkID + " | Deposit: $" + deposit + " via " + pay, false);
        refreshBookings();
    }

    private void cancelBooking() {
        int row = bookTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a booking to cancel.", true); return; }
        String bkID = (String) bookModel.getValueAt(row, 0);
        Reservation r = bookDAO.findByID(bkID);
        if (r == null) return;
        new CancelCommand(svc, r).execute();
        bookDAO.updateBooking(r);
        try { bookDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "Booking " + bkID + " cancelled.", false);
        refreshBookings();
    }

    private void modifyBooking() {
        int row = bookTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a booking to modify.", true); return; }
        String bkID = (String) bookModel.getValueAt(row, 0);
        Reservation r = bookDAO.findByID(bkID);
        if (r == null || !"CONFIRMED".equals(r.getStatus())) {
            UI.setStatus(status, "Can only modify a CONFIRMED booking.", true); return;
        }
        String newStart = modifyStartField.getText().trim();
        String newEnd   = modifyEndField.getText().trim();
        if (newStart.isEmpty() || newEnd.isEmpty()) {
            UI.setStatus(status, "Enter new start and end times.", true); return;
        }
        new ModifyCommand(svc, r, newStart, newEnd).execute();
        bookDAO.updateBooking(r);
        try { bookDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "Booking " + bkID + " modified: " + newStart + " → " + newEnd, false);
        refreshBookings();
    }

    private void extend() {
        int row = bookTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a booking to extend.", true); return; }
        String bkID = (String) bookModel.getValueAt(row, 0);
        Reservation r = bookDAO.findByID(bkID);
        if (r == null || !"CONFIRMED".equals(r.getStatus())) {
            UI.setStatus(status, "Cannot extend this booking.", true); return;
        }
        String newEnd = extendField.getText().trim();
        if (newEnd.isEmpty()) { UI.setStatus(status, "Enter new end time.", true); return; }
        new ExtendCommand(svc, r, newEnd).execute();
        bookDAO.updateBooking(r);
        try { bookDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "Booking extended to " + newEnd, false);
        refreshBookings();
    }

    private void forfeit() {
        int row = bookTable.getSelectedRow();
        if (row < 0) { UI.setStatus(status, "Select a booking.", true); return; }
        String bkID = (String) bookModel.getValueAt(row, 0);
        Reservation r = bookDAO.findByID(bkID);
        if (r == null) return;
        new ForfeitDepositCommand(svc, r).execute();
        bookDAO.updateBooking(r);
        try { bookDAO.save(); } catch (Exception e) { e.printStackTrace(); }
        UI.setStatus(status, "Deposit forfeited. Amount lost: $" + r.getDepositAmount(), false);
        refreshBookings();
    }

    private PaymentStrategy payStrategy(String m) {
        switch(m) {
            case "DEBIT":         return new DebitPayment();
            case "INSTITUTIONAL": return new InstitutionalPayment();
            case "GRANT":         return new GrantPayment();
            default:              return new CreditCardPayment();
        }
    }
}