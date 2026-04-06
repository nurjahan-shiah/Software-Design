package pattern.state;

public class AvailableState implements EquipmentState {

    @Override
    public void enable(EquipmentContext context) {
        System.out.println("Equipment is already enabled and available.");
    }

    @Override
    public void disable(EquipmentContext context) {
        context.setState(new DisabledState());
        System.out.println("Equipment has been disabled.");
    }

    @Override
    public void markUnderMaintenance(EquipmentContext context) {
        context.setState(new MaintenanceState());
        System.out.println("Equipment is now under maintenance.");
    }

    @Override
    public String getStatus() {
        return "AVAILABLE";
    }
}