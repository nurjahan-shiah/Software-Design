package model;

public class Researcher extends User {
    private static final double HOURLY_FEE = 20.0;

    public Researcher() {}

    public Researcher(String userID, String name, String email, String password,
                      String staffID, String status, String department) {
        super(userID, name, email, password, "RESEARCHER", staffID, status, department);
    }

    @Override
    public double getFeeRate() {
        return HOURLY_FEE;
    }
}
