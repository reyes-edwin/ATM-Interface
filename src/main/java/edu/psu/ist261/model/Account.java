package edu.psu.ist261.model;

import java.util.HashMap;
import java.util.Map;

public class Account {

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

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public Type getAccountType() {
        return accountType;
    }

    public void setAccountType(Type accountType) {
        this.accountType = accountType;
    }


}