package edu.psu.ist261;

public class Account {
    private double checkingAmount = 4654.34;
    private double savingsAmount = 8239.87;
    private String checking = "Primary Checking";
    private String savings = "Savings";

    public Account() {}


    public Account(double checkingAmount, double savingsAmount, String checking, String savings) {
        this.checkingAmount = checkingAmount;
        this.savingsAmount = savingsAmount;
        this.checking = checking;
        this.savings = savings;
    }

    public double getCheckingAmount() {
        return checkingAmount;
    }

    public void setCheckingAmount(double checkingAmount) {
        this.checkingAmount = checkingAmount;
    }

    public double getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(double savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public String getChecking() {
        return checking;
    }

    public void setChecking(String checking) {
        this.checking = checking;
    }

    public String getSavings() {
        return savings;
    }

    public void setSavings(String savings) {
        this.savings = savings;
    }

    @Override
    public String toString() {
        return "" + checkingAmount;
    }
}
