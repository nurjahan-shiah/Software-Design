package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.*;

/**
 * Manual JUnit 4 tests for all User model subclasses.
 * Covers: Student, Faculty, Researcher, Guest, LabManager, HeadLabCoordinator, User base class.
 */
public class UserTests {

    // ===================== Student Tests =====================

    @Test
    public void student_defaultConstructor_feeRate() {
        Student s = new Student();
        assertEquals(10.0, s.getFeeRate(), 0.001);
    }

    @Test
    public void student_defaultConstructor_userTypeNull() {
        Student s = new Student();
        assertNull(s.getUserType());
    }

    @Test
    public void student_fullConstructor_userType() {
        Student s = new Student("U001", "Alice", "alice@yorku.ca", "pass", "STU001", "ACTIVE", "CS");
        assertEquals("STUDENT", s.getUserType());
    }

    @Test
    public void student_fullConstructor_allFields() {
        Student s = new Student("U001", "Alice", "alice@yorku.ca", "pass", "STU001", "ACTIVE", "CS");
        assertEquals("U001", s.getUserID());
        assertEquals("Alice", s.getName());
        assertEquals("alice@yorku.ca", s.getEmail());
        assertEquals("STU001", s.getStaffID());
        assertEquals("ACTIVE", s.getStatus());
        assertEquals("CS", s.getDepartment());
    }

    @Test
    public void student_fullConstructor_feeRate() {
        Student s = new Student("U001", "Alice", "alice@yorku.ca", "pass", "STU001", "ACTIVE", "CS");
        assertEquals(10.0, s.getFeeRate(), 0.001);
    }

    @Test
    public void student_setName_updatesName() {
        Student s = new Student();
        s.setName("Bob");
        assertEquals("Bob", s.getName());
    }

    @Test
    public void student_setEmail_updatesEmail() {
        Student s = new Student();
        s.setEmail("bob@yorku.ca");
        assertEquals("bob@yorku.ca", s.getEmail());
    }

    @Test
    public void student_setStatus_updatesStatus() {
        Student s = new Student();
        s.setStatus("PENDING");
        assertEquals("PENDING", s.getStatus());
    }

    @Test
    public void student_toString_containsUserID() {
        Student s = new Student("U001", "Alice", "alice@yorku.ca", "pass", "STU001", "ACTIVE", "CS");
        assertTrue(s.toString().contains("U001"));
    }

    @Test
    public void student_twoInstances_areDistinct() {
        Student s1 = new Student();
        Student s2 = new Student();
        assertNotSame(s1, s2);
    }

    // ===================== Faculty Tests =====================

    @Test
    public void faculty_defaultConstructor_feeRate() {
        Faculty f = new Faculty();
        assertEquals(15.0, f.getFeeRate(), 0.001);
    }

    @Test
    public void faculty_defaultConstructor_userTypeNull() {
        Faculty f = new Faculty();
        assertNull(f.getUserType());
    }

    @Test
    public void faculty_fullConstructor_userType() {
        Faculty f = new Faculty("U002", "Bob", "bob@yorku.ca", "pass", "FAC001", "ACTIVE", "Math");
        assertEquals("FACULTY", f.getUserType());
    }

    @Test
    public void faculty_fullConstructor_allFields() {
        Faculty f = new Faculty("U002", "Bob", "bob@yorku.ca", "pass", "FAC001", "ACTIVE", "Math");
        assertEquals("U002", f.getUserID());
        assertEquals("Bob", f.getName());
        assertEquals("bob@yorku.ca", f.getEmail());
        assertEquals("FAC001", f.getStaffID());
        assertEquals("ACTIVE", f.getStatus());
        assertEquals("Math", f.getDepartment());
    }

    @Test
    public void faculty_fullConstructor_feeRate() {
        Faculty f = new Faculty("U002", "Bob", "bob@yorku.ca", "pass", "FAC001", "ACTIVE", "Math");
        assertEquals(15.0, f.getFeeRate(), 0.001);
    }

    @Test
    public void faculty_setDepartment_updatesDepartment() {
        Faculty f = new Faculty();
        f.setDepartment("Physics");
        assertEquals("Physics", f.getDepartment());
    }

    @Test
    public void faculty_toString_containsName() {
        Faculty f = new Faculty("U002", "Bob", "bob@yorku.ca", "pass", "FAC001", "ACTIVE", "Math");
        assertTrue(f.toString().contains("Bob"));
    }

    @Test
    public void faculty_twoInstances_areDistinct() {
        Faculty f1 = new Faculty();
        Faculty f2 = new Faculty();
        assertNotSame(f1, f2);
    }

    // ===================== Researcher Tests =====================

