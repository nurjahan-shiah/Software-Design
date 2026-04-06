package pattern.state;

public class DisabledState implements EquipmentState {

    @Override
    public void enable(EquipmentContext context) {
        context.setState(new AvailableState());
        System.out.println("Equipment has been enabled and is now available.");
    }

    @Override
    public void disable(EquipmentContext context) {
        System.out.println("Equipment is already disabled.");
    }

    @Override
    public void markUnderMaintenance(EquipmentContext context) {
        context.setState(new MaintenanceState());
        System.out.println("Equipment moved from disabled to maintenance.");
    }

    @Override
    public String getStatus() {
        return "DISABLED";
    }
}