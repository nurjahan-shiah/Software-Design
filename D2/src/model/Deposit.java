package model;

public class Deposit {
    private double amount;
    private boolean isForfeited;
    private boolean deductedFromTotal;

    public Deposit() {}

    public Deposit(double amount) {
        this.amount = amount;
        this.isForfeited = false;
        this.deductedFromTotal = false;
    }

    // Called when user is >20 min late (Req4)
    public void forfeit() {
        this.isForfeited = true;
    }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public boolean isForfeited() { return isForfeited; }
    public void setForfeited(boolean forfeited) { isForfeited = forfeited; }

    public boolean isDeductedFromTotal() { return deductedFromTotal; }
    public void setDeductedFromTotal(boolean deductedFromTotal) {
        this.deductedFromTotal = deductedFromTotal;
    }
}