    @Test
    public void researcher_defaultConstructor_feeRate() {
        Researcher r = new Researcher();
        assertEquals(20.0, r.getFeeRate(), 0.001);
    }

    @Test
    public void researcher_defaultConstructor_userTypeNull() {
        Researcher r = new Researcher();
        assertNull(r.getUserType());
    }

    @Test
    public void researcher_fullConstructor_userType() {
        Researcher r = new Researcher("U003", "Carol", "carol@yorku.ca", "pass", "RES001", "ACTIVE", "Biology");
        assertEquals("RESEARCHER", r.getUserType());
    }

    @Test
    public void researcher_fullConstructor_allFields() {
        Researcher r = new Researcher("U003", "Carol", "carol@yorku.ca", "pass", "RES001", "ACTIVE", "Biology");
        assertEquals("U003", r.getUserID());
        assertEquals("Carol", r.getName());
        assertEquals("carol@yorku.ca", r.getEmail());
        assertEquals("RES001", r.getStaffID());
        assertEquals("ACTIVE", r.getStatus());
        assertEquals("Biology", r.getDepartment());
    }

    @Test
    public void researcher_fullConstructor_feeRate() {
        Researcher r = new Researcher("U003", "Carol", "carol@yorku.ca", "pass", "RES001", "ACTIVE", "Biology");
        assertEquals(20.0, r.getFeeRate(), 0.001);
    }

    @Test
    public void researcher_setPassword_updatesPassword() {
        Researcher r = new Researcher();
        r.setPassword("newpass");
        assertEquals("newpass", r.getPassword());
    }

    @Test
    public void researcher_toString_containsUserID() {
        Researcher r = new Researcher("U003", "Carol", "carol@yorku.ca", "pass", "RES001", "ACTIVE", "Biology");
        assertTrue(r.toString().contains("U003"));
    }

    @Test
    public void researcher_twoInstances_areDistinct() {
        Researcher r1 = new Researcher();
        Researcher r2 = new Researcher();
        assertNotSame(r1, r2);
    }

    // ===================== Guest Tests =====================

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
    public void guest_fullConstructor_userType() {
        Guest g = new Guest("G001", "Dave", "dave@ex.com", "pass", "CERT001", "ACTIVE", "External");
        assertEquals("GUEST", g.getUserType());
    }

    @Test
    public void guest_fullConstructor_allFields() {
        Guest g = new Guest("G001", "Dave", "dave@ex.com", "pass", "CERT001", "ACTIVE", "External");
        assertEquals("G001", g.getUserID());
        assertEquals("Dave", g.getName());
        assertEquals("CERT001", g.getCertificationNumber());
        assertEquals("ACTIVE", g.getStatus());
        assertEquals("External", g.getDepartment());
    }

    @Test
    public void guest_setCertificationNumber_updatesValue() {
        Guest g = new Guest();
        g.setCertificationNumber("CERT999");
        assertEquals("CERT999", g.getCertificationNumber());
    }

    @Test
    public void guest_fullConstructor_feeRate() {
        Guest g = new Guest("G001", "Dave", "dave@ex.com", "pass", "CERT001", "ACTIVE", "External");
        assertEquals(30.0, g.getFeeRate(), 0.001);
    }

    @Test
    public void guest_toString_containsUserID() {
        Guest g = new Guest("G001", "Dave", "dave@ex.com", "pass", "CERT001", "ACTIVE", "External");
        assertTrue(g.toString().contains("G001"));
    }

    @Test
    public void guest_twoInstances_areDistinct() {
        Guest g1 = new Guest();
        Guest g2 = new Guest();
        assertNotSame(g1, g2);
    }

    // ===================== LabManager Tests =====================

    @Test
    public void labManager_defaultConstructor_feeRate() {
        LabManager lm = new LabManager();
        assertEquals(0.0, lm.getFeeRate(), 0.001);
    }

    @Test
    public void labManager_defaultConstructor_managerIDNull() {
        LabManager lm = new LabManager();
        assertNull(lm.getManagerID());
    }

    @Test
    public void labManager_fullConstructor_userType() {
        LabManager lm = new LabManager("M001", "Martin", "martin@yorku.ca", "pass", "LABM001", "Eng");
        assertEquals("MANAGER", lm.getUserType());
    }

    @Test
    public void labManager_fullConstructor_allFields() {
        LabManager lm = new LabManager("M001", "Martin", "martin@yorku.ca", "pass", "LABM001", "Eng");
        assertEquals("M001", lm.getUserID());
        assertEquals("Martin", lm.getName());
        assertEquals("LABM001", lm.getManagerID());
        assertEquals("ACTIVE", lm.getStatus());
        assertEquals("Eng", lm.getDepartment());
    }

    @Test
    public void labManager_setManagerID_updatesID() {
        LabManager lm = new LabManager();
        lm.setManagerID("LABM999");
        assertEquals("LABM999", lm.getManagerID());
    }

