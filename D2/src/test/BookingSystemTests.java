package test;

import pattern.singleton.*;
import model.Reservation;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class BookingSystemTests {

    @Before
    public void clearBookings() {
        BookingSystem.getInstance().getReservations().clear();
    }

    // ===================== Singleton Tests =====================

    @Test
    public void singleInstanceTest() {
        BookingSystem system1 = BookingSystem.getInstance();
        BookingSystem system2 = BookingSystem.getInstance();
        assertEquals(system1, system2);
    }

    @Test
    public void singleInstanceNotNull() {
        assertNotNull(BookingSystem.getInstance());
    }

    @Test
    public void singleInstanceSameReference() {
        assertSame(BookingSystem.getInstance(), BookingSystem.getInstance());
    }

    // ===================== addBooking / checkActiveBookings Tests =====================

    @Test
    public void singleInstanceTest2() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation booking1 = new Reservation();
        booking1.setEquipmentID("EQU001");
        booking1.setStatus("CONFIRMED");
        booking1.setStartTime("2026-05-01 09:00");
        Reservation booking2 = new Reservation();
        booking2.setEquipmentID("EQU002");
        booking2.setStatus("CONFIRMED");
        booking2.setStartTime("2026-05-01 09:00");
        Reservation booking3 = new Reservation();
        booking3.setEquipmentID("EQU003");
        booking3.setStatus("CONFIRMED");
        booking3.setStartTime("2026-05-01 09:00");
        system.addBooking(booking1);
        system.addBooking(booking2);
        assertTrue(system.checkActiveBookings("EQU001"));
        assertTrue(system.checkActiveBookings("EQU002"));
        assertFalse(system.checkActiveBookings("EQU003"));
        system.addBooking(booking3);
        assertTrue(system.checkActiveBookings("EQU003"));
    }

    @Test
    public void checkActiveBookings_unknownID_returnsFalse() {
        assertFalse(BookingSystem.getInstance().checkActiveBookings("DOES_NOT_EXIST_999"));
    }

    @Test
    public void addBooking_singleBooking_isFound() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation r = new Reservation();
        r.setEquipmentID("EQU_SINGLE_001");
        r.setStatus("CONFIRMED");
        r.setStartTime("2026-05-01 09:00");
        system.addBooking(r);
        assertTrue(system.checkActiveBookings("EQU_SINGLE_001"));
    }

    @Test
    public void addBooking_multipleBookings_allFound() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation r1 = new Reservation();
        r1.setEquipmentID("EQU_MULTI_A");
        r1.setStatus("CONFIRMED");
        r1.setStartTime("2026-05-01 09:00");
        Reservation r2 = new Reservation();
        r2.setEquipmentID("EQU_MULTI_B");
        r2.setStatus("CONFIRMED");
        r2.setStartTime("2026-05-01 09:00");
        Reservation r3 = new Reservation();
        r3.setEquipmentID("EQU_MULTI_C");
        r3.setStatus("CONFIRMED");
        r3.setStartTime("2026-05-01 09:00");
        system.addBooking(r1);
        system.addBooking(r2);
        system.addBooking(r3);
        assertTrue(system.checkActiveBookings("EQU_MULTI_A"));
        assertTrue(system.checkActiveBookings("EQU_MULTI_B"));
        assertTrue(system.checkActiveBookings("EQU_MULTI_C"));
    }

    @Test
    public void getReservations_notNull() {
        assertNotNull(BookingSystem.getInstance().getReservations());
    }

    @Test
    public void getReservations_afterAdd_containsBooking() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation r = new Reservation();
        r.setEquipmentID("EQU_LIST_001");
        r.setStatus("CONFIRMED");
        r.setStartTime("2026-05-01 09:00");
        system.addBooking(r);
        assertTrue(system.getReservations().contains(r));
    }

    @Test
    public void getReservations_isList() {
        assertTrue(BookingSystem.getInstance().getReservations() instanceof List);
    }

    // ===================== cancelFutureBookings Tests =====================

    @Test
    public void futureBookingsTest() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation booking1 = new Reservation();
        booking1.setEquipmentID("EQU010");
        booking1.setStartTime("2026-02-17 15:00");
        booking1.setStatus("CONFIRMED");
        Reservation booking2 = new Reservation();
        booking2.setEquipmentID("EQU011");
        booking2.setStartTime("2026-09-05 11:30");
        booking2.setStatus("CONFIRMED");
        Reservation booking3 = new Reservation();
        booking3.setEquipmentID("EQU012");
        booking3.setStartTime("2026-05-14 10:00");
        booking3.setStatus("CONFIRMED");
        system.addBooking(booking1);
        system.addBooking(booking2);
        system.addBooking(booking3);
        system.cancelFutureBookings("EQU010");
        assertTrue(system.checkActiveBookings("EQU010"));
        assertEquals("CONFIRMED", booking1.getStatus());
        system.cancelFutureBookings("EQU011");
        assertEquals("CONFIRMED", booking2.getStatus());
        assertTrue(system.checkActiveBookings("EQU012"));
        assertEquals("CONFIRMED", booking3.getStatus());
    }

    @Test
    public void cancelFutureBookings_nonExistentID_noException() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation dummy = new Reservation();
        dummy.setEquipmentID("DUMMY_FOR_CANCEL_TEST");
        dummy.setStartTime("2026-05-01 09:00");
        dummy.setStatus("CONFIRMED");
        system.addBooking(dummy);
        system.cancelFutureBookings("TRULY_NONEXISTENT_999");
    }

    @Test
    public void cancelFutureBookings_pastBooking_statusUnchanged() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation r = new Reservation();
        r.setEquipmentID("EQU_PAST_001");
        r.setStartTime("2020-01-01 10:00");
        r.setStatus("CONFIRMED");
        system.addBooking(r);
        system.cancelFutureBookings("EQU_PAST_001");
        assertEquals("CONFIRMED", r.getStatus());
    }

    @Test
    public void cancelFutureBookings_nullStartTime_skipped() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation r = new Reservation();
        r.setEquipmentID("EQU_NULL_START");
        r.setStatus("CONFIRMED");
        // no startTime set — should be skipped without crashing
        system.addBooking(r);
        system.cancelFutureBookings("EQU_NULL_START");
        assertEquals("CONFIRMED", r.getStatus());
    }

    @Test
    public void cancelFutureBookings_mixedNullAndValid_noException() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation r1 = new Reservation();
        r1.setEquipmentID("EQU_MIX_001");
        r1.setStatus("CONFIRMED");
        // no startTime — should be skipped
        system.addBooking(r1);
        Reservation r2 = new Reservation();
        r2.setEquipmentID("EQU_MIX_002");
        r2.setStatus("CONFIRMED");
        r2.setStartTime("2026-05-01 09:00");
        system.addBooking(r2);
        system.cancelFutureBookings("EQU_MIX_002");
        assertEquals("CONFIRMED", r1.getStatus());
        assertEquals("CONFIRMED", r2.getStatus());
    }

    // ===================== HeadLabCoordinatorSingleton Tests =====================

    @Test
    public void coordinatorSingleton_notNull() {
        assertNotNull(HeadLabCoordinatorSingleton.getInstance());
    }

    @Test
    public void coordinatorSingleton_sameInstance() {
        assertSame(HeadLabCoordinatorSingleton.getInstance(), HeadLabCoordinatorSingleton.getInstance());
    }

    @Test
    public void coordinatorSingleton_defaultCoordinatorID() {
        assertEquals("C001", HeadLabCoordinatorSingleton.getInstance().getCoordinatorID());
    }

    @Test
    public void coordinatorSingleton_defaultName() {
        assertEquals("Coordinator Carol", HeadLabCoordinatorSingleton.getInstance().getName());
    }

    @Test
    public void coordinatorSingleton_defaultEmail() {
        assertEquals("coord@yorku.ca", HeadLabCoordinatorSingleton.getInstance().getEmail());
    }

    @Test
    public void coordinatorSingleton_defaultDepartment() {
        assertEquals("Administration", HeadLabCoordinatorSingleton.getInstance().getDepartment());
    }

    @Test
    public void coordinatorSingleton_generateManager_notNull() {
        assertNotNull(HeadLabCoordinatorSingleton.getInstance()
                .generateManagerAccount("BS_MGR001", "Mgr One", "m1@yorku.ca", "pw", "CS"));
    }

    @Test
    public void coordinatorSingleton_generateManager_correctID() {
        assertEquals("BS_MGR002", HeadLabCoordinatorSingleton.getInstance()
                .generateManagerAccount("BS_MGR002", "Mgr Two", "m2@yorku.ca", "pw", "Math")
                .getManagerID());
    }

    @Test
    public void coordinatorSingleton_generateManager_isActive() {
        assertEquals("ACTIVE", HeadLabCoordinatorSingleton.getInstance()
                .generateManagerAccount("BS_MGR003", "Mgr Three", "m3@yorku.ca", "pw", "Physics")
                .getStatus());
    }

    @Test
    public void coordinatorSingleton_toString_containsID() {
        assertTrue(HeadLabCoordinatorSingleton.getInstance().toString().contains("C001"));
    }
}