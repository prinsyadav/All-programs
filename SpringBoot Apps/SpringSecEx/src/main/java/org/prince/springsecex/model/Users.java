package org.prince.springsecex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    private int id;
    private String username;
    private String password;

    public Users() {
    }

    public Users(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
