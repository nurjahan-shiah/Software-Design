package pattern.strategy;

import model.PaymentTransaction;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public boolean pay(PaymentTransaction transaction) {
        System.out.println("Processing credit card payment of $" + transaction.getTotalAmount());
        transaction.setPaymentStatus("SUCCESS");
        return true;
    }
}