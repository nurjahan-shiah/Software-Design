package pattern.command;

import model.Reservation;

public class ModifyCommand implements Command {

    private Reservation reservation;
    private String newStartTime;
    private String newEndTime;

    public ModifyCommand(Reservation reservation, String newStartTime, String newEndTime) {
        this.reservation = reservation;
        this.newStartTime = newStartTime;
        this.newEndTime = newEndTime;
    }

    @Override
    public void execute() {
        reservation.setStartTime(newStartTime);
        reservation.setEndTime(newEndTime);
        System.out.println("Reservation modified.");
    }
}