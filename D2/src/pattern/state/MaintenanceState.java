package pattern.state;

public class MaintenanceState implements EquipmentState {

    @Override
    public void enable(EquipmentContext context) {
        context.setState(new AvailableState());
        System.out.println("Maintenance completed. Equipment is now available.");
    }

    @Override
    public void disable(EquipmentContext context) {
        context.setState(new DisabledState());
        System.out.println("Equipment has been disabled from maintenance state.");
    }

    @Override
    public void markUnderMaintenance(EquipmentContext context) {
        System.out.println("Equipment is already under maintenance.");
    }

    @Override
    public String getStatus() {
        return "MAINTENANCE";
    }
}