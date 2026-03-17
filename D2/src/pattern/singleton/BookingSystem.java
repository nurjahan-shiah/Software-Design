package pattern.singleton;
import model.Reservation;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

public class BookingSystem {

    // creating the single BookingSystem instance
    private static BookingSystem bsInstance = new BookingSystem();
    public static BookingSystem getInstance() { return bsInstance; }

    private List<Reservation> reservations;

    // Setting the constructor private so nobody outside the class can call it
    private BookingSystem() {
        bsInstance.reservations = new ArrayList<Reservation>();
    }

    public List<Reservation> getReservations() { return bsInstance.reservations; }

    public void addBooking(Reservation booking) {
        bsInstance.getReservations().add(booking);
    }

    public boolean checkActiveBookings(String equipmentID) {
        Reservation booking;
        for (int i = 0; i < bsInstance.reservations.size(); i++) {
            booking = reservations.get(i);
            if (booking.getEquipmentID().equals(equipmentID)) {
                System.out.println(booking.toString());
                return true;
            }
        }
        System.out.println("No reservation with that equipment ID.\n");
        return false;
    }

    public void cancelFutureBookings(String id) {
        Reservation booking;
        for (int i = 0; i < bsInstance.reservations.size(); i++) {
            booking = reservations.get(i);
            LocalDateTime start = LocalDateTime.parse(booking.getStartTime());
            if (booking.getEquipmentID().equals(id) && LocalDateTime.now().isBefore(start)) {

                if (booking.getStatus().equals("CANCELLED")) { reservations.remove(i); }
                return;
            }
        }
    }

}
