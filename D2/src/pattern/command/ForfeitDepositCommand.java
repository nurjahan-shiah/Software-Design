package pattern.command;

import model.Reservation;

public class ForfeitDepositCommand implements Command {

    private ReservationService reservationService;
    private Reservation reservation;

    public ForfeitDepositCommand(ReservationService reservationService, Reservation reservation) {
        this.reservationService = reservationService;
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        reservationService.forfeitDeposit(reservation);
    }
}