package model;

public class Faculty extends User {
    private static final double HOURLY_FEE = 15.0;

    public Faculty() {}

    public Faculty(String userID, String name, String email, String password,
                   String staffID, String status, String department) {
        super(userID, name, email, password, "FACULTY", staffID, status, department);
    }

    @Override
    public double getFeeRate() {
        return HOURLY_FEE;
    }
}
