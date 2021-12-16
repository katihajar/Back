package com.example.GestionDesStagiaire.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Critere implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private int idCritere;

    @Column(length = 200)
    private String nomCritere;

    @Column(length = 100)
    private String valPositive;

    @Column(length = 100)
    private String valNegative;

    @Column
    private boolean actif;

    @Column
    private int poids;

    @ManyToOne
    @JoinColumn(name="idCampagne", nullable=false)
    @JsonBackReference
    private Campagne campagne;

    @OneToMany(mappedBy = "critere")
    @JsonBackReference
    private List<CandidatResponseCritere> candidatResponseCriteres;

    public Critere() {  }

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
