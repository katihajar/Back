package com.example.GestionDesStagiaire.dtos;

import com.example.GestionDesStagiaire.entities.Candidat;
import com.example.GestionDesStagiaire.entities.Critere;

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


    private List<Candidat> candidatsDto;


    private List<Critere> criteresDto;

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
        return candidatsDto;
    }

    public void setCandidats(List<Candidat> candidats) {
        this.candidatsDto = candidats;
    }

    public List<Critere> getCriteres() {
        return criteresDto;
    }

    public void setCriteres(List<Critere> criteres) {
        this.criteresDto = criteres;
    }
}
