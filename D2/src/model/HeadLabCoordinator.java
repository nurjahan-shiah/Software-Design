package model;

public class HeadLabCoordinator extends User {
    private static final double HOURLY_FEE = 0.0;

    public HeadLabCoordinator() {}

    public HeadLabCoordinator(String userID, String name, String email,
                               String password, String department) {
        super(userID, name, email, password, "COORDINATOR", "COORD-001", "ACTIVE", department);
    }

    @Override
    public double getFeeRate() { return HOURLY_FEE; }

    // Req2 - only coordinator can create manager accounts
    public LabManager generateManagerAccount(String managerID, String name,
                                              String email, String tempPassword, String department) {
        return new LabManager(managerID, name, email, tempPassword, managerID, department);
    }
}
