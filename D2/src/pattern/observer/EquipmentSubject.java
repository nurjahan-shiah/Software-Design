package pattern.observer;

/**
 * Observer Pattern - Subject Interface
 * EquipmentContext implements this to support registering/notifying observers.
 */
public interface EquipmentSubject {
    void registerObserver(EquipmentObserver observer);
    void removeObserver(EquipmentObserver observer);
    void notifyObservers(String equipmentID, String newStatus);
}
