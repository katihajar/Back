package com.example.GestionDesStagiaire.dtos;

import com.example.GestionDesStagiaire.entities.custom_keys.candidatResponseCritereKey;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


public class CandidatResponseCritereDto {


    private candidatResponseCritereKey idCandidatRespCritere;


    private String response;

    @JsonManagedReference
    private CritereDto critere;

    @JsonBackReference
    private CandidatDto candidat;

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

    public CritereDto getCritere() {
        return critere;
    }

    public void setCritere(CritereDto critere) {
        this.critere = critere;
    }

    public CandidatDto getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatDto candidat) {
        this.candidat = candidat;
    }
}
