package com.example.GestionDesStagiaire.dao;

import com.example.GestionDesStagiaire.entities.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class ProfileDao implements Serializable {


    private int idProfile;


    private String role;


    private List<UserDao> users;

    public int getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<UserDao> getUsers() {
        return users;
    }

    public void setUsers(List<UserDao> users) {
        this.users = users;
    }
}
