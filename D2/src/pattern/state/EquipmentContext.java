package pattern.state;

import pattern.observer.EquipmentObserver;
import pattern.observer.EquipmentSubject;
import java.util.ArrayList;
import java.util.List;

/**
 * State Pattern - Context class
 * Holds the current state of a piece of equipment.
 * Also implements EquipmentSubject (Observer Pattern) to notify
 * observers when the equipment status changes (Req5, Req6).
 */
public class EquipmentContext implements EquipmentSubject {

    private EquipmentState currentState;
    private String equipmentID;

    // Observer pattern - list of observers watching this equipment
    private List<EquipmentObserver> observers = new ArrayList<>();

    public EquipmentContext(String equipmentID, String initialStatus) {
        this.equipmentID = equipmentID;
        this.currentState = getStateFromString(initialStatus);
    }

    // --- State Pattern methods ---

    public void enable() {
        currentState.enable(this);
    }

    public void disable() {
        currentState.disable(this);
    }

    public void markUnderMaintenance() {
        currentState.markUnderMaintenance(this);
    }

    public void setState(EquipmentState newState) {
        this.currentState = newState;
        notifyObservers(equipmentID, getStatusString());
    }

    public EquipmentState getCurrentState() {
        return currentState;
    }

    public String getStatusString() {
        if (currentState instanceof AvailableState)    return "AVAILABLE";
        if (currentState instanceof DisabledState)     return "DISABLED";
        if (currentState instanceof MaintenanceState)  return "MAINTENANCE";
        return "UNKNOWN";
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    // --- Observer Pattern methods ---

    @Override
    public void registerObserver(EquipmentObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(EquipmentObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String equipmentID, String newStatus) {
        for (EquipmentObserver observer : observers) {
            observer.update(equipmentID, newStatus);
        }
    }

    // Helper to convert string to State object
    private EquipmentState getStateFromString(String status) {
        switch (status.toUpperCase()) {
            case "AVAILABLE":   return new AvailableState();
            case "DISABLED":    return new DisabledState();
            case "MAINTENANCE": return new MaintenanceState();
            default:            return new AvailableState();
        }
    }
}