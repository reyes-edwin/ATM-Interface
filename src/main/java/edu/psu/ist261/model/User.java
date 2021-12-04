package edu.psu.ist261.model;

import edu.psu.ist261.model.Account;

import java.util.HashMap;
import java.util.Map;

public class User  {
    private String firstName;
    private String lastName;
    private String uuid;
    private String pinNumber;
//    private Map<Account.Type, Account> accountMap =new HashMap<>();
    private Map<Account, Account> account =new HashMap<>();

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


//    public Account getAccount(Account.Type account) {
//        return accountMap.get(account);
//    }


//    public Map<Account.Type, Account> getAccountMap() {
//        return accountMap;
//    }


    public Map<Account, Account> getAccountMap() {
        return account;
    }

    public Account getBalance(Account balance) {
        return this.account.get(balance.getBalance());
    }


    public void addAccount(Account account) {
        this.account.put(account, account);
    }

    public String getUuid() {
        return uuid;
    }

    public String getPinNumber() {
        return pinNumber;
    }

}
