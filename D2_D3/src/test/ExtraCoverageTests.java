package test;

import static org.junit.Assert.*;
import org.junit.Test;
import model.*;

/**
 * Extra tests targeting Guest and HeadLabCoordinator
 * to push coverage above 80%.
 */
public class ExtraCoverageTests {

    // ===================== Guest - full coverage =====================

    @Test
    public void guest_defaultConstructor_feeRate() {
        Guest g = new Guest();
        assertEquals(30.0, g.getFeeRate(), 0.001);
    }

    @Test
    public void guest_defaultConstructor_certificationNumberNull() {
        Guest g = new Guest();
        assertNull(g.getCertificationNumber());
    }

    @Test
    public void guest_fullConstructor_allFields() {
        Guest g = new Guest("G001", "Dave", "dave@example.com", "pass123",
                "CERT001", "ACTIVE", "External");
        assertEquals("G001", g.getUserID());
        assertEquals("Dave", g.getName());
        assertEquals("dave@example.com", g.getEmail());
        assertEquals("GUEST", g.getUserType());
        assertEquals("ACTIVE", g.getStatus());
        assertEquals("External", g.getDepartment());
        assertEquals("CERT001", g.getCertificationNumber());
    }

    @Test
    public void guest_fullConstructor_feeRate() {
        Guest g = new Guest("G002", "Eve", "eve@example.com", "pass",
                "CERT002", "ACTIVE", "External");
        assertEquals(30.0, g.getFeeRate(), 0.001);
    }

    @Test
    public void guest_fullConstructor_getCertificationNumber() {
        Guest g = new Guest("G003", "Frank", "frank@example.com", "pass",
                "CERT003", "PENDING", "External");
        assertEquals("CERT003", g.getCertificationNumber());
    }

    @Test
    public void guest_setCertificationNumber_updatesValue() {
        Guest g = new Guest();
        g.setCertificationNumber("CERT_NEW");
        assertEquals("CERT_NEW", g.getCertificationNumber());
    }

    @Test
    public void guest_setCertificationNumber_overwritesExisting() {
        Guest g = new Guest("G004", "Grace", "grace@example.com", "pass",
                "CERT004", "ACTIVE", "External");
        g.setCertificationNumber("CERT_UPDATED");
        assertEquals("CERT_UPDATED", g.getCertificationNumber());
    }

    @Test
    public void guest_toString_containsUserID() {
        Guest g = new Guest("G005", "Hank", "hank@example.com", "pass",
                "CERT005", "ACTIVE", "External");
        assertTrue(g.toString().contains("G005"));
    }

    @Test
    public void guest_status_pending() {
        Guest g = new Guest("G006", "Iris", "iris@example.com", "pass",
                "CERT006", "PENDING", "External");
        assertEquals("PENDING", g.getStatus());
    }

    @Test
    public void guest_password_isSet() {
        Guest g = new Guest("G007", "Jack", "jack@example.com", "secret",
                "CERT007", "ACTIVE", "External");
        assertEquals("secret", g.getPassword());
    }

    // ===================== HeadLabCoordinator - full coverage =====================

    @Test
    public void coordinator_defaultConstructor_feeRate() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        assertEquals(0.0, c.getFeeRate(), 0.001);
    }

    @Test
    public void coordinator_fullConstructor_allFields() {
        HeadLabCoordinator c = new HeadLabCoordinator("C001", "Carol", "carol@yorku.ca",
                "pass123", "Administration");
        assertEquals("C001", c.getUserID());
        assertEquals("Carol", c.getName());
        assertEquals("carol@yorku.ca", c.getEmail());
        assertEquals("COORDINATOR", c.getUserType());
        assertEquals("ACTIVE", c.getStatus());
        assertEquals("Administration", c.getDepartment());
    }

    @Test
    public void coordinator_fullConstructor_feeRate() {
        HeadLabCoordinator c = new HeadLabCoordinator("C002", "Sam", "sam@yorku.ca",
                "pass", "Science");
        assertEquals(0.0, c.getFeeRate(), 0.001);
    }

    @Test
    public void coordinator_fullConstructor_generateManager() {
        HeadLabCoordinator c = new HeadLabCoordinator("C003", "Alex", "alex@yorku.ca",
                "pass", "Engineering");
        LabManager lm = c.generateManagerAccount("MGR001", "Bob", "bob@yorku.ca",
                "temp", "Engineering");
        assertNotNull(lm);
        assertEquals("MGR001", lm.getManagerID());
        assertEquals("Bob", lm.getName());
        assertEquals("MANAGER", lm.getUserType());
        assertEquals("ACTIVE", lm.getStatus());
    }

    @Test
    public void coordinator_defaultConstructor_generateManager() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        LabManager lm = c.generateManagerAccount("MGR002", "Sara", "sara@yorku.ca",
                "temp", "Math");
        assertNotNull(lm);
        assertEquals("MGR002", lm.getManagerID());
    }

    @Test
    public void coordinator_fullConstructor_toString() {
        HeadLabCoordinator c = new HeadLabCoordinator("C004", "Tina", "tina@yorku.ca",
                "pass", "Arts");
        assertTrue(c.toString().contains("C004"));
        assertTrue(c.toString().contains("Tina"));
    }

    @Test
    public void coordinator_staffID_isCoord001() {
        HeadLabCoordinator c = new HeadLabCoordinator("C005", "Uma", "uma@yorku.ca",
                "pass", "Physics");
        assertEquals("COORD-001", c.getStaffID());
    }

    @Test
    public void coordinator_generateMultipleManagers_distinct() {
        HeadLabCoordinator c = new HeadLabCoordinator("C006", "Vera", "vera@yorku.ca",
                "pass", "Biology");
        LabManager m1 = c.generateManagerAccount("MGR003", "Mgr A", "a@yorku.ca", "pw", "Dept1");
        LabManager m2 = c.generateManagerAccount("MGR004", "Mgr B", "b@yorku.ca", "pw", "Dept2");
        assertNotEquals(m1.getManagerID(), m2.getManagerID());
        assertNotEquals(m1.getName(), m2.getName());
    }
}