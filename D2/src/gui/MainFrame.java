package gui;

import javax.swing.*;
import java.awt.*;
import model.User;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private static MainFrame instance;

    private CardLayout cardLayout;
    private JPanel mainPanel;

    private LoginPanel loginPanel;
    private UserDashboardPanel userDashboard;
    private ManagerDashboardPanel managerDashboard;
    private CoordinatorDashboardPanel coordinatorDashboard;

    public static final String LOGIN       = "LOGIN";
    public static final String USER        = "USER";
    public static final String MANAGER     = "MANAGER";
    public static final String COORDINATOR = "COORDINATOR";

    public static MainFrame getInstance() {
        if (instance == null) instance = new MainFrame();
        return instance;
    }

    private MainFrame() {
        super("Lab Equipment Reservation System — York University");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 700);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel  = new JPanel(cardLayout);

        loginPanel           = new LoginPanel(this);
        userDashboard        = new UserDashboardPanel(this);
        managerDashboard     = new ManagerDashboardPanel(this);
        coordinatorDashboard = new CoordinatorDashboardPanel(this);

        mainPanel.add(loginPanel,           LOGIN);
        mainPanel.add(userDashboard,        USER);
        mainPanel.add(managerDashboard,     MANAGER);
        mainPanel.add(coordinatorDashboard, COORDINATOR);

        add(mainPanel);
        showPanel(LOGIN);
    }

    public void showPanel(String name) {
        cardLayout.show(mainPanel, name);
    }

    public void onLoginSuccess(User user) {
        String type = user.getUserType().toUpperCase();
        switch (type) {
            case "COORDINATOR":
                coordinatorDashboard.setCurrentUser(user);
                coordinatorDashboard.refresh();
                showPanel(COORDINATOR);
                break;
            case "MANAGER":
                managerDashboard.setCurrentUser(user);
                managerDashboard.refresh();
                showPanel(MANAGER);
                break;
            default: // STUDENT, FACULTY, RESEARCHER, GUEST
                userDashboard.setCurrentUser(user);
                userDashboard.refresh();
                showPanel(USER);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> MainFrame.getInstance().setVisible(true));
    }
}
