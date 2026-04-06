package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import pattern.state.*;

public class StateTests {

    private EquipmentContext context;

    @Before
    public void setUp() {
        context = new EquipmentContext("EQU001", "AVAILABLE");
    }

    // ===================== Initial State Tests =====================

    @Test
    public void testInitialStatusAvailable() {
        assertEquals("AVAILABLE", context.getStatusString());
    }

    @Test
    public void testInitialStatusDisabled() {
        EquipmentContext ctx = new EquipmentContext("EQU002", "DISABLED");
        assertEquals("DISABLED", ctx.getStatusString());
    }

    @Test
    public void testInitialStatusMaintenance() {
        EquipmentContext ctx = new EquipmentContext("EQU003", "MAINTENANCE");
        assertEquals("MAINTENANCE", ctx.getStatusString());
    }

    @Test
    public void testUnknownStatusDefaultsToAvailable() {
        EquipmentContext ctx = new EquipmentContext("EQU004", "INVALID");
        assertEquals("AVAILABLE", ctx.getStatusString());
    }

    // ===================== AvailableState Transitions =====================

    @Test
    public void testAvailableToDisabled() {
        context.disable();
        assertEquals("DISABLED", context.getStatusString());
    }

    @Test
    public void testAvailableToMaintenance() {
        context.markUnderMaintenance();
        assertEquals("MAINTENANCE", context.getStatusString());
    }

    @Test
    public void testAvailableEnableStaysAvailable() {
        context.enable(); // already available - no change
        assertEquals("AVAILABLE", context.getStatusString());
    }

    // ===================== DisabledState Transitions =====================

    @Test
    public void testDisabledToAvailable() {
        context.disable();
        context.enable();
        assertEquals("AVAILABLE", context.getStatusString());
    }

    @Test
    public void testDisabledToMaintenance() {
        context.disable();
        context.markUnderMaintenance();
        assertEquals("MAINTENANCE", context.getStatusString());
    }

    @Test
    public void testDisabledDisableStaysDisabled() {
        context.disable();
        context.disable(); // already disabled - no change
        assertEquals("DISABLED", context.getStatusString());
    }

    // ===================== MaintenanceState Transitions =====================

    @Test
    public void testMaintenanceToAvailable() {
        context.markUnderMaintenance();
        context.enable();
        assertEquals("AVAILABLE", context.getStatusString());
    }

    @Test
    public void testMaintenanceToDisabled() {
        context.markUnderMaintenance();
        context.disable();
        assertEquals("DISABLED", context.getStatusString());
    }

    @Test
    public void testMaintenanceMarkMaintenanceStaysMaintenance() {
        context.markUnderMaintenance();
        context.markUnderMaintenance(); // already in maintenance - no change
        assertEquals("MAINTENANCE", context.getStatusString());
    }

    // ===================== Multi-step Transitions =====================

    @Test
    public void testAvailableDisabledAvailable() {
        context.disable();
        context.enable();
        assertEquals("AVAILABLE", context.getStatusString());
    }

    @Test
    public void testAvailableMaintenanceDisabledAvailable() {
        context.markUnderMaintenance();
        context.disable();
        context.enable();
        assertEquals("AVAILABLE", context.getStatusString());
    }

    // ===================== State Object Tests =====================

    @Test
    public void testAvailableStateGetStatus() {
        AvailableState state = new AvailableState();
        assertEquals("AVAILABLE", state.getStatus());
    }

    @Test
    public void testDisabledStateGetStatus() {
        DisabledState state = new DisabledState();
        assertEquals("DISABLED", state.getStatus());
    }

    @Test
    public void testMaintenanceStateGetStatus() {
        MaintenanceState state = new MaintenanceState();
        assertEquals("MAINTENANCE", state.getStatus());
    }

    @Test
    public void testGetCurrentState() {
        assertTrue(context.getCurrentState() instanceof AvailableState);
        context.disable();
        assertTrue(context.getCurrentState() instanceof DisabledState);
        context.markUnderMaintenance();
        assertTrue(context.getCurrentState() instanceof MaintenanceState);
    }

    @Test
    public void testGetEquipmentID() {
        assertEquals("EQU001", context.getEquipmentID());
    }
}
