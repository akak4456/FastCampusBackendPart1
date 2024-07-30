package com.adele.mvc.model;

public class User {
    private final String userId;
    private final String name;

    public User(String userID, String name) {
        this.userId = userID;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
