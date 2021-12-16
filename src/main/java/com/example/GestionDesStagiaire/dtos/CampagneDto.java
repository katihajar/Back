package com.example.GestionDesStagiaire.dtos;



import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CampagneDto implements Serializable {

    private int idCampagne;


    private String nomCampagne;


    private String description;


    private Date dateDebut;


    private Date dateFin;


    private int seuil;

    @JsonManagedReference
    private List<CandidatDto> candidats;

    @JsonManagedReference
    private List<CritereDto> criteres;

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

    public List<CandidatDto> getCandidats() {
        return candidats;
    }

    public void setCandidats(List<CandidatDto> candidats) {
        this.candidats = candidats;
    }

    public List<CritereDto> getCriteres() {
        return criteres;
    }

    public void setCriteres(List<CritereDto> criteres) {
        this.criteres = criteres;
    }
}
