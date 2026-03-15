package pattern.command;

import model.Reservation;

public class ReserveCommand implements Command {

    private ReservationService reservationService;
    private Reservation reservation;

    public ReserveCommand(ReservationService reservationService, Reservation reservation) {
        this.reservationService = reservationService;
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        reservationService.reserve(reservation);
    }
}