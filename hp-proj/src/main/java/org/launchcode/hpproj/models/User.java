package org.launchcode.hpproj.models;

import javax.persistence.Entity;

//@Entity
public class User extends AbstractEntity{

    private String username;

    private String pwHash;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.pwHash = password;
    }

    public String getUsername() {
        return username;
    }
}
