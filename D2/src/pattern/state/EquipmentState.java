package pattern.state;

public interface EquipmentState {
    void enable(EquipmentContext context);
    void disable(EquipmentContext context);
    void markUnderMaintenance(EquipmentContext context);
    String getStatus();
}