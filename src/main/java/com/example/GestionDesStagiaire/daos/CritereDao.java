package com.example.GestionDesStagiaire.daos;

import java.io.Serializable;
import java.util.List;

public class CritereDao implements Serializable {

    private int idCritere;


    private String nomCritere;


    private String valPositive;


    private String valNegative;


    private boolean actif;


    private int poids;


    private CampagneDao campagne;


    private List<CandidatResponseCritereDao> candidatResponseCriteres;

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

    public CampagneDao getCampagne() {
        return campagne;
    }

    public void setCampagne(CampagneDao campagne) {
        this.campagne = campagne;
    }

    public List<CandidatResponseCritereDao> getCandidatResponseCriteres() {
        return candidatResponseCriteres;
    }

    public void setCandidatResponseCriteres(List<CandidatResponseCritereDao> candidatResponseCriteres) {
        this.candidatResponseCriteres = candidatResponseCriteres;
    }
}
