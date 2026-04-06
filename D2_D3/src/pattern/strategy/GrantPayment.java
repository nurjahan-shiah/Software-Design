package pattern.strategy;

import model.PaymentTransaction;

public class GrantPayment implements PaymentStrategy {

    @Override
    public boolean pay(PaymentTransaction transaction) {
        System.out.println("Processing grant payment for booking " + transaction.getBookingID());
        transaction.setPaymentStatus("SUCCESS");
        return true;
    }
}