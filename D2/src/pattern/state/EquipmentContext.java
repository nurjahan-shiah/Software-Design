package pattern.state;

import model.Equipment;

public class EquipmentContext {
    private Equipment equipment;
    private EquipmentState currentState;

    public EquipmentContext(Equipment equipment) {
        this.equipment = equipment;

        String status = equipment.getStatus();
        if ("DISABLED".equalsIgnoreCase(status)) {
            this.currentState = new DisabledState();
        } else if ("MAINTENANCE".equalsIgnoreCase(status)) {
            this.currentState = new MaintenanceState();
        } else {
            this.currentState = new AvailableState();
        }
    }

    public void setState(EquipmentState state) {
        this.currentState = state;
        equipment.setStatus(state.getStatus());
    }

    public EquipmentState getState() {
        return currentState;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void enable() {
        currentState.enable(this);
    }

    public void disable() {
        currentState.disable(this);
    }

    public void markUnderMaintenance() {
        currentState.markUnderMaintenance(this);
    }

    public String getCurrentStatus() {
        return currentState.getStatus();
    }
}