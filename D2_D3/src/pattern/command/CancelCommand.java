package pattern.command;

import model.Reservation;

public class CancelCommand implements Command {

    private ReservationService reservationService;
    private Reservation reservation;

    public CancelCommand(ReservationService reservationService, Reservation reservation) {
        this.reservationService = reservationService;
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        reservationService.cancel(reservation);
    }
}