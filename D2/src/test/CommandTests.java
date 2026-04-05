package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
        reservation = new Reservation(
                bookingID,
                userID,
                equipmentID,
                startTime,
                endTime,
                paymentMethod,
                depositAmount);
    }

    // ===================== CancelCommand Tests =====================

    @Test
    public void cancelCommand_setsStatusToCancelled() {
        new CancelCommand(reservationService, reservation).execute();

        assertEquals("CANCELLED", reservation.getStatus());
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void cancelCommand_fromConfirmed_changesToCancelled() {
        reservationService.reserve(reservation);

        new CancelCommand(reservationService, reservation).execute();

        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void cancelCommand_twice_staysCancelled() {
        new CancelCommand(reservationService, reservation).execute();
        new CancelCommand(reservationService, reservation).execute();

        assertEquals("CANCELLED", reservation.getStatus());
        assertFalse(reservation.isDepositForfeited());
    }

    // ===================== ReserveCommand Tests =====================

    @Test
    public void reserveCommand_setsStatusToConfirmed() {
        new ReserveCommand(reservationService, reservation).execute();

        assertEquals("CONFIRMED", reservation.getStatus());
        assertFalse(reservation.isDepositForfeited());
        assertFalse(reservation.isExtended());
    }

    @Test
    public void reserveCommand_fromCancelled_changesToConfirmed() {
        reservationService.cancel(reservation);
        assertEquals("CANCELLED", reservation.getStatus());

        new ReserveCommand(reservationService, reservation).execute();

        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void reserveCommand_fromForfeited_changesToConfirmed() {
        reservationService.forfeitDeposit(reservation);
        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());

        new ReserveCommand(reservationService, reservation).execute();

        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void reserveCommand_doesNotChangeReservationIdentityFields() {
        new ReserveCommand(reservationService, reservation).execute();

        assertEquals(bookingID, reservation.getBookingID());
        assertEquals(userID, reservation.getUserID());
        assertEquals(equipmentID, reservation.getEquipmentID());
        assertEquals(startTime, reservation.getStartTime());
        assertEquals(endTime, reservation.getEndTime());
        assertEquals(paymentMethod, reservation.getPaymentMethod());
        assertEquals(depositAmount, reservation.getDepositAmount(), 0.001);
    }

    // ===================== ExtendCommand Tests =====================

    @Test
    public void extendCommand_updatesEndTimeAndMarksExtended() {
        String newEndTime = "2026-03-10 15:00";
        reservationService.reserve(reservation);

        new ExtendCommand(reservationService, reservation, newEndTime).execute();

        assertEquals(newEndTime, reservation.getEndTime());
        assertTrue(reservation.isExtended());
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void extendCommand_multipleExtensions_keepsLastEndTime() {
        reservationService.reserve(reservation);

        new ExtendCommand(reservationService, reservation, "2026-03-10 14:00").execute();
        new ExtendCommand(reservationService, reservation, "2026-03-10 16:00").execute();

        assertEquals("2026-03-10 16:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void extendCommand_doesNotChangeStartTime() {
        reservationService.reserve(reservation);

        new ExtendCommand(reservationService, reservation, "2026-03-10 18:00").execute();

        assertEquals(startTime, reservation.getStartTime());
    }

    // ===================== ModifyCommand Tests =====================

    @Test
    public void modifyCommand_updatesStartAndEndTime() {
        String newStart = "2026-03-10 11:30";
        String newEnd = "2026-03-10 14:30";
        reservationService.reserve(reservation);

        new ModifyCommand(reservationService, reservation, newStart, newEnd).execute();

        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void modifyCommand_twice_keepsSecondValues() {
        reservationService.reserve(reservation);

        new ModifyCommand(reservationService, reservation,
                "2026-03-10 10:00", "2026-03-10 13:00").execute();
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 14:00").execute();

        assertEquals("2026-03-10 11:00", reservation.getStartTime());
        assertEquals("2026-03-10 14:00", reservation.getEndTime());
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void modifyCommand_doesNotForfeitDeposit() {
        reservationService.reserve(reservation);

        new ModifyCommand(reservationService, reservation,
                "2026-03-10 11:00", "2026-03-10 13:00").execute();

        assertFalse(reservation.isDepositForfeited());
    }

    // ===================== ForfeitDepositCommand Tests =====================

    @Test
    public void forfeitDepositCommand_setsForfeitedStatusAndDepositFlag() {
        new ForfeitDepositCommand(reservationService, reservation).execute();

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void forfeitDepositCommand_fromConfirmed_changesToForfeited() {
        reservationService.reserve(reservation);
        assertEquals("CONFIRMED", reservation.getStatus());

        new ForfeitDepositCommand(reservationService, reservation).execute();

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void forfeitDepositCommand_twice_staysForfeited() {
        new ForfeitDepositCommand(reservationService, reservation).execute();
        new ForfeitDepositCommand(reservationService, reservation).execute();

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    // ===================== Workflow / Integration Tests =====================

    @Test
    public void reserveThenCancel_resultsInCancelled() {
        new ReserveCommand(reservationService, reservation).execute();
        new CancelCommand(reservationService, reservation).execute();

        assertEquals("CANCELLED", reservation.getStatus());
    }

    @Test
    public void reserveThenForfeit_resultsInForfeited() {
        new ReserveCommand(reservationService, reservation).execute();
        new ForfeitDepositCommand(reservationService, reservation).execute();

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void reserveThenExtendThenForfeit_preservesExtensionAndSetsForfeited() {
        new ReserveCommand(reservationService, reservation).execute();
        new ExtendCommand(reservationService, reservation, "2026-03-10 15:00").execute();
        new ForfeitDepositCommand(reservationService, reservation).execute();

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
        assertTrue(reservation.isExtended());
        assertEquals("2026-03-10 15:00", reservation.getEndTime());
    }

    @Test
    public void reserveThenModifyThenCancel_preservesModifiedTimeAndCancels() {
        new ReserveCommand(reservationService, reservation).execute();
        new ModifyCommand(reservationService, reservation,
                "2026-03-10 10:00", "2026-03-10 13:00").execute();
        new CancelCommand(reservationService, reservation).execute();

        assertEquals("CANCELLED", reservation.getStatus());
        assertEquals("2026-03-10 10:00", reservation.getStartTime());
        assertEquals("2026-03-10 13:00", reservation.getEndTime());
    }

    @Test
    public void differentReservations_keepIndependentState() {
        Reservation r2 = new Reservation(
                "BK002",
                "user02",
                "EQU002",
                "2026-04-01 09:00",
                "2026-04-01 11:00",
                "DEBIT",
                15.0);

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
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void service_reserve_fromCancelled_changesToConfirmed() {
        reservationService.cancel(reservation);
        assertEquals("CANCELLED", reservation.getStatus());

        reservationService.reserve(reservation);

        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void service_cancel_setsCancelled() {
        reservationService.cancel(reservation);

        assertEquals("CANCELLED", reservation.getStatus());
        assertFalse(reservation.isDepositForfeited());
    }

    @Test
    public void service_modify_updatesTimeButPreservesConfirmedStatus() {
        reservationService.reserve(reservation);

        reservationService.modify(reservation, "2026-04-01 08:00", "2026-04-01 10:00");

        assertEquals("2026-04-01 08:00", reservation.getStartTime());
        assertEquals("2026-04-01 10:00", reservation.getEndTime());
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void service_modify_secondCallOverwritesFirstCall() {
        reservationService.reserve(reservation);

        reservationService.modify(reservation, "2026-04-01 08:00", "2026-04-01 10:00");
        reservationService.modify(reservation, "2026-04-01 09:00", "2026-04-01 11:00");

        assertEquals("2026-04-01 09:00", reservation.getStartTime());
        assertEquals("2026-04-01 11:00", reservation.getEndTime());
    }

    @Test
    public void service_extend_updatesEndTimeAndMarksExtended() {
        reservationService.reserve(reservation);

        reservationService.extend(reservation, "2026-03-10 18:00");

        assertEquals("2026-03-10 18:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    public void service_extend_secondCallKeepsLatestEndTime() {
        reservationService.reserve(reservation);

        reservationService.extend(reservation, "2026-03-10 14:00");
        reservationService.extend(reservation, "2026-03-10 16:00");

        assertEquals("2026-03-10 16:00", reservation.getEndTime());
        assertTrue(reservation.isExtended());
    }

    @Test
    public void service_forfeit_setsForfeitedAndDepositFlag() {
        reservationService.forfeitDeposit(reservation);

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void service_forfeit_fromConfirmed_changesToForfeited() {
        reservationService.reserve(reservation);
        assertEquals("CONFIRMED", reservation.getStatus());

        reservationService.forfeitDeposit(reservation);

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void service_forfeit_twice_staysForfeited() {
        reservationService.forfeitDeposit(reservation);
        reservationService.forfeitDeposit(reservation);

        assertEquals("FORFEITED", reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

    @Test
    public void service_reserve_printsConfirmationMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            reservationService.reserve(reservation);
            String output = out.toString();
            assertTrue(output.contains("Reservation " + reservation.getBookingID() + " created for equipment "
                    + reservation.getEquipmentID()));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void service_cancel_printsCancellationMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            reservationService.cancel(reservation);
            String output = out.toString();
            assertTrue(output.contains("Reservation " + reservation.getBookingID() + " cancelled."));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void service_modify_printsModifiedMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            reservationService.modify(reservation, "2026-04-01 08:00", "2026-04-01 10:00");
            String output = out.toString();
            assertTrue(output.contains("Reservation " + reservation.getBookingID() + " modified."));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void service_extend_printsExtendedMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            reservationService.extend(reservation, "2026-03-10 18:00");
            String output = out.toString();
            assertTrue(output.contains("Reservation " + reservation.getBookingID() + " extended to 2026-03-10 18:00"));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void service_forfeit_printsForfeitMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            reservationService.forfeitDeposit(reservation);
            String output = out.toString();
            assertTrue(output.contains("Deposit forfeited for reservation " + reservation.getBookingID()));
        } finally {
            System.setOut(originalOut);
        }
    }
}