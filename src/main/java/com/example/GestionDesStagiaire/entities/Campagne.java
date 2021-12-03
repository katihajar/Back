package com.example.GestionDesStagiaire.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Campagne implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCampagne;

    @Column(length = 50)
    private String nomCampagne;

    @Column(length = 200)
    private String description;

    @Column
    private Date dateDebut;

    @Column
    private Date dateFin;

    @Column
    private int seuil;

    @OneToMany(mappedBy = "campagne")
    private List<Candidat> candidats;

    @OneToMany(mappedBy = "campagne")
    private List<Critere> criteres;

    public Campagne() {}

    public int getIdCampagne() {
        return idCampagne;
    }

    public void setIdCampagne(int idCampagne) {
        this.idCampagne = idCampagne;
    }

    public String getNomCampagne() {
        return nomCampagne;
    }

    public void setNomCampagne(String nomCampagne) {
        this.nomCampagne = nomCampagne;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getSeuil() {
        return seuil;
    }

    public void setSeuil(int seuil) {
        this.seuil = seuil;
    }

    public List<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<Candidat> candidats) {
        this.candidats = candidats;
    }

    public List<Critere> getCriteres() {
        return criteres;
    }

    public void setCriteres(List<Critere> criteres) {
        this.criteres = criteres;
    }


}
