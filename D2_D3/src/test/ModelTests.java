package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.*;

public class ModelTests {

    // ===================== Reservation Tests =====================

    private Reservation reservation;

    @Before
    public void setUp() {
        reservation = new Reservation("BK001", "USR001", "EQU001",
                "2026-05-01 09:00", "2026-05-01 11:00", "CREDIT", 25.0);
    }

    @Test
    public void testReservationInitialStatus() {
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void testReservationFields() {
        assertEquals("BK001", reservation.getBookingID());
        assertEquals("USR001", reservation.getUserID());
        assertEquals("EQU001", reservation.getEquipmentID());
        assertEquals("2026-05-01 09:00", reservation.getStartTime());
        assertEquals("2026-05-01 11:00", reservation.getEndTime());
        assertEquals("CREDIT", reservation.getPaymentMethod());
        assertEquals(25.0, reservation.getDepositAmount(), 0.001);
    }

    @Test
    public void testReservationCancel() {
        reservation.cancel();
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void testReservationForfeitDeposit() {
        reservation.forfeitDeposit();
        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void testReservationExtend() {
        reservation.extend("2026-05-01 13:00");
        assertEquals("2026-05-01 13:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void testReservationNotExtendedByDefault() {
        assertFalse(reservation.isExtended());
    }

    @Test
    public void testReservationDepositNotForfeitedByDefault() {
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void testReservationSetBookingID() {
        reservation.setBookingID("BK999");
        assertEquals("BK999", reservation.getBookingID());
    }

    @Test
    public void testReservationSetUserID() {
        reservation.setUserID("USR999");
        assertEquals("USR999", reservation.getUserID());
    }

    @Test
    public void testReservationSetEquipmentID() {
        reservation.setEquipmentID("EQU999");
        assertEquals("EQU999", reservation.getEquipmentID());
    }

    @Test
    public void testReservationSetStartTime() {
        reservation.setStartTime("2026-06-01 10:00");
        assertEquals("2026-06-01 10:00", reservation.getStartTime());
    }

    @Test
    public void testReservationSetEndTime() {
        reservation.setEndTime("2026-06-01 12:00");
        assertEquals("2026-06-01 12:00", reservation.getEndTime());
    }

    @Test
    public void testReservationSetExtended() {
        reservation.setExtended(true);
        assertTrue(reservation.isExtended());
    }

    @Test
    public void testReservationSetDepositAmount() {
        reservation.setDepositAmount(99.99);
        assertEquals(99.99, reservation.getDepositAmount(), 0.001);
    }

    @Test
    public void testReservationSetDepositForfeited() {
        reservation.setDepositForfeited(true);
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void testReservationSetPaymentMethod() {
        reservation.setPaymentMethod("DEBIT");
        assertEquals("DEBIT", reservation.getPaymentMethod());
    }

    @Test
    public void testReservationSetStatus() {
        reservation.setStatus("CANCELLED");
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void testReservationToString() {
        String str = reservation.toString();
        assertTrue(str.contains("BK001"));
        assertTrue(str.contains("EQU001"));
        assertTrue(str.contains("CONFIRMED"));
    }

    @Test
    public void testReservationDefaultConstructor() {
        Reservation r = new Reservation();
        assertNull(r.getBookingID());
        assertNull(r.getStatus());
    }

    // ===================== Equipment Tests =====================

    @Test
    public void testEquipmentConstructorAndGetters() {
        Equipment eq = new Equipment("EQU001", "Microscope", "High-power microscope",
                "Optical", "AVAILABLE", "Lassonde", "101");
        assertEquals("EQU001", eq.getEquipmentID());
        assertEquals("Microscope", eq.getName());
        assertEquals("High-power microscope", eq.getDescription());
        assertEquals("Optical", eq.getType());
        assertEquals("AVAILABLE", eq.getStatus());
        assertEquals("Lassonde", eq.getBuildingName());
        assertEquals("101", eq.getRoomNumber());
    }

    @Test
    public void testEquipmentIsAvailable() {
        Equipment eq = new Equipment("EQU002", "Laser", "UV Laser", "Laser",
                "AVAILABLE", "Bergeron", "202");
        assertTrue(eq.isAvailable());
    }

    @Test
    public void testEquipmentIsNotAvailable() {
        Equipment eq = new Equipment("EQU003", "Centrifuge", "High-speed centrifuge",
                "Lab", "DISABLED", "Bergeron", "203");
        assertFalse(eq.isAvailable());
    }

    @Test
    public void testEquipmentMaintenanceIsNotAvailable() {
        Equipment eq = new Equipment("EQU004", "Sensor", "Temp Sensor", "Sensor",
                "MAINTENANCE", "Lassonde", "104");
        assertFalse(eq.isAvailable());
    }

    @Test
    public void testEquipmentSetStatus() {
        Equipment eq = new Equipment("EQU005", "Scanner", "3D Scanner", "Scanner",
                "AVAILABLE", "Lassonde", "105");
        eq.setStatus("DISABLED");
        assertEquals("DISABLED", eq.getStatus());
        assertFalse(eq.isAvailable());
    }

    @Test
    public void testEquipmentGetLabLocation() {
        Equipment eq = new Equipment("EQU006", "Printer", "3D Printer", "Printer",
                "AVAILABLE", "Lassonde", "201");
        LabLocation loc = eq.getLabLocation();
        assertEquals("Lassonde", loc.getBuildingName());
        assertEquals("201", loc.getRoomNumber());
    }

    @Test
    public void testEquipmentToString() {
        Equipment eq = new Equipment("EQU007", "Robot", "Robotic arm", "Robotics",
                "AVAILABLE", "Lassonde", "301");
        String str = eq.toString();
        assertTrue(str.contains("EQU007"));
        assertTrue(str.contains("AVAILABLE"));
    }

    @Test
    public void testEquipmentDefaultConstructor() {
        Equipment eq = new Equipment();
        assertNull(eq.getEquipmentID());
        assertNull(eq.getStatus());
    }

    @Test
    public void testEquipmentSetters() {
        Equipment eq = new Equipment();
        eq.setEquipmentID("EQU100");
        eq.setName("Spectrometer");
        eq.setDescription("UV-Vis Spectrometer");
        eq.setType("Optical");
        eq.setBuildingName("Bergeron");
        eq.setRoomNumber("400");
        assertEquals("EQU100", eq.getEquipmentID());
        assertEquals("Spectrometer", eq.getName());
        assertEquals("UV-Vis Spectrometer", eq.getDescription());
        assertEquals("Optical", eq.getType());
        assertEquals("Bergeron", eq.getBuildingName());
        assertEquals("400", eq.getRoomNumber());
    }

    // ===================== Deposit Tests =====================

    @Test
    public void testDepositInitialState() {
        Deposit deposit = new Deposit(50.0);
        assertEquals(50.0, deposit.getAmount(), 0.001);
        assertFalse(deposit.isForfeited());
        assertFalse(deposit.isDeductedFromTotal());
    }

    @Test
    public void testDepositForfeit() {
        Deposit deposit = new Deposit(50.0);
        deposit.forfeit();
        assertTrue(deposit.isForfeited());
    }

    @Test
    public void testDepositSetForfeited() {
        Deposit deposit = new Deposit(30.0);
        deposit.setForfeited(true);
        assertTrue(deposit.isForfeited());
        deposit.setForfeited(false);
        assertFalse(deposit.isForfeited());
    }

    @Test
    public void testDepositDeductedFromTotal() {
        Deposit deposit = new Deposit(20.0);
        deposit.setDeductedFromTotal(true);
        assertTrue(deposit.isDeductedFromTotal());
        deposit.setDeductedFromTotal(false);
        assertFalse(deposit.isDeductedFromTotal());
    }

    @Test
    public void testDepositSetAmount() {
        Deposit deposit = new Deposit(10.0);
        deposit.setAmount(75.0);
        assertEquals(75.0, deposit.getAmount(), 0.001);
    }

    @Test
    public void testDepositDefaultConstructor() {
        Deposit deposit = new Deposit();
        assertEquals(0.0, deposit.getAmount(), 0.001);
        assertFalse(deposit.isForfeited());
    }

    // ===================== PaymentTransaction Tests =====================

    @Test
    public void testPaymentTransactionConstructor() {
        PaymentTransaction pt = new PaymentTransaction("TXN001", "BK001", 150.0, "CREDIT");
        assertEquals("TXN001", pt.getTransactionID());
        assertEquals("BK001", pt.getBookingID());
        assertEquals(150.0, pt.getTotalAmount(), 0.001);
        assertEquals("CREDIT", pt.getPaymentMethod());
        assertEquals("SUCCESS", pt.getPaymentStatus());
    }

    @Test
    public void testPaymentTransactionSetStatus() {
        PaymentTransaction pt = new PaymentTransaction("TXN002", "BK002", 200.0, "DEBIT");
        pt.setPaymentStatus("DECLINED");
        assertEquals("DECLINED", pt.getPaymentStatus());
    }

    @Test
    public void testPaymentTransactionSetters() {
        PaymentTransaction pt = new PaymentTransaction();
        pt.setTransactionID("TXN003");
        pt.setBookingID("BK003");
        pt.setTotalAmount(99.99);
        pt.setPaymentMethod("GRANT");
        pt.setPaymentStatus("SUCCESS");
        assertEquals("TXN003", pt.getTransactionID());
        assertEquals("BK003", pt.getBookingID());
        assertEquals(99.99, pt.getTotalAmount(), 0.001);
        assertEquals("GRANT", pt.getPaymentMethod());
        assertEquals("SUCCESS", pt.getPaymentStatus());
    }

    // ===================== LabLocation Tests =====================

    @Test
    public void testLabLocationConstructorAndGetters() {
        LabLocation loc = new LabLocation("Lassonde", "101");
        assertEquals("Lassonde", loc.getBuildingName());
        assertEquals("101", loc.getRoomNumber());
    }

    @Test
    public void testLabLocationGetLocationDetails() {
        LabLocation loc = new LabLocation("Bergeron", "202");
        assertEquals("Bergeron - Room 202", loc.getLocationDetails());
    }

    @Test
    public void testLabLocationToString() {
        LabLocation loc = new LabLocation("Lassonde", "305");
        assertEquals("Lassonde,305", loc.toString());
    }

    @Test
    public void testLabLocationSetters() {
        LabLocation loc = new LabLocation();
        loc.setBuildingName("Petrie");
        loc.setRoomNumber("400");
        assertEquals("Petrie", loc.getBuildingName());
        assertEquals("400", loc.getRoomNumber());
    }

    @Test
    public void testLabLocationDefaultConstructor() {
        LabLocation loc = new LabLocation();
        assertNull(loc.getBuildingName());
        assertNull(loc.getRoomNumber());
    }

    // ===================== Guest Tests =====================

    @Test
    public void testGuestFeeRate() {
        Guest g = new Guest();
        assertEquals(30.0, g.getFeeRate(), 0.001);
    }

    @Test
    public void testGuestFullConstructor() {
        Guest g = new Guest("U004", "Dave", "dave@example.com", "pass123",
                "CERT123", "ACTIVE", "External");
        assertEquals("U004", g.getUserID());
        assertEquals("Dave", g.getName());
        assertEquals("dave@example.com", g.getEmail());
        assertEquals("GUEST", g.getUserType());
        assertEquals("ACTIVE", g.getStatus());
        assertEquals("External", g.getDepartment());
    }

    @Test
    public void testGuestGetCertificationNumber() {
        Guest g = new Guest("U004", "Dave", "dave@example.com", "pass123",
                "CERT123", "ACTIVE", "External");
        assertEquals("CERT123", g.getCertificationNumber());
    }

    @Test
    public void testGuestSetCertificationNumber() {
        Guest g = new Guest();
        g.setCertificationNumber("CERT999");
        assertEquals("CERT999", g.getCertificationNumber());
    }

    @Test
    public void testGuestDefaultConstructor() {
        Guest g = new Guest();
        assertEquals(30.0, g.getFeeRate(), 0.001);
        assertNull(g.getCertificationNumber());
    }

    // ===================== HeadLabCoordinator Tests =====================

    @Test
    public void testHeadLabCoordinatorFeeRate() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        assertEquals(0.0, c.getFeeRate(), 0.001);
    }

    @Test
    public void testHeadLabCoordinatorFullConstructor() {
        HeadLabCoordinator c = new HeadLabCoordinator("C001", "Sam", "sam@yorku.ca",
                "pass123", "Administration");
        assertEquals("C001", c.getUserID());
        assertEquals("Sam", c.getName());
        assertEquals("sam@yorku.ca", c.getEmail());
        assertEquals("COORDINATOR", c.getUserType());
        assertEquals("ACTIVE", c.getStatus());
        assertEquals("Administration", c.getDepartment());
    }

    @Test
    public void testHeadLabCoordinatorGeneratesManager() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        LabManager lm = c.generateManagerAccount("LABM500", "Sam", "sam@yorku.ca",
                "temp123", "Physics");
        assertNotNull(lm);
        assertEquals("LABM500", lm.getManagerID());
        assertEquals("Sam", lm.getName());
        assertEquals("MANAGER", lm.getUserType());
    }

    @Test
    public void testHeadLabCoordinatorGeneratesManagerIsActive() {
        HeadLabCoordinator c = new HeadLabCoordinator("C001", "Sam", "sam@yorku.ca",
                "pass123", "Administration");
        LabManager lm = c.generateManagerAccount("LABM600", "Alex", "alex@yorku.ca",
                "temp456", "Engineering");
        assertEquals("ACTIVE", lm.getStatus());
        assertEquals("LABM600", lm.getManagerID());
    }

    // ===================== Student Tests =====================

    @Test
    public void testStudentFeeRate() {
        Student s = new Student();
        assertEquals(10.0, s.getFeeRate(), 0.001);
    }

    @Test
    public void testStudentFullConstructor() {
        Student s = new Student("U001", "Alice", "alice@yorku.ca", "pass123",
                "STU001", "ACTIVE", "CS");
        assertEquals("U001", s.getUserID());
        assertEquals("Alice", s.getName());
        assertEquals("alice@yorku.ca", s.getEmail());
        assertEquals("STUDENT", s.getUserType());
        assertEquals("ACTIVE", s.getStatus());
        assertEquals("CS", s.getDepartment());
    }

    // ===================== Faculty Tests =====================

    @Test
    public void testFacultyFeeRate() {
        Faculty f = new Faculty();
        assertEquals(15.0, f.getFeeRate(), 0.001);
    }

    @Test
    public void testFacultyFullConstructor() {
        Faculty f = new Faculty("U002", "Bob", "bob@yorku.ca", "pass123",
                "FAC001", "ACTIVE", "Math");
        assertEquals("U002", f.getUserID());
        assertEquals("Bob", f.getName());
        assertEquals("FACULTY", f.getUserType());
        assertEquals("ACTIVE", f.getStatus());
        assertEquals("Math", f.getDepartment());
    }

    // ===================== Researcher Tests =====================

    @Test
    public void testResearcherFeeRate() {
        Researcher r = new Researcher();
        assertEquals(20.0, r.getFeeRate(), 0.001);
    }

    @Test
    public void testResearcherFullConstructor() {
        Researcher r = new Researcher("U003", "Carol", "carol@yorku.ca", "pass123",
                "RES001", "ACTIVE", "Biology");
        assertEquals("U003", r.getUserID());
        assertEquals("Carol", r.getName());
        assertEquals("RESEARCHER", r.getUserType());
        assertEquals("ACTIVE", r.getStatus());
        assertEquals("Biology", r.getDepartment());
    }

    // ===================== LabManager Tests =====================

    @Test
    public void testLabManagerFeeRate() {
        LabManager lm = new LabManager();
        assertEquals(0.0, lm.getFeeRate(), 0.001);
    }

    @Test
    public void testLabManagerFullConstructor() {
        LabManager lm = new LabManager("M001", "Martin", "martin@yorku.ca", "mgr123",
                "LABM001", "Engineering");
        assertEquals("M001", lm.getUserID());
        assertEquals("Martin", lm.getName());
        assertEquals("LABM001", lm.getManagerID());
        assertEquals("MANAGER", lm.getUserType());
        assertEquals("ACTIVE", lm.getStatus());
        assertEquals("Engineering", lm.getDepartment());
    }

    @Test
    public void testLabManagerSetManagerID() {
        LabManager lm = new LabManager();
        lm.setManagerID("LABM999");
        assertEquals("LABM999", lm.getManagerID());
    }

    // ===================== User Setters Tests =====================

    @Test
    public void testUserAllSetters() {
        Student s = new Student();
        s.setUserID("U999");
        s.setName("Test User");
        s.setEmail("test@yorku.ca");
        s.setPassword("secret");
        s.setUserType("STUDENT");
        s.setStaffID("STU999");
        s.setStatus("PENDING");
        s.setDepartment("Engineering");

        assertEquals("U999", s.getUserID());
        assertEquals("Test User", s.getName());
        assertEquals("test@yorku.ca", s.getEmail());
        assertEquals("secret", s.getPassword());
        assertEquals("STUDENT", s.getUserType());
        assertEquals("STU999", s.getStaffID());
        assertEquals("PENDING", s.getStatus());
        assertEquals("Engineering", s.getDepartment());
    }

    @Test
    public void testUserToString() {
        Student s = new Student("U001", "Alice", "alice@yorku.ca", "pass123",
                "STU001", "ACTIVE", "CS");
        String str = s.toString();
        assertTrue(str.contains("U001"));
        assertTrue(str.contains("Alice"));
        assertTrue(str.contains("alice@yorku.ca"));
        assertTrue(str.contains("ACTIVE"));
    }
}