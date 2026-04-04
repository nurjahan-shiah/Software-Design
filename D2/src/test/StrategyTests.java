package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.PaymentTransaction;
import pattern.strategy.*;

public class StrategyTests {

    private PaymentTransaction transaction;

    @Before
    public void setUp() {
        transaction = new PaymentTransaction("TXN001", "BK001", 100.0, "CREDIT");
    }

    // ===================== CreditCardPayment Tests =====================

    @Test
    public void testCreditCardPaymentReturnsTrue() {
        CreditCardPayment strategy = new CreditCardPayment();
        assertTrue(strategy.pay(transaction));
    }

    @Test
    public void testCreditCardPaymentSetsSuccess() {
        CreditCardPayment strategy = new CreditCardPayment();
        strategy.pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testCreditCardPaymentAmount() {
        CreditCardPayment strategy = new CreditCardPayment();
        strategy.pay(transaction);
        assertEquals(100.0, transaction.getTotalAmount(), 0.001);
    }

    // ===================== DebitPayment Tests =====================

    @Test
    public void testDebitPaymentReturnsTrue() {
        DebitPayment strategy = new DebitPayment();
        assertTrue(strategy.pay(transaction));
    }

    @Test
    public void testDebitPaymentSetsSuccess() {
        DebitPayment strategy = new DebitPayment();
        strategy.pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testDebitPaymentAmount() {
        DebitPayment strategy = new DebitPayment();
        strategy.pay(transaction);
        assertEquals(100.0, transaction.getTotalAmount(), 0.001);
    }

    // ===================== GrantPayment Tests =====================

    @Test
    public void testGrantPaymentReturnsTrue() {
        GrantPayment strategy = new GrantPayment();
        assertTrue(strategy.pay(transaction));
    }

    @Test
    public void testGrantPaymentSetsSuccess() {
        GrantPayment strategy = new GrantPayment();
        strategy.pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testGrantPaymentBookingID() {
        GrantPayment strategy = new GrantPayment();
        strategy.pay(transaction);
        assertEquals("BK001", transaction.getBookingID());
    }

    // ===================== InstitutionalPayment Tests =====================

    @Test
    public void testInstitutionalPaymentReturnsTrue() {
        InstitutionalPayment strategy = new InstitutionalPayment();
        assertTrue(strategy.pay(transaction));
    }

    @Test
    public void testInstitutionalPaymentSetsSuccess() {
        InstitutionalPayment strategy = new InstitutionalPayment();
        strategy.pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testInstitutionalPaymentBookingID() {
        InstitutionalPayment strategy = new InstitutionalPayment();
        strategy.pay(transaction);
        assertEquals("BK001", transaction.getBookingID());
    }

    // ===================== PaymentProcessor Tests =====================

    @Test
    public void testPaymentProcessorWithCreditCard() {
        PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
        assertTrue(processor.processPayment(transaction));
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testPaymentProcessorWithDebit() {
        PaymentProcessor processor = new PaymentProcessor(new DebitPayment());
        assertTrue(processor.processPayment(transaction));
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testPaymentProcessorWithGrant() {
        PaymentProcessor processor = new PaymentProcessor(new GrantPayment());
        assertTrue(processor.processPayment(transaction));
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testPaymentProcessorWithInstitutional() {
        PaymentProcessor processor = new PaymentProcessor(new InstitutionalPayment());
        assertTrue(processor.processPayment(transaction));
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testPaymentProcessorNullStrategyReturnsFalse() {
        PaymentProcessor processor = new PaymentProcessor(null);
        assertFalse(processor.processPayment(transaction));
        assertEquals("DECLINED", transaction.getPaymentStatus());
    }

    @Test
    public void testPaymentProcessorSetStrategy() {
        PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
        processor.setPaymentStrategy(new DebitPayment());
        assertTrue(processor.processPayment(transaction));
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testPaymentProcessorSwitchFromNullToValid() {
        PaymentProcessor processor = new PaymentProcessor(null);
        processor.setPaymentStrategy(new CreditCardPayment());
        assertTrue(processor.processPayment(transaction));
    }
}
