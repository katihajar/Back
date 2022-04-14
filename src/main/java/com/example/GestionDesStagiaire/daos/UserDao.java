package com.example.GestionDesStagiaire.daos;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;

public class UserDao implements Serializable {

    private int idUser;


    private String nomUser;


    private String prenomUser;


    private String emailUser;

    @JsonManagedReference
    private ProfileDao profile;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public ProfileDao getProfile() {
        return profile;
    }

    public void setProfile(ProfileDao profile) {
        this.profile = profile;
    }

    public UserDao() {  }

}
