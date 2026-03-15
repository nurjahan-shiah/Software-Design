package model;

public class PaymentTransaction {
    private String transactionID;
    private String bookingID;
    private double totalAmount;
    private String paymentStatus;  // SUCCESS, DECLINED
    private String paymentMethod;

    public PaymentTransaction() {}

    public PaymentTransaction(String transactionID, String bookingID,
                               double totalAmount, String paymentMethod) {
        this.transactionID = transactionID;
        this.bookingID = bookingID;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "SUCCESS";
    }

    // Getters and Setters
    public String getTransactionID() { return transactionID; }
    public void setTransactionID(String transactionID) { this.transactionID = transactionID; }

    public String getBookingID() { return bookingID; }
    public void setBookingID(String bookingID) { this.bookingID = bookingID; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
}
