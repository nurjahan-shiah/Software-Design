package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getType();
        equipment7.setBuildingName("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | hi! to null | hi!", (-1.0d), "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) (short) 10, "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        paymentTransaction4.setPaymentStatus("Booking [CANCELLED]  | null to null | null");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | CANCELLED");
        java.lang.String str14 = equipment7.getRoomNumber();
        boolean boolean15 = equipment7.isAvailable();
        java.lang.String str16 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setExtended(true);
        java.lang.String str13 = reservation0.getUserID();
        java.lang.String str14 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setEquipmentID("");
        java.lang.String str15 = equipment7.getRoomNumber();
        java.lang.Class<?> wildcardClass16 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 100, "FORFEITED");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        java.lang.String str17 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str17, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        reservation0.setBookingID("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        boolean boolean16 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        java.lang.String str9 = reservation0.getBookingID();
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setDepositAmount(1.0d);
        reservation0.setEquipmentID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        model.Reservation reservation7 = new model.Reservation("hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) ' ');
        java.lang.String str8 = reservation7.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        boolean boolean14 = reservation0.isExtended();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.toString();
        equipment7.setName("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        java.lang.String str16 = equipment7.getName();
        java.lang.String str17 = equipment7.getStatus();
        java.lang.String str18 = equipment7.getDescription();
        equipment7.setRoomNumber("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.toString();
        model.LabLocation labLocation17 = equipment7.getLabLocation();
        java.lang.String str18 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CANCELLED" + "'", str15, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getStartTime();
        java.lang.String str11 = reservation0.getPaymentMethod();
        double double12 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        model.Reservation reservation7 = new model.Reservation("", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "", "", 100.0d);
        reservation7.extend("null -  [null] @ null Booking [null] null | null to null | null");
        reservation7.setDepositAmount(1.0d);
        java.lang.String str12 = reservation7.getStartTime();
        java.lang.String str13 = reservation7.getBookingID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setRoomNumber("CANCELLED");
        equipment0.setRoomNumber("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment0.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labLocation12);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEquipmentID("SUCCESS");
        java.lang.String str9 = reservation0.getEquipmentID();
        java.lang.String str10 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(10.0d);
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        model.Equipment equipment7 = new model.Equipment("", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "SUCCESS", "FORFEITED");
        equipment7.setRoomNumber("Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null");
        reservation0.setStatus("");
        java.lang.String str11 = reservation0.getEndTime();
        reservation0.setStatus("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getStatus();
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getUserID();
        reservation0.extend("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(true);
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        double double14 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setEquipmentID("Booking [null] null | null to null | null");
        equipment0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str10 = equipment0.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        model.Equipment equipment7 = new model.Equipment("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to CANCELLED | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositAmount((double) 100L);
        java.lang.String str11 = reservation0.getEquipmentID();
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("SUCCESS");
        boolean boolean11 = reservation0.isExtended();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        reservation0.setUserID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str14 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        java.lang.String str17 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        model.Reservation reservation7 = new model.Reservation(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null |  to null | hi!", "CANCELLED", "", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", (double) (short) 0);
        reservation7.setEquipmentID("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
        reservation7.cancel();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        double double13 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str16 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setDescription("Booking [null] null | hi! to null | hi!");
        java.lang.String str15 = equipment7.toString();
        java.lang.String str16 = equipment7.getBuildingName();
        java.lang.String str17 = equipment7.getDescription();
        java.lang.String str18 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str17, "Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str18, "Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("hi!");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        boolean boolean6 = reservation0.isExtended();
        double double7 = reservation0.getDepositAmount();
        boolean boolean8 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getStatus();
        equipment7.setDescription("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        boolean boolean4 = reservation0.isDepositForfeited();
        double double5 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        double double7 = reservation0.getDepositAmount();
        java.lang.String str8 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("hi!");
        boolean boolean5 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentStatus(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str10, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setTotalAmount((double) (byte) 1);
        paymentTransaction4.setPaymentMethod("Booking [null] null | hi! to null | hi!");
        java.lang.Class<?> wildcardClass15 = paymentTransaction4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getBuildingName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setDepositAmount((double) 1L);
        java.lang.String str15 = reservation0.getStartTime();
        java.lang.String str16 = reservation0.getPaymentMethod();
        java.lang.String str17 = reservation0.getEndTime();
        boolean boolean18 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        model.Equipment equipment7 = new model.Equipment(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str9 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        java.lang.String str12 = equipment7.getRoomNumber();
        java.lang.Class<?> wildcardClass13 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("SUCCESS");
        java.lang.String str6 = reservation0.getEquipmentID();
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getStatus();
        java.lang.String str13 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getStatus();
        java.lang.String str6 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str11 = reservation0.getStatus();
        reservation0.setDepositAmount(0.0d);
        reservation0.cancel();
        reservation0.setDepositAmount((double) (short) 1);
        java.lang.String str17 = reservation0.getEndTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getStatus();
        equipment7.setDescription("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        double double5 = reservation0.getDepositAmount();
        reservation0.setDepositAmount((double) (-1.0f));
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        paymentTransaction4.setTransactionID("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.setStatus("SUCCESS");
        reservation0.forfeitDeposit();
        java.lang.String str11 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (byte) -1);
        java.lang.String str14 = reservation0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        equipment7.setRoomNumber("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.lang.String str15 = reservation0.getStartTime();
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.setUserID("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.Class<?> wildcardClass9 = equipment7.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        java.lang.String str9 = reservation0.getUserID();
        java.lang.String str10 = reservation0.toString();
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to  | null" + "'", str10, "Booking [null] null | null to  | null");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        model.LabLocation labLocation19 = equipment7.getLabLocation();
        java.lang.String str20 = equipment7.getBuildingName();
        boolean boolean21 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(labLocation19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | null" + "'", str20, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation20 = equipment7.getLabLocation();
        java.lang.String str21 = equipment7.getBuildingName();
        java.lang.String str22 = equipment7.toString();
        boolean boolean23 = equipment7.isAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labLocation20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str22, "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        paymentTransaction4.setTransactionID("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setDepositForfeited(true);
        java.lang.String str9 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str9, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        model.Reservation reservation7 = new model.Reservation("hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) ' ');
        java.lang.String str8 = reservation7.getBookingID();
        java.lang.String str9 = reservation7.getEquipmentID();
        reservation7.setStatus("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        model.Equipment equipment7 = new model.Equipment("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null" + "'", str8, "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setRoomNumber("Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        model.Equipment equipment7 = new model.Equipment("Booking [CANCELLED]  | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "FORFEITED");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        org.junit.Assert.assertNotNull(labLocation8);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setExtended(true);
        reservation0.setUserID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        reservation0.setDepositForfeited(true);
        boolean boolean18 = reservation0.isDepositForfeited();
        java.lang.String str19 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        reservation0.setEndTime("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.cancel();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        boolean boolean22 = equipment7.isAvailable();
        java.lang.String str23 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Booking [null] null | null to null | null" + "'", str23, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        java.lang.String str7 = reservation0.getStartTime();
        java.lang.String str8 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        reservation0.setPaymentMethod("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getEndTime();
        java.lang.String str7 = reservation0.getPaymentMethod();
        reservation0.setUserID("");
        java.lang.String str10 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        java.lang.String str12 = reservation0.toString();
        java.lang.String str13 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str12, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setEndTime("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        model.LabLocation labLocation10 = equipment0.getLabLocation();
        java.lang.String str11 = equipment0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(labLocation10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        java.lang.String str6 = reservation0.getPaymentMethod();
        boolean boolean7 = reservation0.isExtended();
        java.lang.String str8 = reservation0.getPaymentMethod();
        reservation0.setStartTime("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        boolean boolean11 = reservation0.isExtended();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        reservation0.setUserID("CANCELLED");
        reservation0.setEquipmentID("Booking [null] null | null to  | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        equipment7.setName("hi!");
        equipment7.setBuildingName("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        reservation0.setDepositAmount((double) ' ');
        reservation0.cancel();
        java.lang.String str10 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.cancel();
        reservation0.setPaymentMethod("Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setBookingID("");
        reservation0.setBookingID("");
        reservation0.extend("SUCCESS");
        reservation0.setExtended(true);
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setEquipmentID("CANCELLED");
        java.lang.String str17 = equipment7.getName();
        equipment7.setRoomNumber(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        java.lang.String str12 = reservation0.getStatus();
        java.lang.String str13 = reservation0.getUserID();
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.lang.String str17 = reservation0.getEquipmentID();
        boolean boolean18 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        java.lang.Class<?> wildcardClass15 = labLocation14.getClass();
        org.junit.Assert.assertNotNull(labLocation14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setExtended(true);
        reservation0.setDepositForfeited(true);
        java.lang.String str12 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        java.lang.String str6 = reservation0.getPaymentMethod();
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        boolean boolean9 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isExtended();
        java.lang.String str12 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.cancel();
        java.lang.String str9 = reservation0.getPaymentMethod();
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str9, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.cancel();
        java.lang.String str9 = reservation0.toString();
        boolean boolean10 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str9, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setStatus("SUCCESS");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getUserID();
        reservation0.setPaymentMethod(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "null -  [null] @ null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", "Booking [CANCELLED]  | null to null | null", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED", (double) '4');
        java.lang.String str8 = reservation7.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.toString();
        equipment7.setName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getName();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getStatus();
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", (-1.0d));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "Booking [null] null | null to CANCELLED | null", "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.toString();
        java.lang.String str16 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        java.lang.String str8 = reservation0.toString();
        reservation0.setEndTime("Booking [null] null | hi! to null | hi!");
        java.lang.String str11 = reservation0.getStatus();
        boolean boolean12 = reservation0.isDepositForfeited();
        java.lang.String str13 = reservation0.getEquipmentID();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to hi! | Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        double double17 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "SUCCESS", "", "null -  [null] @ null Booking [null] null | null to null | null");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        org.junit.Assert.assertNotNull(labLocation8);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        java.lang.String str6 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        reservation0.setExtended(true);
        reservation0.setEndTime("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        java.lang.String str17 = equipment7.getRoomNumber();
        java.lang.String str18 = equipment7.getDescription();
        java.lang.String str19 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str19, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("hi!");
        java.lang.String str17 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTotalAmount((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to  | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "hi!", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) '4');
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setType("SUCCESS");
        equipment7.setRoomNumber("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", (double) (short) 100, "Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (-1.0f));
        paymentTransaction4.setTotalAmount((double) 100);
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.toString();
        equipment7.setName("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        java.lang.String str13 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        java.lang.String str15 = reservation0.getStartTime();
        reservation0.setPaymentMethod("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | hi! to null | hi!");
        boolean boolean9 = reservation0.isExtended();
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        equipment7.setName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 0, "Booking [null] null | null to CANCELLED | null");
        paymentTransaction4.setTransactionID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getStatus();
        equipment0.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment0.setStatus("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str6 = equipment0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to  | Booking [null] null | null to null | null", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        equipment7.setBuildingName("Booking [null] null |  to null | hi!");
        java.lang.String str10 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str10, "Booking [null] null |  to null | hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getUserID();
        reservation0.setExtended(false);
        boolean boolean10 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.String str13 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        boolean boolean14 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        boolean boolean6 = reservation0.isExtended();
        reservation0.extend(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setBookingID("");
        reservation0.setBookingID("");
        reservation0.extend("SUCCESS");
        reservation0.setExtended(true);
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setPaymentMethod("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setPaymentMethod(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getDescription();
        java.lang.String str14 = equipment7.getRoomNumber();
        boolean boolean15 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.cancel();
        reservation0.setEquipmentID("");
        java.lang.String str8 = reservation0.getPaymentMethod();
        reservation0.setExtended(true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositForfeited(false);
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getPaymentMethod();
        reservation0.setPaymentMethod("Booking [CANCELLED]  | null to null | null");
        java.lang.String str11 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.getStatus();
        java.lang.String str17 = equipment7.getRoomNumber();
        java.lang.String str18 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.toString();
        java.lang.String str9 = equipment7.getRoomNumber();
        java.lang.String str10 = equipment7.getName();
        java.lang.String str11 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        java.lang.String str15 = reservation0.getUserID();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getRoomNumber();
        java.lang.String str13 = equipment7.getRoomNumber();
        java.lang.String str14 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        java.lang.String str17 = equipment7.getEquipmentID();
        equipment7.setEquipmentID("Booking [null] null |  to null | hi!");
        equipment7.setRoomNumber("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setEquipmentID("");
        java.lang.String str12 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to CANCELLED | null", "Booking [null] null |  to null | hi!", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", (double) ' ');
        java.lang.String str8 = reservation7.getUserID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str8, "Booking [null] null |  to null | hi!");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        boolean boolean7 = reservation0.isDepositForfeited();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getRoomNumber();
        equipment7.setRoomNumber("CANCELLED");
        java.lang.String str17 = equipment7.getDescription();
        java.lang.String str18 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str17, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.forfeitDeposit();
        reservation0.setDepositAmount((double) 100.0f);
        reservation0.setPaymentMethod("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        boolean boolean8 = reservation0.isDepositForfeited();
        java.lang.String str9 = reservation0.getStatus();
        reservation0.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        boolean boolean16 = equipment7.isAvailable();
        java.lang.String str17 = equipment7.getBuildingName();
        equipment7.setBuildingName("CANCELLED");
        equipment7.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        model.LabLocation labLocation22 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation22);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setStatus("FORFEITED");
        java.lang.Class<?> wildcardClass10 = equipment7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getUserID();
        double double2 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.setEndTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str11 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi! | hi!");
        boolean boolean19 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str11 = reservation0.getStatus();
        reservation0.setDepositAmount(0.0d);
        java.lang.String str14 = reservation0.getBookingID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str14, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        java.lang.String str4 = reservation0.toString();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getName();
        java.lang.String str11 = equipment7.getEquipmentID();
        java.lang.String str12 = equipment7.getName();
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setExtended(false);
        java.lang.String str15 = reservation0.getPaymentMethod();
        reservation0.forfeitDeposit();
        java.lang.String str17 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str7, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (short) 100);
        reservation7.setUserID("");
        reservation7.setDepositForfeited(false);
        boolean boolean12 = reservation7.isDepositForfeited();
        java.lang.String str13 = reservation7.toString();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED" + "'", str13, "Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", 1.0d, "hi!");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str9, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        double double9 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount(32.0d);
        double double15 = paymentTransaction4.getTotalAmount();
        java.lang.String str16 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        reservation0.setStartTime("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        double double14 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        java.lang.String str9 = reservation0.getBookingID();
        reservation0.setBookingID("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        java.lang.String str12 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null" + "'", str12, "Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.setStatus("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEquipmentID("SUCCESS");
        java.lang.String str9 = reservation0.getStatus();
        boolean boolean10 = reservation0.isDepositForfeited();
        boolean boolean11 = reservation0.isExtended();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        java.lang.String str4 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | hi! to null | hi!");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.toString();
        reservation0.extend("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        boolean boolean16 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str13, "Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setEquipmentID("SUCCESS");
        equipment7.setStatus("hi!");
        equipment7.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        equipment7.setName("Booking [null] null | null to null | null");
        equipment7.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        java.lang.String str12 = reservation0.getStatus();
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setTransactionID("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str9 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("Booking [null] null |  to null | hi!");
        java.lang.String str12 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED" + "'", str12, "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getRoomNumber();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        boolean boolean10 = equipment7.isAvailable();
        java.lang.String str11 = equipment7.getType();
        java.lang.String str12 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        equipment7.setStatus("Booking [null] null | null to  | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null");
        java.lang.String str9 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getStatus();
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        double double6 = paymentTransaction4.getTotalAmount();
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTotalAmount(0.0d);
        paymentTransaction4.setTotalAmount((double) (byte) 10);
        java.lang.String str14 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.setPaymentMethod("hi!");
        reservation7.extend("CANCELLED");
        reservation7.setDepositForfeited(false);
        java.lang.String str14 = reservation7.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CONFIRMED" + "'", str14, "CONFIRMED");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getName();
        equipment7.setType("Booking [null] null | null to null | CANCELLED");
        boolean boolean13 = equipment7.isAvailable();
        java.lang.String str14 = equipment7.getStatus();
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | null to null | null");
        double double10 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", (double) (short) 1, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        java.lang.String str4 = reservation0.getPaymentMethod();
        reservation0.setEndTime("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setDescription(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str17 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        java.lang.String str12 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setEquipmentID("CANCELLED");
        equipment7.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str19 = equipment7.getEquipmentID();
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setName("Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CANCELLED" + "'", str19, "CANCELLED");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.cancel();
        java.lang.String str9 = reservation0.toString();
        reservation0.setDepositAmount((double) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str9, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTotalAmount((double) 0);
        double double6 = paymentTransaction0.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        equipment7.setName("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        equipment7.setRoomNumber("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str14 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        double double10 = reservation0.getDepositAmount();
        reservation0.extend("CANCELLED");
        reservation0.setEndTime("Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.String str14 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str9, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str11, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getDescription();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getStatus();
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 0, "Booking [null] null | null to CANCELLED | null");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str5, "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setTotalAmount((double) 100);
        paymentTransaction4.setBookingID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str15 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        java.lang.String str17 = equipment7.getEquipmentID();
        java.lang.String str18 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str18, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        reservation0.setUserID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        reservation0.extend("CANCELLED");
        java.lang.String str10 = reservation0.getPaymentMethod();
        java.lang.Class<?> wildcardClass11 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        java.lang.String str15 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentMethod("hi!");
        paymentTransaction4.setBookingID("hi!");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setDepositForfeited(false);
        java.lang.String str9 = reservation0.getPaymentMethod();
        java.lang.String str10 = reservation0.getPaymentMethod();
        double double11 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.forfeitDeposit();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        java.lang.String str4 = reservation0.toString();
        reservation0.setStatus("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.toString();
        reservation0.cancel();
        java.lang.String str8 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        double double10 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str13 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.setDepositForfeited(false);
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setEquipmentID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.forfeitDeposit();
        reservation0.setDepositAmount((double) 100.0f);
        java.lang.String str12 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FORFEITED" + "'", str12, "FORFEITED");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        equipment7.setEquipmentID("");
        equipment7.setType("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        equipment7.setEquipmentID("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.setEndTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str11 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        boolean boolean3 = reservation0.isExtended();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        java.lang.String str6 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str6, "Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.toString();
        equipment7.setDescription("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CANCELLED" + "'", str15, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.setDepositAmount(100.0d);
        reservation0.setDepositAmount((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        double double15 = paymentTransaction4.getTotalAmount();
        double double16 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | hi!");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | null to  | CANCELLED", (double) (-1), "Booking [null] null | null to  | null");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.toString();
        java.lang.String str12 = reservation0.getPaymentMethod();
        double double13 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        double double13 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setBookingID("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getEquipmentID();
        equipment7.setRoomNumber("");
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setBuildingName("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "hi!", (double) 1.0f, "Booking [null] null |  to null | hi!");
        paymentTransaction4.setTotalAmount((double) 100L);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getPaymentStatus();
        double double4 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTransactionID("null -  [null] @ null Booking [null] null | null to null | null");
        paymentTransaction0.setPaymentStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        paymentTransaction0.setPaymentMethod("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        model.LabLocation labLocation15 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labLocation15);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getStatus();
        java.lang.String str11 = equipment7.getType();
        equipment7.setBuildingName("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getRoomNumber();
        equipment7.setBuildingName(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        equipment7.setEquipmentID("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setRoomNumber("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str18 = equipment7.toString();
        model.LabLocation labLocation19 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation19);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | null to  | CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        boolean boolean8 = reservation0.isDepositForfeited();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        boolean boolean11 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        reservation0.setStartTime("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.toString();
        model.LabLocation labLocation17 = equipment7.getLabLocation();
        java.lang.String str18 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CANCELLED" + "'", str15, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTransactionID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str14, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) (-1.0f));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        java.lang.Class<?> wildcardClass4 = reservation0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("SUCCESS");
        boolean boolean11 = reservation0.isExtended();
        java.lang.String str12 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) -1);
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(true);
        reservation0.setDepositAmount(0.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) 10, "");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getStatus();
        equipment0.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str4 = equipment0.getStatus();
        equipment0.setRoomNumber("Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str10 = reservation0.getStartTime();
        reservation0.extend("null -  [null] @ null Booking [null] null | null to null | null");
        boolean boolean13 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        double double16 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED");
        double double9 = paymentTransaction4.getTotalAmount();
        double double10 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", (double) 100L, " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double16 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getEquipmentID();
        java.lang.String str9 = reservation0.getUserID();
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setPaymentMethod("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.extend("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(true);
        java.lang.String str12 = reservation0.getPaymentMethod();
        double double13 = reservation0.getDepositAmount();
        java.lang.String str14 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setDepositForfeited(true);
        boolean boolean9 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | hi! to null | hi!", (-1.0d), "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str5 = paymentTransaction4.getPaymentStatus();
        java.lang.String str6 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SUCCESS" + "'", str5, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        java.lang.String str12 = equipment7.getType();
        java.lang.String str13 = equipment7.toString();
        java.lang.String str14 = equipment7.getDescription();
        java.lang.String str15 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        model.Equipment equipment7 = new model.Equipment("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "SUCCESS", "SUCCESS");
        equipment7.setRoomNumber("SUCCESS");
        java.lang.String str10 = equipment7.getRoomNumber();
        equipment7.setType("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        model.Equipment equipment7 = new model.Equipment("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "SUCCESS", "SUCCESS");
        equipment7.setRoomNumber("SUCCESS");
        boolean boolean10 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        equipment7.setStatus("");
        equipment7.setType("Booking [null] null | null to null | CANCELLED");
        equipment7.setName("Booking [CANCELLED]  | null to null | null");
        java.lang.String str16 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        double double11 = paymentTransaction4.getTotalAmount();
        double double12 = paymentTransaction4.getTotalAmount();
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (byte) -1);
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        double double13 = paymentTransaction4.getTotalAmount();
        double double14 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setBookingID("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        model.Reservation reservation7 = new model.Reservation("", "", "SUCCESS", "CANCELLED", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "hi!", (double) 'a');
        reservation7.setPaymentMethod("CANCELLED");
        reservation7.cancel();
        reservation7.setDepositAmount((double) 10);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setEquipmentID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double11 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.cancel();
        reservation0.setDepositForfeited(true);
        java.lang.String str8 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str12 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.lang.String str13 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double10 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        double double5 = reservation0.getDepositAmount();
        boolean boolean6 = reservation0.isDepositForfeited();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        reservation0.setEquipmentID("hi!");
        java.lang.String str9 = reservation0.getPaymentMethod();
        java.lang.String str10 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED", "SUCCESS", "Booking [null] null | hi! to null | hi!", "Booking [CANCELLED]  | null to null | null", (double) (byte) -1);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("SUCCESS", "", (double) (short) 0, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (byte) -1);
        paymentTransaction4.setBookingID("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("SUCCESS", "", (double) (short) 0, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) (byte) -1);
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        equipment7.setName("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation9);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("FORFEITED", "hi!", (double) (byte) 100, "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!" + "'", str5, "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getRoomNumber();
        java.lang.String str14 = equipment7.getStatus();
        java.lang.String str15 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        java.lang.String str14 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setDescription("Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.setStatus("SUCCESS");
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isDepositForfeited();
        reservation0.setEquipmentID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        double double8 = reservation0.getDepositAmount();
        reservation0.forfeitDeposit();
        reservation0.setPaymentMethod("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null", (double) (short) -1, "Booking [null] null | null to  | null");
        paymentTransaction4.setPaymentMethod("FORFEITED");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getRoomNumber();
        equipment7.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        paymentTransaction4.setTotalAmount(1.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 0L, "");
        java.lang.String str5 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("null -  [null] @ null Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SUCCESS" + "'", str5, "SUCCESS");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        model.Equipment equipment7 = new model.Equipment("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to  | CANCELLED");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getStatus();
        java.lang.String str14 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation18 = equipment7.getLabLocation();
        org.junit.Assert.assertNotNull(labLocation18);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("null -  [null] @ null Booking [null] null | null to null | null");
        reservation0.setPaymentMethod("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | hi!");
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.setEndTime("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        java.lang.String str12 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        model.LabLocation labLocation15 = equipment7.getLabLocation();
        equipment7.setBuildingName("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getRoomNumber();
        java.lang.String str13 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setRoomNumber("CONFIRMED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.forfeitDeposit();
        reservation0.extend("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | hi!", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to  | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str10, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getEndTime();
        java.lang.String str11 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 0, "Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount(0.0d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        java.lang.String str10 = reservation0.getPaymentMethod();
        reservation0.setDepositAmount((double) '#');
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        double double13 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) '4');
        paymentTransaction4.setTotalAmount(100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setStatus("SUCCESS");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null - Booking [null] null | null to null | hi! [SUCCESS] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null - Booking [null] null | null to null | hi! [SUCCESS] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | hi! to null | hi!", (-1.0d), "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double5 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTotalAmount((double) ' ');
        paymentTransaction4.setPaymentStatus("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str15 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.toString();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        java.lang.String str15 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.extend("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        equipment7.setEquipmentID("");
        java.lang.String str14 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setRoomNumber("hi!");
        equipment7.setDescription("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        java.lang.String str10 = equipment0.getRoomNumber();
        java.lang.String str11 = equipment0.getBuildingName();
        equipment0.setRoomNumber("Booking [null] null |  to null | hi!");
        boolean boolean14 = equipment0.isAvailable();
        java.lang.String str15 = equipment0.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        equipment7.setName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setUserID("CANCELLED");
        boolean boolean5 = reservation0.isDepositForfeited();
        double double6 = reservation0.getDepositAmount();
        reservation0.setUserID("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.cancel();
        double double6 = reservation0.getDepositAmount();
        java.lang.String str7 = reservation0.getEndTime();
        double double8 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        equipment7.setType("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(labLocation21);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | null to  | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", (double) 100);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        java.lang.String str5 = reservation0.getBookingID();
        boolean boolean6 = reservation0.isExtended();
        double double7 = reservation0.getDepositAmount();
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        equipment7.setDescription("hi!");
        model.LabLocation labLocation19 = equipment7.getLabLocation();
        java.lang.String str20 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("SUCCESS");
        java.lang.String str5 = reservation0.getPaymentMethod();
        double double6 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 1.0f, "Booking [null] null | null to null | hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str5, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setExtended(true);
        reservation0.setExtended(true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getBuildingName();
        java.lang.String str3 = equipment0.getType();
        java.lang.String str4 = equipment0.getDescription();
        java.lang.String str5 = equipment0.getBuildingName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getEquipmentID();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setBookingID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("Booking [CANCELLED]  | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setDepositAmount((double) 0);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setUserID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = reservation0.getStartTime();
        java.lang.String str14 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CANCELLED" + "'", str13, "CANCELLED");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        reservation0.setEquipmentID("CANCELLED");
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getEndTime();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getStatus();
        java.lang.String str6 = reservation0.getEndTime();
        java.lang.String str7 = reservation0.getStartTime();
        boolean boolean8 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment7.setStatus("SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", (double) (byte) 1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(true);
        reservation0.setEndTime("");
        reservation0.setDepositAmount((double) 100L);
        double double16 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        java.lang.String str21 = equipment7.getDescription();
        java.lang.String str22 = equipment7.getType();
        model.LabLocation labLocation23 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str20, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(labLocation23);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) (short) 10, "Booking [null] null | null to null | hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentStatus();
        double double6 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SUCCESS" + "'", str5, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isExtended();
        java.lang.String str7 = reservation0.getUserID();
        reservation0.forfeitDeposit();
        java.lang.Class<?> wildcardClass9 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setEquipmentID("Booking [null] null | null to null | hi!");
        reservation0.setUserID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        model.Equipment equipment7 = new model.Equipment("Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED", "Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "CANCELLED", "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        reservation0.setUserID("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.setDepositForfeited(true);
        reservation0.setEquipmentID("Booking [null] null | null to  | CANCELLED");
        java.lang.String str12 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.extend("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        boolean boolean9 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        double double8 = reservation0.getDepositAmount();
        reservation0.setExtended(false);
        java.lang.String str11 = reservation0.getBookingID();
        java.lang.String str12 = reservation0.getBookingID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        java.lang.String str15 = reservation0.getStartTime();
        reservation0.extend("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStatus("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        java.lang.String str17 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [null] null | null to null | CANCELLED", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.setBuildingName("CANCELLED");
        equipment7.setBuildingName("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str13 = equipment7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | hi! - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [] @ Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! |  Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | hi! - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [] @ Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! |  Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        boolean boolean5 = reservation0.isExtended();
        reservation0.setPaymentMethod("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setDepositAmount((double) 100.0f);
        double double9 = reservation0.getDepositAmount();
        boolean boolean10 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setDepositForfeited(true);
        double double9 = reservation0.getDepositAmount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getPaymentStatus();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        java.lang.String str17 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str16, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", (double) (byte) 100);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getRoomNumber();
        java.lang.String str14 = equipment7.getType();
        equipment7.setBuildingName(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        java.lang.String str9 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setRoomNumber("hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setBuildingName("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        java.lang.String str10 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", (double) 0L);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        double double15 = paymentTransaction4.getTotalAmount();
        double double16 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentMethod("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        model.Reservation reservation7 = new model.Reservation("", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null |  to null | hi!", (double) 1);
        reservation7.setEquipmentID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str12 = reservation0.toString();
        reservation0.setBookingID("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) (short) 10, "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str5, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SUCCESS" + "'", str6, "SUCCESS");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getDescription();
        boolean boolean13 = equipment7.isAvailable();
        java.lang.String str14 = equipment7.getName();
        java.lang.Class<?> wildcardClass15 = equipment7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        java.lang.String str6 = reservation0.getPaymentMethod();
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str9 = reservation0.getBookingID();
        java.lang.String str10 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setType("hi!");
        java.lang.String str15 = equipment7.getStatus();
        model.LabLocation labLocation16 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation16);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", 1.0d, "hi!");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str9 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("hi!");
        java.lang.String str7 = paymentTransaction4.getTransactionID();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setPaymentStatus("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setBookingID("CANCELLED");
        java.lang.String str12 = reservation0.getStatus();
        java.lang.String str13 = reservation0.getUserID();
        reservation0.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str8 = reservation0.getEndTime();
        java.lang.String str9 = reservation0.getEndTime();
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.setStartTime("Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.setUserID("Booking [null] null | null to null | CANCELLED");
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setStatus(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to CANCELLED | null", "Booking [null] null |  to null | hi!", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "Booking [null] null | null to null | CANCELLED", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", (double) ' ');
        reservation7.extend("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.cancel();
        boolean boolean6 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        java.lang.String str9 = equipment0.getDescription();
        java.lang.String str10 = equipment0.toString();
        equipment0.setDescription("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str13 = equipment0.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str10, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        java.lang.String str14 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        double double5 = reservation0.getDepositAmount();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setExtended(true);
        java.lang.String str13 = reservation0.getPaymentMethod();
        boolean boolean14 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        reservation0.setEquipmentID("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to null | CANCELLED");
        double double7 = reservation0.getDepositAmount();
        reservation0.setDepositAmount((double) 1L);
        reservation0.setBookingID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str12 = reservation0.getPaymentMethod();
        java.lang.String str13 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        equipment7.setType("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10.0f);
        paymentTransaction4.setTotalAmount((double) (-1L));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getEquipmentID();
        boolean boolean7 = reservation0.isDepositForfeited();
        double double8 = reservation0.getDepositAmount();
        reservation0.setBookingID("Booking [null] null |  to null | hi!");
        java.lang.String str11 = reservation0.getStartTime();
        reservation0.setBookingID("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 0, "Booking [CANCELLED]  | null to null | null");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | CANCELLED");
        java.lang.String str14 = equipment7.getRoomNumber();
        boolean boolean15 = equipment7.isAvailable();
        equipment7.setType("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        reservation0.setStatus("Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        model.Equipment equipment7 = new model.Equipment(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null |  to null | hi!", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str8 = equipment7.getDescription();
        equipment7.setStatus("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        boolean boolean3 = reservation0.isExtended();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        reservation0.setDepositAmount((double) (byte) 100);
        java.lang.String str8 = reservation0.getPaymentMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        java.lang.String str6 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getStatus();
        java.lang.String str15 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        equipment7.setEquipmentID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        equipment7.setType("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        java.lang.String str4 = reservation0.getEndTime();
        java.lang.String str5 = reservation0.getUserID();
        java.lang.String str6 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        java.lang.String str8 = equipment7.getBuildingName();
        java.lang.String str9 = equipment7.getRoomNumber();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        model.LabLocation labLocation21 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNotNull(labLocation21);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | hi!", "Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null", "", "SUCCESS", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to  | Booking [null] null | null to null | null", "CANCELLED", "SUCCESS", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        equipment7.setDescription("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        java.lang.String str12 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CANCELLED" + "'", str12, "CANCELLED");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getUserID();
        reservation0.extend("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(true);
        double double12 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setPaymentMethod("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        reservation0.setPaymentMethod(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        reservation0.setEndTime("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = reservation0.getBookingID();
        reservation0.setBookingID("Booking [null] null | null to CANCELLED | null");
        reservation0.setStartTime("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation13);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        java.lang.String str9 = reservation0.getBookingID();
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setDepositAmount(1.0d);
        java.lang.String str13 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        reservation0.setDepositAmount((double) (-1L));
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getPaymentStatus();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str7, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS" + "'", str8, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getEquipmentID();
        java.lang.String str4 = reservation0.getPaymentMethod();
        java.lang.String str5 = reservation0.getStartTime();
        reservation0.setUserID("Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        java.lang.String str10 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | null to Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi! | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to CANCELLED | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.lang.String str14 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.extend("Booking [null] null | null to null | hi!");
        double double10 = reservation7.getDepositAmount();
        reservation7.setBookingID("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        java.lang.String str5 = reservation0.getBookingID();
        boolean boolean6 = reservation0.isExtended();
        java.lang.Class<?> wildcardClass7 = reservation0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.extend("Booking [null] null | null to null | hi!");
        reservation7.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        boolean boolean5 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getBookingID();
        reservation0.extend("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
        reservation0.setStartTime("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        equipment0.setRoomNumber("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        reservation0.setEquipmentID("hi!");
        reservation0.setStatus(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(false);
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", 1.0d, "hi!");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        double double10 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        java.lang.String str11 = reservation0.toString();
        reservation0.setExtended(false);
        reservation0.setStatus("Booking [null] null | null to null | hi! - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [] @ Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! |  Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str11, "Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.toString();
        java.lang.String str12 = reservation0.getPaymentMethod();
        reservation0.setStartTime("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str11, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", 1.0d, "hi!");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount((double) 10);
        java.lang.String str9 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.forfeitDeposit();
        java.lang.String str12 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        paymentTransaction0.setTotalAmount(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.setStartTime("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str12 = reservation0.toString();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.getStatus();
        java.lang.String str16 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getTransactionID();
        double double11 = paymentTransaction4.getTotalAmount();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setBookingID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.cancel();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        reservation0.setExtended(true);
        java.lang.String str17 = reservation0.toString();
        boolean boolean18 = reservation0.isExtended();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!" + "'", str17, "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.toString();
        java.lang.String str16 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to  | CANCELLED");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str21 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", (double) 10, "");
        paymentTransaction4.setTotalAmount((double) (byte) 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setBookingID("Booking [null] null | null to null | CANCELLED");
        reservation0.setEquipmentID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        double double12 = reservation0.getDepositAmount();
        java.lang.String str13 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", "", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "CONFIRMED", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", 10.0d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        double double6 = paymentTransaction4.getTotalAmount();
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTotalAmount(0.0d);
        paymentTransaction4.setTotalAmount((double) (byte) 10);
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        java.lang.String str15 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | hi! to null | Booking [null] null | null to hi! | Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | hi! to null | Booking [null] null | null to hi! | Booking [null] null | null to null | null");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        boolean boolean15 = equipment7.isAvailable();
        model.LabLocation labLocation16 = equipment7.getLabLocation();
        model.LabLocation labLocation17 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(labLocation16);
        org.junit.Assert.assertNotNull(labLocation17);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        equipment7.setDescription("hi!");
        java.lang.String str19 = equipment7.getDescription();
        equipment7.setType("Booking [CANCELLED]  | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.getEquipmentID();
        java.lang.String str16 = equipment7.getName();
        equipment7.setStatus("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        boolean boolean19 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setType("CANCELLED");
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        double double8 = paymentTransaction4.getTotalAmount();
        java.lang.String str9 = paymentTransaction4.getBookingID();
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("SUCCESS");
        double double12 = paymentTransaction4.getTotalAmount();
        double double13 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        boolean boolean14 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        model.Equipment equipment7 = new model.Equipment("hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to CANCELLED | null", "null -  [null] @ null Booking [null] null | null to null | null", (double) 10.0f, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        double double5 = paymentTransaction4.getTotalAmount();
        java.lang.String str6 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTransactionID(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to CANCELLED | null" + "'", str6, "Booking [null] null | null to CANCELLED | null");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str20 = equipment7.getType();
        java.lang.String str21 = equipment7.getBuildingName();
        java.lang.String str22 = equipment7.getBuildingName();
        java.lang.String str23 = equipment7.getName();
        java.lang.String str24 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str20, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking [null] null | null to null | null" + "'", str22, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str23, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Booking [null] null | null to null | null" + "'", str24, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        model.Equipment equipment7 = new model.Equipment("null -  [null] @ null Booking [null] null | null to null | null", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null |  to null | hi!");
        equipment7.setBuildingName(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        equipment7.setDescription("Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.cancel();
        java.lang.String str8 = reservation0.getEquipmentID();
        java.lang.String str9 = reservation0.getEndTime();
        boolean boolean10 = reservation0.isDepositForfeited();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setRoomNumber("CANCELLED");
        equipment0.setRoomNumber("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        boolean boolean12 = equipment0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to hi! | Booking [null] null | null to null | null", "", "Booking [CANCELLED]  | null to null | null", "hi!", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | hi! to null | hi!");
        java.lang.String str8 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null" + "'", str8, "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        double double6 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str16 = reservation0.getEquipmentID();
        reservation0.setStartTime("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setStatus("hi!");
        reservation0.extend("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        reservation0.setEquipmentID("FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getEquipmentID();
        java.lang.String str9 = reservation0.getStatus();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setDescription("Booking [null] null | hi! to null | hi!");
        java.lang.String str15 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setPaymentMethod("");
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        java.lang.String str11 = reservation0.getStartTime();
        boolean boolean12 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        double double9 = reservation0.getDepositAmount();
        java.lang.String str10 = reservation0.toString();
        java.lang.String str11 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEquipmentID("SUCCESS");
        java.lang.String str9 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.extend("Booking [null] null | null to null | hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        equipment7.setBuildingName("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        reservation0.setDepositAmount((double) '4');
        java.lang.Class<?> wildcardClass7 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        boolean boolean12 = equipment7.isAvailable();
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        equipment7.setName("hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(labLocation13);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.Class<?> wildcardClass13 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        double double7 = reservation0.getDepositAmount();
        reservation0.setUserID("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        model.Reservation reservation7 = new model.Reservation("hi!", "hi!", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 'a');
        reservation7.setEquipmentID("Booking [null] null | hi! to null | hi!");
        java.lang.String str10 = reservation7.getStartTime();
        reservation7.setDepositForfeited(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        reservation0.setDepositAmount((double) ' ');
        reservation0.cancel();
        reservation0.setDepositForfeited(true);
        reservation0.setExtended(false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getStatus();
        java.lang.String str11 = equipment7.getBuildingName();
        java.lang.String str12 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to  | Booking [null] null | null to null | null", "CANCELLED", "SUCCESS", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        equipment7.setDescription("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation20 = equipment7.getLabLocation();
        equipment7.setType("SUCCESS");
        java.lang.String str23 = equipment7.getName();
        equipment7.setType(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labLocation20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str23, "null -  [null] @ null Booking [null] null | null to null | null");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.getEquipmentID();
        java.lang.String str12 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("");
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        reservation0.setUserID("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        reservation0.setDepositAmount((double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "FORFEITED", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        boolean boolean8 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        model.Equipment equipment7 = new model.Equipment("CANCELLED", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "", "CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation8 = equipment7.getLabLocation();
        equipment7.setRoomNumber("Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED");
        org.junit.Assert.assertNotNull(labLocation8);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        reservation0.setEquipmentID("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("SUCCESS");
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setDepositForfeited(false);
        boolean boolean8 = reservation0.isDepositForfeited();
        java.lang.String str9 = reservation0.getBookingID();
        boolean boolean10 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) 'a');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str8 = equipment7.getStatus();
        java.lang.String str9 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str8, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        equipment7.setName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str16 = equipment7.getBuildingName();
        java.lang.String str17 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str17, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "CONFIRMED", "Booking [null] null | null to  | Booking [null] null | null to null | null", (double) 'a');
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        double double13 = paymentTransaction4.getTotalAmount();
        java.lang.String str14 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getName();
        java.lang.String str17 = equipment7.getEquipmentID();
        equipment7.setBuildingName("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", (double) 'a', "CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        model.Reservation reservation7 = new model.Reservation("hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) ' ');
        double double8 = reservation7.getDepositAmount();
        reservation7.setBookingID("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        reservation0.forfeitDeposit();
        java.lang.String str4 = reservation0.getEndTime();
        boolean boolean5 = reservation0.isDepositForfeited();
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        java.lang.String str14 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!" + "'", str14, "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setEquipmentID("Booking [null] null | hi! to null | hi!");
        java.lang.String str15 = equipment7.getEquipmentID();
        equipment7.setType("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | hi! to null | hi!" + "'", str15, "Booking [null] null | hi! to null | hi!");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.extend("");
        java.lang.String str14 = reservation0.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null - Booking [null] null | null to null | hi! [SUCCESS] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", (double) 10L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        double double12 = paymentTransaction4.getTotalAmount();
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        double double16 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        java.lang.String str15 = equipment7.getEquipmentID();
        java.lang.String str16 = equipment7.toString();
        java.lang.String str17 = equipment7.getType();
        java.lang.String str18 = equipment7.toString();
        java.lang.String str19 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        equipment7.setName("null -  [null] @ null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation20 = equipment7.getLabLocation();
        java.lang.String str21 = equipment7.getDescription();
        equipment7.setRoomNumber("hi!");
        model.LabLocation labLocation24 = equipment7.getLabLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labLocation20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation24);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.lang.String str16 = reservation0.getPaymentMethod();
        reservation0.setStartTime("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        java.lang.String str19 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi! to null | " + "'", str19, "Booking [null] null | Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi! to null | ");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "FORFEITED", 0.0d, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        boolean boolean2 = equipment0.isAvailable();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        boolean boolean14 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        double double7 = reservation0.getDepositAmount();
        reservation0.setEndTime("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }
}

