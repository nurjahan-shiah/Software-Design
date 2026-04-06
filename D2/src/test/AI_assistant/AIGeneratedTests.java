package test.AI_assistant;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.*;
import pattern.command.*;
import pattern.factory.*;
import pattern.observer.*;
import pattern.singleton.*;
import pattern.state.*;
import pattern.strategy.*;

import java.util.ArrayList;
import java.util.List;

/**
 * AI-Generated Test Suite
 * Generated using Claude (Anthropic) as the AI assistant.
 * Tests were reviewed, corrected, and validated manually before inclusion.
 */
public class AIGeneratedTests {

    // ===================== Factory Pattern Tests =====================

    @Test
    public void aiTest_factoryCreatesStudent() {
        UserFactory factory = new UserFactory();
        User user = factory.getUserType("STUDENT");
        assertNotNull(user);
        assertTrue(user instanceof Student);
    }

    @Test
    public void aiTest_factoryCreatesFaculty() {
        UserFactory factory = new UserFactory();
        User user = factory.getUserType("FACULTY");
        assertNotNull(user);
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void aiTest_factoryCreatesResearcher() {
        UserFactory factory = new UserFactory();
        User user = factory.getUserType("RESEARCHER");
        assertNotNull(user);
        assertTrue(user instanceof Researcher);
    }

    @Test
    public void aiTest_factoryCreatesGuest() {
        UserFactory factory = new UserFactory();
        User user = factory.getUserType("GUEST");
        assertNotNull(user);
        assertTrue(user instanceof Guest);
    }

    @Test
    public void aiTest_factoryCreatesManager() {
        UserFactory factory = new UserFactory();
        User user = factory.getUserType("MANAGER");
        assertNotNull(user);
        assertTrue(user instanceof LabManager);
    }

    @Test
    public void aiTest_factoryCreatesCoordinator() {
        UserFactory factory = new UserFactory();
        User user = factory.getUserType("COORDINATOR");
        assertNotNull(user);
        assertTrue(user instanceof HeadLabCoordinator);
    }

    @Test
    public void aiTest_studentFeeRateIs10() {
        UserFactory factory = new UserFactory();
        assertEquals(10.0, factory.getUserType("STUDENT").getFeeRate(), 0.001);
    }

    @Test
    public void aiTest_guestFeeRateIs30() {
        UserFactory factory = new UserFactory();
        assertEquals(30.0, factory.getUserType("GUEST").getFeeRate(), 0.001);
    }

    @Test
    public void aiTest_facultyFeeRateIs15() {
        UserFactory factory = new UserFactory();
        assertEquals(15.0, factory.getUserType("FACULTY").getFeeRate(), 0.001);
    }

    @Test
    public void aiTest_researcherFeeRateIs20() {
        UserFactory factory = new UserFactory();
        assertEquals(20.0, factory.getUserType("RESEARCHER").getFeeRate(), 0.001);
    }

    @Test
    public void aiTest_managerFeeRateIsZero() {
        UserFactory factory = new UserFactory();
        assertEquals(0.0, factory.getUserType("MANAGER").getFeeRate(), 0.001);
    }

    @Test
    public void aiTest_coordinatorFeeRateIsZero() {
        UserFactory factory = new UserFactory();
        assertEquals(0.0, factory.getUserType("COORDINATOR").getFeeRate(), 0.001);
    }

    @Test
    public void aiTest_factoryUnknownTypeReturnsNull() {
        UserFactory factory = new UserFactory();
        assertNull(factory.getUserType("UNKNOWN_TYPE"));
    }

    @Test
    public void aiTest_factoryEmptyStringReturnsNull() {
        UserFactory factory = new UserFactory();
        assertNull(factory.getUserType(""));
    }

    @Test
    public void aiTest_factoryTwoStudents_areDistinct() {
        UserFactory factory = new UserFactory();
        User s1 = factory.getUserType("STUDENT");
        User s2 = factory.getUserType("STUDENT");
        assertNotSame(s1, s2);
    }

    @Test
    public void aiTest_factoryTwoGuests_areDistinct() {
        UserFactory factory = new UserFactory();
        User g1 = factory.getUserType("GUEST");
        User g2 = factory.getUserType("GUEST");
        assertNotSame(g1, g2);
    }

    // ===================== Singleton - BookingSystem Tests =====================

    @Test
    public void aiTest_bookingSystemSingletonNotNull() {
        assertNotNull(BookingSystem.getInstance());
    }

    @Test
    public void aiTest_bookingSystemSameInstance() {
        BookingSystem b1 = BookingSystem.getInstance();
        BookingSystem b2 = BookingSystem.getInstance();
        assertSame(b1, b2);
    }

    @Test
    public void aiTest_bookingSystemAddAndCheck() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation r = new Reservation();
        r.setEquipmentID("AI_EQU001");
        r.setStatus("CONFIRMED");
        system.addBooking(r);
        assertTrue(system.checkActiveBookings("AI_EQU001"));
    }

