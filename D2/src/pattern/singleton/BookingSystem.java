package pattern.singleton;
import java.time.format.DateTimeFormatter;
import model.Reservation;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

public class BookingSystem {

    // creating the single BookingSystem instance
    private static BookingSystem bsInstance;
    public static BookingSystem getInstance() { 
        if (bsInstance == null) {
            bsInstance = new BookingSystem();
        }
        return bsInstance;
    }

    private List<Reservation> reservations;

    // Setting the constructor private so nobody outside the class can call it
    private BookingSystem() {
        reservations = new ArrayList<Reservation>();
    }

    public List<Reservation> getReservations() { return reservations; }

    public void addBooking(Reservation booking) {
        bsInstance.getReservations().add(booking);
    }

    public boolean checkActiveBookings(String equipmentID) {
        Reservation booking;
        for (int i = 0; i < reservations.size(); i++) {
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
    for (int i = 0; i < reservations.size(); i++) {
        booking = reservations.get(i);
        if (booking.getStartTime() == null) continue;   // ← ADD THIS LINE
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime start = LocalDateTime.parse(booking.getStartTime(), formatter);
        if (booking.getEquipmentID().equals(id) && LocalDateTime.now().isBefore(start)) {
            if (booking.getStatus().equals("CANCELLED")) { reservations.remove(i); }
            return;
        }
    }
}
}