package model;

public class Reservation {
    private String bookingID;
    private String userID;
    private String equipmentID;
    private String startTime;   // stored as string "yyyy-MM-dd HH:mm"
    private String endTime;
    private boolean isExtended;
    private String status;      // CONFIRMED, CANCELLED, FORFEITED
    private double depositAmount;
    private boolean depositForfeited;
    private String paymentMethod; // CREDIT, DEBIT, INSTITUTIONAL, GRANT

    public Reservation() {}

    public Reservation(String bookingID, String userID, String equipmentID,
                       String startTime, String endTime, String paymentMethod, double depositAmount) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.equipmentID = equipmentID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isExtended = false;
        this.status = "CONFIRMED";
        this.depositAmount = depositAmount;
        this.depositForfeited = false;
        this.paymentMethod = paymentMethod;
    }

    public void cancel() { this.status = "CANCELLED"; }
    public void forfeitDeposit() { this.depositForfeited = true; this.status = "FORFEITED"; }
    public void extend(String newEndTime) { this.endTime = newEndTime; this.isExtended = true; }

    // Getters and Setters
    public String getBookingID() { return bookingID; }
    public void setBookingID(String bookingID) { this.bookingID = bookingID; }

    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }

    public String getEquipmentID() { return equipmentID; }
    public void setEquipmentID(String equipmentID) { this.equipmentID = equipmentID; }

    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }

    public boolean isExtended() { return isExtended; }
    public void setExtended(boolean extended) { isExtended = extended; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getDepositAmount() { return depositAmount; }
    public void setDepositAmount(double depositAmount) { this.depositAmount = depositAmount; }

    public boolean isDepositForfeited() { return depositForfeited; }
    public void setDepositForfeited(boolean depositForfeited) { this.depositForfeited = depositForfeited; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    @Override
    public String toString() {
        return "Booking [" + bookingID + "] " + equipmentID + " | " + startTime + " to " + endTime + " | " + status;
    }
}
