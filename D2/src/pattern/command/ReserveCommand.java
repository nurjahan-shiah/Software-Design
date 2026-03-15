package pattern.command;

import model.Reservation;

public class ReserveCommand implements Command {

    private Reservation reservation;

    public ReserveCommand(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        System.out.println("Reservation created for equipment " + reservation.getEquipmentID());
    }
}