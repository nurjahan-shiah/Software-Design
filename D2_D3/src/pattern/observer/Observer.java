package pattern.observer;

/**
 * Observer Pattern - Base marker interface (GoF definition).
 *
 * In the classic Gang of Four structure the Observer interface is the root
 * that all concrete observers extend.  In this system the equipment-specific
 * sub-interface EquipmentObserver extends Observer and adds the domain-specific
 * update(equipmentID, newStatus) contract.
 *
 * Hierarchy:
 *   Observer  (this file - base marker)
 *     └─ EquipmentObserver   (domain update contract)
 *          └─ UserNotificationObserver  (concrete observer)
 */
public interface Observer {
    // Marker interface - domain-specific update signatures
    // are declared in sub-interfaces (e.g. EquipmentObserver).
}