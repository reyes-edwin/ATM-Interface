package edu.psu.ist261.model;

public class Account {
//    Users account type
    public enum Type {
        Savings,
        Checking
    }

    private double balance;
    private Type accountType;

    public Account(double balance, Type accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public Type getAccountType() {
        return accountType;
    }
}