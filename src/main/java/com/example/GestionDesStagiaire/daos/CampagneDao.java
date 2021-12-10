package com.example.GestionDesStagiaire.daos;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CampagneDao implements Serializable {

    private int idCampagne;

    private String nomCampagne;

    private String description;

    private Date dateDebut;

    private Date dateFin;

    private int seuil;


    private List<CandidatDao> candidats;

    private List<CritereDao> criteres;

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

    public List<CandidatDao> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<CandidatDao> candidats) {
        this.candidats = candidats;
    }

    public List<CritereDao> getCriteres() {
        return criteres;
    }

    public void setCriteres(List<CritereDao> criteres) {
        this.criteres = criteres;
    }
}