    @Test
    public void aiTest_bookingSystemUnknownEquipmentReturnsFalse() {
        BookingSystem system = BookingSystem.getInstance();
        assertFalse(system.checkActiveBookings("NONEXISTENT_XYZ"));
    }

    // ===================== Singleton - HeadLabCoordinatorSingleton Tests =====================

    @Test
    public void aiTest_coordinatorSingletonNotNull() {
        assertNotNull(HeadLabCoordinatorSingleton.getInstance());
    }

    @Test
    public void aiTest_coordinatorSingletonSameInstance() {
        HeadLabCoordinatorSingleton c1 = HeadLabCoordinatorSingleton.getInstance();
        HeadLabCoordinatorSingleton c2 = HeadLabCoordinatorSingleton.getInstance();
        assertSame(c1, c2);
    }

    @Test
    public void aiTest_coordinatorGeneratesManager() {
        HeadLabCoordinatorSingleton c = HeadLabCoordinatorSingleton.getInstance();
        LabManager m = c.generateManagerAccount("AI_MGR001", "AI Manager",
                "ai@yorku.ca", "pass", "CS");
        assertNotNull(m);
        assertEquals("AI_MGR001", m.getManagerID());
    }

    @Test
    public void aiTest_coordinatorManagerIsActive() {
        HeadLabCoordinatorSingleton c = HeadLabCoordinatorSingleton.getInstance();
        LabManager m = c.generateManagerAccount("AI_MGR002", "Test Mgr",
                "mgr@yorku.ca", "pass", "Math");
        assertEquals("ACTIVE", m.getStatus());
    }

    @Test
    public void aiTest_coordinatorManagerType() {
        HeadLabCoordinatorSingleton c = HeadLabCoordinatorSingleton.getInstance();
        LabManager m = c.generateManagerAccount("AI_MGR003", "Test Mgr2",
                "mgr2@yorku.ca", "pass", "Physics");
        assertEquals("MANAGER", m.getUserType());
    }

    // ===================== Command Pattern Tests =====================

    private ReservationService service;
    private Reservation reservation;

    @Before
    public void setUp() {
        service = new ReservationService();
        reservation = new Reservation("AI_BK001", "USR001", "EQU001",
                "2026-06-01 09:00", "2026-06-01 11:00", "CREDIT", 20.0);
    }

