package pattern.command;

import model.Reservation;

public class ExtendCommand implements Command {

    private Reservation reservation;
    private String newEndTime;

    public ExtendCommand(Reservation reservation, String newEndTime) {
        this.reservation = reservation;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservation.extend(newEndTime);
        System.out.println("Reservation extended to " + newEndTime);
    }
}