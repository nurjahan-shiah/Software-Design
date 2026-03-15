package data;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import model.Reservation;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * BookingDAO - loads and saves reservations from/to bookings.csv
 * CSV columns: bookingID,userID,equipmentID,startTime,endTime,status,depositAmount,depositForfeited,paymentMethod,isExtended
 */
public class BookingDAO {

    private String path;
    private List<Reservation> bookings = new ArrayList<>();

    public BookingDAO(String path) {
        this.path = path;
    }

    public void load() throws Exception {
        bookings.clear();
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            Reservation r = new Reservation();
            r.setBookingID(reader.get("bookingID"));
            r.setUserID(reader.get("userID"));
            r.setEquipmentID(reader.get("equipmentID"));
            r.setStartTime(reader.get("startTime"));
            r.setEndTime(reader.get("endTime"));
            r.setStatus(reader.get("status"));
            r.setDepositAmount(Double.parseDouble(reader.get("depositAmount")));
            r.setDepositForfeited(Boolean.parseBoolean(reader.get("depositForfeited")));
            r.setPaymentMethod(reader.get("paymentMethod"));
            r.setExtended(Boolean.parseBoolean(reader.get("isExtended")));
            bookings.add(r);
        }
        reader.close();
    }

    public void save() throws Exception {
        CsvWriter writer = new CsvWriter(new FileWriter(path, false), ',');

        writer.write("bookingID");
        writer.write("userID");
        writer.write("equipmentID");
        writer.write("startTime");
        writer.write("endTime");
        writer.write("status");
        writer.write("depositAmount");
        writer.write("depositForfeited");
        writer.write("paymentMethod");
        writer.write("isExtended");
        writer.endRecord();

        for (Reservation r : bookings) {
            writer.write(r.getBookingID());
            writer.write(r.getUserID());
            writer.write(r.getEquipmentID());
            writer.write(r.getStartTime());
            writer.write(r.getEndTime());
            writer.write(r.getStatus());
            writer.write(String.valueOf(r.getDepositAmount()));
            writer.write(String.valueOf(r.isDepositForfeited()));
            writer.write(r.getPaymentMethod());
            writer.write(String.valueOf(r.isExtended()));
            writer.endRecord();
        }
        writer.close();
    }

    public void addBooking(Reservation r) {
        bookings.add(r);
    }

    public Reservation findByID(String bookingID) {
        for (Reservation r : bookings) {
            if (r.getBookingID().equals(bookingID)) return r;
        }
        return null;
    }

    public List<Reservation> getBookingsByUser(String userID) {
        List<Reservation> result = new ArrayList<>();
        for (Reservation r : bookings) {
            if (r.getUserID().equals(userID)) result.add(r);
        }
        return result;
    }

    public List<Reservation> getBookingsByEquipment(String equipmentID) {
        List<Reservation> result = new ArrayList<>();
        for (Reservation r : bookings) {
            if (r.getEquipmentID().equals(equipmentID)) result.add(r);
        }
        return result;
    }

    public List<Reservation> getAllBookings() {
        return bookings;
    }

    public void updateBooking(Reservation updated) {
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBookingID().equals(updated.getBookingID())) {
                bookings.set(i, updated);
                return;
            }
        }
    }
}
