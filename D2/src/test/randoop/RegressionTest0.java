package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.Class<?> wildcardClass3 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        java.lang.Class<?> wildcardClass12 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.Class<?> wildcardClass9 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getTransactionID();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getDescription();
        java.lang.Class<?> wildcardClass2 = equipment0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setDepositAmount(1.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        java.lang.String str9 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        paymentTransaction4.setPaymentStatus("");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        reservation0.extend("CANCELLED");
        boolean boolean10 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getStatus();
        java.lang.String str16 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        equipment0.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("", "CANCELLED", (double) (short) 0, "CANCELLED");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTransactionID("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CANCELLED" + "'", str5, "CANCELLED");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setType("hi!");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        equipment7.setStatus("hi!");
        java.lang.String str16 = equipment7.getName();
        java.lang.String str17 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str17, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.toString();
        java.lang.String str9 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = reservation0.getStartTime();
        java.lang.Class<?> wildcardClass11 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        boolean boolean9 = equipment0.isAvailable();
        java.lang.Class<?> wildcardClass10 = equipment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        java.lang.String str5 = reservation0.toString();
        reservation0.setDepositAmount((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTransactionID("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.Class<?> wildcardClass2 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        java.lang.String str6 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("");
        java.lang.String str9 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.Class<?> wildcardClass8 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.Class<?> wildcardClass11 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.setPaymentMethod("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getStatus();
        reservation0.setBookingID("hi!");
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        java.lang.Class<?> wildcardClass10 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setBookingID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass12 = paymentTransaction4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        model.Reservation reservation7 = new model.Reservation("hi!", "hi!", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 'a');
        boolean boolean8 = reservation7.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        paymentTransaction4.setTransactionID("CANCELLED");
        paymentTransaction4.setPaymentMethod("");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null");
        java.lang.String str10 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTransactionID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTransactionID("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTotalAmount((double) ' ');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        boolean boolean15 = equipment7.isAvailable();
        org.junit.Assert.assertNotNull(labLocation14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        java.lang.Class<?> wildcardClass8 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getBuildingName();
        java.lang.String str3 = equipment0.getType();
        java.lang.String str4 = equipment0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("hi!");
        java.lang.Class<?> wildcardClass15 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        java.lang.String str12 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setBookingID("");
        reservation0.extend("Booking [null] null | null to null | null");
        boolean boolean9 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        java.lang.String str4 = reservation0.toString();
        reservation0.setExtended(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str17 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass14 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStartTime("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        java.lang.String str3 = equipment0.getRoomNumber();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        double double10 = reservation0.getDepositAmount();
        reservation0.setPaymentMethod("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.cancel();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getUserID();
        java.lang.Class<?> wildcardClass8 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setEndTime("Booking [null] null | null to null | null");
        java.lang.String str9 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 1);
        paymentTransaction4.setTotalAmount((double) 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        java.lang.String str4 = reservation0.getPaymentMethod();
        reservation0.cancel();
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setEquipmentID("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        equipment7.setDescription("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getBookingID();
        reservation0.setUserID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("SUCCESS", "", (double) (-1), "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        java.lang.String str12 = equipment7.getType();
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getPaymentStatus();
        double double4 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTotalAmount((double) (-1));
        paymentTransaction0.setTotalAmount((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        java.lang.String str16 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", (double) 10L, "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getBuildingName();
        java.lang.String str14 = equipment7.getType();
        java.lang.String str15 = equipment7.getRoomNumber();
        equipment7.setName("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        equipment7.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        java.lang.String str14 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        boolean boolean8 = reservation0.isDepositForfeited();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getBuildingName();
        equipment0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str5 = equipment0.getRoomNumber();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        equipment7.setRoomNumber("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTotalAmount((double) 10.0f);
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        boolean boolean12 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setExtended(true);
        reservation0.setExtended(true);
        reservation0.setDepositAmount(10.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        java.lang.String str8 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        boolean boolean17 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str16, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", 1.0d, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setDescription("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        model.LabLocation labLocation10 = equipment0.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labLocation10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setBookingID("CANCELLED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        java.lang.String str4 = reservation0.toString();
        double double5 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        boolean boolean18 = equipment7.isAvailable();
        java.lang.Class<?> wildcardClass19 = equipment7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        java.lang.String str9 = equipment0.getDescription();
        equipment0.setStatus("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTotalAmount((double) 100);
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("CANCELLED");
        java.lang.String str13 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.toString();
        java.lang.String str9 = equipment7.getRoomNumber();
        java.lang.String str10 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str13, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", "Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED", (double) (short) -1);
        java.lang.String str8 = reservation7.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str8, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setBookingID("SUCCESS");
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to hi! | Booking [null] null | null to null | null", "FORFEITED", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "FORFEITED", "Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        java.lang.String str4 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        java.lang.String str9 = equipment0.getDescription();
        java.lang.Class<?> wildcardClass10 = equipment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | CANCELLED");
        java.lang.String str14 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setBookingID("FORFEITED");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getType();
        java.lang.String str13 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        reservation0.extend("");
        reservation0.setExtended(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getBookingID();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        java.lang.String str4 = reservation0.getEndTime();
        reservation0.setEndTime("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStatus();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getStatus();
        equipment7.setStatus("Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str5 = paymentTransaction0.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getBookingID();
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        paymentTransaction4.setBookingID("FORFEITED");
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.setBookingID("Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "SUCCESS", (double) 1.0f, "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        model.Equipment equipment7 = new model.Equipment("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "hi!");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        reservation0.setUserID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = reservation0.getStartTime();
        java.lang.String str11 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED" + "'", str11, "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setName("");
        java.lang.String str10 = equipment7.getDescription();
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getStatus();
        java.lang.String str16 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str16, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(32.0d);
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) (short) 10, "Booking [null] null | null to null | hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", (double) (short) 100, "Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (-1.0f));
        java.lang.String str7 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str7, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        equipment7.setBuildingName("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setRoomNumber("FORFEITED");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        java.lang.String str9 = reservation0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        java.lang.String str4 = reservation0.getEndTime();
        reservation0.setDepositAmount(1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("null -  [null] @ null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str10 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str7, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.toString();
        java.lang.Class<?> wildcardClass7 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getStatus();
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        equipment7.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass17 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setEquipmentID("");
        java.lang.String str10 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertNotNull(labLocation14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str8 = reservation0.getEndTime();
        java.lang.String str9 = reservation0.getEndTime();
        boolean boolean10 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setDescription("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str10 = equipment0.getType();
        equipment0.setRoomNumber("Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        equipment7.setBuildingName("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getBookingID();
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        double double8 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getStatus();
        java.lang.String str11 = equipment7.getType();
        equipment7.setRoomNumber("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.setStatus("SUCCESS");
        java.lang.String str10 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setRoomNumber("Booking [null] null | null to null | null");
        equipment7.setType("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(false);
        double double12 = reservation0.getDepositAmount();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        java.lang.String str12 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        paymentTransaction4.setBookingID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getEndTime();
        java.lang.String str3 = reservation0.getBookingID();
        java.lang.String str4 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "FORFEITED", (double) 0.0f, "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setStatus("Booking [null] null | null to null | null");
        double double16 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        java.lang.String str8 = equipment7.getBuildingName();
        java.lang.String str9 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str9, "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getStatus();
        equipment0.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment0.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setEquipmentID("");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        reservation0.setStartTime("SUCCESS");
        java.lang.String str9 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CANCELLED" + "'", str9, "CANCELLED");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | hi! to null | hi!");
        java.lang.String str19 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str19, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", (double) (-1L));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getPaymentStatus();
        double double4 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTotalAmount((double) (-1));
        paymentTransaction0.setTransactionID("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        java.lang.Class<?> wildcardClass7 = reservation0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setEndTime("Booking [null] null | null to null | hi!");
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.cancel();
        reservation0.setDepositAmount((double) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        double double14 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setEndTime("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getName();
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        java.lang.String str12 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        boolean boolean3 = reservation0.isExtended();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        java.lang.String str6 = equipment0.getType();
        model.LabLocation labLocation7 = equipment0.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(labLocation7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "FORFEITED" + "'", str6, "FORFEITED");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        double double13 = paymentTransaction4.getTotalAmount();
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("");
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        java.lang.String str11 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) (short) 10, "Booking [null] null | null to null | hi!");
        paymentTransaction4.setTotalAmount((double) (short) 100);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        boolean boolean5 = reservation0.isDepositForfeited();
        double double6 = reservation0.getDepositAmount();
        reservation0.extend("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("SUCCESS");
        reservation0.forfeitDeposit();
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double14 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        java.lang.String str14 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isExtended();
        double double12 = reservation0.getDepositAmount();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str15 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str13, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        reservation0.setPaymentMethod("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        paymentTransaction4.setTotalAmount((double) ' ');
        double double12 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        boolean boolean6 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isExtended();
        reservation0.setEndTime("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        java.lang.String str6 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        double double5 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        model.Reservation reservation7 = new model.Reservation("CANCELLED", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | CANCELLED", (double) (short) 100);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null");
        reservation0.cancel();
        java.lang.String str7 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        double double12 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setDescription("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str10 = equipment0.getType();
        java.lang.String str11 = equipment0.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        reservation0.setUserID("CANCELLED");
        java.lang.Class<?> wildcardClass8 = reservation0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        reservation0.extend("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        java.lang.String str6 = reservation0.getBookingID();
        boolean boolean7 = reservation0.isDepositForfeited();
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getName();
        equipment7.setName("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        boolean boolean3 = reservation0.isExtended();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        java.lang.String str6 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null |  to null | hi!", "Booking [null] null |  to null | hi!", "hi!", "SUCCESS", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", (double) (short) 100);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (byte) -1, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) 0.0f, "CANCELLED");
        java.lang.Class<?> wildcardClass5 = paymentTransaction4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 10L, "CANCELLED");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTotalAmount(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        equipment7.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labLocation18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setEquipmentID("");
        reservation0.setEquipmentID("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        double double9 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        equipment7.setName("FORFEITED");
        java.lang.String str14 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FORFEITED" + "'", str14, "FORFEITED");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to hi! | Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | hi!", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        java.lang.String str4 = reservation0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setStatus("hi!");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        boolean boolean7 = reservation0.isExtended();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getName();
        java.lang.String str13 = equipment7.getName();
        java.lang.String str14 = equipment7.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str13, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        double double8 = paymentTransaction4.getTotalAmount();
        java.lang.String str9 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.getEquipmentID();
        boolean boolean16 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setType("hi!");
        equipment7.setType("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        equipment7.setStatus("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.setDepositForfeited(false);
        boolean boolean6 = reservation0.isDepositForfeited();
        reservation0.setUserID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        model.Reservation reservation7 = new model.Reservation("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", (double) (short) 10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str10 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        model.Equipment equipment7 = new model.Equipment("CANCELLED", "CANCELLED", "SUCCESS", "CANCELLED", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        paymentTransaction4.setBookingID("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setUserID("CANCELLED");
        boolean boolean16 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(true);
        java.lang.String str12 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getRoomNumber();
        java.lang.String str12 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        model.Equipment equipment0 = new model.Equipment();
        boolean boolean1 = equipment0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setExtended(false);
        java.lang.String str9 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getBookingID();
        java.lang.String str4 = paymentTransaction0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isExtended();
        java.lang.String str7 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTotalAmount((double) 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        reservation0.setStartTime("SUCCESS");
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        paymentTransaction4.setTransactionID("null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getStatus();
        java.lang.String str14 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("hi!");
        equipment7.setType("Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        java.lang.String str8 = reservation0.getStartTime();
        double double9 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        java.lang.String str10 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(10.0d);
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        boolean boolean15 = equipment7.isAvailable();
        equipment7.setType("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "", "Booking [null] null | null to null | CANCELLED", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "SUCCESS");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        double double13 = paymentTransaction4.getTotalAmount();
        java.lang.String str14 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        java.lang.String str5 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str15 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTotalAmount((-1.0d));
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setUserID("hi!");
        reservation0.setExtended(true);
        reservation0.setEquipmentID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentStatus("hi!");
        paymentTransaction4.setTotalAmount((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str7, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        model.Equipment equipment7 = new model.Equipment("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getEquipmentID();
        java.lang.Class<?> wildcardClass11 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getStatus();
        java.lang.String str2 = equipment0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentMethod("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("FORFEITED");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.cancel();
        java.lang.String str5 = reservation0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        reservation0.setEquipmentID("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", (double) (short) 100, "Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (-1.0f));
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getStatus();
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        equipment7.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str17 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        java.lang.String str8 = equipment7.getBuildingName();
        java.lang.String str9 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(true);
        reservation0.setUserID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.getEquipmentID();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.setBookingID("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setDescription("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setStatus("Booking [null] null | null to null | hi!");
        java.lang.String str16 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setPaymentMethod("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getType();
        equipment7.setName("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setBookingID("CANCELLED");
        java.lang.String str16 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SUCCESS" + "'", str16, "SUCCESS");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str9 = reservation0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str9, "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTransactionID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass5 = paymentTransaction0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        java.lang.String str12 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        model.Reservation reservation7 = new model.Reservation("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", (double) 100L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.getEquipmentID();
        java.lang.String str16 = equipment7.toString();
        equipment7.setName("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        model.Reservation reservation7 = new model.Reservation("hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) ' ');
        java.lang.String str8 = reservation7.getBookingID();
        reservation7.setBookingID("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str11 = reservation0.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | " + "'", str11, "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        boolean boolean13 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        double double6 = paymentTransaction4.getTotalAmount();
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str8, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) (short) 10, "Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        paymentTransaction4.setBookingID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        model.Reservation reservation7 = new model.Reservation("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null |  to null | hi!", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "FORFEITED", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", "", (double) (byte) 1);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setDescription("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        equipment0.setDescription("Booking [null] null | hi! to null | hi!");
        equipment0.setName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("hi!");
        java.lang.String str15 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        boolean boolean12 = equipment7.isAvailable();
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        model.Reservation reservation7 = new model.Reservation("CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) (short) -1);
        reservation7.setDepositForfeited(false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        java.lang.String str12 = equipment7.getRoomNumber();
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setEndTime("Booking [null] null | null to null | null");
        boolean boolean9 = reservation0.isDepositForfeited();
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        java.lang.String str10 = reservation0.getEndTime();
        boolean boolean11 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getRoomNumber();
        boolean boolean14 = equipment7.isAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setDescription("");
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getStatus();
        java.lang.String str13 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        java.lang.String str14 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str8 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED" + "'", str8, "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        equipment7.setEquipmentID("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        double double7 = reservation0.getDepositAmount();
        reservation0.setDepositAmount((double) 1L);
        reservation0.setBookingID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str12 = reservation0.getPaymentMethod();
        java.lang.String str13 = reservation0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getUserID();
        java.lang.String str2 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setBookingID("SUCCESS");
        reservation0.setEquipmentID("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        boolean boolean8 = reservation7.isDepositForfeited();
        reservation7.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        java.lang.String str17 = equipment7.getEquipmentID();
        equipment7.setEquipmentID("Booking [null] null |  to null | hi!");
        java.lang.String str20 = equipment7.getDescription();
        java.lang.String str21 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | null" + "'", str20, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        equipment7.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setDescription("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getPaymentMethod();
        java.lang.String str4 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.extend("null -  [null] @ null Booking [null] null | null to null | null");
        reservation0.setPaymentMethod("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        model.Reservation reservation7 = new model.Reservation("", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "FORFEITED", 0.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "hi!", "", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNotNull(labLocation8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to  | Booking [null] null | null to null | null", "CANCELLED", "SUCCESS", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getDescription();
        equipment7.setRoomNumber("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = equipment7.getStatus();
        java.lang.String str16 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED" + "'", str16, " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setEquipmentID("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setStatus("hi!");
        reservation0.extend("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to null | null");
        boolean boolean14 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setRoomNumber("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        java.lang.String str13 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | hi!");
        reservation0.extend("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        java.lang.String str13 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("null -  [null] @ null Booking [null] null | null to null | null", "FORFEITED", (double) '#', "Booking [null] null |  to null | hi!");
        paymentTransaction4.setTotalAmount((double) (short) 10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.Class<?> wildcardClass13 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getName();
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str14 = equipment7.toString();
        equipment7.setEquipmentID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        model.Equipment equipment7 = new model.Equipment("CANCELLED", "CANCELLED", "SUCCESS", "CANCELLED", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED");
        equipment7.setBuildingName("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(32.0d);
        paymentTransaction4.setTotalAmount(0.0d);
        paymentTransaction4.setBookingID("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setEquipmentID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        boolean boolean12 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        java.lang.String str12 = equipment7.getType();
        equipment7.setDescription("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        equipment7.setDescription("");
        java.lang.String str17 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setUserID("SUCCESS");
        reservation0.extend("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str10 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount(32.0d);
        double double15 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str18 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        boolean boolean10 = reservation0.isExtended();
        java.lang.String str11 = reservation0.getBookingID();
        reservation0.setDepositAmount((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getBookingID();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getBuildingName();
        model.LabLocation labLocation16 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        boolean boolean16 = equipment7.isAvailable();
        java.lang.String str17 = equipment7.getBuildingName();
        equipment7.setBuildingName("CANCELLED");
        java.lang.String str20 = equipment7.getEquipmentID();
        model.LabLocation labLocation21 = equipment7.getLabLocation();
        java.lang.String str22 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(labLocation21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CANCELLED" + "'", str22, "CANCELLED");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", 32.0d, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        java.lang.Class<?> wildcardClass12 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.toString();
        java.lang.String str7 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setEquipmentID("");
        reservation0.setUserID("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setUserID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.toString();
        double double11 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str10, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getType();
        equipment7.setDescription("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.getBuildingName();
        equipment7.setType("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        java.lang.Class<?> wildcardClass12 = labLocation11.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setStatus("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str12 = reservation0.getEndTime();
        reservation0.setStatus("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        java.lang.String str17 = equipment7.getRoomNumber();
        equipment7.setEquipmentID("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", 100.0d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.setDepositForfeited(false);
        double double7 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        java.lang.String str8 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) '#');
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        reservation0.setEquipmentID("");
        java.lang.String str14 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [CANCELLED]  | null to null | null" + "'", str14, "Booking [CANCELLED]  | null to null | null");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        java.lang.String str5 = reservation0.getUserID();
        java.lang.String str6 = reservation0.getBookingID();
        java.lang.String str7 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        java.lang.String str12 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setBookingID("");
        reservation0.setBookingID("");
        java.lang.String str9 = reservation0.getStatus();
        double double10 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        equipment7.setName("FORFEITED");
        equipment7.setStatus("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("SUCCESS");
        reservation0.setUserID("Booking [CANCELLED]  | null to null | null");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        java.lang.String str17 = equipment7.getEquipmentID();
        equipment7.setEquipmentID("Booking [null] null |  to null | hi!");
        java.lang.String str20 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        java.lang.String str9 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str9, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        java.lang.String str4 = reservation0.getStatus();
        java.lang.Class<?> wildcardClass5 = reservation0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FORFEITED" + "'", str4, "FORFEITED");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        equipment7.setEquipmentID("");
        java.lang.Class<?> wildcardClass14 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        reservation0.setStartTime("CANCELLED");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        equipment7.setEquipmentID("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        java.lang.String str13 = paymentTransaction4.getBookingID();
        java.lang.String str14 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "FORFEITED");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount((double) 100.0f);
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.extend("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        java.lang.String str12 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [null] null | null to null | CANCELLED", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.setBuildingName("CANCELLED");
        java.lang.String str11 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getEquipmentID();
        equipment7.setRoomNumber("");
        java.lang.String str13 = equipment7.getName();
        equipment7.setStatus("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getRoomNumber();
        java.lang.String str12 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        model.Reservation reservation7 = new model.Reservation("null -  [null] @ null Booking [null] null | null to null | null", "", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [CANCELLED]  | null to null | null", (double) 10.0f);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        boolean boolean5 = reservation0.isDepositForfeited();
        double double6 = reservation0.getDepositAmount();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str9 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getEquipmentID();
        java.lang.String str9 = reservation0.getUserID();
        reservation0.setBookingID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.cancel();
        reservation0.setEquipmentID("");
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        boolean boolean9 = equipment7.isAvailable();
        java.lang.String str10 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str10, "Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "CANCELLED", "Booking [CANCELLED]  | null to null | null", (double) (byte) 100);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        java.lang.String str9 = equipment0.getDescription();
        java.lang.String str10 = equipment0.toString();
        java.lang.String str11 = equipment0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str10, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str11, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str8 = reservation0.getEndTime();
        java.lang.String str9 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        java.lang.String str8 = reservation0.getStartTime();
        java.lang.String str9 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getEndTime();
        reservation0.setBookingID("Booking [null] null |  to null | hi!");
        java.lang.String str6 = reservation0.getStatus();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getEquipmentID();
        java.lang.String str11 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        java.lang.String str8 = reservation7.getStartTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        java.lang.String str6 = reservation0.getUserID();
        java.lang.String str7 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getType();
        equipment7.setType("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setDescription("Booking [null] null | hi! to null | hi!");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str15, "Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getBookingID();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", (double) 100, "Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str5, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("SUCCESS");
        java.lang.String str5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setEquipmentID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        boolean boolean12 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("");
        java.lang.String str13 = reservation0.toString();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str13, "Booking [null] null |  to null | hi!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        java.lang.String str10 = equipment0.getRoomNumber();
        java.lang.String str11 = equipment0.getBuildingName();
        equipment0.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        model.Reservation reservation7 = new model.Reservation("", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", (double) 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getEquipmentID();
        equipment7.setRoomNumber("");
        java.lang.String str13 = equipment7.getEquipmentID();
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        model.Reservation reservation7 = new model.Reservation("hi!", "Booking [null] null | null to null | hi!", "hi!", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", (double) 10L);
        java.lang.String str8 = reservation7.getUserID();
        reservation7.setDepositAmount((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str8 = reservation0.getEndTime();
        java.lang.String str9 = reservation0.getEndTime();
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setDepositAmount((double) 1.0f);
        boolean boolean13 = reservation0.isExtended();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [CANCELLED]  | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [CANCELLED]  | null to null | null", (double) (byte) 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setUserID("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        java.lang.String str4 = reservation0.getEndTime();
        java.lang.String str5 = reservation0.getUserID();
        java.lang.String str6 = reservation0.getUserID();
        boolean boolean7 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str16 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        java.lang.String str4 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setEquipmentID("CANCELLED");
        reservation0.setBookingID("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        reservation0.setBookingID("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(10.0d);
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentStatus("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getDescription();
        equipment7.setRoomNumber("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = equipment7.getStatus();
        java.lang.String str16 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to  | CANCELLED", "Booking [null] null | null to  | CANCELLED", (double) 100.0f);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        boolean boolean6 = reservation0.isExtended();
        double double7 = reservation0.getDepositAmount();
        reservation0.setUserID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setDepositAmount((double) ' ');
        boolean boolean14 = reservation0.isDepositForfeited();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        double double7 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setExtended(true);
        reservation0.setDepositForfeited(false);
        reservation0.setPaymentMethod("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setEndTime("Booking [null] null | null to null | null");
        java.lang.String str11 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount(32.0d);
        java.lang.String str15 = paymentTransaction4.getBookingID();
        double double16 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 'a');
        java.lang.String str19 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.cancel();
        reservation0.setEquipmentID("");
        java.lang.String str8 = reservation0.getPaymentMethod();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str11 = reservation0.toString();
        boolean boolean12 = reservation0.isExtended();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null" + "'", str11, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        boolean boolean3 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isDepositForfeited();
        reservation0.setEndTime("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        model.Reservation reservation7 = new model.Reservation("", "", "SUCCESS", "CANCELLED", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "hi!", (double) 'a');
        reservation7.setDepositAmount((-1.0d));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.cancel();
        java.lang.String str9 = reservation0.getPaymentMethod();
        java.lang.String str10 = reservation0.getStartTime();
        java.lang.String str11 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str9, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTotalAmount((double) 100);
        java.lang.String str17 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = reservation0.getStartTime();
        double double11 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        reservation0.extend("");
        reservation0.forfeitDeposit();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setEquipmentID("CANCELLED");
        java.lang.Class<?> wildcardClass9 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        java.lang.String str17 = equipment7.getEquipmentID();
        boolean boolean18 = equipment7.isAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        model.Reservation reservation7 = new model.Reservation("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null |  to null | hi!", (double) (-1));
        java.lang.String str8 = reservation7.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null " + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        java.lang.String str13 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getBookingID();
        reservation0.setStartTime("");
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        double double10 = reservation0.getDepositAmount();
        java.lang.String str11 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        equipment7.setStatus("");
        equipment7.setBuildingName("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        double double10 = reservation0.getDepositAmount();
        boolean boolean11 = reservation0.isExtended();
        java.lang.String str12 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        java.lang.String str9 = equipment0.getDescription();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setStatus("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setEquipmentID("");
        java.lang.String str10 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null " + "'", str10, " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        java.lang.String str8 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        boolean boolean8 = reservation7.isDepositForfeited();
        reservation7.forfeitDeposit();
        reservation7.setDepositAmount((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getDescription();
        equipment7.setRoomNumber("Booking [null] null | null to null | CANCELLED");
        java.lang.String str15 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED" + "'", str15, " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", (double) 10L, "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        model.LabLocation labLocation10 = equipment0.getLabLocation();
        equipment0.setStatus("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str13 = equipment0.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labLocation10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", (double) 100.0f, "Booking [null] null |  to null | hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.toString();
        java.lang.String str16 = equipment7.getRoomNumber();
        java.lang.String str17 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str17, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getDescription();
        equipment7.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.forfeitDeposit();
        java.lang.String str10 = reservation0.getStatus();
        java.lang.Class<?> wildcardClass11 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FORFEITED" + "'", str10, "FORFEITED");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        equipment7.setName("");
        boolean boolean14 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setStartTime("FORFEITED");
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        equipment7.setRoomNumber("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        equipment7.setRoomNumber("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        double double11 = paymentTransaction4.getTotalAmount();
        double double12 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("SUCCESS");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setEndTime("null -  [null] @ null Booking [null] null | null to null | null");
        reservation0.setDepositAmount((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        paymentTransaction4.setTotalAmount((double) 1);
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount(100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        reservation0.setEndTime("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.lang.String str21 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FORFEITED" + "'", str20, "FORFEITED");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.toString();
        java.lang.String str11 = reservation0.getEndTime();
        reservation0.setDepositAmount((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str10, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        java.lang.String str21 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FORFEITED" + "'", str20, "FORFEITED");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        java.lang.String str9 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTotalAmount((-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = equipment7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double14 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [CANCELLED]  | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositAmount((double) 100L);
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setStatus("FORFEITED");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setPaymentMethod("");
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getBookingID();
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        java.lang.String str17 = equipment7.toString();
        java.lang.String str18 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str17, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SUCCESS" + "'", str18, "SUCCESS");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "SUCCESS", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass14 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setStatus("Booking [null] null | null to null | hi!");
        equipment7.setDescription(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setEquipmentID("CANCELLED");
        java.lang.String str17 = equipment7.getName();
        java.lang.String str18 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to  | CANCELLED");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str12 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        equipment7.setEquipmentID("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        reservation0.setStatus("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }
}

