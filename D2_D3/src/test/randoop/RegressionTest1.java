package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTotalAmount((double) 100);
        paymentTransaction4.setTransactionID("Booking [CANCELLED]  | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str14 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str14, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.setDepositForfeited(false);
        java.lang.Class<?> wildcardClass7 = reservation0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.extend("SUCCESS");
        java.lang.String str11 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount(0.0d);
        reservation0.setEquipmentID("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        double double8 = reservation0.getDepositAmount();
        reservation0.forfeitDeposit();
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 'a');
        reservation7.setStatus("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation7.forfeitDeposit();
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEquipmentID("SUCCESS");
        java.lang.String str9 = reservation0.getStatus();
        reservation0.setEndTime("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        boolean boolean6 = reservation0.isDepositForfeited();
        java.lang.String str7 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.extend("Booking [null] null | null to null | hi!");
        java.lang.String str7 = reservation0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED" + "'", str7, "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setUserID("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getPaymentStatus();
        java.lang.String str3 = paymentTransaction0.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getDescription();
        equipment7.setRoomNumber("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = equipment7.getStatus();
        java.lang.String str16 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        java.lang.String str13 = paymentTransaction4.getBookingID();
        double double14 = paymentTransaction4.getTotalAmount();
        double double15 = paymentTransaction4.getTotalAmount();
        java.lang.String str16 = paymentTransaction4.getPaymentMethod();
        double double17 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        model.Equipment equipment7 = new model.Equipment("FORFEITED", "Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | hi! to null | hi!", "Booking [null] null | hi! to null | hi!", (double) 'a');
        reservation7.setPaymentMethod("");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        boolean boolean11 = reservation0.isExtended();
        java.lang.String str12 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.cancel();
        reservation0.setExtended(false);
        java.lang.String str8 = reservation0.toString();
        java.lang.String str9 = reservation0.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to  | CANCELLED" + "'", str8, "Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str7 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 100, "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        double double8 = reservation0.getDepositAmount();
        java.lang.String str9 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        double double12 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        java.lang.String str12 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FORFEITED" + "'", str12, "FORFEITED");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", (double) (short) 100, "Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str5, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        double double10 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        double double7 = reservation0.getDepositAmount();
        reservation0.cancel();
        reservation0.setEndTime("");
        reservation0.setEndTime("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getBuildingName();
        java.lang.String str14 = equipment7.getType();
        java.lang.String str15 = equipment7.getRoomNumber();
        equipment7.setStatus("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setStatus("hi!");
        java.lang.String str8 = reservation0.getEndTime();
        boolean boolean9 = reservation0.isDepositForfeited();
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setPaymentMethod(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStatus("");
        reservation0.setUserID("");
        java.lang.String str13 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "", "Booking [null] null | null to null | hi!", "Booking [CANCELLED]  | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) 100);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getRoomNumber();
        java.lang.String str10 = equipment7.getBuildingName();
        java.lang.String str11 = equipment7.getEquipmentID();
        equipment7.setStatus("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setPaymentMethod("");
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        reservation0.setDepositForfeited(false);
        java.lang.String str13 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        double double8 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        java.lang.String str9 = reservation0.getBookingID();
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setDepositAmount(1.0d);
        java.lang.String str13 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        java.lang.String str8 = reservation0.getPaymentMethod();
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        equipment7.setName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        boolean boolean13 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.cancel();
        reservation0.setUserID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        java.lang.String str12 = reservation0.getStatus();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null |  to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        java.lang.String str12 = equipment7.getType();
        java.lang.String str13 = equipment7.toString();
        java.lang.String str14 = equipment7.getType();
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setEndTime("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.getEndTime();
        java.lang.String str12 = reservation0.getUserID();
        double double13 = reservation0.getDepositAmount();
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str11, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setBookingID("CANCELLED");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.setDepositAmount((double) (byte) 0);
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getStartTime();
        reservation0.setDepositAmount((double) 100);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | hi!", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null");
        double double9 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getName();
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str14, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setTransactionID("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        paymentTransaction4.setTransactionID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setBuildingName("hi!");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("SUCCESS", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", (double) (byte) 10, "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", 0.0d, " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        model.Equipment equipment7 = new model.Equipment("", "CANCELLED", "Booking [null] null | null to null | null", "SUCCESS", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!");
        java.lang.String str8 = equipment7.getRoomNumber();
        java.lang.String str9 = equipment7.getStatus();
        equipment7.setStatus("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.cancel();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositAmount((double) 100L);
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setEquipmentID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        boolean boolean5 = reservation0.isDepositForfeited();
        double double6 = reservation0.getDepositAmount();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str9 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null" + "'", str9, "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount(32.0d);
        java.lang.String str15 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentStatus("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SUCCESS" + "'", str15, "SUCCESS");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        java.lang.String str12 = paymentTransaction4.getBookingID();
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.extend("FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        java.lang.String str5 = reservation0.getBookingID();
        boolean boolean6 = reservation0.isExtended();
        double double7 = reservation0.getDepositAmount();
        java.lang.String str8 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        java.lang.String str6 = reservation0.getPaymentMethod();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setStatus("hi!");
        java.lang.String str8 = reservation0.getEndTime();
        boolean boolean9 = reservation0.isDepositForfeited();
        reservation0.setEndTime("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        java.lang.String str10 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        double double5 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setDepositForfeited(true);
        reservation0.setDepositAmount((double) 100L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getStatus();
        reservation0.setBookingID("hi!");
        java.lang.String str11 = reservation0.getStatus();
        boolean boolean12 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.String str13 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation15 = equipment7.getLabLocation();
        equipment7.setBuildingName("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        boolean boolean12 = equipment7.isAvailable();
        java.lang.String str13 = equipment7.getStatus();
        equipment7.setDescription("FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        java.lang.String str12 = equipment7.getDescription();
        java.lang.String str13 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(labLocation14);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        equipment7.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        boolean boolean17 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.extend("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        java.lang.String str7 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        java.lang.String str8 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getStatus();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str16 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        boolean boolean9 = equipment0.isAvailable();
        equipment0.setEquipmentID("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.toString();
        java.lang.String str11 = reservation0.getEndTime();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str10, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setExtended(true);
        java.lang.String str13 = reservation0.getStatus();
        double double14 = reservation0.getDepositAmount();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        paymentTransaction4.setTransactionID("CANCELLED");
        paymentTransaction4.setTotalAmount((double) (byte) 1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to  | Booking [null] null | null to null | null", "SUCCESS", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", (double) '#');
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setEndTime("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str15 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED" + "'", str15, "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        equipment7.setStatus("");
        java.lang.String str17 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        reservation7.setUserID("");
        double double10 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "CANCELLED", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setDepositForfeited(true);
        java.lang.String str9 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null");
        equipment7.setDescription("");
        equipment7.setDescription("");
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SUCCESS" + "'", str15, "SUCCESS");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setType("hi!");
        equipment7.setEquipmentID("");
        equipment7.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("hi!");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | hi!");
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        double double10 = reservation0.getDepositAmount();
        java.lang.String str11 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        reservation0.setUserID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setDescription("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getRoomNumber();
        java.lang.String str16 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        double double8 = reservation0.getDepositAmount();
        reservation0.setExtended(false);
        java.lang.String str11 = reservation0.getBookingID();
        java.lang.String str12 = reservation0.getBookingID();
        java.lang.String str13 = reservation0.getUserID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setEquipmentID("SUCCESS");
        java.lang.String str18 = equipment7.getType();
        boolean boolean19 = equipment7.isAvailable();
        equipment7.setRoomNumber("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        boolean boolean12 = equipment7.isAvailable();
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        equipment7.setName("");
        java.lang.String str16 = equipment7.getDescription();
        java.lang.String str17 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isDepositForfeited();
        java.lang.String str12 = reservation0.getEndTime();
        reservation0.setDepositAmount((double) (byte) 0);
        reservation0.setDepositForfeited(true);
        boolean boolean17 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        java.lang.String str10 = equipment0.getBuildingName();
        java.lang.String str11 = equipment0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        reservation0.forfeitDeposit();
        reservation0.extend("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str14, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        paymentTransaction4.setBookingID("FORFEITED");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FORFEITED" + "'", str12, "FORFEITED");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        java.lang.String str12 = equipment7.getType();
        equipment7.setDescription("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        equipment7.setDescription("");
        boolean boolean17 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) (short) 10, "Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentMethod("Booking [null] null |  to null | hi!");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | hi! to null | hi!", (double) (byte) 10, "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        equipment7.setType("hi!");
        equipment7.setStatus("hi!");
        equipment7.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        double double9 = reservation0.getDepositAmount();
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getStatus();
        java.lang.String str15 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        java.lang.String str12 = paymentTransaction4.getBookingID();
        java.lang.String str13 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentMethod("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str19 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        double double7 = reservation0.getDepositAmount();
        reservation0.setDepositAmount((double) 1L);
        reservation0.setBookingID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str12 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.extend("SUCCESS");
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEquipmentID("SUCCESS");
        reservation0.setEndTime("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        reservation0.extend(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        paymentTransaction4.setTotalAmount((double) ' ');
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        double double14 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getUserID();
        java.lang.String str2 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getEquipmentID();
        equipment7.setRoomNumber("");
        java.lang.String str13 = equipment7.getBuildingName();
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        java.lang.String str13 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setDepositForfeited(true);
        java.lang.String str13 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        equipment7.setEquipmentID("");
        java.lang.String str14 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        double double10 = reservation0.getDepositAmount();
        reservation0.setPaymentMethod("FORFEITED");
        reservation0.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!" + "'", str15, "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.toString();
        reservation0.cancel();
        reservation0.setBookingID("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        reservation0.setUserID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        reservation0.setStartTime("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        reservation0.setEquipmentID("CANCELLED");
        boolean boolean11 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(10.0d);
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        model.Equipment equipment7 = new model.Equipment("CANCELLED", "CANCELLED", "SUCCESS", "CANCELLED", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED");
        java.lang.String str8 = equipment7.getType();
        java.lang.String str9 = equipment7.getDescription();
        java.lang.String str10 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CANCELLED" + "'", str8, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED" + "'", str10, "CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        double double10 = reservation0.getDepositAmount();
        boolean boolean11 = reservation0.isExtended();
        boolean boolean12 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str13, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        double double8 = reservation0.getDepositAmount();
        reservation0.forfeitDeposit();
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.setEquipmentID("FORFEITED");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str17 = equipment7.getType();
        equipment7.setBuildingName("FORFEITED");
        java.lang.String str20 = equipment7.getBuildingName();
        java.lang.String str21 = equipment7.getBuildingName();
        java.lang.Class<?> wildcardClass22 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FORFEITED" + "'", str20, "FORFEITED");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FORFEITED" + "'", str21, "FORFEITED");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = reservation0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "FORFEITED", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        org.junit.Assert.assertNotNull(labLocation8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getBuildingName();
        java.lang.String str12 = equipment7.getType();
        java.lang.String str13 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        java.lang.String str8 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) '#');
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to  | null", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", (double) (-1.0f));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 'a');
        reservation7.setUserID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        java.lang.String str17 = equipment7.getDescription();
        model.LabLocation labLocation18 = equipment7.getLabLocation();
        java.lang.String str19 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isDepositForfeited();
        java.lang.String str12 = reservation0.getEndTime();
        reservation0.setDepositAmount((double) (byte) 0);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        double double6 = reservation0.getDepositAmount();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("SUCCESS");
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        boolean boolean8 = reservation7.isDepositForfeited();
        reservation7.forfeitDeposit();
        boolean boolean10 = reservation7.isDepositForfeited();
        reservation7.setUserID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.setUserID("Booking [null] null | null to null | hi!");
        reservation0.setExtended(false);
        java.lang.String str15 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null");
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CANCELLED" + "'", str8, "CANCELLED");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        java.lang.Class<?> wildcardClass7 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | hi!");
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) '#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        model.LabLocation labLocation5 = equipment0.getLabLocation();
        org.junit.Assert.assertNotNull(labLocation5);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        java.lang.String str4 = reservation0.getEndTime();
        java.lang.String str5 = reservation0.getUserID();
        boolean boolean6 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str13 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getName();
        equipment7.setRoomNumber("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str19 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setEquipmentID("SUCCESS");
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "", (double) 10.0f, "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        paymentTransaction4.setTransactionID("CANCELLED");
        paymentTransaction4.setBookingID("CANCELLED");
        paymentTransaction4.setBookingID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.toString();
        java.lang.String str11 = reservation0.getEndTime();
        java.lang.String str12 = reservation0.getBookingID();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str10, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setExtended(true);
        reservation0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setEquipmentID("CANCELLED");
        equipment7.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str19 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentMethod("hi!");
        paymentTransaction4.setTransactionID("Booking [null] null | null to  | CANCELLED");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.cancel();
        java.lang.String str8 = reservation0.getEquipmentID();
        java.lang.String str9 = reservation0.getEndTime();
        java.lang.Class<?> wildcardClass10 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getStatus();
        equipment0.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str4 = equipment0.getStatus();
        java.lang.String str5 = equipment0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        paymentTransaction4.setBookingID("FORFEITED");
        paymentTransaction4.setTransactionID("");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 100.0f);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.extend("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setDescription("Booking [null] null | hi! to null | hi!");
        java.lang.String str15 = equipment7.toString();
        equipment7.setType("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        equipment7.setType("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str18 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getBookingID();
        java.lang.String str10 = paymentTransaction4.getTransactionID();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        boolean boolean16 = equipment7.isAvailable();
        model.LabLocation labLocation17 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(labLocation17);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        double double5 = paymentTransaction4.getTotalAmount();
        java.lang.String str6 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str6, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null" + "'", str8, "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        reservation0.forfeitDeposit();
        reservation0.setUserID("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.extend("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str9 = reservation0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getBuildingName();
        java.lang.String str3 = equipment0.getEquipmentID();
        equipment0.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str6 = equipment0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("");
        java.lang.String str11 = reservation0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        java.lang.String str4 = reservation0.toString();
        reservation0.setEquipmentID("");
        boolean boolean7 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getStatus();
        model.LabLocation labLocation16 = equipment7.getLabLocation();
        java.lang.String str17 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        java.lang.String str13 = paymentTransaction4.getBookingID();
        double double14 = paymentTransaction4.getTotalAmount();
        double double15 = paymentTransaction4.getTotalAmount();
        java.lang.String str16 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setBookingID("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        model.Equipment equipment7 = new model.Equipment("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!", "hi!", "Booking [null] null | null to  | CANCELLED", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "FORFEITED", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.extend("Booking [null] null | null to null | hi!");
        boolean boolean10 = reservation7.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTransactionID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double5 = paymentTransaction0.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.setStatus("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | hi!", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to  | null", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.setUserID("Booking [null] null | null to null | hi!");
        reservation0.forfeitDeposit();
        java.lang.String str14 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        reservation0.setEndTime("hi!");
        reservation0.setEquipmentID("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.cancel();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setDepositAmount((double) 100.0f);
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.toString();
        equipment7.setBuildingName("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount(32.0d);
        java.lang.String str15 = paymentTransaction4.getPaymentStatus();
        java.lang.String str16 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SUCCESS" + "'", str15, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SUCCESS" + "'", str16, "SUCCESS");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        double double9 = reservation0.getDepositAmount();
        reservation0.setUserID("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 1.0f, "Booking [null] null | null to null | hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("SUCCESS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SUCCESS" + "'", str5, "SUCCESS");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        reservation0.extend("CANCELLED");
        java.lang.String str10 = reservation0.getPaymentMethod();
        reservation0.setPaymentMethod("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to CANCELLED | null" + "'", str13, "Booking [null] null | null to CANCELLED | null");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        paymentTransaction0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        java.lang.String str5 = reservation0.getStartTime();
        java.lang.String str6 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setEquipmentID("CANCELLED");
        java.lang.String str17 = equipment7.getName();
        java.lang.String str18 = equipment7.getDescription();
        equipment7.setEquipmentID("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setEquipmentID("SUCCESS");
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        boolean boolean22 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setExtended(true);
        reservation0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str15 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to hi! | Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = reservation0.getStatus();
        reservation0.setDepositAmount((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        reservation0.extend("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setExtended(true);
        reservation0.setDepositForfeited(true);
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.setUserID("Booking [null] null | null to null | CANCELLED");
        boolean boolean11 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        boolean boolean8 = reservation7.isDepositForfeited();
        reservation7.forfeitDeposit();
        boolean boolean10 = reservation7.isDepositForfeited();
        reservation7.extend("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setStatus("SUCCESS");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setBuildingName("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        java.lang.String str12 = equipment7.getRoomNumber();
        java.lang.String str13 = equipment7.toString();
        java.lang.Class<?> wildcardClass14 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        java.lang.String str5 = reservation0.getPaymentMethod();
        java.lang.String str6 = reservation0.getPaymentMethod();
        boolean boolean7 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        equipment7.setEquipmentID("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | hi! to null | hi!");
        java.lang.String str19 = equipment7.toString();
        java.lang.String str20 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str19, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | null" + "'", str20, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        model.Equipment equipment7 = new model.Equipment(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "FORFEITED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", "Booking [null] null | null to  | CANCELLED", "CANCELLED");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getStatus();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        reservation0.setStartTime("CANCELLED");
        reservation0.cancel();
        java.lang.String str8 = reservation0.getStatus();
        reservation0.extend("Booking [null] null | null to null | null");
        reservation0.setBookingID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CANCELLED" + "'", str8, "CANCELLED");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        reservation0.setExtended(false);
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.cancel();
        reservation0.extend("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", 1.0d, " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositForfeited(false);
        reservation0.extend("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        boolean boolean10 = equipment0.isAvailable();
        java.lang.Class<?> wildcardClass11 = equipment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setPaymentMethod("");
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str11 = reservation0.getEquipmentID();
        java.lang.String str12 = reservation0.getBookingID();
        reservation0.setStatus(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setUserID("SUCCESS");
        reservation0.setDepositAmount((double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        reservation0.setExtended(false);
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        equipment7.setRoomNumber("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setName("");
        equipment7.setStatus("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(labLocation12);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("hi!");
        double double8 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setBookingID(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        reservation0.setUserID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CANCELLED" + "'", str13, "CANCELLED");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.toString();
        java.lang.String str17 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CANCELLED" + "'", str15, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.extend("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.extend("Booking [null] null | null to null | hi!");
        java.lang.String str10 = reservation7.getEndTime();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str10, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "null -  [null] @ null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "");
        java.lang.String str8 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str17 = equipment7.getType();
        equipment7.setDescription("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        java.lang.String str4 = reservation0.toString();
        reservation0.setExtended(true);
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str9 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null" + "'", str9, "Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        boolean boolean12 = equipment7.isAvailable();
        boolean boolean13 = equipment7.isAvailable();
        equipment7.setDescription(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getEndTime();
        java.lang.String str4 = reservation0.toString();
        double double5 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to  | null", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getPaymentStatus();
        double double4 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTotalAmount((double) (-1));
        paymentTransaction0.setBookingID("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str15 = reservation0.toString();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null" + "'", str15, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.extend("Booking [null] null | null to null | hi!");
        reservation0.setDepositAmount(10.0d);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setDepositForfeited(true);
        java.lang.String str13 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!" + "'", str13, "Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getEndTime();
        java.lang.String str7 = reservation0.getPaymentMethod();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double10 = paymentTransaction4.getTotalAmount();
        double double11 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        equipment7.setRoomNumber("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getBuildingName();
        equipment0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        equipment0.setName("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getBookingID();
        java.lang.String str7 = paymentTransaction4.getTransactionID();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.setPaymentMethod("");
        reservation0.cancel();
        reservation0.setEquipmentID("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        boolean boolean8 = reservation0.isDepositForfeited();
        java.lang.String str9 = reservation0.toString();
        reservation0.cancel();
        java.lang.String str11 = reservation0.toString();
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str9, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.forfeitDeposit();
        java.lang.String str12 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount((double) 100.0f);
        java.lang.String str15 = reservation0.getBookingID();
        java.lang.String str16 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setPaymentMethod("");
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str11 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str14 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setBookingID("SUCCESS");
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        reservation0.setBookingID("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setUserID("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setBuildingName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setRoomNumber("CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        boolean boolean7 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) 100);
        java.lang.String str10 = reservation0.getEndTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setEquipmentID("Booking [null] null | null to null | hi!");
        reservation0.setStatus("CANCELLED");
        java.lang.String str15 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CANCELLED" + "'", str15, "CANCELLED");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "FORFEITED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 0L);
        java.lang.String str8 = reservation7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "", "Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setBookingID("SUCCESS");
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str14 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setName("");
        java.lang.String str10 = equipment7.toString();
        equipment7.setName("Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null " + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNotNull(labLocation8);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setDescription("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        equipment0.setDescription("Booking [null] null | hi! to null | hi!");
        equipment0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str14 = equipment0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setEquipmentID("SUCCESS");
        model.LabLocation labLocation18 = equipment7.getLabLocation();
        equipment7.setEquipmentID("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labLocation18);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(false);
        double double12 = reservation0.getDepositAmount();
        reservation0.setEquipmentID("Booking [null] null |  to null | hi!");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 1.0f);
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("");
        java.lang.String str9 = paymentTransaction4.getBookingID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to  | null");
        java.lang.String str20 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str20, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", (double) (short) 100, "Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (-1.0f));
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to CANCELLED | null", "hi!", "Booking [CANCELLED]  | null to null | null", "Booking [null] null | null to  | CANCELLED");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str8 = reservation0.getEndTime();
        java.lang.String str9 = reservation0.getEndTime();
        java.lang.String str10 = reservation0.getStatus();
        reservation0.forfeitDeposit();
        java.lang.String str12 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FORFEITED" + "'", str12, "FORFEITED");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.toString();
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str21 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str21, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getBuildingName();
        java.lang.String str14 = equipment7.getType();
        java.lang.String str15 = equipment7.getRoomNumber();
        java.lang.String str16 = equipment7.getStatus();
        java.lang.String str17 = equipment7.getBuildingName();
        java.lang.String str18 = equipment7.getBuildingName();
        model.LabLocation labLocation19 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation19);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", (double) (short) 100, "Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (-1.0f));
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str8, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        java.lang.String str11 = reservation0.toString();
        reservation0.setDepositAmount((double) 100.0f);
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        equipment7.setBuildingName("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        equipment7.setDescription("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        reservation0.setEndTime("Booking [null] null | null to null | CANCELLED");
        boolean boolean13 = reservation0.isExtended();
        java.lang.String str14 = reservation0.getBookingID();
        reservation0.setEndTime("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str17 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi! | hi!" + "'", str17, "Booking [null] null | null to Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi! | hi!");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str12 = reservation0.getEndTime();
        reservation0.setExtended(false);
        reservation0.extend("null -  [null] @ null Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        boolean boolean9 = equipment0.isAvailable();
        equipment0.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str12 = equipment0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str12, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTotalAmount(0.0d);
        java.lang.String str5 = paymentTransaction0.getPaymentMethod();
        double double6 = paymentTransaction0.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        model.Reservation reservation7 = new model.Reservation("CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) (short) -1);
        java.lang.String str8 = reservation7.getPaymentMethod();
        boolean boolean9 = reservation7.isExtended();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.cancel();
        reservation0.setExtended(true);
        reservation0.forfeitDeposit();
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "hi!", "Booking [null] null | hi! to null | hi!", "hi!", (double) (byte) 0);
        reservation7.extend("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        java.lang.String str17 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str17, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getStatus();
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.getType();
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setEquipmentID("");
        reservation0.setUserID("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("hi!");
        java.lang.String str15 = equipment7.getEquipmentID();
        equipment7.setEquipmentID("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str15, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        equipment7.setEquipmentID("");
        equipment7.setRoomNumber("Booking [null] null | null to  | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setEndTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str16 = reservation0.getEndTime();
        java.lang.String str17 = reservation0.toString();
        reservation0.setStatus("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str16, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | " + "'", str17, "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        java.lang.String str7 = reservation0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        model.Reservation reservation7 = new model.Reservation("hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) ' ');
        java.lang.String str8 = reservation7.getBookingID();
        java.lang.String str9 = reservation7.getEquipmentID();
        reservation7.setStatus("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        java.lang.String str17 = equipment7.getDescription();
        java.lang.String str18 = equipment7.toString();
        boolean boolean19 = equipment7.isAvailable();
        equipment7.setName("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        java.lang.String str22 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking [null] null | null to null | null" + "'", str22, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        double double9 = reservation0.getDepositAmount();
        reservation0.setDepositForfeited(true);
        boolean boolean12 = reservation0.isExtended();
        java.lang.String str13 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        java.lang.String str13 = equipment7.getName();
        java.lang.String str14 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) 0.0f, "CANCELLED");
        paymentTransaction4.setBookingID("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getType();
        equipment7.setDescription("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.getBuildingName();
        java.lang.String str19 = equipment7.getEquipmentID();
        equipment7.setBuildingName("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str22 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking [null] null | null to hi! | Booking [null] null | null to null | null" + "'", str22, "Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        boolean boolean10 = equipment7.isAvailable();
        java.lang.String str11 = equipment7.getType();
        equipment7.setEquipmentID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        reservation0.setEndTime("Booking [null] null | null to null | CANCELLED");
        double double13 = reservation0.getDepositAmount();
        java.lang.String str14 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        java.lang.String str8 = reservation0.getStartTime();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.cancel();
        reservation0.setExtended(true);
        reservation0.cancel();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        boolean boolean5 = reservation0.isDepositForfeited();
        double double6 = reservation0.getDepositAmount();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str9 = reservation0.getPaymentMethod();
        java.lang.String str10 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("", "", (double) (short) 10, "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to  | null");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to  | CANCELLED", "", "SUCCESS", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        model.Equipment equipment7 = new model.Equipment("", "CANCELLED", "Booking [null] null | null to null | null", "SUCCESS", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!");
        java.lang.String str8 = equipment7.getRoomNumber();
        java.lang.String str9 = equipment7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setExtended(false);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("SUCCESS", "", (double) (short) 0, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (byte) -1);
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount((double) 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.getEquipmentID();
        java.lang.String str16 = equipment7.getDescription();
        java.lang.String str17 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        boolean boolean10 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.cancel();
        reservation0.setExtended(true);
        reservation0.cancel();
        java.lang.String str14 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED" + "'", str14, "Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", "Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED", (double) (short) -1);
        reservation7.setUserID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        reservation7.setStatus("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        double double15 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED" + "'", str14, "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        java.lang.String str8 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        equipment7.setType("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        equipment7.setRoomNumber("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str15 = reservation0.getUserID();
        java.lang.String str16 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setEquipmentID("CANCELLED");
        java.lang.String str17 = equipment7.getName();
        boolean boolean18 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        equipment7.setStatus("Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setDescription("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        boolean boolean10 = equipment0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getBuildingName();
        java.lang.String str14 = equipment7.getType();
        java.lang.String str15 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to  | CANCELLED");
        equipment7.setType("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to  | Booking [null] null | null to null | null", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to  | CANCELLED", "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", (double) (-1L));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", 0.0d, "null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        java.lang.String str9 = reservation0.getStartTime();
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        reservation0.setBookingID("Booking [null] null | hi! to null | hi!");
        reservation0.setStatus("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        boolean boolean12 = equipment7.isAvailable();
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        equipment7.setName("");
        java.lang.String str16 = equipment7.getDescription();
        boolean boolean17 = equipment7.isAvailable();
        model.LabLocation labLocation18 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(labLocation18);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str14, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        double double5 = reservation0.getDepositAmount();
        reservation0.setDepositAmount((double) (-1.0f));
        reservation0.setStatus("Booking [null] null | null to  | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getRoomNumber();
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setStatus("Booking [CANCELLED]  | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation11);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.extend("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getBookingID();
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getPaymentStatus();
        double double4 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTransactionID("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction0.getTransactionID();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str7, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        reservation0.setEndTime("Booking [null] null | null to null | CANCELLED");
        double double13 = reservation0.getDepositAmount();
        java.lang.String str14 = reservation0.getStartTime();
        boolean boolean15 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.setUserID("Booking [null] null | null to null | hi!");
        java.lang.String str13 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str13, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        reservation0.extend("CANCELLED");
        java.lang.String str10 = reservation0.getPaymentMethod();
        reservation0.setPaymentMethod("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        model.Reservation reservation7 = new model.Reservation("", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "", "", 100.0d);
        reservation7.extend("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str10 = reservation7.getUserID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str10, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        model.Equipment equipment7 = new model.Equipment("CANCELLED", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "", "CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        boolean boolean9 = equipment7.isAvailable();
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        equipment7.setName("Booking [null] null | hi! to null | hi!");
        java.lang.String str17 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isExtended();
        java.lang.String str7 = reservation0.getUserID();
        reservation0.setEndTime("hi!");
        reservation0.setDepositAmount((double) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 100L);
        reservation7.setPaymentMethod("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.toString();
        equipment7.setType("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setEquipmentID("SUCCESS");
        model.LabLocation labLocation18 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        boolean boolean21 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labLocation18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.forfeitDeposit();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        boolean boolean13 = reservation0.isDepositForfeited();
        reservation0.setUserID("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str9, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        boolean boolean8 = reservation0.isDepositForfeited();
        java.lang.String str9 = reservation0.toString();
        reservation0.cancel();
        java.lang.String str11 = reservation0.toString();
        reservation0.setUserID("CANCELLED");
        java.lang.String str14 = reservation0.getStartTime();
        java.lang.String str15 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str9, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CANCELLED" + "'", str15, "CANCELLED");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.extend("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        double double7 = reservation0.getDepositAmount();
        java.lang.String str8 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED" + "'", str8, "Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getBookingID();
        java.lang.String str7 = paymentTransaction4.getBookingID();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("hi!");
        java.lang.String str7 = paymentTransaction4.getTransactionID();
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null");
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        reservation0.setDepositForfeited(true);
        reservation0.setStartTime("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        model.Reservation reservation7 = new model.Reservation("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) (short) 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setType("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass12 = equipment7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setDepositAmount((double) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("hi!");
        java.lang.String str7 = paymentTransaction4.getTransactionID();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        double double9 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        java.lang.String str5 = reservation0.toString();
        reservation0.setPaymentMethod("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", (double) (short) 1, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null " + "'", str5, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.cancel();
        boolean boolean15 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) (-1), "Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SUCCESS" + "'", str5, "SUCCESS");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str13, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        java.lang.String str17 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str15 = reservation0.toString();
        reservation0.setEquipmentID("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null" + "'", str15, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getBookingID();
        java.lang.String str10 = paymentTransaction4.getTransactionID();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTotalAmount((double) 'a');
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setStatus("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getRoomNumber();
        boolean boolean15 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.toString();
        equipment7.setStatus("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        boolean boolean8 = reservation0.isDepositForfeited();
        java.lang.String str9 = reservation0.toString();
        reservation0.cancel();
        reservation0.forfeitDeposit();
        java.lang.String str12 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str9, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null |  to null | hi!", (double) 0.0f);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        java.lang.String str10 = reservation0.getPaymentMethod();
        java.lang.String str11 = reservation0.getStatus();
        java.lang.String str12 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CANCELLED" + "'", str11, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SUCCESS" + "'", str12, "SUCCESS");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10.0f);
        double double11 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0);
        double double14 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        paymentTransaction4.setBookingID("FORFEITED");
        paymentTransaction4.setTransactionID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.cancel();
        java.lang.String str15 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        java.lang.String str10 = equipment0.getRoomNumber();
        java.lang.String str11 = equipment0.getBuildingName();
        equipment0.setRoomNumber("Booking [null] null |  to null | hi!");
        equipment0.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str16 = equipment0.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        model.Reservation reservation7 = new model.Reservation("", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "", "", 100.0d);
        reservation7.setDepositForfeited(true);
        reservation7.setStartTime("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("SUCCESS", "", (double) (short) 0, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (byte) -1);
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("SUCCESS", "", (double) (short) 0, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", 32.0d, "FORFEITED");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setBookingID("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED" + "'", str14, "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("", "CANCELLED", (double) (short) 0, "CANCELLED");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        double double6 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CANCELLED" + "'", str5, "CANCELLED");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentMethod("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to hi! | Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | hi!", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        java.lang.String str8 = equipment7.getBuildingName();
        java.lang.String str9 = equipment7.getType();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        paymentTransaction4.setTotalAmount((double) ' ');
        java.lang.String str12 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.setUserID("Booking [null] null | null to null | CANCELLED");
        boolean boolean11 = reservation0.isDepositForfeited();
        java.lang.String str12 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", "Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED", (double) (short) -1);
        reservation7.setUserID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str10 = reservation7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CANCELLED" + "'", str10, "CANCELLED");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getEndTime();
        reservation0.setPaymentMethod("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        reservation0.setUserID("hi!");
        java.lang.String str8 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        double double12 = paymentTransaction4.getTotalAmount();
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("FORFEITED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        equipment7.setStatus("");
        equipment7.setType("Booking [null] null | null to null | CANCELLED");
        equipment7.setName("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        boolean boolean4 = reservation0.isExtended();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        equipment7.setName("Booking [null] null | hi! to null | hi!");
        equipment7.setType("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", 1.0d, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str12 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getStartTime();
        java.lang.String str11 = reservation0.getUserID();
        double double12 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getRoomNumber();
        java.lang.String str10 = equipment7.getBuildingName();
        java.lang.String str11 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        double double10 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str13, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str14 = reservation0.getUserID();
        java.lang.String str15 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        model.Equipment equipment7 = new model.Equipment("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS", "FORFEITED", "Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        boolean boolean8 = reservation7.isDepositForfeited();
        java.lang.String str9 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        java.lang.String str5 = reservation0.getBookingID();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setDepositAmount((double) (short) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setDepositForfeited(false);
        reservation0.cancel();
        reservation0.setDepositAmount((double) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str4 = reservation0.getStatus();
        java.lang.String str5 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null " + "'", str4, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str4 = reservation0.getStatus();
        java.lang.String str5 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null " + "'", str4, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setExtended(true);
        reservation0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str17 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getName();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("SUCCESS");
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.getEquipmentID();
        java.lang.String str16 = equipment7.toString();
        equipment7.setDescription("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str15 = reservation0.toString();
        reservation0.setEquipmentID("Booking [null] null | null to CANCELLED | null");
        reservation0.setStartTime("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null" + "'", str15, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getUserID();
        reservation0.setUserID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        equipment7.setType("SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.extend("Booking [null] null | null to null | hi!");
        double double10 = reservation7.getDepositAmount();
        reservation7.setEndTime(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        reservation7.cancel();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        reservation0.setExtended(true);
        reservation0.setDepositForfeited(false);
        reservation0.setPaymentMethod("CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getStatus();
        java.lang.String str9 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setBookingID("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("CANCELLED");
        java.lang.String str9 = reservation0.getStatus();
        reservation0.setEquipmentID("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
        reservation0.extend("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str17 = equipment7.getType();
        equipment7.setBuildingName("FORFEITED");
        java.lang.String str20 = equipment7.getRoomNumber();
        java.lang.String str21 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str20, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setEquipmentID("");
        java.lang.String str10 = equipment7.getType();
        equipment7.setBuildingName("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getPaymentStatus();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str10, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        java.lang.String str10 = equipment0.getRoomNumber();
        java.lang.String str11 = equipment0.getEquipmentID();
        java.lang.String str12 = equipment0.getBuildingName();
        java.lang.String str13 = equipment0.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setDepositAmount((double) 10.0f);
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (-1));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.forfeitDeposit();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setEquipmentID("Booking [null] null |  to null | hi!");
        double double15 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setDescription("");
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getStatus();
        equipment7.setType("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.extend("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", 1.0d, "hi!");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTransactionID("");
        double double8 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        paymentTransaction4.setPaymentStatus("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setBookingID("Booking [null] null | null to null | null");
        java.lang.String str11 = reservation0.getPaymentMethod();
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setEndTime("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getEquipmentID();
        java.lang.String str4 = reservation0.getBookingID();
        reservation0.cancel();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        model.Equipment equipment7 = new model.Equipment("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null", "FORFEITED", "FORFEITED", "Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        java.lang.String str9 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FORFEITED" + "'", str9, "FORFEITED");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        model.Reservation reservation7 = new model.Reservation("hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) ' ');
        java.lang.String str8 = reservation7.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setPaymentMethod("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        boolean boolean13 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setEndTime("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str10 = reservation0.getUserID();
        reservation0.setDepositAmount((double) (short) -1);
        reservation0.setUserID("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.Class<?> wildcardClass13 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getEndTime();
        reservation0.setExtended(false);
        reservation0.setEndTime("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        model.Equipment equipment7 = new model.Equipment(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [CANCELLED]  | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str8, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getEndTime();
        reservation0.setPaymentMethod("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        reservation0.setUserID("hi!");
        java.lang.String str8 = reservation0.getEquipmentID();
        boolean boolean9 = reservation0.isExtended();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setPaymentMethod("");
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str11 = reservation0.getEquipmentID();
        java.lang.String str12 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        double double6 = paymentTransaction4.getTotalAmount();
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentMethod("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        java.lang.String str16 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(false);
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str14 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str14, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation20 = equipment7.getLabLocation();
        equipment7.setDescription("CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labLocation20);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTransactionID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTotalAmount((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        java.lang.String str7 = reservation0.getStartTime();
        java.lang.String str8 = reservation0.getPaymentMethod();
        java.lang.String str9 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        boolean boolean10 = reservation0.isExtended();
        java.lang.String str11 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        reservation0.setEquipmentID("");
        boolean boolean14 = reservation0.isDepositForfeited();
        reservation0.setBookingID("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        model.Reservation reservation7 = new model.Reservation("", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "", "", 100.0d);
        java.lang.String str8 = reservation7.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.forfeitDeposit();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setEndTime("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setType("SUCCESS");
        java.lang.String str18 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str9 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setEndTime("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str10 = reservation0.getUserID();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str15 = reservation0.toString();
        java.lang.String str16 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null" + "'", str15, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        java.lang.String str12 = equipment7.getDescription();
        java.lang.String str13 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str11 = reservation0.getStatus();
        reservation0.setDepositAmount(0.0d);
        reservation0.setEndTime("Booking [null] null | hi! to null | hi!");
        java.lang.String str16 = reservation0.getEndTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str16, "Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.extend("Booking [null] null | null to null | hi!");
        reservation0.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getBookingID();
        java.lang.String str10 = paymentTransaction4.getTransactionID();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.setStatus("SUCCESS");
        reservation0.forfeitDeposit();
        java.lang.String str11 = reservation0.getEquipmentID();
        java.lang.String str12 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        double double12 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        boolean boolean9 = equipment7.isAvailable();
        java.lang.String str10 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        paymentTransaction0.setTotalAmount((double) (short) -1);
        java.lang.String str7 = paymentTransaction0.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount((double) (short) -1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.setPaymentMethod("hi!");
        reservation7.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation7.forfeitDeposit();
        reservation7.setPaymentMethod("Booking [null] null | null to Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi! | hi!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        model.Reservation reservation7 = new model.Reservation("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "FORFEITED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", (double) (byte) 1);
        reservation7.setDepositAmount(100.0d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositAmount((double) 0);
        reservation0.setStatus("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", (double) '#', "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setBookingID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("", "CANCELLED", (double) (short) 0, "CANCELLED");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        double double6 = paymentTransaction4.getTotalAmount();
        double double7 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CANCELLED" + "'", str5, "CANCELLED");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null");
        reservation0.setStatus("");
        java.lang.String str11 = reservation0.getEndTime();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        reservation0.cancel();
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.cancel();
        reservation0.setExtended(true);
        reservation0.forfeitDeposit();
        java.lang.String str14 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str14, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        paymentTransaction4.setBookingID("FORFEITED");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getPaymentStatus();
        java.lang.String str13 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SUCCESS" + "'", str12, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setEndTime("Booking [null] null | null to null | hi!");
        java.lang.String str9 = reservation0.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        java.lang.String str6 = reservation0.getStatus();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to  | CANCELLED", (double) ' ', "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }
}

