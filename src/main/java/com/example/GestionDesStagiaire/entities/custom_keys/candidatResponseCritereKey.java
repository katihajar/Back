package com.example.GestionDesStagiaire.entities.custom_keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
public class candidatResponseCritereKey implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name="idCandidat")
    private int idCandidat;

    @Column(name = "idCritere")
    private int idCritere;

    public candidatResponseCritereKey() {  }

    public candidatResponseCritereKey(int idCandidat, int idCritere) {
        this.idCandidat = idCandidat;
        this.idCritere = idCritere;
    }

    public int getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }

    public int getIdCritere() {
        return idCritere;
    }

    public void setIdCritere(int idCritere) {
        this.idCritere = idCritere;
    }
}
