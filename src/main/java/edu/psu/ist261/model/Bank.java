package edu.psu.ist261.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String bankName;
    private Map<String, User> userMap = new HashMap<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addUser(User user) {
        this.userMap.put(user.getUuid(), user);
    }

    public User getUser(String uuid) {
        return userMap.get(uuid);
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }
}
