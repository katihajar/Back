package com.example.GestionDesStagiaire.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Statut implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStatut;

    @Column(length = 100)
    private String valeur;

    @OneToMany(mappedBy = "statut")
    private List<Candidat> candidats;

    public Statut() { }

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

    public List<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<Candidat> candidats) {
        this.candidats = candidats;
    }
}
