package test;
import static org.junit.Assert.*;
import org.junit.Test;
import model.User;
import model.Student;
import model.Guest;
import model.Faculty;
import model.Researcher;
import model.LabManager;
import model.HeadLabCoordinator;
import pattern.observer.*;
import java.util.List;
import java.util.ArrayList;

public class ObserverTests {
    List<User> affectedUsers = new ArrayList<>(); 
    Student student = new Student();
    Guest guest = new Guest();
    Faculty faculty = new Faculty();
    Student student2 = new Student();
    LabManager manager = new LabManager();
    Researcher researcher = new Researcher();
    HeadLabCoordinator coordinator = new HeadLabCoordinator();
    UserNotificationObserver notificationObserver = new UserNotificationObserver(affectedUsers);

    @Test
    public void notificationTest() {
        student.setName("John");
        guest.setName("Alice");
        faculty.setName("Mike");
        student2.setName("Mary");
        manager.setName("Martin");
        researcher.setName("Nicole");
        coordinator.setName("Sam");
        affectedUsers.add(student);
        affectedUsers.add(student2);
        notificationObserver.update("EQU001", "MAINTENANCE");
        String message = "";
        for (User user: affectedUsers) {
            message+= "[NOTIFICATION] Dear " + user.getName() + ", equipment EQU001" +
                        " has been marked as MAINTENANCE. Your booking may be affected." + "\n";
        }
        assertEquals(message,notificationObserver.getNotificationLog());
    }

    @Test
    public void notificationTest2() {
        affectedUsers.add(faculty);
        notificationObserver.update("EQU001", "DISABLED");
        String message = "";
        for (User user: affectedUsers) {
            message+= "[NOTIFICATION] Dear " + user.getName() + ", equipment EQU001" +
                        " has been marked as DISABLED. Your booking may be affected." + "\n";
        }
        assertEquals(message,notificationObserver.getNotificationLog());
    }

    @Test
    public void notificationTest3() {
        affectedUsers.remove(faculty);
        notificationObserver.update("EQU001", "DISABLED");
        String message = "";
        for (User user: affectedUsers) {
            message+= "[NOTIFICATION] Dear " + user.getName() + ", equipment EQU001" +
                        " has been marked as DISABLED. Your booking may be affected." + "\n";
        }
        assertEquals(message,notificationObserver.getNotificationLog());
    }
}
