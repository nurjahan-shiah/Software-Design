package pattern.strategy;

import model.PaymentTransaction;

public class InstitutionalPayment implements PaymentStrategy {

    @Override
    public boolean pay(PaymentTransaction transaction) {
        System.out.println("Processing institutional payment for booking " + transaction.getBookingID());
        transaction.setPaymentStatus("SUCCESS");
        return true;
    }
}