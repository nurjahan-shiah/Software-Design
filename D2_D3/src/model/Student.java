package model;

public class Student extends User {
    private static final double HOURLY_FEE = 10.0;

    public Student() {}

    public Student(String userID, String name, String email, String password,
                   String staffID, String status, String department) {
        super(userID, name, email, password, "STUDENT", staffID, status, department);
    }

    @Override
    public double getFeeRate() {
        return HOURLY_FEE;
    }
}
