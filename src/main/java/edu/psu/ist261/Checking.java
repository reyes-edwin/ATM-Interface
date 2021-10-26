package edu.psu.ist261;

public class Checking {
    private double amount = 7654.34;

    public Checking(double amount) {
        this.amount = amount;
    }

    public Checking() {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "" + amount;
    }
}
