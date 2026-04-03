package test;
import org.junit.Test;
import static org.junit.Assert.*;
import pattern.factory.*;
import model.User;
import model.Student; 
import model.Faculty;
import model.Guest;
import model.Researcher;
import model.HeadLabCoordinator;
import model.LabManager;

public class FactoryTests {
    UserFactory userFactory = new UserFactory();
    User user;
    @Test
    public void studentTests() {
        Student student = new Student();
        user = userFactory.getUserType("STUDENT");

        assertEquals(user.getClass(),student.getClass());
        assertTrue(user.getFeeRate() == 10.0);
    }

    @Test
    public void guestTests() {
        Guest guest = new Guest();
        user = userFactory.getUserType("GUEST");

        assertEquals(user.getClass(),guest.getClass());
        assertTrue(user.getFeeRate() == 30.0);
    }

    @Test
    public void facultyTests() {
        Faculty faculty = new Faculty();
        user = userFactory.getUserType("FACULTY");

        assertEquals(user.getClass(),faculty.getClass());
        assertTrue(user.getFeeRate() == 15.0);
    }

    @Test
    public void researcherTests() {
        Researcher researcher = new Researcher();
        user = userFactory.getUserType("RESEARCHER");

        assertEquals(user.getClass(),researcher.getClass());
        assertTrue(user.getFeeRate() == 20.0);
    }

    @Test
    public void LabManagerTests() {
        LabManager labManager = new LabManager();
        user = userFactory.getUserType("MANAGER");

        assertEquals(user.getClass(),labManager.getClass());
        assertTrue(user.getFeeRate() == 0.0);

        labManager.setManagerID("LABM387");
        assertEquals("LABM387",labManager.getManagerID());
    }

    @Test
    public void HeadLabCoordinatorTests() {
        LabManager labManager;
        HeadLabCoordinator coordinator = new HeadLabCoordinator();
        user = userFactory.getUserType("COORDINATOR");

        assertEquals(user.getClass(),coordinator.getClass());
        assertTrue(user.getFeeRate() == 0.0);

       labManager = coordinator.generateManagerAccount("LABM213", "John Smith", "john@yorku.ca", "pass123","Lassonde");
        assertEquals("LABM213",labManager.getManagerID());
    }


}
