package pattern.strategy;

import model.PaymentTransaction;

public class DebitPayment implements PaymentStrategy {

    @Override
    public boolean pay(PaymentTransaction transaction) {
        System.out.println("Processing debit payment of $" + transaction.getTotalAmount());
        transaction.setPaymentStatus("SUCCESS");
        return true;
    }
} 