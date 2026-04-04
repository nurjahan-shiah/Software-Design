package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.*;
import pattern.factory.UserFactory;

public class FactoryTests {

    private UserFactory factory;

    @Before
    public void setUp() {
        factory = new UserFactory();
    }

    // ===================== Type Tests =====================

    @Test
    public void studentTests() {
        User user = factory.getUserType("STUDENT");
        assertEquals(Student.class, user.getClass());
        assertEquals(10.0, user.getFeeRate(), 0.001);
    }

    @Test
    public void guestTests() {
        User user = factory.getUserType("GUEST");
        assertEquals(Guest.class, user.getClass());
        assertEquals(30.0, user.getFeeRate(), 0.001);
    }

    @Test
    public void facultyTests() {
        User user = factory.getUserType("FACULTY");
        assertEquals(Faculty.class, user.getClass());
        assertEquals(15.0, user.getFeeRate(), 0.001);
    }

    @Test
    public void researcherTests() {
        User user = factory.getUserType("RESEARCHER");
        assertEquals(Researcher.class, user.getClass());
        assertEquals(20.0, user.getFeeRate(), 0.001);
    }

    @Test
    public void LabManagerTests() {
        LabManager labManager = new LabManager();
        User user = factory.getUserType("MANAGER");
        assertEquals(labManager.getClass(), user.getClass());
        assertEquals(0.0, user.getFeeRate(), 0.001);
        labManager.setManagerID("LABM387");
        assertEquals("LABM387", labManager.getManagerID());
    }

    @Test
    public void HeadLabCoordinatorTests() {
        HeadLabCoordinator coordinator = new HeadLabCoordinator();
        User user = factory.getUserType("COORDINATOR");
        assertEquals(coordinator.getClass(), user.getClass());
        assertEquals(0.0, user.getFeeRate(), 0.001);
        LabManager labManager = coordinator.generateManagerAccount("LABM213", "John Smith",
                "john@yorku.ca", "pass123", "Lassonde");
        assertEquals("LABM213", labManager.getManagerID());
    }

    // ===================== NotNull Tests =====================

    @Test
    public void factory_student_notNull() {
        assertNotNull(factory.getUserType("STUDENT"));
    }

    @Test
    public void factory_faculty_notNull() {
        assertNotNull(factory.getUserType("FACULTY"));
    }

    @Test
    public void factory_researcher_notNull() {
        assertNotNull(factory.getUserType("RESEARCHER"));
    }

    @Test
    public void factory_guest_notNull() {
        assertNotNull(factory.getUserType("GUEST"));
    }

    @Test
    public void factory_manager_notNull() {
        assertNotNull(factory.getUserType("MANAGER"));
    }

    @Test
    public void factory_coordinator_notNull() {
        assertNotNull(factory.getUserType("COORDINATOR"));
    }

    @Test
    public void factory_unknownType_returnsNull() {
        assertNull(factory.getUserType("UNKNOWN_TYPE"));
    }

    @Test
    public void factory_emptyString_returnsNull() {
        assertNull(factory.getUserType(""));
    }

    @Test
    public void factory_lowercaseStudent_returnsNull() {
        assertNull(factory.getUserType("student"));
    }

    // ===================== instanceof Tests =====================

    @Test
    public void factory_student_isInstanceOfUser() {
        assertTrue(factory.getUserType("STUDENT") instanceof User);
    }

    @Test
    public void factory_faculty_isInstanceOfUser() {
        assertTrue(factory.getUserType("FACULTY") instanceof User);
    }

    @Test
    public void factory_researcher_isInstanceOfUser() {
        assertTrue(factory.getUserType("RESEARCHER") instanceof User);
    }

    @Test
    public void factory_guest_isInstanceOfUser() {
        assertTrue(factory.getUserType("GUEST") instanceof User);
    }

    @Test
    public void factory_manager_isInstanceOfUser() {
        assertTrue(factory.getUserType("MANAGER") instanceof User);
    }

    @Test
    public void factory_coordinator_isInstanceOfUser() {
        assertTrue(factory.getUserType("COORDINATOR") instanceof User);
    }

    // ===================== Multiple Instances Tests =====================

    @Test
    public void factory_createsTwoStudents_differentInstances() {
        User s1 = factory.getUserType("STUDENT");
        User s2 = factory.getUserType("STUDENT");
        assertNotSame(s1, s2);
    }

    @Test
    public void factory_createsTwoManagers_differentInstances() {
        User m1 = factory.getUserType("MANAGER");
        User m2 = factory.getUserType("MANAGER");
        assertNotSame(m1, m2);
    }

    @Test
    public void factory_allFeeRatesCorrect() {
        assertEquals(10.0, factory.getUserType("STUDENT").getFeeRate(), 0.001);
        assertEquals(15.0, factory.getUserType("FACULTY").getFeeRate(), 0.001);
        assertEquals(20.0, factory.getUserType("RESEARCHER").getFeeRate(), 0.001);
        assertEquals(30.0, factory.getUserType("GUEST").getFeeRate(), 0.001);
        assertEquals(0.0, factory.getUserType("MANAGER").getFeeRate(), 0.001);
        assertEquals(0.0, factory.getUserType("COORDINATOR").getFeeRate(), 0.001);
    }
}