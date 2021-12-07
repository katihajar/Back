package com.example.GestionDesStagiaire.entities.DTO;

import com.example.GestionDesStagiaire.entities.Campagne;
import com.example.GestionDesStagiaire.entities.CandidatResponseCritere;

import java.io.Serializable;
import java.util.List;

public class CritereDto implements Serializable {

    private int idCritere;


    private String nomCritere;


    private String valPositive;


    private String valNegative;


    private boolean actif;


    private int poids;


    private Campagne campagne;


    private List<CandidatResponseCritere> candidatResponseCriteres;

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

    public Campagne getCampagne() {
        return campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    public List<CandidatResponseCritere> getCandidatResponseCriteres() {
        return candidatResponseCriteres;
    }

    public void setCandidatResponseCriteres(List<CandidatResponseCritere> candidatResponseCriteres) {
        this.candidatResponseCriteres = candidatResponseCriteres;
    }
}