    @Test
    public void aiTest_reserveCommandSetsConfirmed() {
        ReserveCommand cmd = new ReserveCommand(service, reservation);
        cmd.execute();
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void aiTest_cancelCommandSetsCancelled() {
        CancelCommand cmd = new CancelCommand(service, reservation);
        cmd.execute();
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void aiTest_extendCommandUpdatesEndTime() {
        ExtendCommand cmd = new ExtendCommand(service, reservation, "2026-06-01 14:00");
        cmd.execute();
        assertEquals("2026-06-01 14:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void aiTest_modifyCommandUpdatesStartAndEnd() {
        ModifyCommand cmd = new ModifyCommand(service, reservation,
                "2026-06-01 10:00", "2026-06-01 13:00");
        cmd.execute();
        assertEquals("2026-06-01 10:00", reservation.getStartTime());
        assertEquals("2026-06-01 13:00", reservation.getEndTime());
    }

    @Test
    public void aiTest_forfeitDepositCommandSetsForfeited() {
        ForfeitDepositCommand cmd = new ForfeitDepositCommand(service, reservation);
        cmd.execute();
        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void aiTest_reservationServiceReserve() {
        service.reserve(reservation);
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void aiTest_reservationServiceCancel() {
        service.cancel(reservation);
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void aiTest_reservationServiceModify() {
        service.modify(reservation, "2026-07-01 08:00", "2026-07-01 10:00");
        assertEquals("2026-07-01 08:00", reservation.getStartTime());
        assertEquals("2026-07-01 10:00", reservation.getEndTime());
    }

    @Test
    public void aiTest_reservationServiceExtend() {
        service.extend(reservation, "2026-06-01 15:00");
        assertEquals("2026-06-01 15:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void aiTest_reservationServiceForfeit() {
        service.forfeitDeposit(reservation);
        assertTrue(reservation.isDepositForfeited());
        assertEquals("FORFEITED", reservation.getStatus());
    }

    // ===================== Observer Pattern Tests =====================

    @Test
    public void aiTest_observerNotifiesOnDisabled() {
        List<User> users = new ArrayList<>();
        Student s = new Student();
        s.setName("Alice");
        users.add(s);
        UserNotificationObserver obs = new UserNotificationObserver(users);
        obs.update("EQU001", "DISABLED");
        assertTrue(obs.getNotificationLog().contains("Alice"));
        assertTrue(obs.getNotificationLog().contains("DISABLED"));
    }

    @Test
    public void aiTest_observerNotifiesOnMaintenance() {
        List<User> users = new ArrayList<>();
        Student s = new Student();
        s.setName("Bob");
        users.add(s);
        UserNotificationObserver obs = new UserNotificationObserver(users);
        obs.update("EQU002", "MAINTENANCE");
        assertTrue(obs.getNotificationLog().contains("Bob"));
        assertTrue(obs.getNotificationLog().contains("MAINTENANCE"));
    }

    @Test
    public void aiTest_observerDoesNotNotifyOnAvailable() {
        List<User> users = new ArrayList<>();
        Student s = new Student();
        s.setName("Carol");
        users.add(s);
        UserNotificationObserver obs = new UserNotificationObserver(users);
        obs.update("EQU003", "AVAILABLE");
        assertEquals("", obs.getNotificationLog());
    }

    @Test
    public void aiTest_observerNotifiesMultipleUsers() {
        List<User> users = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Dave");
        Student s2 = new Student();
        s2.setName("Eve");
        users.add(s1);
        users.add(s2);
        UserNotificationObserver obs = new UserNotificationObserver(users);
        obs.update("EQU004", "DISABLED");
        assertTrue(obs.getNotificationLog().contains("Dave"));
        assertTrue(obs.getNotificationLog().contains("Eve"));
    }

    @Test
    public void aiTest_equipmentContextRegistersObserver() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU001", "AVAILABLE");
        List<User> users = new ArrayList<>();
        Student s = new Student();
        s.setName("Frank");
        users.add(s);
        UserNotificationObserver obs = new UserNotificationObserver(users);
        ctx.registerObserver(obs);
        ctx.disable();
        assertTrue(obs.getNotificationLog().contains("Frank"));
        assertTrue(obs.getNotificationLog().contains("DISABLED"));
    }

    @Test
    public void aiTest_equipmentContextRemovesObserver() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU002", "AVAILABLE");
        List<User> users = new ArrayList<>();
        Student s = new Student();
        s.setName("Grace");
        users.add(s);
        UserNotificationObserver obs = new UserNotificationObserver(users);
        ctx.registerObserver(obs);
        ctx.removeObserver(obs);
        ctx.disable();
        assertEquals("", obs.getNotificationLog());
    }

    // ===================== State Pattern Tests =====================

    @Test
    public void aiTest_availableToDisabled() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU010", "AVAILABLE");
        ctx.disable();
        assertEquals("DISABLED", ctx.getStatusString());
    }

    @Test
    public void aiTest_availableToMaintenance() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU011", "AVAILABLE");
        ctx.markUnderMaintenance();
        assertEquals("MAINTENANCE", ctx.getStatusString());
    }

    @Test
    public void aiTest_disabledToAvailable() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU012", "DISABLED");
        ctx.enable();
        assertEquals("AVAILABLE", ctx.getStatusString());
    }

    @Test
    public void aiTest_maintenanceToAvailable() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU013", "MAINTENANCE");
        ctx.enable();
        assertEquals("AVAILABLE", ctx.getStatusString());
    }

    @Test
    public void aiTest_maintenanceToDisabled() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU014", "MAINTENANCE");
        ctx.disable();
        assertEquals("DISABLED", ctx.getStatusString());
    }

    // ===================== Strategy Pattern Tests =====================

