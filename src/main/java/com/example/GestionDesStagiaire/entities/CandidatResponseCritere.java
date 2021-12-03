package com.example.GestionDesStagiaire.entities;

import com.example.GestionDesStagiaire.entities.custom_keys.candidatResponseCritereKey;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CandidatResponseCritere implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private candidatResponseCritereKey idCandidatRespCritere;

    @Column(length = 100)
    private String response;

    @ManyToOne
    @JoinColumn(name="idCritere", nullable=false, insertable = false, updatable = false)
    private Critere critere;

    @ManyToOne
    @JoinColumn(name="idCandidat", nullable= false, insertable = false, updatable = false)
    private Candidat candidat;

    public CandidatResponseCritere() {   }

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

    public Critere getCritere() {
        return critere;
    }

    public void setCritere(Critere critere) {
        this.critere = critere;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }
}
