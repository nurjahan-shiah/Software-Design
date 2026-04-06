package pattern.command;

import model.Reservation;

public class ReservationService {

    public void reserve(Reservation reservation) {
        reservation.setStatus("CONFIRMED");
        System.out.println("Reservation " + reservation.getBookingID() + " created for equipment " + reservation.getEquipmentID());
    }

    public void cancel(Reservation reservation) {
        reservation.cancel();
        System.out.println("Reservation " + reservation.getBookingID() + " cancelled.");
    }

    public void modify(Reservation reservation, String newStartTime, String newEndTime) {
        reservation.setStartTime(newStartTime);
        reservation.setEndTime(newEndTime);
        System.out.println("Reservation " + reservation.getBookingID() + " modified.");
    }

    public void extend(Reservation reservation, String newEndTime) {
        reservation.extend(newEndTime);
        System.out.println("Reservation " + reservation.getBookingID() + " extended to " + newEndTime);
    }

    public void forfeitDeposit(Reservation reservation) {
        reservation.forfeitDeposit();
        System.out.println("Deposit forfeited for reservation " + reservation.getBookingID());
    }
}