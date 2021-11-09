package edu.psu.ist261;

public class Account {

    enum AccountType {
        Savings,
        Checking
    }

    private double balance =  4282.29;

    public Account() {}

    public Account(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return  "" + balance;
    }

}