package pattern.command;

import model.Reservation;

public class ExtendCommand implements Command {

    private ReservationService reservationService;
    private Reservation reservation;
    private String newEndTime;

    public ExtendCommand(ReservationService reservationService, Reservation reservation, String newEndTime) {
        this.reservationService = reservationService;
        this.reservation = reservation;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservationService.extend(reservation, newEndTime);
    }
}