package com.example.GestionDesStagiaire.daos;

import com.example.GestionDesStagiaire.entities.custom_keys.candidatResponseCritereKey;



public class CandidatResponseCritereDao {


    private candidatResponseCritereKey idCandidatRespCritere;


    private String response;

    private CritereDao critere;


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
