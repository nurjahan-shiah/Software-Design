package test.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        model.Reservation reservation7 = new model.Reservation("hi!", "hi!", "Booking [null] null | null to null | hi!", "Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 'a');
        reservation7.setEquipmentID("Booking [null] null | hi! to null | hi!");
        java.lang.String str10 = reservation7.getStartTime();
        java.lang.String str11 = reservation7.getEndTime();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        java.lang.String str14 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double14 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        java.lang.String str13 = equipment7.getStatus();
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        equipment7.setEquipmentID("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str17 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        equipment0.setEquipmentID("Booking [null] null | null to null | hi!");
        java.lang.String str10 = equipment0.getRoomNumber();
        java.lang.String str11 = equipment0.getBuildingName();
        equipment0.setRoomNumber("Booking [null] null |  to null | hi!");
        equipment0.setName("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        java.lang.String str15 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        equipment7.setName("Booking [null] null | null to null | hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getName();
        equipment7.setRoomNumber(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str15, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        reservation0.setEquipmentID("CANCELLED");
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        java.lang.String str8 = reservation0.getStatus();
        reservation0.setBookingID("hi!");
        java.lang.String str11 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to  | Booking [null] null | null to null | null", " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str8 = equipment7.getType();
        model.LabLocation labLocation9 = equipment7.getLabLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getRoomNumber();
        java.lang.String str13 = equipment7.getRoomNumber();
        java.lang.String str14 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        model.Equipment equipment7 = new model.Equipment("Booking [CANCELLED]  | null to null | null", "Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setDescription("Booking [null] null | hi! to null | hi!");
        boolean boolean15 = equipment7.isAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | hi! to null | hi!");
        java.lang.String str19 = equipment7.toString();
        java.lang.String str20 = equipment7.getDescription();
        java.lang.String str21 = equipment7.getDescription();
        equipment7.setName("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        equipment7.setBuildingName("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!" + "'", str19, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | null" + "'", str20, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        java.lang.String str17 = equipment7.getStatus();
        java.lang.String str18 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        model.Equipment equipment7 = new model.Equipment("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "SUCCESS", "SUCCESS");
        equipment7.setRoomNumber("SUCCESS");
        java.lang.String str10 = equipment7.getRoomNumber();
        java.lang.String str11 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SUCCESS" + "'", str10, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setStartTime("hi!");
        reservation0.setStatus("null -  [null] @ null Booking [null] null | null to null | null");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setEquipmentID("");
        boolean boolean16 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        reservation0.setDepositAmount((double) ' ');
        reservation0.cancel();
        reservation0.setDepositForfeited(true);
        reservation0.setEndTime("Booking [null] null | hi! to null | hi!");
        java.lang.String str14 = reservation0.getStartTime();
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        double double13 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str16 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setEquipmentID("CANCELLED");
        java.lang.String str9 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        reservation0.setUserID("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        java.lang.String str10 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        java.lang.String str13 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        double double12 = paymentTransaction4.getTotalAmount();
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setBookingID("");
        reservation0.setBookingID("");
        java.lang.String str9 = reservation0.getStatus();
        java.lang.String str10 = reservation0.getUserID();
        java.lang.String str11 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [] null | null to null | null" + "'", str11, "Booking [] null | null to null | null");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setDescription("");
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStatus();
        java.lang.String str7 = reservation0.getStartTime();
        reservation0.setDepositForfeited(true);
        reservation0.setStartTime("Booking [null] null |  to null | hi!");
        java.lang.Class<?> wildcardClass12 = reservation0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setBookingID("Booking [null] null | null to CANCELLED | null");
        reservation0.forfeitDeposit();
        java.lang.String str17 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [Booking [null] null | null to CANCELLED | null] null | null to null | FORFEITED" + "'", str17, "Booking [Booking [null] null | null to CANCELLED | null] null | null to null | FORFEITED");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getName();
        equipment7.setEquipmentID("CANCELLED");
        java.lang.String str17 = equipment7.getName();
        equipment7.setStatus("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        equipment7.setDescription("Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("");
        double double13 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str16 = paymentTransaction4.getPaymentMethod();
        double double17 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("Booking [null] null | hi! to null | Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.setUserID("Booking [null] null | null to null | CANCELLED");
        boolean boolean11 = reservation0.isDepositForfeited();
        java.lang.String str12 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setBookingID("");
        reservation0.setEquipmentID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        java.lang.String str18 = reservation0.getStartTime();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!" + "'", str17, "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setBuildingName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositForfeited(false);
        reservation0.setStatus("");
        reservation0.setStatus(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setBookingID("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        java.lang.String str13 = equipment7.getType();
        java.lang.String str14 = equipment7.getRoomNumber();
        equipment7.setRoomNumber("CANCELLED");
        java.lang.String str17 = equipment7.getDescription();
        equipment7.setRoomNumber("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str17, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        java.lang.String str14 = equipment7.getEquipmentID();
        java.lang.String str15 = equipment7.getType();
        model.LabLocation labLocation16 = equipment7.getLabLocation();
        java.lang.String str17 = equipment7.getRoomNumber();
        equipment7.setRoomNumber("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | null to null | null");
        reservation0.setPaymentMethod(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        reservation0.setExtended(true);
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentStatus("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.getStatus();
        java.lang.String str17 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", (double) 0L, "CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | CANCELLED", (double) (-1L), "Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentStatus("CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.toString();
        reservation0.extend("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        boolean boolean10 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setUserID("hi!");
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setBookingID("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
        reservation0.setEndTime("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setDescription("");
        java.lang.String str10 = equipment7.getEquipmentID();
        boolean boolean11 = equipment7.isAvailable();
        java.lang.String str12 = equipment7.getRoomNumber();
        equipment7.setName("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.cancel();
        double double6 = reservation0.getDepositAmount();
        boolean boolean7 = reservation0.isExtended();
        java.lang.String str8 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CANCELLED" + "'", str8, "CANCELLED");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "CANCELLED", "Booking [null] null | null to null | null", (double) 0L);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        java.lang.String str19 = equipment7.getRoomNumber();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str18, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str15, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        equipment7.setDescription("");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setEquipmentID("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getEquipmentID();
        java.lang.Class<?> wildcardClass16 = equipment7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        paymentTransaction4.setTotalAmount(100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        reservation0.setBookingID("Booking [null] null | null to null | null");
        java.lang.String str11 = reservation0.getPaymentMethod();
        reservation0.extend("Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        java.lang.String str3 = equipment0.getBuildingName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getBuildingName();
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("", "CANCELLED", (double) (short) 0, "CANCELLED");
        java.lang.String str5 = paymentTransaction4.getPaymentStatus();
        java.lang.String str6 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SUCCESS" + "'", str5, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SUCCESS" + "'", str6, "SUCCESS");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        java.lang.String str8 = equipment7.getRoomNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getType();
        java.lang.String str9 = equipment7.getEquipmentID();
        boolean boolean10 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str9, "Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        boolean boolean6 = reservation0.isDepositForfeited();
        java.lang.String str7 = reservation0.getBookingID();
        java.lang.String str8 = reservation0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        boolean boolean11 = equipment7.isAvailable();
        java.lang.String str12 = equipment7.getStatus();
        java.lang.String str13 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "CANCELLED", (double) 1L);
        reservation7.setPaymentMethod("hi!");
        reservation7.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation7.forfeitDeposit();
        java.lang.String str13 = reservation7.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [Booking [null] null | null to null | CANCELLED]  | null -  [null] @ null Booking [null] null | null to null | null to Booking [null] null | null to hi! | Booking [null] null | null to null | null | FORFEITED" + "'", str13, "Booking [Booking [null] null | null to null | CANCELLED]  | null -  [null] @ null Booking [null] null | null to null | null to Booking [null] null | null to hi! | Booking [null] null | null to null | null | FORFEITED");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        reservation0.setDepositAmount((double) ' ');
        reservation0.setEndTime("Booking [null] null | null to null | null");
        java.lang.String str11 = reservation0.getBookingID();
        java.lang.String str12 = reservation0.getEndTime();
        java.lang.Class<?> wildcardClass13 = reservation0.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        java.lang.String str7 = reservation0.getPaymentMethod();
        double double8 = reservation0.getDepositAmount();
        reservation0.forfeitDeposit();
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.getEndTime();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getBookingID();
        java.lang.String str8 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CANCELLED" + "'", str8, "CANCELLED");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        model.Reservation reservation7 = new model.Reservation("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED", "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [] null | null to null | null", (double) 1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getDescription();
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.getDescription();
        java.lang.String str16 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | CANCELLED");
        java.lang.String str14 = equipment7.getBuildingName();
        boolean boolean15 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getRoomNumber();
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str20 = equipment7.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null hi!" + "'", str20, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.setDepositForfeited(false);
        java.lang.String str6 = reservation0.getStatus();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        java.lang.String str8 = reservation0.toString();
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str8, "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        java.lang.String str9 = reservation0.getUserID();
        java.lang.String str10 = reservation0.toString();
        java.lang.String str11 = reservation0.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to  | null" + "'", str10, "Booking [null] null | null to  | null");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", (double) 100, "Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("Booking [] null | null to null | null");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.getBookingID();
        java.lang.String str11 = reservation0.getStartTime();
        reservation0.setDepositForfeited(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getBookingID();
        paymentTransaction4.setPaymentStatus("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation15 = equipment7.getLabLocation();
        java.lang.String str16 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to  | CANCELLED", "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED", (double) ' ');
        java.lang.String str8 = reservation7.getEndTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null" + "'", str8, "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        java.lang.String str5 = reservation0.toString();
        reservation0.setStartTime("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED", 1.0d, "hi!");
        java.lang.String str5 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentStatus("SUCCESS");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null");
        java.lang.String str10 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getEndTime();
        java.lang.String str7 = reservation0.getPaymentMethod();
        reservation0.setUserID("");
        java.lang.String str10 = reservation0.getEndTime();
        java.lang.String str11 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        model.Equipment equipment7 = new model.Equipment("", "hi!", "hi!", "", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getType();
        java.lang.String str13 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        reservation0.extend("hi!");
        reservation0.setDepositAmount((double) 10);
        reservation0.setStatus("SUCCESS");
        reservation0.forfeitDeposit();
        reservation0.setBookingID("Booking [null] null | null to null | null");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        java.lang.String str16 = equipment7.getStatus();
        equipment7.setDescription("hi!");
        java.lang.String str19 = equipment7.getDescription();
        equipment7.setBuildingName("hi!");
        java.lang.Class<?> wildcardClass22 = equipment7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.extend("Booking [null] null | null to  | CANCELLED");
        java.lang.String str6 = reservation0.getEquipmentID();
        java.lang.String str7 = reservation0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to Booking [null] null | null to  | CANCELLED | null" + "'", str7, "Booking [null] null | null to Booking [null] null | null to  | CANCELLED | null");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.toString();
        java.lang.String str13 = equipment7.getDescription();
        java.lang.String str14 = equipment7.getRoomNumber();
        java.lang.String str15 = equipment7.getType();
        equipment7.setBuildingName("Booking [CANCELLED]  | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        double double7 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getStatus();
        java.lang.String str6 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        java.lang.String str2 = paymentTransaction0.getBookingID();
        paymentTransaction0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        paymentTransaction0.setTotalAmount((double) (short) -1);
        java.lang.String str7 = paymentTransaction0.getTransactionID();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setBuildingName("hi!");
        java.lang.String str18 = equipment7.getStatus();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        reservation0.extend("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str8 = reservation0.getStatus();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | null to null | null");
        reservation0.setPaymentMethod(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to CANCELLED | null", "null -  [null] @ null Booking [null] null | null to null | null", (double) 10.0f, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentMethod("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to CANCELLED | null" + "'", str5, "Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to CANCELLED | null" + "'", str8, "Booking [null] null | null to CANCELLED | null");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getBookingID();
        reservation0.setUserID(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        reservation0.setExtended(true);
        reservation0.setPaymentMethod("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str20 = reservation0.getStartTime();
        java.lang.String str21 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str21, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.setExtended(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        model.LabLocation labLocation12 = equipment7.getLabLocation();
        equipment7.setDescription("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str15 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        java.lang.String str18 = reservation0.getBookingID();
        boolean boolean19 = reservation0.isExtended();
        reservation0.setDepositForfeited(true);
        java.lang.String str22 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!" + "'", str18, "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null" + "'", str22, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | CANCELLED]  | null -  [null] @ null Booking [null] null | null to null | null to Booking [null] null | null to hi! | Booking [null] null | null to null | null | FORFEITED", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        java.lang.String str16 = equipment0.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        java.lang.String str15 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        reservation0.setDepositAmount((double) (-1));
        java.lang.String str10 = reservation0.getStartTime();
        java.lang.String str11 = reservation0.getUserID();
        java.lang.String str12 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        reservation0.setEquipmentID("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        boolean boolean18 = reservation0.isExtended();
        double double19 = reservation0.getDepositAmount();
        reservation0.cancel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        java.lang.String str3 = equipment0.getType();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        model.Reservation reservation7 = new model.Reservation("null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null |  to null | hi!", "", (double) 10L);
        java.lang.String str8 = reservation7.getUserID();
        reservation7.setUserID("Booking [null] null | Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi! to null | ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getRoomNumber();
        equipment7.setDescription("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        reservation0.forfeitDeposit();
        boolean boolean19 = reservation0.isExtended();
        java.lang.String str20 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Booking [null] null | hi! to null -  [null] @ null Booking [null] null | null to null | null | FORFEITED" + "'", str20, "Booking [null] null | hi! to null -  [null] @ null Booking [null] null | null to null | null | FORFEITED");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.cancel();
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setExtended(false);
        java.lang.String str9 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | hi! to null | hi!");
        java.lang.String str12 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str5, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CANCELLED" + "'", str9, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CANCELLED" + "'", str12, "CANCELLED");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to  | CANCELLED | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "FORFEITED", (double) (short) 100);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        model.Reservation reservation7 = new model.Reservation("FORFEITED", "SUCCESS", "FORFEITED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "hi!", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 100);
        reservation7.setStartTime("Booking [null] null | null to CANCELLED | null");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        java.lang.String str6 = equipment0.getBuildingName();
        java.lang.String str7 = equipment0.getBuildingName();
        equipment0.setBuildingName("FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 0.0f, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        paymentTransaction4.setTransactionID("Booking [Booking [null] null | null to null | null] Booking [null] null | null to null | CANCELLED | Booking [null] null | null to null | hi! to Booking [null] null | null to  | Booking [null] null | null to null | null | CONFIRMED");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null |  to null | hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "hi!", "Booking [null] null | null to null | CANCELLED", "Booking [null] null | hi! to null | hi!", "Booking [null] null | null to null | null");
        java.lang.String str8 = equipment7.getType();
        java.lang.String str9 = equipment7.getEquipmentID();
        java.lang.String str10 = equipment7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str9, "Booking [null] null |  to null | hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str10, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setEquipmentID("Booking [null] null | null to null | null");
        equipment0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        equipment0.setName("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        java.lang.String str12 = equipment0.getType();
        equipment0.setEquipmentID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setBuildingName("hi!");
        java.lang.String str14 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        reservation0.setEquipmentID("CANCELLED");
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | null");
        reservation0.setBookingID("Booking [null] null | null to Booking [null] null | null to  | CANCELLED | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        equipment7.setName("Booking [null] null | null to null | null");
        java.lang.String str13 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to  | Booking [null] null | null to null | null");
        boolean boolean16 = equipment7.isAvailable();
        boolean boolean17 = equipment7.isAvailable();
        java.lang.String str18 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        java.lang.String str15 = equipment7.getDescription();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getEquipmentID();
        java.lang.String str11 = equipment7.getType();
        equipment7.setType("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        java.lang.String str14 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        java.lang.String str10 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null");
        paymentTransaction4.setTransactionID("");
        java.lang.String str15 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        java.lang.String str10 = equipment7.getName();
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(labLocation11);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | CANCELLED to null | Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | CANCELLED to null | Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getStatus();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setEquipmentID("Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        equipment7.setStatus("SUCCESS");
        boolean boolean14 = equipment7.isAvailable();
        boolean boolean15 = equipment7.isAvailable();
        model.LabLocation labLocation16 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(labLocation16);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.toString();
        java.lang.String str10 = equipment7.getName();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("hi!");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.cancel();
        java.lang.String str10 = reservation0.getStatus();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CANCELLED" + "'", str10, "CANCELLED");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        reservation0.setExtended(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        java.lang.String str6 = equipment0.getType();
        java.lang.String str7 = equipment0.getBuildingName();
        java.lang.String str8 = equipment0.getDescription();
        java.lang.String str9 = equipment0.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getEquipmentID();
        reservation0.setUserID("CANCELLED");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        boolean boolean5 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str19 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null |  to null | hi!");
        equipment7.setType("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getUserID();
        reservation0.setEndTime("Booking [null] null | hi! to null | hi!");
        java.lang.String str6 = reservation0.getUserID();
        reservation0.setUserID("Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        java.lang.String str16 = reservation0.getBookingID();
        double double17 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to CANCELLED | null" + "'", str16, "Booking [null] null | null to CANCELLED | null");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(32.0d);
        double double7 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        java.lang.String str15 = equipment7.getName();
        equipment7.setBuildingName("hi!");
        equipment7.setStatus("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        java.lang.String str22 = equipment7.getBuildingName();
        java.lang.String str23 = equipment7.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "FORFEITED" + "'", str20, "FORFEITED");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "FORFEITED" + "'", str21, "FORFEITED");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FORFEITED" + "'", str22, "FORFEITED");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "FORFEITED" + "'", str23, "FORFEITED");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setTotalAmount((double) 100.0f);
        paymentTransaction4.setTransactionID("Booking [null] null | null to  | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 10L);
        paymentTransaction4.setBookingID("FORFEITED");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        java.lang.String str12 = paymentTransaction4.getPaymentStatus();
        double double13 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SUCCESS" + "'", str12, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        double double9 = reservation0.getDepositAmount();
        boolean boolean10 = reservation0.isDepositForfeited();
        reservation0.setBookingID("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(false);
        java.lang.String str10 = reservation0.toString();
        java.lang.String str11 = reservation0.getEndTime();
        java.lang.String str12 = reservation0.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | hi!" + "'", str10, "Booking [null] null | null to null | hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        java.lang.String str8 = equipment7.getEquipmentID();
        java.lang.String str9 = equipment7.getStatus();
        java.lang.String str10 = equipment7.getDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        java.lang.String str9 = reservation0.getEndTime();
        reservation0.forfeitDeposit();
        java.lang.String str11 = reservation0.getUserID();
        java.lang.String str12 = reservation0.getPaymentMethod();
        java.lang.String str13 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setDepositForfeited(false);
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getPaymentMethod();
        java.lang.String str9 = reservation0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setBookingID("CANCELLED");
        double double16 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        boolean boolean14 = reservation0.isExtended();
        double double15 = reservation0.getDepositAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str13, "Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "");
        equipment7.setName("");
        java.lang.String str10 = equipment7.getStatus();
        equipment7.setBuildingName("Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        double double7 = reservation0.getDepositAmount();
        java.lang.String str8 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        reservation0.setStatus("SUCCESS");
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setPaymentMethod("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        reservation0.setEndTime("hi!");
        reservation0.setExtended(false);
        reservation0.setBookingID("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", (double) (short) 1, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        double double5 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getStatus();
        equipment0.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str4 = equipment0.getStatus();
        java.lang.String str5 = equipment0.getRoomNumber();
        equipment0.setBuildingName("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        equipment0.setRoomNumber("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "", (double) 0L, "hi!");
        paymentTransaction4.setPaymentStatus("null -  [null] @ null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getBookingID();
        java.lang.String str8 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        boolean boolean9 = equipment0.isAvailable();
        equipment0.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str12 = equipment0.getStatus();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | hi!", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null", "Booking [null] null | null to CANCELLED | null", (double) 0);
        reservation7.setEquipmentID("Booking [Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED] null | null to  | null");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setPaymentMethod("CANCELLED");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | CANCELLED");
        double double9 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setStatus("Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getRoomNumber();
        java.lang.String str13 = equipment7.getRoomNumber();
        equipment7.setStatus("Booking [Booking [null] null | null to null | CANCELLED]  | null -  [null] @ null Booking [null] null | null to null | null to Booking [null] null | null to hi! | Booking [null] null | null to null | null | FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", "Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED", "Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!", "Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED", "hi!", "Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        model.Reservation reservation7 = new model.Reservation(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", "Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null - Booking [null] null | null to null | hi! [SUCCESS] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!", "Booking [null] null | null to null | null - Booking [null] null | null to null | hi! [SUCCESS] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 1);
        reservation7.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        paymentTransaction4.setTransactionID("CANCELLED");
        paymentTransaction4.setBookingID("CANCELLED");
        double double13 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount(32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        java.lang.String str7 = reservation0.getUserID();
        java.lang.String str8 = reservation0.getEquipmentID();
        double double9 = reservation0.getDepositAmount();
        reservation0.setUserID("Booking [null] null | hi! to null | hi!");
        java.lang.String str12 = reservation0.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("");
        boolean boolean13 = reservation0.isExtended();
        java.lang.String str14 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        boolean boolean6 = reservation0.isDepositForfeited();
        java.lang.String str7 = reservation0.getBookingID();
        java.lang.String str8 = reservation0.getEquipmentID();
        reservation0.forfeitDeposit();
        reservation0.setStartTime("SUCCESS");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isExtended();
        java.lang.String str7 = reservation0.getUserID();
        reservation0.setEndTime("hi!");
        java.lang.String str10 = reservation0.getPaymentMethod();
        reservation0.setEndTime("Booking [null] null |  to null | hi!");
        reservation0.setDepositAmount((double) (byte) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("hi!");
        reservation0.setEndTime("");
        java.lang.String str9 = reservation0.getBookingID();
        java.lang.String str10 = reservation0.getEndTime();
        reservation0.setDepositAmount(1.0d);
        reservation0.setEquipmentID("Booking [null] null | Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi! to null | ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        boolean boolean14 = reservation0.isExtended();
        java.lang.String str15 = reservation0.getUserID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        boolean boolean11 = equipment7.isAvailable();
        equipment7.setName("");
        model.LabLocation labLocation14 = equipment7.getLabLocation();
        equipment7.setEquipmentID("CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(labLocation14);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        boolean boolean14 = reservation0.isExtended();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null |  to null | hi!" + "'", str13, "Booking [null] null |  to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        reservation0.extend("Booking [null] null | null -  [null] @ null Booking [null] null | null to null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", (double) 0, "Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("Booking [null] null | hi! to null | Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.setDepositForfeited(true);
        reservation0.setDepositAmount((double) 100L);
        reservation0.setDepositForfeited(false);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        double double6 = paymentTransaction4.getTotalAmount();
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | hi!");
        double double10 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        model.Equipment equipment7 = new model.Equipment(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi! | CANCELLED", "Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!", "FORFEITED", "Booking [null] null | null to  | CANCELLED", "Booking [] null | null to null | null", "Booking [null] null | null to null | hi!");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        java.lang.String str10 = reservation0.getBookingID();
        boolean boolean11 = reservation0.isExtended();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setStatus("CANCELLED");
        java.lang.String str6 = reservation0.getPaymentMethod();
        boolean boolean7 = reservation0.isExtended();
        java.lang.String str8 = reservation0.getPaymentMethod();
        java.lang.String str9 = reservation0.getEquipmentID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "SUCCESS", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setName("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        reservation0.setPaymentMethod("CANCELLED - CANCELLED [Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!] @ null -  [null] @ null Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ");
        boolean boolean3 = reservation0.isExtended();
        boolean boolean4 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        reservation0.extend("CANCELLED");
        reservation0.setEndTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.toString();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Booking [null] null | null to null | null" + "'", str1, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setBuildingName("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = equipment7.getName();
        java.lang.String str13 = equipment7.getName();
        java.lang.String str14 = equipment7.toString();
        java.lang.String str15 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str12, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str13, "Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null - Booking [null] null | null to null | CANCELLED [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | CANCELLED" + "'", str15, "Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.cancel();
        reservation0.setStartTime("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        java.lang.String str11 = equipment7.getBuildingName();
        equipment7.setRoomNumber("hi!");
        boolean boolean14 = equipment7.isAvailable();
        equipment7.setName("SUCCESS");
        java.lang.String str17 = equipment7.getRoomNumber();
        java.lang.String str18 = equipment7.getEquipmentID();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str11 = reservation0.getStatus();
        reservation0.setDepositAmount(0.0d);
        java.lang.String str14 = reservation0.toString();
        boolean boolean15 = reservation0.isExtended();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null" + "'", str14, "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | hi!", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null", (double) 1, "SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setDepositForfeited(true);
        java.lang.String str8 = reservation0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setTotalAmount((double) (short) -1);
        java.lang.String str10 = paymentTransaction4.getBookingID();
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        double double12 = paymentTransaction4.getTotalAmount();
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTotalAmount((double) 100.0f);
        java.lang.String str16 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SUCCESS" + "'", str7, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setBookingID("");
        reservation0.setBookingID("");
        reservation0.setExtended(false);
        reservation0.forfeitDeposit();
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        model.Equipment equipment7 = new model.Equipment("", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to  | CANCELLED | null", " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null | CANCELLED", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!", "Booking [null] null | null to  | null");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null - Booking [null] null | null to null | hi! [SUCCESS] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [null] null | null to  | CANCELLED", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", "Booking [null] null | null to CANCELLED | null", "", "Booking [null] null | Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi! to null | ");
        java.lang.String str8 = equipment7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getName();
        java.lang.String str12 = equipment7.getName();
        equipment7.setName("SUCCESS");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        double double5 = paymentTransaction4.getTotalAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setTotalAmount(32.0d);
        paymentTransaction4.setTotalAmount(0.0d);
        paymentTransaction4.setPaymentMethod("SUCCESS -  [null -  [null] @ null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! Booking [null] null | null to null | null");
        paymentTransaction4.setPaymentMethod(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.toString();
        reservation0.cancel();
        reservation0.setExtended(true);
        java.lang.String str6 = reservation0.getEquipmentID();
        reservation0.setStartTime("SUCCESS");
        reservation0.forfeitDeposit();
        boolean boolean10 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Booking [null] null | null to null | null" + "'", str2, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getUserID();
        double double5 = reservation0.getDepositAmount();
        reservation0.setDepositAmount((double) (-1.0f));
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isExtended();
        reservation0.setDepositForfeited(false);
        reservation0.setDepositAmount((double) 0.0f);
        java.lang.String str11 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getRoomNumber();
        java.lang.String str2 = equipment0.getBuildingName();
        java.lang.String str3 = equipment0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setBookingID("Booking [null] null | null to null | null");
        reservation0.setUserID(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setStatus("Booking [null] null | null to null | hi!");
        reservation0.setEndTime("Booking [null] null | null to null | null");
        reservation0.setEquipmentID("");
        reservation0.setExtended(true);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) 1L, "hi!");
        paymentTransaction4.setBookingID("");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str11 = paymentTransaction4.getPaymentStatus();
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getPaymentMethod();
        double double14 = paymentTransaction4.getTotalAmount();
        java.lang.String str15 = paymentTransaction4.getPaymentStatus();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SUCCESS" + "'", str11, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SUCCESS" + "'", str15, "SUCCESS");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        boolean boolean5 = reservation0.isDepositForfeited();
        java.lang.String str6 = reservation0.getEndTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.setPaymentMethod("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        boolean boolean11 = reservation0.isExtended();
        java.lang.String str12 = reservation0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | CANCELLED to null | FORFEITED" + "'", str12, "Booking [null] null | CANCELLED to null | FORFEITED");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        java.lang.String str5 = reservation0.getPaymentMethod();
        reservation0.cancel();
        reservation0.setExtended(false);
        reservation0.setExtended(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        double double1 = paymentTransaction0.getTotalAmount();
        double double2 = paymentTransaction0.getTotalAmount();
        java.lang.String str3 = paymentTransaction0.getPaymentStatus();
        double double4 = paymentTransaction0.getTotalAmount();
        paymentTransaction0.setTransactionID(" - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        model.Equipment equipment7 = new model.Equipment("hi!", "hi!", "Booking [null] null | null to null | null", "hi!", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "hi!");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str11 = equipment7.getType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isExtended();
        java.lang.String str7 = reservation0.getUserID();
        reservation0.setEndTime("hi!");
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        reservation0.setStatus("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        reservation0.setExtended(true);
        reservation0.setDepositAmount(32.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "Booking [null] null | null to null | null", (double) (short) 10, "Booking [null] null | null to null | hi!");
        paymentTransaction4.setPaymentStatus("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        java.lang.String str9 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str9, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        equipment7.setType("");
        equipment7.setType("");
        java.lang.String str12 = equipment7.toString();
        equipment7.setRoomNumber("Booking [null] null | null to null | hi!");
        java.lang.String str15 = equipment7.getName();
        boolean boolean16 = equipment7.isAvailable();
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str19 = equipment7.getBuildingName();
        equipment7.setEquipmentID("");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Booking [null] null | null to null | null" + "'", str19, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setDescription("Booking [null] null | null to null | hi!");
        java.lang.String str13 = equipment7.getName();
        equipment7.setName("Booking [null] null | null to null | CANCELLED");
        equipment7.setStatus("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setPaymentMethod("Booking [null] null | null to Booking [null] null | null to null | CANCELLED | hi!");
        java.lang.String str4 = reservation0.getBookingID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        java.lang.String str3 = reservation0.getStatus();
        boolean boolean4 = reservation0.isDepositForfeited();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getStatus();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setExtended(true);
        reservation0.setUserID("null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "FORFEITED", (double) (byte) 1, "FORFEITED");
        paymentTransaction4.setTransactionID("hi!");
        java.lang.String str7 = paymentTransaction4.getTransactionID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setBuildingName("Booking [null] null | null to null | null");
        model.LabLocation labLocation13 = equipment7.getLabLocation();
        java.lang.String str14 = equipment7.getEquipmentID();
        java.lang.String str15 = equipment7.getType();
        equipment7.setName("Booking [Booking [null] null | null to null | CANCELLED] null | null to null | hi!");
        model.LabLocation labLocation18 = equipment7.getLabLocation();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertNotNull(labLocation18);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setStatus("hi!");
        java.lang.String str8 = reservation0.getEndTime();
        boolean boolean9 = reservation0.isDepositForfeited();
        java.lang.String str10 = reservation0.getStatus();
        reservation0.setPaymentMethod(" -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str13 = reservation0.getPaymentMethod();
        reservation0.setStartTime("Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str16 = reservation0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str13, " -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null to null | hi!" + "'", str16, "Booking [null] null | Booking [null] null | null to null | null -  [Booking [null] null | null to null | hi!] @ Booking [null] null | null to null | null Booking [null] null | null to null | null to null | hi!");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setStartTime("");
        reservation0.extend("Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED", "Booking [null] null | null to null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) (byte) -1, " - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        paymentTransaction4.setTotalAmount((double) (short) 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str3 = reservation0.getEndTime();
        reservation0.setPaymentMethod("Booking [null] null |  to null | hi! - Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] @ Booking [null] null | null to  | Booking [null] null | null to null | null Booking [null] null | Booking [null] null | null to null | CANCELLED to null | CANCELLED");
        java.lang.String str6 = reservation0.getEndTime();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("Booking [null] null | hi! to null | hi!");
        reservation0.cancel();
        reservation0.setEquipmentID("Booking [null] null | null to  | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null |  to null | hi!", "Booking [null] null | null to  | Booking [null] null | null to null | null", "hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "", "SUCCESS", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", (double) 1.0f, "");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        paymentTransaction4.setTransactionID("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ FORFEITED Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        boolean boolean4 = reservation0.isDepositForfeited();
        java.lang.String str5 = reservation0.getBookingID();
        double double6 = reservation0.getDepositAmount();
        java.lang.String str7 = reservation0.getUserID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | null to null | null" + "'", str7, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getBookingID();
        java.lang.String str4 = reservation0.toString();
        reservation0.cancel();
        java.lang.String str6 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Booking [null] null | null to null | null" + "'", str4, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        reservation0.setStartTime("Booking [CANCELLED]  | null to null | null");
        reservation0.setDepositAmount((double) 0L);
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CANCELLED" + "'", str7, "CANCELLED");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | CANCELLED -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ", "Booking [null] null | null to hi! | Booking [null] null | null to null | null", "Booking [null] null | hi! to null | hi!", "Booking [null] null | hi! to null | hi!", (double) 'a');
        reservation7.setDepositForfeited(true);
        reservation7.setPaymentMethod("Booking [null] null | null to  | CANCELLED");
        reservation7.setDepositForfeited(false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        reservation0.setDepositAmount(1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null - null -  [null] @ null Booking [null] null | null to null | null [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! | ", (double) 10.0f, "Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setUserID("hi!");
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setBookingID("Booking [null] Booking [null] null | null to  | Booking [null] null | null to null | null | null to null | null");
        java.lang.String str11 = reservation0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FORFEITED" + "'", str11, "FORFEITED");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        model.Reservation reservation0 = new model.Reservation();
        reservation0.setStatus("Booking [null] null | null to null | null");
        reservation0.extend("");
        java.lang.String str5 = reservation0.toString();
        java.lang.String str6 = reservation0.toString();
        reservation0.setStartTime("Booking [null] null | null to null | hi!");
        reservation0.setBookingID("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        java.lang.String str11 = reservation0.getStatus();
        reservation0.setEndTime("hi! - hi! [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str5, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str6, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setRoomNumber("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setEquipmentID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str17 = equipment7.getType();
        java.lang.String str18 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setDescription("Booking [null] null | null to null | null");
        equipment0.setName("");
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setRoomNumber("Booking [null] null | null to null | null");
        java.lang.String str8 = equipment0.toString();
        boolean boolean9 = equipment0.isAvailable();
        equipment0.setDescription("Booking [null] null | null to Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi! | hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str8, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        java.lang.String str6 = reservation0.getStartTime();
        reservation0.setStartTime("CANCELLED");
        reservation0.extend("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        reservation0.setUserID("Booking [null] null | null to null | CANCELLED");
        java.lang.String str13 = reservation0.getStartTime();
        boolean boolean14 = reservation0.isDepositForfeited();
        reservation0.setStartTime("Booking [null] null | Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi! to null | CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CANCELLED" + "'", str13, "CANCELLED");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositForfeited(true);
        boolean boolean10 = reservation0.isDepositForfeited();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setType("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        model.LabLocation labLocation11 = equipment7.getLabLocation();
        equipment7.setType("Booking [null] null | null to null | null");
        java.lang.String str14 = equipment7.getBuildingName();
        java.lang.String str15 = equipment7.getType();
        java.lang.String str16 = equipment7.getStatus();
        equipment7.setRoomNumber(" - Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null [Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null] @ Booking [null] null | null to null | null ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(labLocation11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Booking [null] null | null to null | null" + "'", str16, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getName();
        java.lang.String str10 = equipment7.getDescription();
        equipment7.setDescription("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        equipment7.setType("Booking [null] null | null to hi! | Booking [null] null | null to null | null");
        equipment7.setDescription("null -  [null] @ null Booking [null] null | null to null | null");
        boolean boolean17 = equipment7.isAvailable();
        java.lang.String str18 = equipment7.getDescription();
        java.lang.String str19 = equipment7.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Booking [null] null | null to null | null" + "'", str10, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null -  [null] @ null Booking [null] null | null to null | null" + "'", str18, "null -  [null] @ null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        model.Reservation reservation7 = new model.Reservation("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!", "null -  [null] @ null Booking [null] null | null to null | null", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | null to null | null", " - hi! [] @ Booking [null] null | null to null | null Booking [null] null | null to null | CANCELLED", (double) (-1L));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setStartTime("FORFEITED");
        java.lang.String str4 = reservation0.getUserID();
        reservation0.setDepositForfeited(false);
        java.lang.String str7 = reservation0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Booking [null] null | FORFEITED to null | null" + "'", str7, "Booking [null] null | FORFEITED to null | null");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getStatus();
        equipment0.setType("Booking [null] null | null to  | Booking [null] null | null to null | null");
        equipment0.setDescription("hi!");
        model.LabLocation labLocation6 = equipment0.getLabLocation();
        java.lang.String str7 = equipment0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(labLocation6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getEquipmentID();
        boolean boolean8 = reservation0.isDepositForfeited();
        reservation0.setStartTime("SUCCESS");
        java.lang.String str11 = reservation0.getBookingID();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        reservation0.setUserID("hi!");
        reservation0.cancel();
        reservation0.cancel();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setEndTime("");
        reservation0.extend("CANCELLED");
        java.lang.String str10 = reservation0.getPaymentMethod();
        reservation0.setPaymentMethod("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        reservation0.forfeitDeposit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        paymentTransaction4.setTotalAmount((double) 100L);
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setPaymentMethod("Booking [null] null | null to null | CANCELLED");
        paymentTransaction4.setTransactionID("Booking [Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!] null | Booking [null] null | null to null | hi! to  | Booking [null] null | null to null | null");
        java.lang.String str14 = paymentTransaction4.getBookingID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str14, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        java.lang.String str2 = reservation0.getStartTime();
        java.lang.String str3 = reservation0.toString();
        java.lang.String str4 = reservation0.getStartTime();
        java.lang.String str5 = reservation0.getStartTime();
        boolean boolean6 = reservation0.isDepositForfeited();
        reservation0.setPaymentMethod("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        reservation0.setPaymentMethod("Booking [Booking [null] null | null to null | CANCELLED] Booking [null] null | null to null | CANCELLED | null to null | hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Booking [null] null | null to null | null" + "'", str3, "Booking [null] null | null to null | null");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("", "CANCELLED", (double) (short) 0, "CANCELLED");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        java.lang.String str6 = paymentTransaction4.getBookingID();
        paymentTransaction4.setTotalAmount(10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CANCELLED" + "'", str5, "CANCELLED");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CANCELLED" + "'", str6, "CANCELLED");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        java.lang.String str7 = reservation0.getStatus();
        reservation0.setDepositAmount((double) (byte) 100);
        double double10 = reservation0.getDepositAmount();
        reservation0.setEquipmentID("Booking [null] null | null to Booking [null] null | null to null | hi! | FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        equipment7.setEquipmentID("");
        java.lang.String str11 = equipment7.getDescription();
        java.lang.String str12 = equipment7.getBuildingName();
        boolean boolean13 = equipment7.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Booking [null] null | null to null | null" + "'", str11, "Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null" + "'", str12, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str7 = paymentTransaction4.getPaymentMethod();
        java.lang.String str8 = paymentTransaction4.getTransactionID();
        java.lang.String str9 = paymentTransaction4.getPaymentStatus();
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        java.lang.String str12 = paymentTransaction4.getPaymentMethod();
        java.lang.String str13 = paymentTransaction4.getPaymentStatus();
        java.lang.String str14 = paymentTransaction4.getPaymentMethod();
        java.lang.String str15 = paymentTransaction4.getBookingID();
        java.lang.String str16 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str8, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SUCCESS" + "'", str9, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SUCCESS" + "'", str13, "SUCCESS");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null" + "'", str15, "Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        reservation0.setDepositAmount((double) (short) 0);
        reservation0.setUserID("hi!");
        reservation0.setDepositForfeited(false);
        boolean boolean8 = reservation0.isDepositForfeited();
        java.lang.String str9 = reservation0.toString();
        reservation0.setStatus("Booking [null] null | hi! to null -  [null] @ null Booking [null] null | null to null | null | FORFEITED");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        model.Reservation reservation0 = new model.Reservation();
        boolean boolean1 = reservation0.isDepositForfeited();
        boolean boolean2 = reservation0.isDepositForfeited();
        reservation0.setExtended(true);
        reservation0.setStatus("hi!");
        boolean boolean7 = reservation0.isDepositForfeited();
        java.lang.String str8 = reservation0.getBookingID();
        reservation0.setStartTime("hi!");
        reservation0.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        boolean boolean13 = reservation0.isExtended();
        reservation0.setDepositForfeited(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        model.Equipment equipment7 = new model.Equipment("SUCCESS", "", "Booking [null] null | null to  | Booking [null] null | null to null | null", "Booking [null] null | null to null | hi!", "null -  [null] @ null Booking [null] null | null to null | null", "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!", "Booking [null] null | null to null | null");
        equipment7.setDescription("");
        equipment7.setDescription("");
        java.lang.String str12 = equipment7.getBuildingName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!" + "'", str12, "Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null", "Booking [null] null | null to null | null", (double) (-1), "");
        paymentTransaction4.setBookingID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null");
        double double7 = paymentTransaction4.getTotalAmount();
        paymentTransaction4.setTotalAmount((double) 0L);
        double double10 = paymentTransaction4.getTotalAmount();
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        model.Equipment equipment7 = new model.Equipment("Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null", "Booking [null] null | null to null | null");
        boolean boolean8 = equipment7.isAvailable();
        java.lang.String str9 = equipment7.getBuildingName();
        equipment7.setName("Booking [null] null | null to null | hi!");
        boolean boolean12 = equipment7.isAvailable();
        equipment7.setDescription("Booking [null] null | null to null | null - SUCCESS [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null hi!");
        equipment7.setStatus("Booking [null] null | null to  | Booking [null] null | null to null | null");
        java.lang.String str17 = equipment7.getStatus();
        java.lang.String str18 = equipment7.getStatus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Booking [null] null | null to null | null" + "'", str9, "Booking [null] null | null to null | null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str17, "Booking [null] null | null to  | Booking [null] null | null to null | null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Booking [null] null | null to  | Booking [null] null | null to null | null" + "'", str18, "Booking [null] null | null to  | Booking [null] null | null to null | null");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        reservation0.setUserID("Booking [null] null | null to null | null");
        java.lang.String str4 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(false);
        reservation0.setUserID("Booking [null] null | null to null | null -  [Booking [null] null | null to null | null] @ Booking [null] null | null to null | null Booking [null] null | null to null | null -  [hi!] @ Booking [null] null | null to null | null hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        model.Reservation reservation0 = new model.Reservation();
        java.lang.String str1 = reservation0.getEndTime();
        java.lang.String str2 = reservation0.getStatus();
        java.lang.String str3 = reservation0.getPaymentMethod();
        reservation0.setDepositForfeited(true);
        reservation0.setPaymentMethod("Booking [null] null | null to null | hi!");
        java.lang.String str8 = reservation0.getEndTime();
        java.lang.String str9 = reservation0.getEndTime();
        java.lang.String str10 = reservation0.getBookingID();
        reservation0.setEndTime("");
        java.lang.String str13 = reservation0.toString();
        reservation0.setUserID("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Booking [null] null | null to  | null" + "'", str13, "Booking [null] null | null to  | null");
    }
}

