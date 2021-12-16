package com.example.GestionDesStagiaire.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.List;

public class StatutDto implements Serializable {


    private int idStatut;

    private String valeur;

    @JsonBackReference
    private List<CandidatDto> candidats;


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

    public List<CandidatDto> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<CandidatDto> candidats) {
        this.candidats = candidats;
    }
}
