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
        // Start with DECLINED so we can detect when setPaymentStatus("SUCCESS") is called
        transaction = new PaymentTransaction("TXN001", "BK001", 100.0, "CREDIT");
        transaction.setPaymentStatus("DECLINED");
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
        assertEquals("DECLINED", transaction.getPaymentStatus()); // verify starting state
        strategy.pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus()); // verify it changed
    }

    @Test
    public void testCreditCardPaymentAmount() {
        CreditCardPayment strategy = new CreditCardPayment();
        strategy.pay(transaction);
        assertEquals(100.0, transaction.getTotalAmount(), 0.001);
    }

    @Test
    public void testCreditCardPaymentChangesStatusFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new CreditCardPayment().pay(transaction);
        assertNotEquals("DECLINED", transaction.getPaymentStatus());
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    // ===================== DebitPayment Tests =====================

    @Test
    public void testDebitPaymentReturnsTrue() {
        DebitPayment strategy = new DebitPayment();
        assertTrue(strategy.pay(transaction));
    }

    @Test
    public void testDebitPaymentSetsSuccess() {
        assertEquals("DECLINED", transaction.getPaymentStatus());
        new DebitPayment().pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testDebitPaymentAmount() {
        new DebitPayment().pay(transaction);
        assertEquals(100.0, transaction.getTotalAmount(), 0.001);
    }

    @Test
    public void testDebitPaymentChangesStatusFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new DebitPayment().pay(transaction);
        assertNotEquals("DECLINED", transaction.getPaymentStatus());
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    // ===================== GrantPayment Tests =====================

    @Test
    public void testGrantPaymentReturnsTrue() {
        GrantPayment strategy = new GrantPayment();
        assertTrue(strategy.pay(transaction));
    }

    @Test
    public void testGrantPaymentSetsSuccess() {
        assertEquals("DECLINED", transaction.getPaymentStatus());
        new GrantPayment().pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testGrantPaymentBookingID() {
        new GrantPayment().pay(transaction);
        assertEquals("BK001", transaction.getBookingID());
    }

    @Test
    public void testGrantPaymentChangesStatusFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new GrantPayment().pay(transaction);
        assertNotEquals("DECLINED", transaction.getPaymentStatus());
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    // ===================== InstitutionalPayment Tests =====================

    @Test
    public void testInstitutionalPaymentReturnsTrue() {
        InstitutionalPayment strategy = new InstitutionalPayment();
        assertTrue(strategy.pay(transaction));
    }

    @Test
    public void testInstitutionalPaymentSetsSuccess() {
        assertEquals("DECLINED", transaction.getPaymentStatus());
        new InstitutionalPayment().pay(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testInstitutionalPaymentBookingID() {
        new InstitutionalPayment().pay(transaction);
        assertEquals("BK001", transaction.getBookingID());
    }

    @Test
    public void testInstitutionalPaymentChangesStatusFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new InstitutionalPayment().pay(transaction);
        assertNotEquals("DECLINED", transaction.getPaymentStatus());
        assertEquals("SUCCESS", transaction.getPaymentStatus());
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
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testPaymentProcessorNullKeepsDeclined() {
        transaction.setPaymentStatus("DECLINED");
        PaymentProcessor processor = new PaymentProcessor(null);
        processor.processPayment(transaction);
        assertEquals("DECLINED", transaction.getPaymentStatus());
    }

    @Test
    public void testProcessorCreditChangesFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new PaymentProcessor(new CreditCardPayment()).processPayment(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testProcessorDebitChangesFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new PaymentProcessor(new DebitPayment()).processPayment(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testProcessorGrantChangesFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new PaymentProcessor(new GrantPayment()).processPayment(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }

    @Test
    public void testProcessorInstitutionalChangesFromDeclined() {
        transaction.setPaymentStatus("DECLINED");
        new PaymentProcessor(new InstitutionalPayment()).processPayment(transaction);
        assertEquals("SUCCESS", transaction.getPaymentStatus());
    }
}