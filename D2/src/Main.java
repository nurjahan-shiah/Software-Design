// just for testing- please build upon this DELETING THIS CODE 

import data.UserDAO;
import data.EquipmentDAO;
import data.BookingDAO;
import model.User;
import model.Equipment;
import model.Reservation;

public class Main {
    public static void main(String[] args) {
        // Get the path to the data folder
        String basePath = "data/";

        System.out.println("Lab Reservation System - Loading Data\n");

        // Test UserDAO
        try {
            UserDAO userDAO = new UserDAO(basePath + "users.csv");
            userDAO.load();
            System.out.println("USERS");
            for (User u : userDAO.getAllUsers()) {
                System.out.println(u.getUserType() + " | " + u.getName() + 
                                   " | " + u.getEmail() + 
                                   " | Fee: $" + u.getFeeRate() + "/hr" +
                                   " | Status: " + u.getStatus());
            }
        } catch (Exception e) {
            System.out.println("Error loading users: " + e.getMessage());
        }

        System.out.println();

        // Test EquipmentDAO 
        try {
            EquipmentDAO equipmentDAO = new EquipmentDAO(basePath + "equipment.csv");
            equipmentDAO.load();
            System.out.println("EQUIPMENT");
            for (Equipment eq : equipmentDAO.getAllEquipment()) {
                System.out.println(eq.getEquipmentID() + " | " + eq.getName() + 
                                   " | " + eq.getStatus() + 
                                   " | " + eq.getBuildingName() + " Room " + eq.getRoomNumber());
            }
        } catch (Exception e) {
            System.out.println("Error loading equipment: " + e.getMessage());
        }

        System.out.println();

        // Test BookingDAO
        try {
            BookingDAO bookingDAO = new BookingDAO(basePath + "bookings.csv");
            bookingDAO.load();
            System.out.println("BOOKINGS");
            for (Reservation r : bookingDAO.getAllBookings()) {
                System.out.println(r.getBookingID() + " | User: " + r.getUserID() + 
                                   " | Equipment: " + r.getEquipmentID() + 
                                   " | " + r.getStartTime() + " to " + r.getEndTime() +
                                   " | Status: " + r.getStatus());
            }
        } catch (Exception e) {
            System.out.println("Error loading bookings: " + e.getMessage());
        }

        System.out.println("\nAll data loaded successfully!");
    }
}