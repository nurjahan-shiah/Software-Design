package test;
import static org.junit.Assert.*;
import org.junit.Test;

import pattern.command.*;
import model.*;
public class CommandTests {
    ReservationService reservationService = new ReservationService();
    String bookingID = "00ade";
        String userID = "user01";
        String equipmentID = "EQU0012";
        String startTime = "2026-03-10 09:30";
        String endTime = "2026-03-10 12:30";
        String paymentMethod = "Credit";
        double depositAmount = 20.0;
    @Test 
    public void cancelTest() {
        Reservation reservation = new Reservation(bookingID, userID, equipmentID, startTime,
            endTime, paymentMethod, depositAmount);
        CancelCommand cancelCommand = new CancelCommand(reservationService, reservation);
        cancelCommand.execute();
        
        assertEquals("CANCELLED",reservation.getStatus());

        
    }

    @Test
    public void reserveTest() {
        Reservation reservation = new Reservation(bookingID, userID, equipmentID, startTime,
            endTime, paymentMethod, depositAmount);
        ReserveCommand reserveCommand = new ReserveCommand(reservationService, reservation);
        reserveCommand.execute();
        
        assertFalse(reservation.getStatus().equals("CANCELLED"));
        assertEquals("CONFIRMED",reservation.getStatus());
    }

    Reservation reservation = new Reservation(bookingID, userID, equipmentID, startTime,
    endTime, paymentMethod, depositAmount);
    @Test
    public void extendAndModifyTest() {
        // Reservation reservation = new Reservation(bookingID, userID, equipmentID, startTime,
        //     endTime, paymentMethod, depositAmount);
        ReserveCommand reserveCommand = new ReserveCommand(reservationService, reservation);
        reserveCommand.execute();
        String newStartTime = "2026-03-10 10:30";
        String newEndTime = "2026-03-10 13:30";
        ExtendCommand extendCommand = new ExtendCommand(reservationService, reservation, newEndTime);
        extendCommand.execute();
        assertEquals(newEndTime,reservation.getEndTime());
        newStartTime = "2026-03-10 11:30";
        newEndTime = "2026-03-10 14:30";
        ModifyCommand modifyCommand = new ModifyCommand(reservationService, reservation, newStartTime, newEndTime);
        modifyCommand.execute();
        
        assertEquals(newStartTime,reservation.getStartTime());
        assertEquals(newEndTime,reservation.getEndTime());
    }

    @Test
    public void forfeitDepositTest() {
        // Reservation reservation = new Reservation(bookingID, userID, equipmentID, startTime,
        //     endTime, paymentMethod, depositAmount);
        ForfeitDepositCommand forfeitDepositCommand = new ForfeitDepositCommand(reservationService, reservation);
        forfeitDepositCommand.execute();
        
        assertFalse(reservation.getStatus().equals("CANCELLED"));
        assertFalse(reservation.getStatus().equals("CONFIRMED"));
        assertEquals("FORFEITED",reservation.getStatus());
        assertTrue(reservation.isDepositForfeited());
    }

}
