package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.*;
import pattern.observer.*;
import pattern.state.EquipmentContext;

import java.util.ArrayList;
import java.util.List;

public class ObserverTests {

    private List<User> affectedUsers;
    private UserNotificationObserver observer;
    private Student student;
    private Student student2;
    private Faculty faculty;
    private Guest guest;
    private Researcher researcher;
    private LabManager manager;
    private HeadLabCoordinator coordinator;

    @Before
    public void setUp() {
        affectedUsers = new ArrayList<>();
        student = new Student();
        student.setName("John");
        student2 = new Student();
        student2.setName("Mary");
        faculty = new Faculty();
        faculty.setName("Mike");
        guest = new Guest();
        guest.setName("Alice");
        researcher = new Researcher();
        researcher.setName("Nicole");
        manager = new LabManager();
        manager.setName("Martin");
        coordinator = new HeadLabCoordinator();
        coordinator.setName("Sam");
        observer = new UserNotificationObserver(affectedUsers);
    }

    // ===================== Notification Log Tests =====================

    @Test
    public void notificationTest() {
        affectedUsers.add(student);
        affectedUsers.add(student2);
        observer.update("EQU001", "MAINTENANCE");
        String message = "";
        for (User user : affectedUsers) {
            message += "[NOTIFICATION] Dear " + user.getName() + ", equipment EQU001"
                    + " has been marked as MAINTENANCE. Your booking may be affected." + "\n";
        }
        assertEquals(message, observer.getNotificationLog());
    }

    @Test
    public void notificationTest2() {
        affectedUsers.add(faculty);
        observer.update("EQU001", "DISABLED");
        String message = "";
        for (User user : affectedUsers) {
            message += "[NOTIFICATION] Dear " + user.getName() + ", equipment EQU001"
                    + " has been marked as DISABLED. Your booking may be affected." + "\n";
        }
        assertEquals(message, observer.getNotificationLog());
    }

    @Test
    public void notificationTest3() {
        observer.update("EQU001", "DISABLED");
        assertEquals("", observer.getNotificationLog());
    }

    @Test
    public void notification_availableStatus_noLog() {
        affectedUsers.add(student);
        observer.update("EQU001", "AVAILABLE");
        assertEquals("", observer.getNotificationLog());
    }

    @Test
    public void notification_multipleUsers_allNotified() {
        affectedUsers.add(student);
        affectedUsers.add(student2);
        affectedUsers.add(faculty);
        observer.update("EQU005", "DISABLED");
        assertTrue(observer.getNotificationLog().contains("John"));
        assertTrue(observer.getNotificationLog().contains("Mary"));
        assertTrue(observer.getNotificationLog().contains("Mike"));
    }

    @Test
    public void notification_containsEquipmentID() {
        affectedUsers.add(student);
        observer.update("EQU_ABC", "DISABLED");
        assertTrue(observer.getNotificationLog().contains("EQU_ABC"));
    }

    @Test
    public void notification_containsStatus() {
        affectedUsers.add(student);
        observer.update("EQU001", "MAINTENANCE");
        assertTrue(observer.getNotificationLog().contains("MAINTENANCE"));
    }

    @Test
    public void notification_logAccumulatesAcrossUpdates() {
        affectedUsers.add(student);
        observer.update("EQU001", "DISABLED");
        observer.update("EQU002", "MAINTENANCE");
        assertTrue(observer.getNotificationLog().contains("EQU001"));
        assertTrue(observer.getNotificationLog().contains("EQU002"));
    }

    @Test
    public void notification_guestUser_isNotified() {
        affectedUsers.add(guest);
        observer.update("EQU003", "DISABLED");
        assertTrue(observer.getNotificationLog().contains("Alice"));
    }

    @Test
    public void notification_researcherUser_isNotified() {
        affectedUsers.add(researcher);
        observer.update("EQU004", "MAINTENANCE");
        assertTrue(observer.getNotificationLog().contains("Nicole"));
    }

    @Test
    public void notification_emptyUserList_emptyLog() {
        observer.update("EQU001", "DISABLED");
        assertEquals("", observer.getNotificationLog());
    }

    @Test
    public void notification_setAffectedUsers_updatesCorrectly() {
        List<User> newUsers = new ArrayList<>();
        newUsers.add(researcher);
        observer.setAffectedUsers(newUsers);
        observer.update("EQU005", "DISABLED");
        assertTrue(observer.getNotificationLog().contains("Nicole"));
        assertFalse(observer.getNotificationLog().contains("John"));
    }

    @Test
    public void notification_setAffectedUsersEmpty_noLog() {
        affectedUsers.add(student);
        observer.setAffectedUsers(new ArrayList<>());
        observer.update("EQU001", "DISABLED");
        assertEquals("", observer.getNotificationLog());
    }

    // ===================== EquipmentContext + Observer Integration Tests =====================

    @Test
    public void equipmentContext_registersObserver_notifiedOnDisable() {
        EquipmentContext ctx = new EquipmentContext("EQU100", "AVAILABLE");
        affectedUsers.add(student);
        ctx.registerObserver(observer);
        ctx.disable();
        assertTrue(observer.getNotificationLog().contains("John"));
        assertTrue(observer.getNotificationLog().contains("DISABLED"));
    }

    @Test
    public void equipmentContext_registersObserver_notifiedOnMaintenance() {
        EquipmentContext ctx = new EquipmentContext("EQU101", "AVAILABLE");
        affectedUsers.add(faculty);
        ctx.registerObserver(observer);
        ctx.markUnderMaintenance();
        assertTrue(observer.getNotificationLog().contains("Mike"));
        assertTrue(observer.getNotificationLog().contains("MAINTENANCE"));
    }

    @Test
    public void equipmentContext_removesObserver_notNotified() {
        EquipmentContext ctx = new EquipmentContext("EQU102", "AVAILABLE");
        affectedUsers.add(student);
        ctx.registerObserver(observer);
        ctx.removeObserver(observer);
        ctx.disable();
        assertEquals("", observer.getNotificationLog());
    }

    @Test
    public void equipmentContext_noObservers_noNotification() {
        EquipmentContext ctx = new EquipmentContext("EQU103", "AVAILABLE");
        ctx.disable();
        assertEquals("", observer.getNotificationLog());
    }

    @Test
    public void equipmentContext_multipleObservers_allNotified() {
        EquipmentContext ctx = new EquipmentContext("EQU104", "AVAILABLE");
        List<User> users2 = new ArrayList<>();
        users2.add(student2);
        UserNotificationObserver observer2 = new UserNotificationObserver(users2);
        affectedUsers.add(student);
        ctx.registerObserver(observer);
        ctx.registerObserver(observer2);
        ctx.disable();
        assertTrue(observer.getNotificationLog().contains("John"));
        assertTrue(observer2.getNotificationLog().contains("Mary"));
    }

    @Test
    public void equipmentContext_enableDoesNotNotify() {
        EquipmentContext ctx = new EquipmentContext("EQU105", "DISABLED");
        affectedUsers.add(student);
        ctx.registerObserver(observer);
        ctx.enable();
        assertEquals("", observer.getNotificationLog());
    }

    @Test
    public void equipmentContext_notifyObserversDirectly() {
        EquipmentContext ctx = new EquipmentContext("EQU106", "AVAILABLE");
        affectedUsers.add(student);
        ctx.registerObserver(observer);
        ctx.notifyObservers("EQU106", "DISABLED");
        assertTrue(observer.getNotificationLog().contains("DISABLED"));
    }
}