package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.Reservation;
import pattern.command.*;

/**
 * Manual JUnit 4 tests for the Command pattern.
 * Covers: ReserveCommand, CancelCommand, ExtendCommand,
 *         ModifyCommand, ForfeitDepositCommand, ReservationService.
 */
public class CommandTests {

    private ReservationService service;
    private Reservation reservation;

    @Before
    public void setUp() {
        service = new ReservationService();
        reservation = new Reservation("BK001", "USR001", "EQU001",
                "2026-06-01 09:00", "2026-06-01 11:00", "CREDIT", 20.0);
    }

    // ===================== ReserveCommand Tests =====================

    @Test
    public void reserveCommand_execute_setsConfirmed() {
        reservation.setStatus("PENDING");
        ReserveCommand cmd = new ReserveCommand(service, reservation);
        cmd.execute();
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void reserveCommand_execute_bookingIDUnchanged() {
        ReserveCommand cmd = new ReserveCommand(service, reservation);
        cmd.execute();
        assertEquals("BK001", reservation.getBookingID());
    }

    @Test
    public void reserveCommand_execute_equipmentIDUnchanged() {
        ReserveCommand cmd = new ReserveCommand(service, reservation);
        cmd.execute();
        assertEquals("EQU001", reservation.getEquipmentID());
    }

    // ===================== CancelCommand Tests =====================

    @Test
    public void cancelCommand_execute_setsCancelled() {
        CancelCommand cmd = new CancelCommand(service, reservation);
        cmd.execute();
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void cancelCommand_execute_fromConfirmed_setsCancelled() {
        reservation.setStatus("CONFIRMED");
        CancelCommand cmd = new CancelCommand(service, reservation);
        cmd.execute();
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void cancelCommand_execute_bookingIDUnchanged() {
        CancelCommand cmd = new CancelCommand(service, reservation);
        cmd.execute();
        assertEquals("BK001", reservation.getBookingID());
    }

    // ===================== ExtendCommand Tests =====================

    @Test
    public void extendCommand_execute_updatesEndTime() {
        ExtendCommand cmd = new ExtendCommand(service, reservation, "2026-06-01 14:00");
        cmd.execute();
        assertEquals("2026-06-01 14:00", reservation.getEndTime());
    }

    @Test
    public void extendCommand_execute_setsExtendedFlag() {
        ExtendCommand cmd = new ExtendCommand(service, reservation, "2026-06-01 14:00");
        cmd.execute();
        assertTrue(reservation.isExtended());
    }

    @Test
    public void extendCommand_execute_startTimeUnchanged() {
        ExtendCommand cmd = new ExtendCommand(service, reservation, "2026-06-01 14:00");
        cmd.execute();
        assertEquals("2026-06-01 09:00", reservation.getStartTime());
    }

    // ===================== ModifyCommand Tests =====================

    @Test
    public void modifyCommand_execute_updatesStartTime() {
        ModifyCommand cmd = new ModifyCommand(service, reservation,
                "2026-06-01 10:00", "2026-06-01 13:00");
        cmd.execute();
        assertEquals("2026-06-01 10:00", reservation.getStartTime());
    }

    @Test
    public void modifyCommand_execute_updatesEndTime() {
        ModifyCommand cmd = new ModifyCommand(service, reservation,
                "2026-06-01 10:00", "2026-06-01 13:00");
        cmd.execute();
        assertEquals("2026-06-01 13:00", reservation.getEndTime());
    }

    @Test
    public void modifyCommand_execute_updatesBothTimes() {
        ModifyCommand cmd = new ModifyCommand(service, reservation,
                "2026-07-01 08:00", "2026-07-01 10:00");
        cmd.execute();
        assertEquals("2026-07-01 08:00", reservation.getStartTime());
        assertEquals("2026-07-01 10:00", reservation.getEndTime());
    }

    // ===================== ForfeitDepositCommand Tests =====================

    @Test
    public void forfeitDepositCommand_execute_setsForfeited() {
        ForfeitDepositCommand cmd = new ForfeitDepositCommand(service, reservation);
        cmd.execute();
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void forfeitDepositCommand_execute_setsForfeitedStatus() {
        ForfeitDepositCommand cmd = new ForfeitDepositCommand(service, reservation);
        cmd.execute();
        assertEquals("FORFEITED", reservation.getStatus());
    }

    @Test
    public void forfeitDepositCommand_execute_depositAmountUnchanged() {
        ForfeitDepositCommand cmd = new ForfeitDepositCommand(service, reservation);
        cmd.execute();
        assertEquals(20.0, reservation.getDepositAmount(), 0.001);
    }

    // ===================== ReservationService Direct Tests =====================

    @Test
    public void service_reserve_setsConfirmed() {
        reservation.setStatus("PENDING");
        service.reserve(reservation);
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void service_cancel_setsCancelled() {
        service.cancel(reservation);
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void service_extend_updatesEndTimeAndFlag() {
        service.extend(reservation, "2026-06-01 15:00");
        assertEquals("2026-06-01 15:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void service_modify_updatesBothTimes() {
        service.modify(reservation, "2026-08-01 09:00", "2026-08-01 12:00");
        assertEquals("2026-08-01 09:00", reservation.getStartTime());
        assertEquals("2026-08-01 12:00", reservation.getEndTime());
    }

    @Test
    public void service_forfeitDeposit_marksForfeited() {
        service.forfeitDeposit(reservation);
        assertTrue(reservation.isDepositForfeited());
        assertEquals("FORFEITED", reservation.getStatus());
    }

    // ===================== Sequential Command Tests =====================

    @Test
    public void reserveThenCancel_statusIsCancelled() {
        new ReserveCommand(service, reservation).execute();
        assertEquals("CONFIRMED", reservation.getStatus());
        new CancelCommand(service, reservation).execute();
        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void reserveThenExtend_bothEffectsApplied() {
        new ReserveCommand(service, reservation).execute();
        new ExtendCommand(service, reservation, "2026-06-01 16:00").execute();
        assertEquals("CONFIRMED", reservation.getStatus());
        assertEquals("2026-06-01 16:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void notExtendedByDefault() {
        assertFalse(reservation.isExtended());
    }

    @Test
    public void notDepositForfeitedByDefault() {
        assertFalse(reservation.isDepositForfeited());
    }
}