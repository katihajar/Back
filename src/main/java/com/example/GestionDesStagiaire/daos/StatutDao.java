package com.example.GestionDesStagiaire.daos;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.List;

public class StatutDao implements Serializable {


    private int idStatut;

    private String valeur;

    @JsonBackReference
    private List<CandidatDao> candidats;


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

    public List<CandidatDao> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<CandidatDao> candidats) {
        this.candidats = candidats;
    }
}
