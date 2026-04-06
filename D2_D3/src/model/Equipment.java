package model;

public class Equipment {
    private String equipmentID;
    private String name;
    private String description;
    private String type;
    private String status;        // AVAILABLE, DISABLED, MAINTENANCE
    private String buildingName;
    private String roomNumber;

    public Equipment() {}

    public Equipment(String equipmentID, String name, String description,
                     String type, String status, String buildingName, String roomNumber) {
        this.equipmentID = equipmentID;
        this.name = name;
        this.description = description;
        this.type = type;
        this.status = status;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public LabLocation getLabLocation() {
        return new LabLocation(buildingName, roomNumber);
    }

    public boolean isAvailable() {
        return "AVAILABLE".equals(status);
    }

    // Getters and Setters
    public String getEquipmentID() { return equipmentID; }
    public void setEquipmentID(String equipmentID) { this.equipmentID = equipmentID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getBuildingName() { return buildingName; }
    public void setBuildingName(String buildingName) { this.buildingName = buildingName; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    @Override
    public String toString() {
        return equipmentID + " - " + name + " [" + status + "] @ " + buildingName + " " + roomNumber;
    }
}
