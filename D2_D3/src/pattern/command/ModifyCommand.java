package pattern.command;

import model.Reservation;

public class ModifyCommand implements Command {

    private ReservationService reservationService;
    private Reservation reservation;
    private String newStartTime;
    private String newEndTime;

    public ModifyCommand(ReservationService reservationService, Reservation reservation, String newStartTime, String newEndTime) {
        this.reservationService = reservationService;
        this.reservation = reservation;
        this.newStartTime = newStartTime;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservationService.modify(reservation, newStartTime, newEndTime);
    }
}