    @Test
    public void labManager_fullConstructor_feeRate() {
        LabManager lm = new LabManager("M001", "Martin", "martin@yorku.ca", "pass", "LABM001", "Eng");
        assertEquals(0.0, lm.getFeeRate(), 0.001);
    }

    @Test
    public void labManager_toString_containsUserID() {
        LabManager lm = new LabManager("M001", "Martin", "martin@yorku.ca", "pass", "LABM001", "Eng");
        assertTrue(lm.toString().contains("M001"));
    }

    @Test
    public void labManager_twoInstances_areDistinct() {
        LabManager lm1 = new LabManager();
        LabManager lm2 = new LabManager();
        assertNotSame(lm1, lm2);
    }

    // ===================== HeadLabCoordinator Tests =====================

    @Test
    public void coordinator_defaultConstructor_feeRate() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        assertEquals(0.0, c.getFeeRate(), 0.001);
    }

    @Test
    public void coordinator_defaultConstructor_userTypeNull() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        assertNull(c.getUserType());
    }

    @Test
    public void coordinator_fullConstructor_userType() {
        HeadLabCoordinator c = new HeadLabCoordinator("C001", "Carol", "carol@yorku.ca", "pass", "Admin");
        assertEquals("COORDINATOR", c.getUserType());
    }

    @Test
    public void coordinator_fullConstructor_allFields() {
        HeadLabCoordinator c = new HeadLabCoordinator("C001", "Carol", "carol@yorku.ca", "pass", "Admin");
        assertEquals("C001", c.getUserID());
        assertEquals("Carol", c.getName());
        assertEquals("carol@yorku.ca", c.getEmail());
        assertEquals("ACTIVE", c.getStatus());
        assertEquals("Admin", c.getDepartment());
    }

    @Test
    public void coordinator_generateManagerAccount_notNull() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        LabManager lm = c.generateManagerAccount("M001", "Sam", "sam@yorku.ca", "pw", "CS");
        assertNotNull(lm);
    }

    @Test
    public void coordinator_generateManagerAccount_correctID() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        LabManager lm = c.generateManagerAccount("M002", "Sam", "sam@yorku.ca", "pw", "CS");
        assertEquals("M002", lm.getManagerID());
    }

    @Test
    public void coordinator_generateManagerAccount_isActive() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        LabManager lm = c.generateManagerAccount("M003", "Sam", "sam@yorku.ca", "pw", "CS");
        assertEquals("ACTIVE", lm.getStatus());
    }

    @Test
    public void coordinator_generateManagerAccount_isManagerType() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        LabManager lm = c.generateManagerAccount("M004", "Sam", "sam@yorku.ca", "pw", "CS");
        assertEquals("MANAGER", lm.getUserType());
    }

    @Test
    public void coordinator_twoGeneratedManagers_areDistinct() {
        HeadLabCoordinator c = new HeadLabCoordinator();
        LabManager m1 = c.generateManagerAccount("M010", "A", "a@y.ca", "pw", "D1");
        LabManager m2 = c.generateManagerAccount("M011", "B", "b@y.ca", "pw", "D2");
        assertNotSame(m1, m2);
        assertNotEquals(m1.getManagerID(), m2.getManagerID());
    }

    @Test
    public void coordinator_staffID_isCoord001() {
        HeadLabCoordinator c = new HeadLabCoordinator("C001", "Carol", "carol@yorku.ca", "pass", "Admin");
        assertEquals("COORD-001", c.getStaffID());
    }

    @Test
    public void coordinator_toString_containsUserID() {
        HeadLabCoordinator c = new HeadLabCoordinator("C001", "Carol", "carol@yorku.ca", "pass", "Admin");
        assertTrue(c.toString().contains("C001"));
    }

    // ===================== User Base Setters Tests =====================

    @Test
    public void user_setUserID_updatesUserID() {
        Student s = new Student();
        s.setUserID("U999");
        assertEquals("U999", s.getUserID());
    }

    @Test
    public void user_setStaffID_updatesStaffID() {
        Student s = new Student();
        s.setStaffID("STU999");
        assertEquals("STU999", s.getStaffID());
    }

    @Test
    public void user_setUserType_updatesUserType() {
        Student s = new Student();
        s.setUserType("STUDENT");
        assertEquals("STUDENT", s.getUserType());
    }

    @Test
    public void user_toString_containsNameAndEmail() {
        Student s = new Student("U001", "Alice", "alice@yorku.ca", "pass", "STU001", "ACTIVE", "CS");
        String str = s.toString();
        assertTrue(str.contains("Alice"));
        assertTrue(str.contains("alice@yorku.ca"));
    }
}