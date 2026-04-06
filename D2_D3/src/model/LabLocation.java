package model;

public class LabLocation {
    private String buildingName;
    private String roomNumber;

    public LabLocation() {}

    public LabLocation(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public String getLocationDetails() {
        return buildingName + " - Room " + roomNumber;
    }

    public String getBuildingName() { return buildingName; }
    public void setBuildingName(String buildingName) { this.buildingName = buildingName; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    @Override
    public String toString() {
        return buildingName + "," + roomNumber;
    }
}
