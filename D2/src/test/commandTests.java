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
        new CancelCommand(reservationService, reservation).execute();
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

    @Test
    public void cancel_userIDUnchanged() {
        new CancelCommand(reservationService, reservation).execute();
        assertEquals(userID, reservation.getUserID());
    }

    @Test
    public void cancel_bookingIDUnchanged() {
        new CancelCommand(reservationService, reservation).execute();
        assertEquals(bookingID, reservation.getBookingID());
    }

    @Test
    public void cancel_startTimeUnchanged() {
        new CancelCommand(reservationService, reservation).execute();
        assertEquals(startTime, reservation.getStartTime());
    }

    @Test
    public void cancel_endTimeUnchanged() {
        new CancelCommand(reservationService, reservation).execute();
        assertEquals(endTime, reservation.getEndTime());
    }

    @Test
    public void cancel_depositAmountUnchanged() {
        new CancelCommand(reservationService, reservation).execute();
        assertEquals(depositAmount, reservation.getDepositAmount(), 0.001);
    }

    // ===================== ReserveCommand Tests =====================

    @Test
    public void reserveTest() {
        new ReserveCommand(reservationService, reservation).execute();
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

    @Test
    public void reserve_userIDUnchanged() {
        new ReserveCommand(reservationService, reservation).execute();
        assertEquals(userID, reservation.getUserID());
    }

    @Test
    public void reserve_startTimeUnchanged() {
        new ReserveCommand(reservationService, reservation).execute();
        assertEquals(startTime, reservation.getStartTime());
    }

    @Test
    public void reserve_endTimeUnchanged() {
        new ReserveCommand(reservationService, reservation).execute();
        assertEquals(endTime, reservation.getEndTime());
    }

    @Test
    public void reserve_paymentMethodUnchanged() {
        new ReserveCommand(reservationService, reservation).execute();
        assertEquals(paymentMethod, reservation.getPaymentMethod());
    }

    @Test
    public void reserve_depositAmountUnchanged() {
        new ReserveCommand(reservationService, reservation).execute();
        assertEquals(depositAmount, reservation.getDepositAmount(), 0.001);
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

    @Test
    public void extend_equipmentIDUnchanged() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 15:00").execute();
        assertEquals(equipmentID, reservation.getEquipmentID());
    }

    @Test
    public void extend_bookingIDUnchanged() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 15:00").execute();
        assertEquals(bookingID, reservation.getBookingID());
    }

    @Test
    public void extend_userIDUnchanged() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 15:00").execute();
        assertEquals(userID, reservation.getUserID());
    }

    @Test
    public void extend_depositAmountUnchanged() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 15:00").execute();
        assertEquals(depositAmount, reservation.getDepositAmount(), 0.001);
    }

    @Test
    public void extend_statusUnchanged() {
        new ExtendCommand(reservationService, reservation, "2026-03-10 15:00").execute();
        assertEquals("CONFIRMED", reservation.getStatus());
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

    @Test
    public void modify_userIDUnchanged() {
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 13:00").execute();
        assertEquals(userID, reservation.getUserID());
    }

    @Test
    public void modify_depositAmountUnchanged() {
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 13:00").execute();
        assertEquals(depositAmount, reservation.getDepositAmount(), 0.001);
    }

    @Test
    public void modify_depositNotForfeited() {
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 13:00").execute();
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void modify_twice_secondValuesKept() {
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 10:00", "2026-03-10 13:00").execute();
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 14:00").execute();
        assertEquals("2026-03-10 11:00", reservation.getStartTime());
        assertEquals("2026-03-10 14:00", reservation.getEndTime());
    }

    // ===================== ForfeitDepositCommand Tests =====================

    @Test
    public void forfeitDepositTest() {
        new ForfeitDepositCommand(reservationService, reservation).execute();
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

    @Test
    public void forfeit_bookingIDUnchanged() {
        new ForfeitDepositCommand(reservationService, reservation).execute();
        assertEquals(bookingID, reservation.getBookingID());
    }

    @Test
    public void forfeit_userIDUnchanged() {
        new ForfeitDepositCommand(reservationService, reservation).execute();
        assertEquals(userID, reservation.getUserID());
    }

    @Test
    public void forfeit_startTimeUnchanged() {
        new ForfeitDepositCommand(reservationService, reservation).execute();
        assertEquals(startTime, reservation.getStartTime());
    }

    // ===================== Workflow / Integration Tests =====================

    @Test
    public void extendAndModifyTest() {
        new ReserveCommand(reservationService, reservation).execute();
        new ExtendCommand(reservationService, reservation, "2026-03-10 13:30").execute();
        assertEquals("2026-03-10 13:30", reservation.getEndTime());
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:30", "2026-03-10 14:30").execute();
        assertEquals("2026-03-10 11:30", reservation.getStartTime());
        assertEquals("2026-03-10 14:30", reservation.getEndTime());
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

    @Test
    public void reserve_thenModify_thenCancel() {
        new ReserveCommand(reservationService, reservation).execute();
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 10:00", "2026-03-10 13:00").execute();
        new CancelCommand(reservationService, reservation).execute();
        assertEquals("CANCELLED", reservation.getStatus());
        assertEquals("2026-03-10 10:00", reservation.getStartTime());
    }

    @Test
    public void reserve_thenExtend_thenForfeit() {
        new ReserveCommand(reservationService, reservation).execute();
        new ExtendCommand(reservationService, reservation, "2026-03-10 15:00").execute();
        new ForfeitDepositCommand(reservationService, reservation).execute();
        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isExtended());
        assertEquals("2026-03-10 15:00", reservation.getEndTime());
    }

    @Test
    public void differentReservations_independentState() {
        Reservation r2 = new Reservation("BK002", "user02", "EQU002",
                "2026-04-01 09:00", "2026-04-01 11:00", "DEBIT", 15.0);
        new ReserveCommand(reservationService, reservation).execute();
        new CancelCommand(reservationService, r2).execute();
        assertEquals("CONFIRMED", reservation.getStatus());
        assertEquals("CANCELLED", r2.getStatus());
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

    @Test
    public void service_modify_doesNotChangeStatus() {
        reservationService.modify(reservation, "2026-04-01 08:00", "2026-04-01 10:00");
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void service_extend_doesNotChangeStatus() {
        reservationService.extend(reservation, "2026-03-10 18:00");
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void service_reserve_doesNotForfeitDeposit() {
        reservationService.reserve(reservation);
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void service_cancel_doesNotForfeitDeposit() {
        reservationService.cancel(reservation);
        assertFalse(reservation.isDepositForfeited());
    }
}