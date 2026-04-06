package model;

public abstract class User {
    protected String userID;
    protected String name;
    protected String email;
    protected String password;
    protected String userType;   // STUDENT, FACULTY, RESEARCHER, GUEST
    protected String staffID;    // student/staff ID or certification number (Req8)
    protected String status;     // ACTIVE, PENDING
    protected String department;

    public User() {}

    public User(String userID, String name, String email, String password,
                String userType, String staffID, String status, String department) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.staffID = staffID;
        this.status = status;
        this.department = department;
    }

    // Abstract method - each subclass returns its own hourly fee (Req3, Req4)
    public abstract double getFeeRate();

    // Getters and Setters
    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }

    public String getStaffID() { return staffID; }
    public void setStaffID(String staffID) { this.staffID = staffID; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String toString() {
        return "User [" + userID + ", " + name + ", " + email + ", " + userType + ", " + status + "]";
    }
}
