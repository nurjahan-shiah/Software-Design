package model;

public class LabManager extends User {
    private static final double HOURLY_FEE = 0.0;
    private String managerID;

    public LabManager() {}

    public LabManager(String userID, String name, String email, String password,
                      String managerID, String department) {
        super(userID, name, email, password, "MANAGER", managerID, "ACTIVE", department);
        this.managerID = managerID;
    }

    @Override
    public double getFeeRate() { return HOURLY_FEE; }

    public String getManagerID() { return managerID; }
    public void setManagerID(String managerID) { this.managerID = managerID; }
}
