package edu.psu.ist261;

public class Account {
    private double checking = 7043.45;
    private double savings = 20392.23;
    private String primaryCheck = "Primary Checking";
    private String saving = "Savings";

    public Account() {
    }

    public Account(double checking, double savings, String primaryCheck, String saving) {
        this.checking = checking;
        this.savings = savings;
        this.primaryCheck = primaryCheck;
        this.saving = saving;
    }

    public double getChecking() {
        return checking;
    }

    public void setChecking(double checking) {
        this.checking = checking;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public String getPrimaryCheck() {
        return primaryCheck;
    }

    public void setPrimaryCheck(String primaryCheck) {
        this.primaryCheck = primaryCheck;
    }

    public String getSaving() {
        return saving;
    }

    public void setSaving(String saving) {
        this.saving = saving;
    }

}


