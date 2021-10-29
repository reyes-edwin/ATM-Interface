package edu.psu.ist261;

public class CheckingAccount {
    private double balance = 7443.67;
    private String type = "Primary Checking";

    public CheckingAccount(double balance, String type) {
        this.balance = balance;
        this.type = type;
    }

    public CheckingAccount() {
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
