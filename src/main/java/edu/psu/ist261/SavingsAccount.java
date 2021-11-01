package edu.psu.ist261;

public class SavingsAccount {
    private double balance = 5300.55;
    private String type = "Savings";

    public SavingsAccount(double balance, String type) {
        this.balance = balance;
        this.type = type;
    }

    public SavingsAccount() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return " " + balance;
    }
}
