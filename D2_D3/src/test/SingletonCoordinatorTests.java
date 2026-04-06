package test;

import static org.junit.Assert.*;
import org.junit.Test;

import model.LabManager;
import pattern.singleton.HeadLabCoordinatorSingleton;

public class SingletonCoordinatorTests {

    @Test
    public void testSingletonInstanceNotNull() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void testSingletonReturnsSameInstance() {
        HeadLabCoordinatorSingleton instance1 = HeadLabCoordinatorSingleton.getInstance();
        HeadLabCoordinatorSingleton instance2 = HeadLabCoordinatorSingleton.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testCoordinatorIDIsSet() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        assertEquals("C001", instance.getCoordinatorID());
    }

    @Test
    public void testCoordinatorNameIsSet() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        assertEquals("Coordinator Carol", instance.getName());
    }

    @Test
    public void testCoordinatorEmailIsSet() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        assertEquals("coord@yorku.ca", instance.getEmail());
    }

    @Test
    public void testCoordinatorDepartmentIsSet() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        assertEquals("Administration", instance.getDepartment());
    }

    @Test
    public void testGenerateManagerAccountNotNull() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        LabManager manager = instance.generateManagerAccount(
                "LABM100", "Jane Doe", "jane@yorku.ca", "temp123", "Engineering");
        assertNotNull(manager);
    }

    @Test
    public void testGenerateManagerAccountID() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        LabManager manager = instance.generateManagerAccount(
                "LABM200", "John Smith", "john@yorku.ca", "temp456", "Science");
        assertEquals("LABM200", manager.getManagerID());
    }

    @Test
    public void testGenerateManagerAccountName() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        LabManager manager = instance.generateManagerAccount(
                "LABM300", "Alice Wong", "alice@yorku.ca", "temp789", "Math");
        assertEquals("Alice Wong", manager.getName());
    }

    @Test
    public void testGenerateManagerAccountType() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        LabManager manager = instance.generateManagerAccount(
                "LABM400", "Bob Lee", "bob@yorku.ca", "temp000", "Physics");
        assertEquals("MANAGER", manager.getUserType());
    }

    @Test
    public void testGenerateManagerAccountIsActive() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        LabManager manager = instance.generateManagerAccount(
                "LABM500", "Sara Kim", "sara@yorku.ca", "temp111", "Chemistry");
        assertEquals("ACTIVE", manager.getStatus());
    }

    @Test
    public void testGenerateMultipleManagersAreDistinct() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        LabManager m1 = instance.generateManagerAccount("LABM601", "Mgr One", "m1@yorku.ca", "pw1", "Dept A");
        LabManager m2 = instance.generateManagerAccount("LABM602", "Mgr Two", "m2@yorku.ca", "pw2", "Dept B");
        assertNotEquals(m1.getManagerID(), m2.getManagerID());
        assertNotEquals(m1.getName(), m2.getName());
    }

    @Test
    public void testToStringContainsCoordinatorID() {
        HeadLabCoordinatorSingleton instance = HeadLabCoordinatorSingleton.getInstance();
        assertTrue(instance.toString().contains("C001"));
    }
}
