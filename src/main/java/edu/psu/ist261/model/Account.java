package edu.psu.ist261.model;

import javax.swing.*;

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
        if (amount > balance) {
            JOptionPane.showMessageDialog(null, "Insufficient amount", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            balance -= amount;
        }
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

    @Override
    public String toString() {
        return  balance + accountType.toString();
    }
}