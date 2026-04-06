package test.randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        model.Researcher researcher7 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation1 = null;
        pattern.command.ExtendCommand extendCommand3 = new pattern.command.ExtendCommand(reservationService0, reservation1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"pattern.command.ReservationService.extend(model.Reservation, String)\" because \"this.reservationService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        double double8 = guest7.getFeeRate();
        guest7.setEmail("Booking []  | hi! to  | FORFEITED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction4.setPaymentMethod("");
        paymentTransaction4.setTotalAmount((double) (byte) 0);
        paymentTransaction4.setTransactionID("");
        java.lang.String str11 = paymentTransaction4.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getStatusString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "AVAILABLE" + "'", str3.equals("AVAILABLE"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        model.LabManager labManager0 = new model.LabManager();
        java.lang.String str1 = labManager0.getManagerID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        model.Researcher researcher7 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher7.setUserID("");
        researcher7.setStatus("hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        paymentTransaction0.setTotalAmount((double) (byte) 100);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        model.Researcher researcher7 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher7.setEmail("");
        java.lang.String str10 = researcher7.getStatus();
        java.lang.String str11 = researcher7.getPassword();
        java.lang.String str12 = researcher7.getStaffID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        model.Deposit deposit0 = new model.Deposit();
        deposit0.setDeductedFromTotal(false);
        deposit0.setAmount((double) (short) 10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        java.lang.String str8 = reservation7.getBookingID();
        boolean boolean9 = reservation7.isDepositForfeited();
        boolean boolean10 = reservation7.isDepositForfeited();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setStatus("Booking []  | hi! to  | FORFEITED");
        java.lang.String str4 = equipment0.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        pattern.strategy.InstitutionalPayment institutionalPayment0 = new pattern.strategy.InstitutionalPayment();
        pattern.strategy.PaymentProcessor paymentProcessor1 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) institutionalPayment0);
        model.PaymentTransaction paymentTransaction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = paymentProcessor1.processPayment(paymentTransaction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.PaymentTransaction.getBookingID()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        model.Equipment equipment7 = new model.Equipment("hi!", "null - null [null] @ null null", "null - null [null] @ null null", "AVAILABLE", "", "CONFIRMED", "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation7.setPaymentMethod("");
        reservation7.setStartTime("hi!");
        reservation7.setExtended(false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        equipment0.setBuildingName("null - null [null] @ null null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        pattern.strategy.InstitutionalPayment institutionalPayment0 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction5 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction5.setPaymentMethod("");
        java.lang.String str8 = paymentTransaction5.getBookingID();
        boolean boolean9 = institutionalPayment0.pay(paymentTransaction5);
        double double10 = paymentTransaction5.getTotalAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        model.Guest guest0 = new model.Guest();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand9 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        reservation8.setStartTime("FORFEITED");
        reservation8.setEndTime("Booking []  | hi! to  | FORFEITED,null");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setEquipmentID("");
        java.lang.String str3 = equipment0.getName();
        java.lang.String str4 = equipment0.getName();
        boolean boolean5 = equipment0.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        pattern.command.ReservationService reservationService0 = null;
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand10 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        reservation9.setStartTime("FORFEITED");
        pattern.command.ModifyCommand modifyCommand15 = new pattern.command.ModifyCommand(reservationService0, reservation9, "SUCCESS", "null - null [null] @ null null");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        model.LabLocation labLocation0 = new model.LabLocation();
        labLocation0.setBuildingName("Booking []  | hi! to  | FORFEITED");
        java.lang.String str3 = labLocation0.getRoomNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setEquipmentID("");
        java.lang.String str3 = equipment0.getName();
        java.lang.String str4 = equipment0.getName();
        equipment0.setRoomNumber("Booking []  | hi! to  | FORFEITED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        model.LabLocation labLocation2 = new model.LabLocation("null - null [null] @ null null", "Booking []  | hi! to  | FORFEITED");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand11 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        java.lang.String str12 = reservation8.toString();
        boolean boolean13 = reservation8.isExtended();
        reservation8.setUserID("hi!");
        boolean boolean16 = reservation8.isExtended();
        reservation8.setDepositForfeited(true);
        reservation8.setEndTime("Booking []  | hi! to  | FORFEITED,null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str12.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setEquipmentID("");
        java.lang.String str3 = equipment0.getName();
        java.lang.String str4 = equipment0.getName();
        java.lang.String str5 = equipment0.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        // The following exception was thrown during execution in test generation
        try {
            modifyCommand13.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"pattern.command.ReservationService.modify(model.Reservation, String, String)\" because \"this.reservationService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getType();
        java.lang.String str2 = equipment0.getRoomNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        pattern.command.ReservationService reservationService0 = null;
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand10 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        reservation9.setStartTime("FORFEITED");
        reservation9.setDepositAmount((double) 10.0f);
        pattern.command.CancelCommand cancelCommand15 = new pattern.command.CancelCommand(reservationService0, reservation9);
        java.lang.String str16 = reservation9.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        guest7.setCertificationNumber("Booking []  | hi! to  | FORFEITED");
        guest7.setStaffID("User [null, null, null, FORFEITED, null]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getType();
        equipment0.setRoomNumber("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation7.setPaymentMethod("");
        boolean boolean10 = reservation7.isExtended();
        java.lang.String str11 = reservation7.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        pattern.strategy.DebitPayment debitPayment0 = new pattern.strategy.DebitPayment();
        model.PaymentTransaction paymentTransaction5 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        boolean boolean6 = debitPayment0.pay(paymentTransaction5);
        paymentTransaction5.setTransactionID("FORFEITED");
        java.lang.String str9 = paymentTransaction5.getTransactionID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FORFEITED" + "'", str9.equals("FORFEITED"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        model.Researcher researcher7 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher7.setEmail("");
        java.lang.String str10 = researcher7.getStatus();
        java.lang.String str11 = researcher7.getPassword();
        double double12 = researcher7.getFeeRate();
        researcher7.setPassword("");
        researcher7.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.setPaymentMethod("");
        reservation9.setStartTime("hi!");
        reservation9.setDepositAmount(100.0d);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand16 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        reservation9.setBookingID("SUCCESS");
        pattern.command.ModifyCommand modifyCommand21 = new pattern.command.ModifyCommand(reservationService0, reservation9, "SUCCESS", "SUCCESS");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        pattern.command.ReservationService reservationService0 = null;
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand10 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        reservation9.setStartTime("FORFEITED");
        reservation9.setDepositAmount((double) 10.0f);
        pattern.command.CancelCommand cancelCommand15 = new pattern.command.CancelCommand(reservationService0, reservation9);
        boolean boolean16 = reservation9.isDepositForfeited();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        java.lang.String str9 = guest7.getStatus();
        double double10 = guest7.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        model.Faculty faculty0 = new model.Faculty();
        faculty0.setUserType("FORFEITED");
        faculty0.setStatus("null - null [null] @ null null");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        model.LabLocation labLocation0 = new model.LabLocation();
        labLocation0.setBuildingName("Booking []  | hi! to  | FORFEITED");
        java.lang.String str3 = labLocation0.getLocationDetails();
        java.lang.String str4 = labLocation0.getLocationDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str3.equals("Booking []  | hi! to  | FORFEITED - Room null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str4.equals("Booking []  | hi! to  | FORFEITED - Room null"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        boolean boolean2 = equipment0.isAvailable();
        java.lang.String str3 = equipment0.getType();
        equipment0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        pattern.factory.UserFactory userFactory0 = new pattern.factory.UserFactory();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        model.Guest guest11 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str12 = guest11.getDepartment();
        guest11.setPassword("hi!");
        model.Student student15 = new model.Student();
        model.LabManager labManager16 = new model.LabManager();
        model.Researcher researcher24 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher24.setUserID("");
        model.Student student34 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher42 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest50 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str51 = guest50.getDepartment();
        model.User[] userArray52 = new model.User[] { guest11, student15, labManager16, researcher24, student34, researcher42, guest50 };
        java.util.ArrayList<model.User> userList53 = new java.util.ArrayList<model.User>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<model.User>) userList53, userArray52);
        pattern.observer.UserNotificationObserver userNotificationObserver55 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList53);
        equipmentContext2.registerObserver((pattern.observer.EquipmentObserver) userNotificationObserver55);
        equipmentContext2.notifyObservers("AVAILABLE", "Administration");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        model.Researcher researcher0 = new model.Researcher();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        model.Researcher researcher7 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher7.setEmail("");
        java.lang.String str10 = researcher7.getStatus();
        researcher7.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand9 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        reservation8.setStartTime("FORFEITED");
        reservation8.setDepositAmount((double) 10.0f);
        reservation8.setDepositForfeited(false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        pattern.strategy.GrantPayment grantPayment0 = new pattern.strategy.GrantPayment();
        model.PaymentTransaction paymentTransaction5 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction5.setPaymentMethod("");
        paymentTransaction5.setTotalAmount((double) (byte) 0);
        paymentTransaction5.setPaymentMethod("FORFEITED");
        boolean boolean12 = grantPayment0.pay(paymentTransaction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        equipment0.setDescription("Booking []  | hi! to  | FORFEITED");
        java.lang.String str6 = equipment0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str6.equals("Booking []  | hi! to  | FORFEITED"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        pattern.strategy.GrantPayment grantPayment0 = new pattern.strategy.GrantPayment();
        model.PaymentTransaction paymentTransaction5 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction5.setPaymentMethod("");
        paymentTransaction5.setTotalAmount((double) (byte) 0);
        paymentTransaction5.setTransactionID("");
        java.lang.String str12 = paymentTransaction5.getPaymentStatus();
        boolean boolean13 = grantPayment0.pay(paymentTransaction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "SUCCESS" + "'", str12.equals("SUCCESS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        double double14 = reservation8.getDepositAmount();
        java.lang.String str15 = reservation8.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        model.Deposit deposit0 = new model.Deposit();
        boolean boolean1 = deposit0.isForfeited();
        double double2 = deposit0.getAmount();
        deposit0.forfeit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        model.Guest guest11 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str12 = guest11.getDepartment();
        guest11.setPassword("hi!");
        model.Student student15 = new model.Student();
        model.LabManager labManager16 = new model.LabManager();
        model.Researcher researcher24 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher24.setUserID("");
        model.Student student34 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher42 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest50 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str51 = guest50.getDepartment();
        model.User[] userArray52 = new model.User[] { guest11, student15, labManager16, researcher24, student34, researcher42, guest50 };
        java.util.ArrayList<model.User> userList53 = new java.util.ArrayList<model.User>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<model.User>) userList53, userArray52);
        pattern.observer.UserNotificationObserver userNotificationObserver55 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList53);
        equipmentContext2.registerObserver((pattern.observer.EquipmentObserver) userNotificationObserver55);
        java.lang.String str57 = userNotificationObserver55.getNotificationLog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        model.Faculty faculty0 = new model.Faculty();
        faculty0.setUserType("FORFEITED");
        java.lang.String str3 = faculty0.toString();
        double double4 = faculty0.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [null, null, null, FORFEITED, null]" + "'", str3.equals("User [null, null, null, FORFEITED, null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        boolean boolean2 = equipment0.isAvailable();
        java.lang.String str3 = equipment0.getType();
        java.lang.String str4 = equipment0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        equipmentContext2.notifyObservers("FORFEITED", "");
        java.lang.String str8 = equipmentContext2.getStatusString();
        equipmentContext2.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setEquipmentID("");
        java.lang.String str3 = equipment0.getName();
        equipment0.setStatus("User [hi!, , , RESEARCHER, hi!]");
        equipment0.setStatus("User [null, null, null, FORFEITED, null]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        model.Deposit deposit0 = new model.Deposit();
        deposit0.setDeductedFromTotal(false);
        deposit0.setAmount((double) (short) 100);
        deposit0.setDeductedFromTotal(false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        model.Deposit deposit0 = new model.Deposit();
        deposit0.setDeductedFromTotal(false);
        deposit0.setAmount((double) (byte) 1);
        double double5 = deposit0.getAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        java.lang.String str15 = reservation9.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        guest7.setCertificationNumber("Booking []  | hi! to  | FORFEITED");
        guest7.setCertificationNumber("null - null [null] @ null null");
        java.lang.String str12 = guest7.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        model.Faculty faculty0 = new model.Faculty();
        faculty0.setUserType("FORFEITED");
        java.lang.String str3 = faculty0.toString();
        java.lang.String str4 = faculty0.getEmail();
        double double5 = faculty0.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "User [null, null, null, FORFEITED, null]" + "'", str3.equals("User [null, null, null, FORFEITED, null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 15.0d + "'", double5 == 15.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        model.LabLocation labLocation0 = new model.LabLocation();
        java.lang.String str1 = labLocation0.getLocationDetails();
        java.lang.String str2 = labLocation0.getBuildingName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - Room null" + "'", str1.equals("null - Room null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        equipment0.setDescription("Booking []  | hi! to  | FORFEITED");
        java.lang.String str6 = equipment0.toString();
        java.lang.String str7 = equipment0.getName();
        java.lang.String str8 = equipment0.getBuildingName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null - null [null] @ null null" + "'", str6.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        model.Researcher researcher7 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher7.setEmail("");
        java.lang.String str10 = researcher7.getStatus();
        java.lang.String str11 = researcher7.toString();
        researcher7.setStatus("Booking []  | hi! to  | FORFEITED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [hi!, , , RESEARCHER, hi!]" + "'", str11.equals("User [hi!, , , RESEARCHER, hi!]"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand11 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        boolean boolean12 = reservation8.isExtended();
        reservation8.extend("hi!");
        reservation8.forfeitDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        boolean boolean14 = reservation8.isExtended();
        reservation8.setEquipmentID("");
        reservation8.setPaymentMethod("FORFEITED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        model.LabManager labManager0 = new model.LabManager();
        labManager0.setManagerID("");
        java.lang.String str3 = labManager0.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setStatus("Booking []  | hi! to  | FORFEITED");
        java.lang.String str4 = equipment0.getBuildingName();
        java.lang.String str5 = equipment0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        pattern.command.ReservationService reservationService0 = null;
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand10 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        reservation9.setStartTime("FORFEITED");
        reservation9.setDepositAmount((double) 10.0f);
        pattern.command.CancelCommand cancelCommand15 = new pattern.command.CancelCommand(reservationService0, reservation9);
        // The following exception was thrown during execution in test generation
        try {
            cancelCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"pattern.command.ReservationService.cancel(model.Reservation)\" because \"this.reservationService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        guest7.setCertificationNumber("Booking []  | hi! to  | FORFEITED");
        guest7.setStaffID("");
        java.lang.String str12 = guest7.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        model.Faculty faculty0 = new model.Faculty();
        java.lang.String str1 = faculty0.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        java.lang.String str8 = reservation7.getBookingID();
        reservation7.setEquipmentID("C001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        model.LabLocation labLocation0 = new model.LabLocation();
        java.lang.String str1 = labLocation0.getLocationDetails();
        java.lang.String str2 = labLocation0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - Room null" + "'", str1.equals("null - Room null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null,null" + "'", str2.equals("null,null"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getCoordinatorID();
        java.lang.String str2 = headLabCoordinatorSingleton0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "C001" + "'", str1.equals("C001"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HeadLabCoordinator [C001] Coordinator Carol" + "'", str2.equals("HeadLabCoordinator [C001] Coordinator Carol"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getCoordinatorID();
        java.lang.String str2 = headLabCoordinatorSingleton0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "C001" + "'", str1.equals("C001"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "coord@yorku.ca" + "'", str2.equals("coord@yorku.ca"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        model.LabManager labManager0 = new model.LabManager();
        labManager0.setManagerID("FORFEITED");
        java.lang.String str3 = labManager0.getManagerID();
        java.lang.String str4 = labManager0.getStaffID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FORFEITED" + "'", str3.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand11 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        java.lang.String str12 = reservation8.toString();
        boolean boolean13 = reservation8.isExtended();
        reservation8.setUserID("hi!");
        boolean boolean16 = reservation8.isExtended();
        reservation8.setDepositForfeited(true);
        boolean boolean19 = reservation8.isDepositForfeited();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str12.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        model.Guest guest12 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str13 = guest12.getDepartment();
        guest12.setPassword("hi!");
        model.Student student16 = new model.Student();
        model.LabManager labManager17 = new model.LabManager();
        model.Researcher researcher25 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher25.setUserID("");
        model.Student student35 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher43 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest51 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str52 = guest51.getDepartment();
        model.User[] userArray53 = new model.User[] { guest12, student16, labManager17, researcher25, student35, researcher43, guest51 };
        java.util.ArrayList<model.User> userList54 = new java.util.ArrayList<model.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<model.User>) userList54, userArray53);
        pattern.observer.UserNotificationObserver userNotificationObserver56 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList54);
        equipmentContext2.removeObserver((pattern.observer.EquipmentObserver) userNotificationObserver56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        boolean boolean14 = reservation8.isExtended();
        reservation8.setEquipmentID("");
        java.lang.String str17 = reservation8.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setEquipmentID("");
        java.lang.String str3 = equipment0.getName();
        equipment0.setType("null - Room null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.setPaymentMethod("");
        reservation8.setStartTime("hi!");
        reservation8.setDepositAmount(100.0d);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand15 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        // The following exception was thrown during execution in test generation
        try {
            forfeitDepositCommand15.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"pattern.command.ReservationService.forfeitDeposit(model.Reservation)\" because \"this.reservationService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getType();
        equipment0.setStatus("AVAILABLE");
        equipment0.setBuildingName("Booking []  | hi! to  | FORFEITED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext2.markUnderMaintenance();
        java.lang.String str4 = equipmentContext2.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand9 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        java.lang.String str10 = reservation8.getStatus();
        reservation8.setBookingID("User [null, null, null, FORFEITED, null]");
        reservation8.setEndTime("HeadLabCoordinator [C001] Coordinator Carol");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "CONFIRMED" + "'", str10.equals("CONFIRMED"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        java.lang.String str14 = reservation8.getStatus();
        reservation8.forfeitDeposit();
        java.lang.String str16 = reservation8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "FORFEITED" + "'", str14.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str16.equals("Booking []  | hi! to  | FORFEITED"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        java.lang.String str4 = equipmentContext2.getEquipmentID();
        model.Guest guest12 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str13 = guest12.getDepartment();
        guest12.setPassword("hi!");
        model.Student student16 = new model.Student();
        model.LabManager labManager17 = new model.LabManager();
        model.Researcher researcher25 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher25.setUserID("");
        model.Student student35 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher43 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest51 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str52 = guest51.getDepartment();
        model.User[] userArray53 = new model.User[] { guest12, student16, labManager17, researcher25, student35, researcher43, guest51 };
        java.util.ArrayList<model.User> userList54 = new java.util.ArrayList<model.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<model.User>) userList54, userArray53);
        pattern.observer.UserNotificationObserver userNotificationObserver56 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList54);
        java.lang.String str57 = userNotificationObserver56.getNotificationLog();
        equipmentContext2.removeObserver((pattern.observer.EquipmentObserver) userNotificationObserver56);
        equipmentContext2.disable();
        equipmentContext2.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        pattern.strategy.GrantPayment grantPayment0 = new pattern.strategy.GrantPayment();
        model.PaymentTransaction paymentTransaction1 = new model.PaymentTransaction();
        boolean boolean2 = grantPayment0.pay(paymentTransaction1);
        model.PaymentTransaction paymentTransaction7 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction7.setPaymentMethod("");
        paymentTransaction7.setTotalAmount((double) (byte) 0);
        boolean boolean12 = grantPayment0.pay(paymentTransaction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        guest7.setPassword("hi!");
        model.Student student11 = new model.Student();
        model.LabManager labManager12 = new model.LabManager();
        model.Researcher researcher20 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher20.setUserID("");
        model.Student student30 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher38 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest46 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str47 = guest46.getDepartment();
        model.User[] userArray48 = new model.User[] { guest7, student11, labManager12, researcher20, student30, researcher38, guest46 };
        java.util.ArrayList<model.User> userList49 = new java.util.ArrayList<model.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.User>) userList49, userArray48);
        pattern.observer.UserNotificationObserver userNotificationObserver51 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList49);
        java.lang.String str52 = userNotificationObserver51.getNotificationLog();
        java.lang.String str53 = userNotificationObserver51.getNotificationLog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        guest7.setPassword("hi!");
        java.lang.String str11 = guest7.toString();
        java.lang.String str12 = guest7.getName();
        java.lang.String str13 = guest7.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [, , , GUEST, ]" + "'", str11.equals("User [, , , GUEST, ]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getName();
        java.lang.String str2 = headLabCoordinatorSingleton0.getDepartment();
        java.lang.String str3 = headLabCoordinatorSingleton0.getDepartment();
        java.lang.String str4 = headLabCoordinatorSingleton0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Coordinator Carol" + "'", str1.equals("Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Administration" + "'", str2.equals("Administration"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Administration" + "'", str3.equals("Administration"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coordinator Carol" + "'", str4.equals("Coordinator Carol"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        model.Researcher researcher7 = new model.Researcher("User [, , , GUEST, ]", "SUCCESS", "", "GUEST", "hi!", "", "User [, , , GUEST, ]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        model.Student student7 = new model.Student("", "", "", "", "", "", "");
        double double8 = student7.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        model.Faculty faculty7 = new model.Faculty("C001", "HeadLabCoordinator [C001] Coordinator Carol", "Coordinator Carol", "User [, , , GUEST, ]", "Coordinator Carol", "coord@yorku.ca", "User [null, null, null, FORFEITED, null]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        pattern.command.ReservationService reservationService15 = null;
        model.Reservation reservation23 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand24 = new pattern.command.ForfeitDepositCommand(reservationService15, reservation23);
        reservation23.setStartTime("FORFEITED");
        reservation23.setStatus("User [null, null, null, FORFEITED, null]");
        pattern.command.ModifyCommand modifyCommand31 = new pattern.command.ModifyCommand(reservationService0, reservation23, "Administration", "coord@yorku.ca");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        java.lang.String str9 = guest7.getStatus();
        guest7.setName("");
        guest7.setUserType("Administration");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        guest7.setUserType("hi!");
        guest7.setPassword("User [null, null, null, FORFEITED, null]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        model.LabLocation labLocation2 = new model.LabLocation("hi!", "null - Room null");
        java.lang.String str3 = labLocation2.getRoomNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null - Room null" + "'", str3.equals("null - Room null"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getEmail();
        guest7.setCertificationNumber("Booking []  | hi! to  | FORFEITED,null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        model.LabManager labManager6 = new model.LabManager("null - null [null] @ null null", "null - Room null", "hi!", "coord@yorku.ca", "Booking []  | hi! to  | FORFEITED,null", "coord@yorku.ca");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        model.HeadLabCoordinator headLabCoordinator5 = new model.HeadLabCoordinator("coord@yorku.ca", "User [null, null, null, FORFEITED, null]", "null - Room null", "FORFEITED", "");
        double double6 = headLabCoordinator5.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        model.HeadLabCoordinator headLabCoordinator0 = new model.HeadLabCoordinator();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand9 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        java.lang.String str10 = reservation8.getStatus();
        reservation8.setBookingID("User [null, null, null, FORFEITED, null]");
        reservation8.setBookingID("Coordinator Carol");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "CONFIRMED" + "'", str10.equals("CONFIRMED"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        pattern.strategy.DebitPayment debitPayment0 = new pattern.strategy.DebitPayment();
        model.PaymentTransaction paymentTransaction5 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        boolean boolean6 = debitPayment0.pay(paymentTransaction5);
        paymentTransaction5.setTransactionID("FORFEITED");
        java.lang.String str9 = paymentTransaction5.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        pattern.strategy.DebitPayment debitPayment0 = new pattern.strategy.DebitPayment();
        pattern.strategy.PaymentProcessor paymentProcessor1 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) debitPayment0);
        model.PaymentTransaction paymentTransaction6 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction6.setPaymentMethod("");
        paymentTransaction6.setBookingID("hi!");
        boolean boolean11 = debitPayment0.pay(paymentTransaction6);
        paymentTransaction6.setPaymentStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        java.lang.String str4 = equipment0.getType();
        equipment0.setDescription("null - null [null] @ null null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CONFIRMED" + "'", str4.equals("CONFIRMED"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        model.Reservation reservation22 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation22.setPaymentMethod("");
        reservationService0.reserve(reservation22);
        model.Reservation reservation33 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation33.forfeitDeposit();
        reservationService0.reserve(reservation33);
        reservation33.setEndTime("null,null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        guest7.setCertificationNumber("Booking []  | hi! to  | FORFEITED");
        guest7.setStaffID("");
        java.lang.String str12 = guest7.getDepartment();
        java.lang.String str13 = guest7.getCertificationNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str13.equals("Booking []  | hi! to  | FORFEITED"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getName();
        java.lang.String str2 = headLabCoordinatorSingleton0.getDepartment();
        java.lang.String str3 = headLabCoordinatorSingleton0.toString();
        java.lang.String str4 = headLabCoordinatorSingleton0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Coordinator Carol" + "'", str1.equals("Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Administration" + "'", str2.equals("Administration"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "HeadLabCoordinator [C001] Coordinator Carol" + "'", str3.equals("HeadLabCoordinator [C001] Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "HeadLabCoordinator [C001] Coordinator Carol" + "'", str4.equals("HeadLabCoordinator [C001] Coordinator Carol"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        model.HeadLabCoordinator headLabCoordinator5 = new model.HeadLabCoordinator("coord@yorku.ca", "User [null, null, null, FORFEITED, null]", "null - Room null", "FORFEITED", "");
        model.LabManager labManager11 = headLabCoordinator5.generateManagerAccount("Booking []  | hi! to  | FORFEITED - Room null", "Booking []  | hi! to  | FORFEITED", "SUCCESS", "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "Administration");
        java.lang.String str12 = labManager11.getManagerID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(labManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str12.equals("Booking []  | hi! to  | FORFEITED - Room null"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        model.LabLocation labLocation0 = new model.LabLocation();
        labLocation0.setBuildingName("Booking []  | hi! to  | FORFEITED");
        java.lang.String str3 = labLocation0.getLocationDetails();
        labLocation0.setRoomNumber("Booking []  | hi! to  | FORFEITED,null");
        java.lang.String str6 = labLocation0.getBuildingName();
        java.lang.String str7 = labLocation0.getRoomNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str3.equals("Booking []  | hi! to  | FORFEITED - Room null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str6.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Booking []  | hi! to  | FORFEITED,null" + "'", str7.equals("Booking []  | hi! to  | FORFEITED,null"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        model.Faculty faculty7 = new model.Faculty("User [hi!, , , RESEARCHER, hi!]", "Booking []  | hi! to  | FORFEITED - Room null", "User [null, null, null, FORFEITED, null]", "C001", "Coordinator Carol", "Administration", "Administration");
        java.lang.String str8 = faculty7.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FACULTY" + "'", str8.equals("FACULTY"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation7.setPaymentMethod("");
        reservation7.setStartTime("hi!");
        reservation7.forfeitDeposit();
        java.lang.String str13 = reservation7.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "FORFEITED" + "'", str13.equals("FORFEITED"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        model.Reservation reservation22 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation22.setPaymentMethod("");
        reservationService0.reserve(reservation22);
        model.Reservation reservation33 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation33.forfeitDeposit();
        reservationService0.reserve(reservation33);
        model.Reservation reservation36 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationService0.modify(reservation36, "HeadLabCoordinator [C001] Coordinator Carol", "HeadLabCoordinator [C001] Coordinator Carol");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Reservation.setStartTime(String)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        java.lang.String str1 = paymentTransaction0.getPaymentStatus();
        paymentTransaction0.setTotalAmount((double) 10L);
        paymentTransaction0.setTotalAmount((double) (-1));
        paymentTransaction0.setTransactionID("SUCCESS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        model.LabManager labManager6 = new model.LabManager("null - null [null] @ null null", "hi!", "SUCCESS", "null,null", "", "Coordinator Carol");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        model.Deposit deposit0 = new model.Deposit();
        deposit0.setForfeited(false);
        boolean boolean3 = deposit0.isDeductedFromTotal();
        deposit0.setAmount((double) ' ');
        deposit0.forfeit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        guest7.setPassword("hi!");
        double double11 = guest7.getFeeRate();
        java.lang.String str12 = guest7.getCertificationNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        pattern.singleton.BookingSystem bookingSystem0 = pattern.singleton.BookingSystem.getInstance();
        java.util.List<model.Reservation> reservationList1 = bookingSystem0.getReservations();
        model.Reservation reservation2 = new model.Reservation();
        java.lang.String str3 = reservation2.getEndTime();
        bookingSystem0.addBooking(reservation2);
        java.lang.String str5 = reservation2.getEquipmentID();
        reservation2.setUserID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingSystem0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        model.HeadLabCoordinator headLabCoordinator5 = new model.HeadLabCoordinator("coord@yorku.ca", "", "HeadLabCoordinator [C001] Coordinator Carol", "coord@yorku.ca", "GUEST");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation7.forfeitDeposit();
        reservation7.setUserID("null,null");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        model.LabLocation labLocation0 = new model.LabLocation();
        labLocation0.setBuildingName("Booking []  | hi! to  | FORFEITED");
        java.lang.String str3 = labLocation0.toString();
        java.lang.String str4 = labLocation0.getLocationDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Booking []  | hi! to  | FORFEITED,null" + "'", str3.equals("Booking []  | hi! to  | FORFEITED,null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str4.equals("Booking []  | hi! to  | FORFEITED - Room null"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        java.lang.String str14 = reservation8.getStatus();
        reservation8.forfeitDeposit();
        java.lang.String str16 = reservation8.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "FORFEITED" + "'", str14.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        equipmentContext2.notifyObservers("FORFEITED", "");
        java.lang.String str8 = equipmentContext2.getStatusString();
        pattern.state.EquipmentContext equipmentContext11 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext11.markUnderMaintenance();
        pattern.state.EquipmentState equipmentState13 = equipmentContext11.getCurrentState();
        equipmentContext2.setState(equipmentState13);
        java.lang.String str15 = equipmentContext2.getStatusString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "MAINTENANCE" + "'", str15.equals("MAINTENANCE"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        model.Faculty faculty7 = new model.Faculty("FORFEITED", "Booking []  | hi! to  | FORFEITED,null", "AVAILABLE", "CONFIRMED", "hi!", "Booking []  | hi! to  | FORFEITED,null", "FORFEITED");
        java.lang.String str8 = faculty7.toString();
        double double9 = faculty7.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]" + "'", str8.equals("User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        pattern.command.ReservationService reservationService15 = null;
        model.Reservation reservation23 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation23.forfeitDeposit();
        double double25 = reservation23.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand26 = new pattern.command.ForfeitDepositCommand(reservationService15, reservation23);
        pattern.command.CancelCommand cancelCommand27 = new pattern.command.CancelCommand(reservationService0, reservation23);
        model.Reservation reservation35 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation35.setPaymentMethod("");
        reservation35.setStartTime("hi!");
        reservation35.forfeitDeposit();
        reservation35.setExtended(true);
        boolean boolean43 = reservation35.isDepositForfeited();
        pattern.command.ModifyCommand modifyCommand46 = new pattern.command.ModifyCommand(reservationService0, reservation35, "C001", "FACULTY");
        reservation35.setDepositForfeited(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        equipmentContext2.notifyObservers("FORFEITED", "");
        java.lang.String str8 = equipmentContext2.getStatusString();
        pattern.state.EquipmentContext equipmentContext11 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext11.markUnderMaintenance();
        pattern.state.EquipmentState equipmentState13 = equipmentContext11.getCurrentState();
        equipmentContext2.setState(equipmentState13);
        equipmentContext2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        model.LabLocation labLocation0 = new model.LabLocation();
        labLocation0.setBuildingName("Booking []  | hi! to  | FORFEITED");
        java.lang.String str3 = labLocation0.getLocationDetails();
        labLocation0.setRoomNumber("Booking []  | hi! to  | FORFEITED,null");
        java.lang.String str6 = labLocation0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str3.equals("Booking []  | hi! to  | FORFEITED - Room null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Booking []  | hi! to  | FORFEITED,Booking []  | hi! to  | FORFEITED,null" + "'", str6.equals("Booking []  | hi! to  | FORFEITED,Booking []  | hi! to  | FORFEITED,null"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        java.lang.String str4 = equipmentContext2.getStatusString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        model.LabLocation labLocation2 = new model.LabLocation("coord@yorku.ca", "MAINTENANCE");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        model.Student student7 = new model.Student("null,null", "CONFIRMED", "FORFEITED", "FORFEITED", "", "", "User [, , , GUEST, ]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        pattern.strategy.InstitutionalPayment institutionalPayment0 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction5 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction5.setPaymentMethod("");
        java.lang.String str8 = paymentTransaction5.getBookingID();
        boolean boolean9 = institutionalPayment0.pay(paymentTransaction5);
        model.PaymentTransaction paymentTransaction10 = new model.PaymentTransaction();
        java.lang.String str11 = paymentTransaction10.getPaymentStatus();
        paymentTransaction10.setTotalAmount((double) 10L);
        boolean boolean14 = institutionalPayment0.pay(paymentTransaction10);
        model.PaymentTransaction paymentTransaction15 = new model.PaymentTransaction();
        java.lang.String str16 = paymentTransaction15.getPaymentStatus();
        paymentTransaction15.setTotalAmount((double) 10L);
        boolean boolean19 = institutionalPayment0.pay(paymentTransaction15);
        pattern.strategy.PaymentProcessor paymentProcessor20 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) institutionalPayment0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setName("hi!");
        java.lang.String str4 = equipment0.getBuildingName();
        equipment0.setBuildingName("FACULTY");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        guest7.setPassword("hi!");
        java.lang.String str11 = guest7.toString();
        java.lang.String str12 = guest7.getName();
        guest7.setStaffID("Booking []  | hi! to  | FORFEITED - Room null");
        double double15 = guest7.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [, , , GUEST, ]" + "'", str11.equals("User [, , , GUEST, ]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getType();
        equipment0.setEquipmentID("Booking []  | hi! to  | FORFEITED,null");
        equipment0.setDescription("Coordinator Carol");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        java.lang.String str5 = paymentTransaction4.getBookingID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setName("hi!");
        java.lang.String str4 = equipment0.getBuildingName();
        java.lang.String str5 = equipment0.getRoomNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        model.Student student0 = new model.Student();
        double double1 = student0.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        pattern.singleton.BookingSystem bookingSystem0 = pattern.singleton.BookingSystem.getInstance();
        java.util.List<model.Reservation> reservationList1 = bookingSystem0.getReservations();
        model.Reservation reservation2 = new model.Reservation();
        java.lang.String str3 = reservation2.getEndTime();
        bookingSystem0.addBooking(reservation2);
        java.lang.String str5 = reservation2.getEquipmentID();
        reservation2.setUserID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingSystem0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getType();
        java.lang.String str4 = equipment0.getStatus();
        equipment0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getName();
        java.lang.String str2 = headLabCoordinatorSingleton0.getDepartment();
        java.lang.String str3 = headLabCoordinatorSingleton0.getDepartment();
        java.lang.String str4 = headLabCoordinatorSingleton0.getCoordinatorID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Coordinator Carol" + "'", str1.equals("Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Administration" + "'", str2.equals("Administration"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Administration" + "'", str3.equals("Administration"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "C001" + "'", str4.equals("C001"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        model.Equipment equipment0 = new model.Equipment();
        equipment0.setEquipmentID("");
        java.lang.String str3 = equipment0.getName();
        equipment0.setStatus("User [hi!, , , RESEARCHER, hi!]");
        equipment0.setBuildingName("C001");
        equipment0.setRoomNumber("Booking []  | hi! to  | FORFEITED,null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        model.Deposit deposit0 = new model.Deposit();
        deposit0.setDeductedFromTotal(false);
        double double3 = deposit0.getAmount();
        boolean boolean4 = deposit0.isDeductedFromTotal();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        java.lang.String str8 = reservation7.getBookingID();
        java.lang.String str9 = reservation7.getUserID();
        reservation7.setEquipmentID("CONFIRMED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getEmail();
        java.lang.String str9 = guest7.getCertificationNumber();
        guest7.setUserType("CONFIRMED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand14 = new pattern.command.ModifyCommand(reservationService1, reservation9, "", "");
        java.lang.String str15 = reservation9.getStatus();
        reservation9.forfeitDeposit();
        reservationService0.modify(reservation9, "SUCCESS", "User [, , , GUEST, ]");
        pattern.command.ReservationService reservationService20 = null;
        model.Reservation reservation28 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation28.forfeitDeposit();
        double double30 = reservation28.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand33 = new pattern.command.ModifyCommand(reservationService20, reservation28, "", "");
        reservation28.setStatus("hi!");
        reservationService0.cancel(reservation28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FORFEITED" + "'", str15.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        model.Deposit deposit0 = new model.Deposit();
        boolean boolean1 = deposit0.isForfeited();
        double double2 = deposit0.getAmount();
        deposit0.setForfeited(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        model.Faculty faculty7 = new model.Faculty("FORFEITED", "Booking []  | hi! to  | FORFEITED,null", "AVAILABLE", "CONFIRMED", "hi!", "Booking []  | hi! to  | FORFEITED,null", "FORFEITED");
        java.lang.String str8 = faculty7.getStaffID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        model.HeadLabCoordinator headLabCoordinator5 = new model.HeadLabCoordinator("hi!", "CONFIRMED", "hi!", "hi!", "Booking []  | hi! to  | FORFEITED - Room null");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        model.Deposit deposit0 = new model.Deposit();
        boolean boolean1 = deposit0.isForfeited();
        deposit0.forfeit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getDescription();
        equipment0.setRoomNumber("GUEST");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getType();
        equipment0.setType("SUCCESS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand14 = new pattern.command.ModifyCommand(reservationService1, reservation9, "", "");
        java.lang.String str15 = reservation9.getStatus();
        reservation9.forfeitDeposit();
        reservationService0.modify(reservation9, "SUCCESS", "User [, , , GUEST, ]");
        model.Reservation reservation27 = new model.Reservation("User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "HeadLabCoordinator [C001] Coordinator Carol", "C001", "CONFIRMED", "User [, , , GUEST, ]", "User [, , , GUEST, ]", 20.0d);
        reservation27.setStartTime("User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]");
        reservationService0.extend(reservation27, "Booking []  | hi! to  | FORFEITED,null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FORFEITED" + "'", str15.equals("FORFEITED"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation7.setPaymentMethod("");
        reservation7.setStartTime("hi!");
        java.lang.String str12 = reservation7.getEndTime();
        reservation7.setStatus("null - null [null] @ null null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        equipmentContext2.notifyObservers("FORFEITED", "");
        java.lang.String str8 = equipmentContext2.getStatusString();
        pattern.state.EquipmentContext equipmentContext11 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext11.markUnderMaintenance();
        pattern.state.EquipmentState equipmentState13 = equipmentContext11.getCurrentState();
        equipmentContext2.setState(equipmentState13);
        pattern.state.EquipmentState equipmentState15 = equipmentContext2.getCurrentState();
        equipmentContext2.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        equipment0.setDescription("Booking []  | hi! to  | FORFEITED");
        java.lang.String str6 = equipment0.toString();
        model.LabLocation labLocation7 = equipment0.getLabLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null - null [null] @ null null" + "'", str6.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(labLocation7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getName();
        java.lang.String str2 = headLabCoordinatorSingleton0.getDepartment();
        model.LabManager labManager8 = headLabCoordinatorSingleton0.generateManagerAccount("hi!", "null - null [null] @ null null", "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "", "GUEST");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Coordinator Carol" + "'", str1.equals("Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Administration" + "'", str2.equals("Administration"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("Booking []  | hi! to  | FORFEITED", "");
        equipmentContext2.markUnderMaintenance();
        equipmentContext2.markUnderMaintenance();
        java.lang.String str5 = equipmentContext2.getEquipmentID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str5.equals("Booking []  | hi! to  | FORFEITED"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setName("hi!");
        java.lang.String str4 = equipment0.getBuildingName();
        java.lang.String str5 = equipment0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        double double14 = reservation8.getDepositAmount();
        java.lang.String str15 = reservation8.getStartTime();
        reservation8.setEndTime("Coordinator Carol");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        boolean boolean2 = equipment0.isAvailable();
        java.lang.String str3 = equipment0.toString();
        java.lang.String str4 = equipment0.toString();
        java.lang.String str5 = equipment0.toString();
        java.lang.String str6 = equipment0.getStatus();
        equipment0.setStatus("User [hi!, , , RESEARCHER, hi!]");
        equipment0.setStatus("Administration");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null - null [null] @ null null" + "'", str3.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null - null [null] @ null null" + "'", str4.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null - null [null] @ null null" + "'", str5.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        pattern.command.ReservationService reservationService15 = null;
        model.Reservation reservation23 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation23.forfeitDeposit();
        double double25 = reservation23.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand26 = new pattern.command.ForfeitDepositCommand(reservationService15, reservation23);
        boolean boolean27 = reservation23.isExtended();
        reservation23.cancel();
        java.lang.String str29 = reservation23.getEndTime();
        reservationService0.extend(reservation23, "MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        model.LabManager labManager0 = new model.LabManager();
        labManager0.setManagerID("");
        java.lang.String str3 = labManager0.getManagerID();
        double double4 = labManager0.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        java.lang.String str5 = paymentTransaction4.getTransactionID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        model.Researcher researcher7 = new model.Researcher("User [null, null, null, FORFEITED, null]", "null,null", "FORFEITED", "HeadLabCoordinator [C001] Coordinator Carol", "User [, , , GUEST, ]", "AVAILABLE", "User [, , , GUEST, ]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        java.lang.String str9 = guest7.getStatus();
        guest7.setName("");
        java.lang.String str12 = guest7.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        model.LabLocation labLocation0 = new model.LabLocation();
        labLocation0.setBuildingName("Booking []  | hi! to  | FORFEITED");
        java.lang.String str3 = labLocation0.getLocationDetails();
        labLocation0.setRoomNumber("Booking []  | hi! to  | FORFEITED,null");
        java.lang.String str6 = labLocation0.getBuildingName();
        java.lang.String str7 = labLocation0.getLocationDetails();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str3.equals("Booking []  | hi! to  | FORFEITED - Room null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str6.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room Booking []  | hi! to  | FORFEITED,null" + "'", str7.equals("Booking []  | hi! to  | FORFEITED - Room Booking []  | hi! to  | FORFEITED,null"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        model.LabLocation labLocation2 = new model.LabLocation("User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        equipmentContext2.notifyObservers("FORFEITED", "");
        java.lang.String str8 = equipmentContext2.getStatusString();
        pattern.state.EquipmentContext equipmentContext11 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext11.markUnderMaintenance();
        pattern.state.EquipmentState equipmentState13 = equipmentContext11.getCurrentState();
        equipmentContext2.setState(equipmentState13);
        equipmentContext2.markUnderMaintenance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        java.lang.String str14 = reservation8.getStatus();
        java.lang.String str15 = reservation8.getEquipmentID();
        double double16 = reservation8.getDepositAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "FORFEITED" + "'", str14.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        java.lang.String str1 = paymentTransaction0.getPaymentStatus();
        double double2 = paymentTransaction0.getTotalAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        model.Reservation reservation7 = new model.Reservation("Booking []  | hi! to  | FORFEITED", "FACULTY", "null - null [null] @ null null", "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "HeadLabCoordinator [C001] Coordinator Carol", "Booking []  | hi! to  | FORFEITED,null", (double) (byte) 10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        model.Reservation reservation22 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation22.setPaymentMethod("");
        reservationService0.reserve(reservation22);
        pattern.command.ReservationService reservationService26 = null;
        model.Reservation reservation34 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation34.forfeitDeposit();
        double double36 = reservation34.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand37 = new pattern.command.ForfeitDepositCommand(reservationService26, reservation34);
        boolean boolean38 = reservation34.isExtended();
        reservationService0.extend(reservation34, "Administration");
        pattern.command.ReservationService reservationService41 = new pattern.command.ReservationService();
        model.Reservation reservation49 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation49.setPaymentMethod("");
        reservation49.setStartTime("hi!");
        reservation49.forfeitDeposit();
        reservation49.setExtended(true);
        reservation49.forfeitDeposit();
        reservationService41.cancel(reservation49);
        reservationService0.forfeitDeposit(reservation49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        pattern.strategy.InstitutionalPayment institutionalPayment0 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction5 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction5.setPaymentMethod("");
        java.lang.String str8 = paymentTransaction5.getBookingID();
        boolean boolean9 = institutionalPayment0.pay(paymentTransaction5);
        model.PaymentTransaction paymentTransaction10 = new model.PaymentTransaction();
        java.lang.String str11 = paymentTransaction10.getPaymentStatus();
        paymentTransaction10.setTotalAmount((double) 10L);
        boolean boolean14 = institutionalPayment0.pay(paymentTransaction10);
        model.PaymentTransaction paymentTransaction15 = new model.PaymentTransaction();
        java.lang.String str16 = paymentTransaction15.getPaymentStatus();
        paymentTransaction15.setTotalAmount((double) 10L);
        boolean boolean19 = institutionalPayment0.pay(paymentTransaction15);
        model.PaymentTransaction paymentTransaction24 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction24.setPaymentMethod("");
        paymentTransaction24.setTotalAmount((double) (byte) 0);
        paymentTransaction24.setTransactionID("");
        boolean boolean31 = institutionalPayment0.pay(paymentTransaction24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        model.Student student0 = new model.Student();
        java.lang.String str1 = student0.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("coord@yorku.ca", "GUEST");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        guest7.setPassword("hi!");
        model.Student student11 = new model.Student();
        model.LabManager labManager12 = new model.LabManager();
        model.Researcher researcher20 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher20.setUserID("");
        model.Student student30 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher38 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest46 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str47 = guest46.getDepartment();
        model.User[] userArray48 = new model.User[] { guest7, student11, labManager12, researcher20, student30, researcher38, guest46 };
        java.util.ArrayList<model.User> userList49 = new java.util.ArrayList<model.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.User>) userList49, userArray48);
        pattern.observer.UserNotificationObserver userNotificationObserver51 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList49);
        pattern.observer.UserNotificationObserver userNotificationObserver52 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList49);
        pattern.observer.UserNotificationObserver userNotificationObserver53 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        java.lang.String str9 = guest7.getStatus();
        guest7.setName("");
        java.lang.String str12 = guest7.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "GUEST" + "'", str12.equals("GUEST"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        model.Faculty faculty0 = new model.Faculty();
        faculty0.setName("User [hi!, , , RESEARCHER, hi!]");
        java.lang.String str3 = faculty0.getDepartment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        model.Reservation reservation7 = new model.Reservation("Administration", "Booking []  | hi! to  | FORFEITED", "Coordinator Carol", "Booking []  | hi! to  | FORFEITED,Booking []  | hi! to  | FORFEITED,null", "User [hi!, , , RESEARCHER, hi!]", "User [, , , GUEST, ]", (double) 0.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getBuildingName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        equipment0.setDescription("Booking []  | hi! to  | FORFEITED");
        equipment0.setRoomNumber("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        pattern.strategy.DebitPayment debitPayment0 = new pattern.strategy.DebitPayment();
        pattern.strategy.PaymentProcessor paymentProcessor1 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) debitPayment0);
        pattern.strategy.DebitPayment debitPayment2 = new pattern.strategy.DebitPayment();
        model.PaymentTransaction paymentTransaction7 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        boolean boolean8 = debitPayment2.pay(paymentTransaction7);
        boolean boolean9 = paymentProcessor1.processPayment(paymentTransaction7);
        pattern.strategy.DebitPayment debitPayment10 = new pattern.strategy.DebitPayment();
        pattern.strategy.PaymentProcessor paymentProcessor11 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) debitPayment10);
        pattern.strategy.DebitPayment debitPayment12 = new pattern.strategy.DebitPayment();
        model.PaymentTransaction paymentTransaction17 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        boolean boolean18 = debitPayment12.pay(paymentTransaction17);
        boolean boolean19 = paymentProcessor11.processPayment(paymentTransaction17);
        boolean boolean20 = paymentProcessor1.processPayment(paymentTransaction17);
        model.PaymentTransaction paymentTransaction25 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction25.setPaymentStatus("");
        boolean boolean28 = paymentProcessor1.processPayment(paymentTransaction25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        boolean boolean2 = equipment0.isAvailable();
        equipment0.setBuildingName("CONFIRMED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand11 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation8);
        java.lang.String str12 = reservation8.toString();
        boolean boolean13 = reservation8.isExtended();
        double double14 = reservation8.getDepositAmount();
        java.lang.String str15 = reservation8.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str12.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        model.PaymentTransaction paymentTransaction4 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction4.setPaymentMethod("");
        paymentTransaction4.setTotalAmount((double) (byte) 0);
        paymentTransaction4.setPaymentMethod("FORFEITED");
        java.lang.String str11 = paymentTransaction4.getTransactionID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        equipmentContext2.notifyObservers("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        model.Reservation reservation22 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation22.setPaymentMethod("");
        reservationService0.reserve(reservation22);
        model.Reservation reservation33 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation33.forfeitDeposit();
        reservationService0.reserve(reservation33);
        pattern.command.ReservationService reservationService36 = null;
        model.Reservation reservation44 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation44.forfeitDeposit();
        double double46 = reservation44.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand47 = new pattern.command.ForfeitDepositCommand(reservationService36, reservation44);
        java.lang.String str48 = reservation44.toString();
        boolean boolean49 = reservation44.isExtended();
        reservation44.setUserID("hi!");
        boolean boolean52 = reservation44.isExtended();
        reservation44.setDepositForfeited(true);
        reservation44.extend("GUEST");
        pattern.command.CancelCommand cancelCommand57 = new pattern.command.CancelCommand(reservationService0, reservation44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str48.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        model.Researcher researcher7 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher7.setEmail("");
        java.lang.String str10 = researcher7.getStatus();
        java.lang.String str11 = researcher7.toString();
        double double12 = researcher7.getFeeRate();
        java.lang.String str13 = researcher7.getUserID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User [hi!, , , RESEARCHER, hi!]" + "'", str11.equals("User [hi!, , , RESEARCHER, hi!]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        pattern.strategy.CreditCardPayment creditCardPayment0 = new pattern.strategy.CreditCardPayment();
        pattern.strategy.InstitutionalPayment institutionalPayment1 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction6 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction6.setPaymentMethod("");
        java.lang.String str9 = paymentTransaction6.getBookingID();
        boolean boolean10 = institutionalPayment1.pay(paymentTransaction6);
        boolean boolean11 = creditCardPayment0.pay(paymentTransaction6);
        pattern.strategy.InstitutionalPayment institutionalPayment12 = new pattern.strategy.InstitutionalPayment();
        pattern.strategy.PaymentProcessor paymentProcessor13 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) institutionalPayment12);
        model.PaymentTransaction paymentTransaction18 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction18.setPaymentMethod("");
        java.lang.String str21 = paymentTransaction18.getBookingID();
        boolean boolean22 = paymentProcessor13.processPayment(paymentTransaction18);
        boolean boolean23 = creditCardPayment0.pay(paymentTransaction18);
        model.PaymentTransaction paymentTransaction24 = new model.PaymentTransaction();
        java.lang.String str25 = paymentTransaction24.getPaymentStatus();
        paymentTransaction24.setTotalAmount((double) 10L);
        paymentTransaction24.setPaymentStatus("hi!");
        boolean boolean30 = creditCardPayment0.pay(paymentTransaction24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        model.Faculty faculty7 = new model.Faculty("null - null [null] @ null null", "null - null [null] @ null null", "null - null [null] @ null null", "Booking []  | hi! to  | FORFEITED", "Booking []  | hi! to  | FORFEITED", "Booking []  | hi! to  | FORFEITED", "FORFEITED");
        faculty7.setDepartment("Coordinator Carol");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("C001", "User [, , , GUEST, ]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        model.Reservation reservation22 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        java.lang.String str23 = reservation22.getBookingID();
        reservation22.setUserID("AVAILABLE");
        java.lang.String str26 = reservation22.getBookingID();
        pattern.command.ModifyCommand modifyCommand29 = new pattern.command.ModifyCommand(reservationService0, reservation22, "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "Booking []  | hi! to  | FORFEITED - Room null");
        pattern.command.ReservationService reservationService30 = null;
        pattern.command.ReservationService reservationService31 = null;
        model.Reservation reservation39 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand40 = new pattern.command.ForfeitDepositCommand(reservationService31, reservation39);
        reservation39.setStartTime("FORFEITED");
        reservation39.setDepositAmount((double) 10.0f);
        pattern.command.CancelCommand cancelCommand45 = new pattern.command.CancelCommand(reservationService30, reservation39);
        reservationService0.cancel(reservation39);
        model.Reservation reservation54 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation54.forfeitDeposit();
        reservation54.extend("FORFEITED");
        reservationService0.cancel(reservation54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        equipment0.setDescription("Booking []  | hi! to  | FORFEITED");
        java.lang.String str6 = equipment0.toString();
        java.lang.String str7 = equipment0.getName();
        model.LabLocation labLocation8 = equipment0.getLabLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null - null [null] @ null null" + "'", str6.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(labLocation8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        pattern.strategy.InstitutionalPayment institutionalPayment0 = new pattern.strategy.InstitutionalPayment();
        pattern.strategy.PaymentProcessor paymentProcessor1 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) institutionalPayment0);
        model.PaymentTransaction paymentTransaction6 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction6.setPaymentMethod("");
        java.lang.String str9 = paymentTransaction6.getBookingID();
        boolean boolean10 = paymentProcessor1.processPayment(paymentTransaction6);
        pattern.strategy.InstitutionalPayment institutionalPayment11 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction16 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction16.setPaymentMethod("");
        java.lang.String str19 = paymentTransaction16.getBookingID();
        boolean boolean20 = institutionalPayment11.pay(paymentTransaction16);
        paymentProcessor1.setPaymentStrategy((pattern.strategy.PaymentStrategy) institutionalPayment11);
        model.PaymentTransaction paymentTransaction26 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction26.setPaymentMethod("");
        java.lang.String str29 = paymentTransaction26.getBookingID();
        boolean boolean30 = institutionalPayment11.pay(paymentTransaction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = guest7.getDepartment();
        guest7.setPassword("hi!");
        double double11 = guest7.getFeeRate();
        java.lang.String str12 = guest7.getUserType();
        java.lang.String str13 = guest7.getUserID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "GUEST" + "'", str12.equals("GUEST"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation7.setPaymentMethod("");
        reservation7.setDepositForfeited(true);
        reservation7.extend("User [hi!, , , RESEARCHER, hi!]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        model.Student student7 = new model.Student("Coordinator Carol", "Booking []  | hi! to  | FORFEITED - Room null", "", "null - Room null", "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "Booking []  | hi! to  | FORFEITED", "User [hi!, , , RESEARCHER, hi!]");
        student7.setDepartment("SUCCESS");
        java.lang.String str10 = student7.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Booking []  | hi! to  | FORFEITED - Room null" + "'", str10.equals("Booking []  | hi! to  | FORFEITED - Room null"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        model.Deposit deposit0 = new model.Deposit();
        deposit0.setDeductedFromTotal(false);
        deposit0.setDeductedFromTotal(false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        model.Guest guest7 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        guest7.setCertificationNumber("Booking []  | hi! to  | FORFEITED");
        guest7.setStaffID("");
        java.lang.String str12 = guest7.getName();
        guest7.setName("SUCCESS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        pattern.command.ReservationService reservationService0 = null;
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        java.lang.String str13 = reservation9.toString();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand14 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation9);
        java.lang.String str15 = reservation9.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str13.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FORFEITED" + "'", str15.equals("FORFEITED"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        java.lang.String str14 = reservation8.getEndTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        pattern.strategy.CreditCardPayment creditCardPayment0 = new pattern.strategy.CreditCardPayment();
        pattern.strategy.InstitutionalPayment institutionalPayment1 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction6 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction6.setPaymentMethod("");
        java.lang.String str9 = paymentTransaction6.getBookingID();
        boolean boolean10 = institutionalPayment1.pay(paymentTransaction6);
        boolean boolean11 = creditCardPayment0.pay(paymentTransaction6);
        model.PaymentTransaction paymentTransaction16 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction16.setPaymentMethod("");
        paymentTransaction16.setTotalAmount((double) (byte) 0);
        paymentTransaction16.setPaymentMethod("FORFEITED");
        boolean boolean23 = creditCardPayment0.pay(paymentTransaction16);
        double double24 = paymentTransaction16.getTotalAmount();
        double double25 = paymentTransaction16.getTotalAmount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("null - Room null", "Booking []  | hi! to  | FORFEITED - Room Booking []  | hi! to  | FORFEITED,null");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand14 = new pattern.command.ModifyCommand(reservationService1, reservation9, "", "");
        java.lang.String str15 = reservation9.getStatus();
        reservation9.forfeitDeposit();
        reservationService0.modify(reservation9, "SUCCESS", "User [, , , GUEST, ]");
        model.Reservation reservation20 = null;
        pattern.command.ForfeitDepositCommand forfeitDepositCommand21 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation20);
        pattern.command.ReservationService reservationService22 = null;
        model.Reservation reservation30 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation30.forfeitDeposit();
        double double32 = reservation30.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand33 = new pattern.command.ForfeitDepositCommand(reservationService22, reservation30);
        java.lang.String str34 = reservation30.toString();
        boolean boolean35 = reservation30.isExtended();
        reservation30.setUserID("hi!");
        pattern.command.ExtendCommand extendCommand39 = new pattern.command.ExtendCommand(reservationService0, reservation30, "HeadLabCoordinator [C001] Coordinator Carol");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FORFEITED" + "'", str15.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str34.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        boolean boolean2 = equipment0.isAvailable();
        java.lang.String str3 = equipment0.toString();
        java.lang.String str4 = equipment0.toString();
        java.lang.String str5 = equipment0.toString();
        java.lang.String str6 = equipment0.getStatus();
        equipment0.setStatus("User [hi!, , , RESEARCHER, hi!]");
        equipment0.setDescription("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null - null [null] @ null null" + "'", str3.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null - null [null] @ null null" + "'", str4.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null - null [null] @ null null" + "'", str5.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        model.Reservation reservation22 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation22.forfeitDeposit();
        reservation22.setPaymentMethod("FORFEITED");
        reservation22.forfeitDeposit();
        reservationService0.cancel(reservation22);
        reservation22.extend("SUCCESS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        model.Researcher researcher7 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = researcher7.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        double double10 = reservation8.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand13 = new pattern.command.ModifyCommand(reservationService0, reservation8, "", "");
        java.lang.String str14 = reservation8.getStatus();
        java.lang.String str15 = reservation8.getEquipmentID();
        java.lang.String str16 = reservation8.getStatus();
        java.lang.String str17 = reservation8.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "FORFEITED" + "'", str14.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "FORFEITED" + "'", str16.equals("FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        pattern.strategy.CreditCardPayment creditCardPayment0 = new pattern.strategy.CreditCardPayment();
        pattern.strategy.InstitutionalPayment institutionalPayment1 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction6 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction6.setPaymentMethod("");
        java.lang.String str9 = paymentTransaction6.getBookingID();
        boolean boolean10 = institutionalPayment1.pay(paymentTransaction6);
        boolean boolean11 = creditCardPayment0.pay(paymentTransaction6);
        pattern.strategy.DebitPayment debitPayment12 = new pattern.strategy.DebitPayment();
        pattern.strategy.PaymentProcessor paymentProcessor13 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) debitPayment12);
        model.PaymentTransaction paymentTransaction18 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction18.setPaymentMethod("");
        paymentTransaction18.setBookingID("hi!");
        boolean boolean23 = debitPayment12.pay(paymentTransaction18);
        boolean boolean24 = creditCardPayment0.pay(paymentTransaction18);
        pattern.strategy.PaymentProcessor paymentProcessor25 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) creditCardPayment0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        model.HeadLabCoordinator headLabCoordinator5 = new model.HeadLabCoordinator("AVAILABLE", "", "Booking []  | hi! to  | FORFEITED,Booking []  | hi! to  | FORFEITED,null", "C001", "Coordinator Carol");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getName();
        java.lang.String str2 = headLabCoordinatorSingleton0.toString();
        model.LabManager labManager8 = headLabCoordinatorSingleton0.generateManagerAccount("hi!", "null,null", "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "null,null", "SUCCESS");
        java.lang.String str9 = headLabCoordinatorSingleton0.getCoordinatorID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Coordinator Carol" + "'", str1.equals("Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "HeadLabCoordinator [C001] Coordinator Carol" + "'", str2.equals("HeadLabCoordinator [C001] Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(labManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "C001" + "'", str9.equals("C001"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        pattern.strategy.CreditCardPayment creditCardPayment0 = new pattern.strategy.CreditCardPayment();
        pattern.strategy.InstitutionalPayment institutionalPayment1 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction6 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction6.setPaymentMethod("");
        java.lang.String str9 = paymentTransaction6.getBookingID();
        boolean boolean10 = institutionalPayment1.pay(paymentTransaction6);
        boolean boolean11 = creditCardPayment0.pay(paymentTransaction6);
        model.PaymentTransaction paymentTransaction16 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction16.setPaymentMethod("");
        paymentTransaction16.setTotalAmount((double) (byte) 0);
        paymentTransaction16.setPaymentMethod("FORFEITED");
        boolean boolean23 = creditCardPayment0.pay(paymentTransaction16);
        model.PaymentTransaction paymentTransaction24 = new model.PaymentTransaction();
        double double25 = paymentTransaction24.getTotalAmount();
        paymentTransaction24.setTransactionID("User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]");
        boolean boolean28 = creditCardPayment0.pay(paymentTransaction24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        model.LabLocation labLocation0 = new model.LabLocation();
        java.lang.String str1 = labLocation0.getLocationDetails();
        java.lang.String str2 = labLocation0.getRoomNumber();
        java.lang.String str3 = labLocation0.getBuildingName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null - Room null" + "'", str1.equals("null - Room null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        equipmentContext2.notifyObservers("FORFEITED", "");
        java.lang.String str8 = equipmentContext2.getStatusString();
        pattern.state.EquipmentContext equipmentContext11 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext11.markUnderMaintenance();
        pattern.state.EquipmentState equipmentState13 = equipmentContext11.getCurrentState();
        equipmentContext2.setState(equipmentState13);
        pattern.state.EquipmentState equipmentState15 = equipmentContext2.getCurrentState();
        equipmentContext2.enable();
        java.lang.String str17 = equipmentContext2.getEquipmentID();
        equipmentContext2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        java.lang.String str8 = reservation7.getBookingID();
        reservation7.setPaymentMethod("Booking []  | hi! to  | FORFEITED");
        reservation7.setEndTime("Booking []  | hi! to  | FORFEITED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        model.LabManager labManager6 = new model.LabManager("hi!", "Booking []  | hi! to  | FORFEITED - Room null", "", "AVAILABLE", "", "CONFIRMED");
        double double7 = labManager6.getFeeRate();
        java.lang.String str8 = labManager6.getManagerID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        model.Faculty faculty7 = new model.Faculty("CONFIRMED", "Booking []  | hi! to  | FORFEITED,Booking []  | hi! to  | FORFEITED,null", "hi!", "coord@yorku.ca", "User [, , , GUEST, ]", "SUCCESS", "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        model.Faculty faculty7 = new model.Faculty("null - null [null] @ null null", "null - null [null] @ null null", "null - null [null] @ null null", "Booking []  | hi! to  | FORFEITED", "Booking []  | hi! to  | FORFEITED", "Booking []  | hi! to  | FORFEITED", "FORFEITED");
        faculty7.setName("FACULTY");
        double double10 = faculty7.getFeeRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        model.Reservation reservation7 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        java.lang.String str8 = reservation7.getBookingID();
        boolean boolean9 = reservation7.isDepositForfeited();
        java.lang.String str10 = reservation7.getEquipmentID();
        reservation7.setUserID("Booking []  | hi! to  | FORFEITED - Room Booking []  | hi! to  | FORFEITED,null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getDescription();
        java.lang.Class<?> wildcardClass4 = equipment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        model.Researcher researcher7 = new model.Researcher("CONFIRMED", "AVAILABLE", "Booking []  | hi! to  | FORFEITED", "AVAILABLE", "CONFIRMED", "", "");
        java.lang.String str8 = researcher7.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext2.markUnderMaintenance();
        pattern.state.EquipmentState equipmentState4 = equipmentContext2.getCurrentState();
        equipmentContext2.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "FORFEITED");
        model.Guest guest10 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str11 = guest10.getDepartment();
        guest10.setPassword("hi!");
        model.Student student14 = new model.Student();
        model.LabManager labManager15 = new model.LabManager();
        model.Researcher researcher23 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher23.setUserID("");
        model.Student student33 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher41 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest49 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str50 = guest49.getDepartment();
        model.User[] userArray51 = new model.User[] { guest10, student14, labManager15, researcher23, student33, researcher41, guest49 };
        java.util.ArrayList<model.User> userList52 = new java.util.ArrayList<model.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.User>) userList52, userArray51);
        pattern.observer.UserNotificationObserver userNotificationObserver54 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList52);
        java.lang.String str55 = userNotificationObserver54.getNotificationLog();
        equipmentContext2.removeObserver((pattern.observer.EquipmentObserver) userNotificationObserver54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand14 = new pattern.command.ModifyCommand(reservationService1, reservation9, "", "");
        java.lang.String str15 = reservation9.getStatus();
        reservation9.forfeitDeposit();
        reservationService0.modify(reservation9, "SUCCESS", "User [, , , GUEST, ]");
        model.Reservation reservation20 = null;
        pattern.command.ForfeitDepositCommand forfeitDepositCommand21 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation20);
        pattern.command.ReservationService reservationService22 = null;
        model.Reservation reservation30 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand31 = new pattern.command.ForfeitDepositCommand(reservationService22, reservation30);
        reservation30.setStartTime("FORFEITED");
        reservation30.forfeitDeposit();
        reservationService0.extend(reservation30, "Booking []  | hi! to  | FORFEITED,null");
        pattern.command.ReservationService reservationService37 = null;
        model.Reservation reservation45 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation45.setPaymentMethod("");
        reservation45.setStartTime("hi!");
        reservation45.setDepositAmount(100.0d);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand52 = new pattern.command.ForfeitDepositCommand(reservationService37, reservation45);
        reservation45.setBookingID("SUCCESS");
        pattern.command.ForfeitDepositCommand forfeitDepositCommand55 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation45);
        model.Reservation reservation63 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation63.setPaymentMethod("");
        reservation63.setStartTime("hi!");
        reservation63.forfeitDeposit();
        reservation63.setExtended(true);
        reservation63.forfeitDeposit();
        reservationService0.reserve(reservation63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FORFEITED" + "'", str15.equals("FORFEITED"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        pattern.strategy.DebitPayment debitPayment0 = new pattern.strategy.DebitPayment();
        pattern.strategy.PaymentProcessor paymentProcessor1 = new pattern.strategy.PaymentProcessor((pattern.strategy.PaymentStrategy) debitPayment0);
        pattern.strategy.DebitPayment debitPayment2 = new pattern.strategy.DebitPayment();
        model.PaymentTransaction paymentTransaction7 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        boolean boolean8 = debitPayment2.pay(paymentTransaction7);
        boolean boolean9 = paymentProcessor1.processPayment(paymentTransaction7);
        pattern.strategy.InstitutionalPayment institutionalPayment10 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction15 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction15.setPaymentMethod("");
        java.lang.String str18 = paymentTransaction15.getBookingID();
        boolean boolean19 = institutionalPayment10.pay(paymentTransaction15);
        paymentProcessor1.setPaymentStrategy((pattern.strategy.PaymentStrategy) institutionalPayment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        pattern.state.EquipmentContext equipmentContext5 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str6 = equipmentContext5.getEquipmentID();
        java.lang.String str7 = equipmentContext5.getEquipmentID();
        model.Guest guest15 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = guest15.getDepartment();
        guest15.setPassword("hi!");
        model.Student student19 = new model.Student();
        model.LabManager labManager20 = new model.LabManager();
        model.Researcher researcher28 = new model.Researcher("hi!", "", "", "", "hi!", "hi!", "hi!");
        researcher28.setUserID("");
        model.Student student38 = new model.Student("", "", "", "", "", "", "");
        model.Researcher researcher46 = new model.Researcher("", "", "", "hi!", "", "", "hi!");
        model.Guest guest54 = new model.Guest("", "", "", "hi!", "hi!", "", "");
        java.lang.String str55 = guest54.getDepartment();
        model.User[] userArray56 = new model.User[] { guest15, student19, labManager20, researcher28, student38, researcher46, guest54 };
        java.util.ArrayList<model.User> userList57 = new java.util.ArrayList<model.User>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<model.User>) userList57, userArray56);
        pattern.observer.UserNotificationObserver userNotificationObserver59 = new pattern.observer.UserNotificationObserver((java.util.List<model.User>) userList57);
        java.lang.String str60 = userNotificationObserver59.getNotificationLog();
        equipmentContext5.removeObserver((pattern.observer.EquipmentObserver) userNotificationObserver59);
        equipmentContext2.removeObserver((pattern.observer.EquipmentObserver) userNotificationObserver59);
        equipmentContext2.enable();
        java.lang.String str64 = equipmentContext2.getStatusString();
        pattern.state.EquipmentContext equipmentContext67 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str68 = equipmentContext67.getEquipmentID();
        pattern.state.EquipmentState equipmentState69 = equipmentContext67.getCurrentState();
        equipmentContext67.notifyObservers("FORFEITED", "");
        java.lang.String str73 = equipmentContext67.getStatusString();
        pattern.state.EquipmentContext equipmentContext76 = new pattern.state.EquipmentContext("", "hi!");
        equipmentContext76.markUnderMaintenance();
        pattern.state.EquipmentState equipmentState78 = equipmentContext76.getCurrentState();
        equipmentContext67.setState(equipmentState78);
        equipmentContext2.setState(equipmentState78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "AVAILABLE" + "'", str64.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "AVAILABLE" + "'", str73.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentState78);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        pattern.strategy.CreditCardPayment creditCardPayment0 = new pattern.strategy.CreditCardPayment();
        pattern.strategy.InstitutionalPayment institutionalPayment1 = new pattern.strategy.InstitutionalPayment();
        model.PaymentTransaction paymentTransaction6 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction6.setPaymentMethod("");
        java.lang.String str9 = paymentTransaction6.getBookingID();
        boolean boolean10 = institutionalPayment1.pay(paymentTransaction6);
        boolean boolean11 = creditCardPayment0.pay(paymentTransaction6);
        model.PaymentTransaction paymentTransaction16 = new model.PaymentTransaction("hi!", "hi!", (double) (short) 100, "hi!");
        paymentTransaction16.setPaymentMethod("");
        paymentTransaction16.setTotalAmount((double) (byte) 0);
        paymentTransaction16.setPaymentMethod("FORFEITED");
        boolean boolean23 = creditCardPayment0.pay(paymentTransaction16);
        java.lang.String str24 = paymentTransaction16.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "FORFEITED" + "'", str24.equals("FORFEITED"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        model.Deposit deposit0 = new model.Deposit();
        boolean boolean1 = deposit0.isForfeited();
        double double2 = deposit0.getAmount();
        deposit0.setAmount((double) 10.0f);
        deposit0.setForfeited(false);
        boolean boolean7 = deposit0.isForfeited();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        model.Deposit deposit0 = new model.Deposit();
        deposit0.setDeductedFromTotal(false);
        boolean boolean3 = deposit0.isForfeited();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        pattern.command.ReservationService reservationService0 = null;
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.forfeitDeposit();
        pattern.command.ModifyCommand modifyCommand12 = new pattern.command.ModifyCommand(reservationService0, reservation8, "Booking []  | hi! to  | FORFEITED", "Booking []  | hi! to  | FORFEITED,null");
        reservation8.setDepositAmount((double) (short) 1);
        reservation8.setExtended(false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand12 = new pattern.command.ForfeitDepositCommand(reservationService1, reservation9);
        boolean boolean13 = reservation9.isExtended();
        reservationService0.cancel(reservation9);
        pattern.command.ReservationService reservationService15 = null;
        model.Reservation reservation23 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation23.forfeitDeposit();
        double double25 = reservation23.getDepositAmount();
        pattern.command.ForfeitDepositCommand forfeitDepositCommand26 = new pattern.command.ForfeitDepositCommand(reservationService15, reservation23);
        pattern.command.CancelCommand cancelCommand27 = new pattern.command.CancelCommand(reservationService0, reservation23);
        java.lang.String str28 = reservation23.toString();
        java.lang.String str29 = reservation23.getPaymentMethod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Booking []  | hi! to  | FORFEITED" + "'", str28.equals("Booking []  | hi! to  | FORFEITED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        equipment0.setType("CONFIRMED");
        equipment0.setDescription("Booking []  | hi! to  | FORFEITED");
        java.lang.String str6 = equipment0.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        model.PaymentTransaction paymentTransaction0 = new model.PaymentTransaction();
        java.lang.String str1 = paymentTransaction0.getPaymentStatus();
        paymentTransaction0.setTotalAmount((double) 10L);
        java.lang.String str4 = paymentTransaction0.getTransactionID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        pattern.singleton.HeadLabCoordinatorSingleton headLabCoordinatorSingleton0 = pattern.singleton.HeadLabCoordinatorSingleton.getInstance();
        java.lang.String str1 = headLabCoordinatorSingleton0.getName();
        model.LabManager labManager7 = headLabCoordinatorSingleton0.generateManagerAccount("HeadLabCoordinator [C001] Coordinator Carol", "GUEST", "null - null [null] @ null null", "", "coord@yorku.ca");
        java.lang.String str8 = headLabCoordinatorSingleton0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(headLabCoordinatorSingleton0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Coordinator Carol" + "'", str1.equals("Coordinator Carol"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(labManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "coord@yorku.ca" + "'", str8.equals("coord@yorku.ca"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        model.Student student7 = new model.Student("", "", "hi!", "", "", "hi!", "");
        student7.setDepartment("");
        student7.setUserType("coord@yorku.ca");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        model.Researcher researcher7 = new model.Researcher("HeadLabCoordinator [C001] Coordinator Carol", "null - Room null", "User [, , , GUEST, ]", "null - null [null] @ null null", "null,null", "GUEST", "null,null");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        pattern.command.ReservationService reservationService1 = null;
        model.Reservation reservation9 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation9.forfeitDeposit();
        double double11 = reservation9.getDepositAmount();
        pattern.command.ModifyCommand modifyCommand14 = new pattern.command.ModifyCommand(reservationService1, reservation9, "", "");
        java.lang.String str15 = reservation9.getStatus();
        reservation9.forfeitDeposit();
        reservationService0.modify(reservation9, "SUCCESS", "User [, , , GUEST, ]");
        model.Reservation reservation20 = null;
        pattern.command.ForfeitDepositCommand forfeitDepositCommand21 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation20);
        pattern.command.ReservationService reservationService22 = null;
        model.Reservation reservation30 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand31 = new pattern.command.ForfeitDepositCommand(reservationService22, reservation30);
        reservation30.setStartTime("FORFEITED");
        reservation30.forfeitDeposit();
        reservationService0.extend(reservation30, "Booking []  | hi! to  | FORFEITED,null");
        pattern.command.ReservationService reservationService37 = null;
        model.Reservation reservation45 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation45.setPaymentMethod("");
        reservation45.setStartTime("hi!");
        reservation45.setDepositAmount(100.0d);
        pattern.command.ForfeitDepositCommand forfeitDepositCommand52 = new pattern.command.ForfeitDepositCommand(reservationService37, reservation45);
        reservation45.setBookingID("SUCCESS");
        pattern.command.ForfeitDepositCommand forfeitDepositCommand55 = new pattern.command.ForfeitDepositCommand(reservationService0, reservation45);
        pattern.command.ReservationService reservationService56 = new pattern.command.ReservationService();
        model.Reservation reservation64 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation64.setPaymentMethod("");
        reservation64.setStartTime("hi!");
        reservation64.forfeitDeposit();
        reservation64.setExtended(true);
        reservation64.forfeitDeposit();
        reservationService56.cancel(reservation64);
        pattern.command.ExtendCommand extendCommand75 = new pattern.command.ExtendCommand(reservationService0, reservation64, "null - Room null");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FORFEITED" + "'", str15.equals("FORFEITED"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        pattern.command.ReservationService reservationService0 = new pattern.command.ReservationService();
        model.Reservation reservation8 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        reservation8.setPaymentMethod("");
        reservation8.setStartTime("hi!");
        reservation8.forfeitDeposit();
        reservation8.setExtended(true);
        reservation8.forfeitDeposit();
        reservationService0.cancel(reservation8);
        model.Reservation reservation25 = new model.Reservation("", "", "", "hi!", "", "", (double) 10L);
        java.lang.String str26 = reservation25.getBookingID();
        reservation25.setUserID("AVAILABLE");
        java.lang.String str29 = reservation25.getBookingID();
        reservationService0.modify(reservation25, "User [FORFEITED, Booking []  | hi! to  | FORFEITED,null, AVAILABLE, FACULTY, Booking []  | hi! to  | FORFEITED,null]", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        pattern.state.EquipmentContext equipmentContext2 = new pattern.state.EquipmentContext("", "hi!");
        java.lang.String str3 = equipmentContext2.getEquipmentID();
        equipmentContext2.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        model.Equipment equipment0 = new model.Equipment();
        java.lang.String str1 = equipment0.getName();
        boolean boolean2 = equipment0.isAvailable();
        java.lang.String str3 = equipment0.toString();
        java.lang.String str4 = equipment0.toString();
        boolean boolean5 = equipment0.isAvailable();
        equipment0.setEquipmentID("Coordinator Carol");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null - null [null] @ null null" + "'", str3.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null - null [null] @ null null" + "'", str4.equals("null - null [null] @ null null"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}

