package pattern.strategy;

import model.PaymentTransaction;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment(PaymentTransaction transaction) {
        if (paymentStrategy == null) {
            transaction.setPaymentStatus("DECLINED");
            return false;
        }
        return paymentStrategy.pay(transaction);
    }
}