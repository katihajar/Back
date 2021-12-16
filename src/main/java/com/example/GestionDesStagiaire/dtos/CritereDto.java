package com.example.GestionDesStagiaire.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;

public class CritereDto implements Serializable {

    private int idCritere;


    private String nomCritere;


    private String valPositive;


    private String valNegative;


    private boolean actif;

    private int poids;

    @JsonBackReference
    private CampagneDto campagne;

    @JsonBackReference
    private List<CandidatResponseCritereDto> candidatResponseCriteres;

    public int getIdCritere() {
        return idCritere;
    }

    public void setIdCritere(int idCritere) {
        this.idCritere = idCritere;
    }

    public String getNomCritere() {
        return nomCritere;
    }

    public void setNomCritere(String nomCritere) {
        this.nomCritere = nomCritere;
    }

    public String getValPositive() {
        return valPositive;
    }

    public void setValPositive(String valPositive) {
        this.valPositive = valPositive;
    }

    public String getValNegative() {
        return valNegative;
    }

    public void setValNegative(String valNegative) {
        this.valNegative = valNegative;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public CampagneDto getCampagne() {
        return campagne;
    }

    public void setCampagne(CampagneDto campagne) {
        this.campagne = campagne;
    }

    public List<CandidatResponseCritereDto> getCandidatResponseCriteres() {
        return candidatResponseCriteres;
    }

    public void setCandidatResponseCriteres(List<CandidatResponseCritereDto> candidatResponseCriteres) {
        this.candidatResponseCriteres = candidatResponseCriteres;
    }
}
