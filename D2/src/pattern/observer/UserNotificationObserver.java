package pattern.observer;

import model.User;
import java.util.List;

/**
 * Observer Pattern - Concrete Observer
 * Notifies affected users when equipment status changes (Req5, Req6).
 * For example: if equipment is DISABLED or set to MAINTENANCE,
 * users with active bookings on that equipment get notified.
 */
public class UserNotificationObserver implements EquipmentObserver {

    private List<User> affectedUsers;
    private String notificationLog = "";

    public UserNotificationObserver(List<User> affectedUsers) {
        this.affectedUsers = affectedUsers;
    }

    @Override
    public void update(String equipmentID, String newStatus) {
        if (newStatus.equals("DISABLED") || newStatus.equals("MAINTENANCE")) {
            for (User user : affectedUsers) {
                String message = "[NOTIFICATION] Dear " + user.getName() +
                        ", equipment " + equipmentID +
                        " has been marked as " + newStatus +
                        ". Your booking may be affected.";
                System.out.println(message);
                notificationLog += message + "\n";
            }
        }
    }

    public String getNotificationLog() {
        return notificationLog;
    }

    public void setAffectedUsers(List<User> affectedUsers) {
        this.affectedUsers = affectedUsers;
    }
}
