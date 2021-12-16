package com.example.GestionDesStagiaire.daos;

import com.example.GestionDesStagiaire.entities.custom_keys.candidatResponseCritereKey;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


public class CandidatResponseCritereDao {


    private candidatResponseCritereKey idCandidatRespCritere;


    private String response;

    @JsonManagedReference
    private CritereDao critere;

    @JsonBackReference
    private CandidatDao candidat;

    public candidatResponseCritereKey getIdCandidatRespCritere() {
        return idCandidatRespCritere;
    }

    public void setIdCandidatRespCritere(candidatResponseCritereKey idCandidatRespCritere) {
        this.idCandidatRespCritere = idCandidatRespCritere;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public CritereDao getCritere() {
        return critere;
    }

    public void setCritere(CritereDao critere) {
        this.critere = critere;
    }

    public CandidatDao getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatDao candidat) {
        this.candidat = candidat;
    }
}
