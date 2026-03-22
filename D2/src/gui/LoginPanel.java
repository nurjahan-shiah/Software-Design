package gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import data.UserDAO;
import model.User;
import pattern.factory.UserFactory;

public class LoginPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private MainFrame frame;
    private UserDAO userDAO = new UserDAO("C:/Users/nshia/Desktop/PEW/FW25-26/EECS3311/D2/LabReservationSystem/LabReservationSystem/Software-Design/D2/data/users.csv");
    private JTextField emailField;
    private JPasswordField passField;
    private JTextField regName, regEmail, regStaffID, regDept;
    private JPasswordField regPass;
    private JComboBox<String> regType;
    private JLabel status;

    public LoginPanel(MainFrame frame) {
        this.frame = frame;
        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        build();
    }

    private void build() {
        setBackground(UI.BG);
        setLayout(new BorderLayout());

        // Nav bar
        JPanel nav = new JPanel(new BorderLayout());
        nav.setBackground(UI.NAV_BG);
        nav.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, UI.YORKU_RED));
        JPanel navLeft = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        navLeft.setBackground(UI.NAV_BG);
        JLabel badge = new JLabel("  Y  ");
        badge.setFont(new Font("Segoe UI", Font.BOLD, 15));
        badge.setForeground(Color.WHITE); badge.setBackground(UI.YORKU_RED); badge.setOpaque(true);
        badge.setBorder(BorderFactory.createEmptyBorder(13,14,13,14));
        JLabel title = new JLabel("  YorkU Lab Equipment Reservation System");
        title.setFont(UI.F_HEAD); title.setForeground(UI.NAV_FG);
        navLeft.add(badge); navLeft.add(title);
        nav.add(navLeft, BorderLayout.WEST);
        add(nav, BorderLayout.NORTH);

        // Cards
        JPanel centre = new JPanel(new GridBagLayout());
        centre.setBackground(UI.BG);
        JPanel cards = new JPanel(new GridLayout(1, 2, 24, 0));
        cards.setBackground(UI.BG);
        cards.setPreferredSize(new Dimension(940, 560));
        cards.add(buildLoginCard());
        cards.add(buildRegCard());
        centre.add(cards);
        add(centre, BorderLayout.CENTER);

        // Status
        status = UI.statusBar();
        status.setText("  Welcome — please sign in or create an account.");
        add(status, BorderLayout.SOUTH);
    }

    private JPanel buildLoginCard() {
        JPanel inner = UI.card("Sign In");
        inner.add(UI.label("Email address")); inner.add(Box.createVerticalStrut(4));
        emailField = UI.field("alice@yorku.ca"); inner.add(emailField);
        inner.add(Box.createVerticalStrut(14));
        inner.add(UI.label("Password")); inner.add(Box.createVerticalStrut(4));
        passField = UI.password();
        passField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));
        passField.setAlignmentX(Component.LEFT_ALIGNMENT);
        inner.add(passField); inner.add(Box.createVerticalStrut(22));

        JButton btn = UI.primary("Login");
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.addActionListener(e -> handleLogin());
        inner.add(btn); inner.add(Box.createVerticalStrut(20));

        // Red hint box
        JPanel hint = new JPanel();
        hint.setLayout(new BoxLayout(hint, BoxLayout.Y_AXIS));
        hint.setBackground(new Color(0xfb, 0xe9, 0xec));
        hint.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(0xe3,0x18,0x37,80), 1, true),
            BorderFactory.createEmptyBorder(10,12,10,12)));
        hint.setAlignmentX(Component.LEFT_ALIGNMENT);
        hint.setMaximumSize(new Dimension(Integer.MAX_VALUE, 130));
        JLabel ht = new JLabel("Test Accounts"); ht.setFont(UI.F_SUB);
        ht.setForeground(UI.YORKU_DARK); ht.setAlignmentX(Component.LEFT_ALIGNMENT);
        hint.add(ht); hint.add(Box.createVerticalStrut(6));
        for (String line : new String[]{
            "alice@yorku.ca / pass123  →  Student",
            "bob@yorku.ca / pass123  →  Faculty",
            "manager@yorku.ca / manager123  →  Manager",
            "coord@yorku.ca / coord123  →  Coordinator"}) {
            JLabel l = new JLabel(line); l.setFont(UI.F_SMALL); l.setForeground(UI.TEXT_MUTED);
            l.setAlignmentX(Component.LEFT_ALIGNMENT); hint.add(l);
        }
        inner.add(hint);
        return wrapCard(inner);
    }

    private JPanel buildRegCard() {
        JPanel inner = UI.card("Create Account");
        regName    = UI.formField(inner, "Full Name");
        regEmail   = UI.formField(inner, "Email Address");
        regPass    = UI.formPassword(inner, "Password (min 6 characters)");
        regType    = UI.formCombo(inner, "User Type", "STUDENT","FACULTY","RESEARCHER","GUEST");
        regStaffID = UI.formField(inner, "Staff / Student ID or Certification Number (Req8)");
        regDept    = UI.formField(inner, "Department");
        JButton btn = UI.primary("Create Account");
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.addActionListener(e -> handleRegister());
        inner.add(btn);
        return wrapCard(inner);
    }

    private JPanel wrapCard(JPanel inner) {
        JPanel w = new JPanel(new BorderLayout());
        w.setBackground(UI.CARD);
        w.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(UI.BORDER, 1, true),
            BorderFactory.createEmptyBorder(26, 30, 26, 30)));
        w.add(inner); return w;
    }

    private void handleLogin() {
        String email = emailField.getText().trim();
        String pass  = new String(passField.getPassword()).trim();
        if (email.isEmpty() || pass.isEmpty()) { setStatus("Please enter your email and password.", true); return; }
        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        User user = userDAO.findByEmail(email);
        if (user == null || !user.getPassword().equals(pass)) { setStatus("Invalid email or password.", true); return; }
        if ("PENDING".equals(user.getStatus()))  { setStatus("Account is pending departmental approval.", true); return; }
        if ("REJECTED".equals(user.getStatus())) { setStatus("Account was rejected. Contact the coordinator.", true); return; }
        setStatus("Welcome, " + user.getName() + "!", false);
        frame.onLoginSuccess(user);
    }

    private void handleRegister() {
        String name=regName.getText().trim(), email=regEmail.getText().trim();
        String pass=new String(regPass.getPassword()).trim(), type=(String)regType.getSelectedItem();
        String staffID=regStaffID.getText().trim(), dept=regDept.getText().trim();
        if (name.isEmpty()||email.isEmpty()||pass.isEmpty()||staffID.isEmpty()) { setStatus("All fields are required.", true); return; }
        if (pass.length()<6) { setStatus("Password must be at least 6 characters.", true); return; }
        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        if (userDAO.emailExists(email)) { setStatus("Email is already registered.", true); return; }
        UserFactory factory = new UserFactory();
        User u = factory.getUserType(type);
        u.setUserID("U"+System.currentTimeMillis()); u.setName(name); u.setEmail(email);
        u.setPassword(pass); u.setUserType(type); u.setStaffID(staffID); u.setDepartment(dept);
        u.setStatus("GUEST".equals(type)?"ACTIVE":"PENDING");
        userDAO.addUser(u);
        try { userDAO.save(); } catch (Exception e) { e.printStackTrace(); setStatus("Error saving account.",true); return; }
        setStatus("GUEST".equals(type)?"Account created! You can now sign in.":"Registration submitted — awaiting departmental approval.", false);
        regName.setText(""); regEmail.setText(""); regPass.setText(""); regStaffID.setText(""); regDept.setText("");
    }

    private void setStatus(String msg, boolean error) {
        status.setText("  "+msg);
        status.setForeground(error ? UI.DANGER : UI.SUCCESS);
    }
}