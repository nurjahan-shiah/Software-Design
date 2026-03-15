package model;

public class Guest extends User {
    private static final double HOURLY_FEE = 30.0;
    private String certificationNumber;

    public Guest() {}

    public Guest(String userID, String name, String email, String password,
                 String certificationNumber, String status, String department) {
        super(userID, name, email, password, "GUEST", certificationNumber, status, department);
        this.certificationNumber = certificationNumber;
    }

    @Override
    public double getFeeRate() {
        return HOURLY_FEE;
    }

    public String getCertificationNumber() { return certificationNumber; }
    public void setCertificationNumber(String certificationNumber) {
        this.certificationNumber = certificationNumber;
    }
}
