package edu.psu.ist261;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User  {
    private String userID;
    private String firstName;
    private String lastName;
//    private List<Account> accountList;
    private Map<Account.Type, Account> accountMap = new HashMap<Account.Type, Account>();

    public User(String firstName, String lastName, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
//        this.accountList = new ArrayList<>();
    }

    public User() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {this.firstName = firstName; }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(Account.Type account) {
        return accountMap.get(account);
    }

    public void addAccount(Account account) {
        this.accountMap.put(account.getAccountType(), account);
    }

    public void setLastName(String lastName) {this.lastName = lastName; }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

//    public List<Account> getAccountList() {
//        return accountList;
//    }
//
//    public void setAccountList(List<Account> accountList) {
//        this.accountList = accountList;
//    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
