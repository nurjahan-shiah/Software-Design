package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import pattern.command.*;
import model.*;

public class CommandTests {

    private ReservationService reservationService;
    private Reservation reservation;

    private final String bookingID = "00ade";
    private final String userID = "user01";
    private final String equipmentID = "EQU0012";
    private final String startTime = "2026-03-10 09:30";
    private final String endTime = "2026-03-10 12:30";
    private final String paymentMethod = "Credit";
    private final double depositAmount = 20.0;

    @Before
    public void setUp() {
        reservationService = new ReservationService();
        reservation = new Reservation(bookingID, userID, equipmentID,
                startTime, endTime, paymentMethod, depositAmount);
    }

    // ===================== CancelCommand Tests =====================

    @Test
    public void cancelTest() {
        CancelCommand cancelCommand = new CancelCommand(reservationService, reservation);
        cancelCommand.execute();
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void cancel_statusNotConfirmed() {
        new CancelCommand(reservationService, reservation).execute();
        assertFalse("CONFIRMED".equals(reservation.getStatus()));
    }

    @Test
    public void cancel_statusNotForfeited() {
        new CancelCommand(reservationService, reservation).execute();
        assertFalse("FORFEITED".equals(reservation.getStatus()));
    }

    @Test
    public void cancel_depositNotForfeited() {
        new CancelCommand(reservationService, reservation).execute();
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void cancel_equipmentIDUnchanged() {
        new CancelCommand(reservationService, reservation).execute();
        assertEquals(equipmentID, reservation.getEquipmentID());
    }

    // ===================== ReserveCommand Tests =====================

    @Test
    public void reserveTest() {
        ReserveCommand reserveCommand = new ReserveCommand(reservationService, reservation);
        reserveCommand.execute();
        assertEquals("CONFIRMED", reservation.getStatus());
        assertFalse("CANCELLED".equals(reservation.getStatus()));
    }

    @Test
    public void reserve_bookingIDUnchanged() {
        new ReserveCommand(reservationService, reservation).execute();
        assertEquals(bookingID, reservation.getBookingID());
    }

    @Test
    public void reserve_equipmentIDUnchanged() {
        new ReserveCommand(reservationService, reservation).execute();
        assertEquals(equipmentID, reservation.getEquipmentID());
    }

    @Test
    public void reserve_depositNotForfeited() {
        new ReserveCommand(reservationService, reservation).execute();
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void reserve_notExtendedByDefault() {
        new ReserveCommand(reservationService, reservation).execute();
        assertFalse(reservation.isExtended());
    }

    // ===================== ExtendCommand Tests =====================

    @Test
    public void extendTest() {
        String newEndTime = "2026-03-10 15:00";
        new ReserveCommand(reservationService, reservation).execute();
        new ExtendCommand(reservationService, reservation, newEndTime).execute();
        assertEquals(newEndTime, reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void extend_startTimeUnchanged() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 16:00").execute();
        assertEquals(startTime, reservation.getStartTime());
    }

    @Test
    public void extend_isExtendedTrue() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 17:00").execute();
        assertTrue(reservation.isExtended());
    }

    @Test
    public void extend_multipleExtensions_lastEndTimeKept() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 14:00").execute();
        new ExtendCommand(reservationService, reservation, "2026-03-10 16:00").execute();
        assertEquals("2026-03-10 16:00", reservation.getEndTime());
    }

    // ===================== ModifyCommand Tests =====================

    @Test
    public void modifyTest() {
        String newStart = "2026-03-10 11:30";
        String newEnd = "2026-03-10 14:30";
        new ModifyCommand(reservationService, reservation, newStart, newEnd).execute();
        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void modify_statusUnchanged() {
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 13:00").execute();
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void modify_bookingIDUnchanged() {
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 13:00").execute();
        assertEquals(bookingID, reservation.getBookingID());
    }

    @Test
    public void modify_equipmentIDUnchanged() {
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 13:00").execute();
        assertEquals(equipmentID, reservation.getEquipmentID());
    }

    // ===================== ForfeitDepositCommand Tests =====================

    @Test
    public void forfeitDepositTest() {
        ForfeitDepositCommand forfeitCommand = new ForfeitDepositCommand(reservationService, reservation);
        forfeitCommand.execute();
        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
        assertFalse("CANCELLED".equals(reservation.getStatus()));
        assertFalse("CONFIRMED".equals(reservation.getStatus()));
    }

    @Test
    public void forfeit_equipmentIDUnchanged() {
        new ForfeitDepositCommand(reservationService, reservation).execute();
        assertEquals(equipmentID, reservation.getEquipmentID());
    }

    @Test
    public void forfeit_depositAmountUnchanged() {
        new ForfeitDepositCommand(reservationService, reservation).execute();
        assertEquals(depositAmount, reservation.getDepositAmount(), 0.001);
    }

    // ===================== Extended Workflow Tests =====================

    @Test
    public void extendAndModifyTest() {
        new ReserveCommand(reservationService, reservation).execute();
        String newEndTime = "2026-03-10 13:30";
        new ExtendCommand(reservationService, reservation, newEndTime).execute();
        assertEquals(newEndTime, reservation.getEndTime());
        String newStart = "2026-03-10 11:30";
        String newEnd = "2026-03-10 14:30";
        new ModifyCommand(reservationService, reservation, newStart, newEnd).execute();
        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void reserve_thenCancel_isCancelled() {
        new ReserveCommand(reservationService, reservation).execute();
        new CancelCommand(reservationService, reservation).execute();
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void reserve_thenForfeit_isForfeited() {
        new ReserveCommand(reservationService, reservation).execute();
        new ForfeitDepositCommand(reservationService, reservation).execute();
        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    // ===================== ReservationService Direct Tests =====================

    @Test
    public void service_reserve_setsConfirmed() {
        reservationService.reserve(reservation);
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void service_cancel_setsCancelled() {
        reservationService.cancel(reservation);
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void service_modify_updatesTime() {
        reservationService.modify(reservation, "2026-04-01 08:00", "2026-04-01 10:00");
        assertEquals("2026-04-01 08:00", reservation.getStartTime());
        assertEquals("2026-04-01 10:00", reservation.getEndTime());
    }

    @Test
    public void service_extend_updatesEndTime() {
        reservationService.extend(reservation, "2026-03-10 18:00");
        assertEquals("2026-03-10 18:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void service_forfeit_setsForfeited() {
        reservationService.forfeitDeposit(reservation);
        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }
}