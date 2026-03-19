package pattern.observer;

/**
 * Observer Pattern - Observer Interface
 * Any class that wants to be notified of equipment status changes implements this.
 */
public interface EquipmentObserver {
    void update(String equipmentID, String newStatus);
}
