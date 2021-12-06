package com.example.GestionDesStagiaire.dao;

import com.example.GestionDesStagiaire.entities.Candidat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class StatutDao implements Serializable {




    private int idStatut;


    private String valeur;


    private List<Candidat> candidats;


    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public List<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<Candidat> candidats) {
        this.candidats = candidats;
    }
}
