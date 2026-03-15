package pattern.strategy;

import model.PaymentTransaction;

public interface PaymentStrategy {
    boolean pay(PaymentTransaction transaction);
}