    @Test
    public void aiTest_creditCardPaymentSucceeds() {
        PaymentTransaction txn = new PaymentTransaction("TXN001", "BK001", 100.0, "CREDIT");
        CreditCardPayment strategy = new CreditCardPayment();
        assertTrue(strategy.pay(txn));
        assertEquals("SUCCESS", txn.getPaymentStatus());
    }

    @Test
    public void aiTest_debitPaymentSucceeds() {
        PaymentTransaction txn = new PaymentTransaction("TXN002", "BK002", 80.0, "DEBIT");
        DebitPayment strategy = new DebitPayment();
        assertTrue(strategy.pay(txn));
        assertEquals("SUCCESS", txn.getPaymentStatus());
    }

    @Test
    public void aiTest_grantPaymentSucceeds() {
        PaymentTransaction txn = new PaymentTransaction("TXN003", "BK003", 200.0, "GRANT");
        GrantPayment strategy = new GrantPayment();
        assertTrue(strategy.pay(txn));
        assertEquals("SUCCESS", txn.getPaymentStatus());
    }

    @Test
    public void aiTest_institutionalPaymentSucceeds() {
        PaymentTransaction txn = new PaymentTransaction("TXN004", "BK004", 150.0, "INSTITUTIONAL");
        InstitutionalPayment strategy = new InstitutionalPayment();
        assertTrue(strategy.pay(txn));
        assertEquals("SUCCESS", txn.getPaymentStatus());
    }

    @Test
    public void aiTest_processorWithNullStrategyDeclines() {
        PaymentTransaction txn = new PaymentTransaction("TXN005", "BK005", 50.0, "CREDIT");
        PaymentProcessor processor = new PaymentProcessor(null);
        assertFalse(processor.processPayment(txn));
        assertEquals("DECLINED", txn.getPaymentStatus());
    }

    @Test
    public void aiTest_processorSwitchesStrategy() {
        PaymentTransaction txn = new PaymentTransaction("TXN006", "BK006", 60.0, "DEBIT");
        PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
        processor.setPaymentStrategy(new DebitPayment());
        assertTrue(processor.processPayment(txn));
        assertEquals("SUCCESS", txn.getPaymentStatus());
    }

    // ===================== Additional Model Tests =====================

    @Test
    public void aiTest_reservationDefaultConstructor_noStatus() {
        Reservation r = new Reservation();
        assertNull(r.getBookingID());
        assertNull(r.getStatus());
    }

    @Test
    public void aiTest_reservationSetAndGetUserID() {
        Reservation r = new Reservation();
        r.setUserID("USR999");
        assertEquals("USR999", r.getUserID());
    }

    @Test
    public void aiTest_reservationNotExtendedByDefault() {
        Reservation r = new Reservation("BK010", "USR001", "EQU001",
                "2026-06-01 09:00", "2026-06-01 11:00", "CREDIT", 25.0);
        assertFalse(r.isExtended());
    }

    @Test
    public void aiTest_reservationNotForfeitedByDefault() {
        Reservation r = new Reservation("BK011", "USR001", "EQU001",
                "2026-06-01 09:00", "2026-06-01 11:00", "CREDIT", 25.0);
        assertFalse(r.isDepositForfeited());
    }

    @Test
    public void aiTest_reservationCancel_setsCancelled() {
        Reservation r = new Reservation("BK012", "USR001", "EQU001",
                "2026-06-01 09:00", "2026-06-01 11:00", "CREDIT", 25.0);
        r.cancel();
        assertEquals("CANCELLED", r.getStatus());
    }

    @Test
    public void aiTest_reservationToString_containsBookingID() {
        Reservation r = new Reservation("BK013", "USR001", "EQU001",
                "2026-06-01 09:00", "2026-06-01 11:00", "CREDIT", 25.0);
        assertTrue(r.toString().contains("BK013"));
    }

    @Test
    public void aiTest_equipmentContextGetEquipmentID() {
        EquipmentContext ctx = new EquipmentContext("AI_VERIFY_001", "AVAILABLE");
        assertEquals("AI_VERIFY_001", ctx.getEquipmentID());
    }

    @Test
    public void aiTest_equipmentContextUnknownStatusDefaultsAvailable() {
        EquipmentContext ctx = new EquipmentContext("AI_EQU099", "INVALID_STATUS");
        assertEquals("AVAILABLE", ctx.getStatusString());
    }
}