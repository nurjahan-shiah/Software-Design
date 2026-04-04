package test;
import pattern.singleton.*;
import model.Reservation;
import static org.junit.Assert.*;
import org.junit.Test;

public class BookingSystemTests {
    @Test
    public void singleInstanceTest() {
        BookingSystem system1 = BookingSystem.getInstance();
        BookingSystem system2 = BookingSystem.getInstance();
        assertEquals(system1,system2);
    }

    @Test
    public void singleInstanceTest2() {
        BookingSystem system = BookingSystem.getInstance();
        Reservation booking1 = new Reservation();
        booking1.setEquipmentID("EQU001");
        booking1.setStatus("CONFIRMED");
        Reservation booking2 = new Reservation();
        booking2.setEquipmentID("EQU002");
        booking2.setStatus("CONFIRMED");
        Reservation booking3 = new Reservation();
        booking3.setEquipmentID("EQU003");
        booking3.setStatus("CONFIRMED");
        system.addBooking(booking1);
        system.addBooking(booking2);
        assertTrue(system.checkActiveBookings("EQU001"));
        assertTrue(system.checkActiveBookings("EQU002"));
        assertFalse(system.checkActiveBookings("EQU003"));
        system.addBooking(booking3);
        assertTrue(system.checkActiveBookings("EQU003"));
    }

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

        // EQU010 start time is in the past - cancelFutureBookings won't affect it
        system.cancelFutureBookings("EQU010");
        assertTrue(system.checkActiveBookings("EQU010"));
        assertEquals("CONFIRMED", booking1.getStatus());

        // EQU011 start time is in the future - booking remains in system but status unchanged
        system.cancelFutureBookings("EQU011");
        assertEquals("CONFIRMED", booking2.getStatus());

        // EQU012 is unaffected
        assertTrue(system.checkActiveBookings("EQU012"));
        assertEquals("CONFIRMED", booking3.getStatus());
    }
}