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
    private UserDAO userDAO = new UserDAO("data/users.csv");

    private JTextField emailField;
    private JPasswordField passField;
    private JTextField regName, regEmail, regStaffID, regDept;
    private JPasswordField regPass;
    private JComboBox<String> regType;
    private JLabel status;

    public LoginPanel(MainFrame frame) {
        this.frame = frame;
        load();
        build();
    }

    private void load() {
        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
    }

    private void build() {
        setBackground(UI.BG);
        setLayout(new GridBagLayout());

        JPanel wrap = new JPanel(new BorderLayout(0, 20));
        wrap.setBackground(UI.BG);
        wrap.setPreferredSize(new Dimension(900, 600));

        // Header
        JPanel hdr = new JPanel(new FlowLayout(FlowLayout.CENTER, 6, 0));
        hdr.setBackground(UI.BG);
        JLabel t1 = new JLabel("Lab Equipment Reservation System");
        t1.setFont(new Font("Georgia", Font.BOLD, 24));
        t1.setForeground(UI.TEXT);
        JLabel t2 = new JLabel("— York University");
        t2.setFont(new Font("Georgia", Font.ITALIC, 16));
        t2.setForeground(UI.TEXT_MUTED);
        hdr.add(t1); hdr.add(t2);
        wrap.add(hdr, BorderLayout.NORTH);

        // Cards
        JPanel cards = new JPanel(new GridLayout(1, 2, 20, 0));
        cards.setBackground(UI.BG);
        cards.add(buildLoginCard());
        cards.add(buildRegCard());
        wrap.add(cards, BorderLayout.CENTER);

        // Status
        status = new JLabel(" ", SwingConstants.CENTER);
        status.setFont(new Font("SansSerif", Font.PLAIN, 13));
        status.setForeground(UI.TEXT_MUTED);
        wrap.add(status, BorderLayout.SOUTH);

        add(wrap);
    }

    private JPanel buildLoginCard() {
        JPanel c = UI.card("Sign In");

        c.add(UI.label("Email address"));
        emailField = UI.field("alice@yorku.ca");
        c.add(emailField);
        c.add(Box.createVerticalStrut(12));

        c.add(UI.label("Password"));
        passField = UI.passwordField();
        c.add(passField);
        c.add(Box.createVerticalStrut(20));

        JButton btn = UI.button("Sign In", UI.ACCENT);
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btn.addActionListener(e -> login());
        c.add(btn);

        c.add(Box.createVerticalStrut(14));
        JLabel hint = new JLabel("<html><center><i>Test accounts:</i><br>"
            + "alice@yorku.ca / pass123 (Student)<br>"
            + "manager@yorku.ca / manager123 (Manager)<br>"
            + "coord@yorku.ca / coord123 (Coordinator)</center></html>", SwingConstants.CENTER);
        hint.setFont(new Font("SansSerif", Font.PLAIN, 11));
        hint.setForeground(UI.TEXT_MUTED);
        hint.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.add(hint);

        return wrap(c);
    }

    private JPanel buildRegCard() {
        JPanel c = UI.card("Create Account");

        c.add(UI.label("Full Name"));
        regName = UI.field(""); c.add(regName);
        c.add(Box.createVerticalStrut(8));

        c.add(UI.label("Email"));
        regEmail = UI.field(""); c.add(regEmail);
        c.add(Box.createVerticalStrut(8));

        c.add(UI.label("Password (min 6 chars)"));
        regPass = UI.passwordField(); c.add(regPass);
        c.add(Box.createVerticalStrut(8));

        c.add(UI.label("User Type"));
        regType = new JComboBox<>(new String[]{"STUDENT","FACULTY","RESEARCHER","GUEST"});
        regType.setFont(new Font("SansSerif", Font.PLAIN, 13));
        regType.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));
        regType.setAlignmentX(Component.LEFT_ALIGNMENT);
        c.add(regType);
        c.add(Box.createVerticalStrut(8));

        c.add(UI.label("Staff/Student ID or Cert Number (Req8)"));
        regStaffID = UI.field(""); c.add(regStaffID);
        c.add(Box.createVerticalStrut(8));

        c.add(UI.label("Department"));
        regDept = UI.field(""); c.add(regDept);
        c.add(Box.createVerticalStrut(16));

        JButton btn = UI.button("Create Account", UI.ACCENT);
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btn.addActionListener(e -> register());
        c.add(btn);

        return wrap(c);
    }

    private JPanel wrap(JPanel inner) {
        JPanel w = new JPanel(new BorderLayout());
        w.setBackground(UI.CARD);
        w.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(UI.BORDER, 1, true),
            BorderFactory.createEmptyBorder(22, 26, 22, 26)
        ));
        w.add(inner, BorderLayout.CENTER);
        return w;
    }

    private void login() {
        String email = emailField.getText().trim();
        String pass  = new String(passField.getPassword()).trim();
        if (email.isEmpty() || pass.isEmpty()) { setStatus("Enter email and password.", true); return; }

        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        User user = userDAO.findByEmail(email);
        if (user == null || !user.getPassword().equals(pass)) { setStatus("Invalid email or password.", true); return; }
        if ("PENDING".equals(user.getStatus()))   { setStatus("Account pending departmental approval.", true); return; }
        if ("REJECTED".equals(user.getStatus()))  { setStatus("Account was rejected. Contact admin.", true); return; }

        setStatus("Welcome, " + user.getName() + "!", false);
        frame.onLoginSuccess(user);
    }

    private void register() {
        String name   = regName.getText().trim();
        String email  = regEmail.getText().trim();
        String pass   = new String(regPass.getPassword()).trim();
        String type   = (String) regType.getSelectedItem();
        String staffID = regStaffID.getText().trim();
        String dept   = regDept.getText().trim();

        if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || staffID.isEmpty()) {
            setStatus("All fields are required.", true); return;
        }
        if (pass.length() < 6) { setStatus("Password must be at least 6 characters.", true); return; }

        try { userDAO.load(); } catch (Exception e) { e.printStackTrace(); }
        if (userDAO.emailExists(email)) { setStatus("Email already registered.", true); return; }

        UserFactory factory = new UserFactory();
        User u = factory.getUserType(type);
        u.setUserID("U" + System.currentTimeMillis());
        u.setName(name); u.setEmail(email); u.setPassword(pass);
        u.setUserType(type); u.setStaffID(staffID); u.setDepartment(dept);
        u.setStatus("GUEST".equals(type) ? "ACTIVE" : "PENDING");

        userDAO.addUser(u);
        try { userDAO.save(); } catch (Exception e) { setStatus("Error saving.", true); return; }

        String msg = "GUEST".equals(type)
            ? "Account created! You can now sign in."
            : "Registration submitted. Awaiting departmental approval.";
        setStatus(msg, false);
        regName.setText(""); regEmail.setText(""); regPass.setText("");
        regStaffID.setText(""); regDept.setText("");
    }

    private void setStatus(String msg, boolean err) {
        status.setText(msg);
        status.setForeground(err ? UI.DANGER : UI.SUCCESS);
    }
}
