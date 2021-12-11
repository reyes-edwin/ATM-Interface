package edu.psu.ist261.model;

import java.util.HashMap;
import java.util.Map;

public class User  {
    private String firstName;
    private String lastName;
    private String uuid;
    private String pinNumber;
    private Map<String, Account> account = new HashMap<>();

    public User(String firstName, String lastName, String uuid, String pinNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = uuid;
        this.pinNumber = pinNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account accounts ) {
        this.account.put(getUuid(), accounts);
    }

    public Account getAccountID(String uuid)  {
        return this.account.get(uuid);
    }

    public String getUuid() {
        return uuid;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public String getFullName() {
        return this.getFirstName() + " " + getLastName();
    }

    public Map<String, Account> getAccount() {
        return account;
    }
}
