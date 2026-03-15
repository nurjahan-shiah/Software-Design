package pattern.command;

import model.Reservation;

public class CancelCommand implements Command {

    private Reservation reservation;

    public CancelCommand(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        reservation.cancel();
        System.out.println("Reservation " + reservation.getBookingID() + " cancelled.");
    }
}