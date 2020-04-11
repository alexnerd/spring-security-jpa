package com.alexnerd.springsecurityjpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user" )
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;
    private String password;
    private boolean active;
    private String roles;

    public long getId () {
        return this.id;
    }
    
    public String getUserName () {
        return this.userName;
    }

    public String getPassword () {
        return this.password;
    }

    public boolean isActive () {
        return this.active;
    }

    public String getRoles () {
        return this.roles;
    }

    public void setId (long id) {
        this.id = id;
    }
    
    public void setUserName (String userName) {
        this.userName = userName;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public void setActive (boolean active) {
        this.active = active;
    }

    public void setRoles (String roles) {
        this.roles = roles;
    }
}