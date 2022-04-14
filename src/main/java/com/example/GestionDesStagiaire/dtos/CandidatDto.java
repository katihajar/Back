package com.example.GestionDesStagiaire.dtos;

import com.example.GestionDesStagiaire.entities.Campagne;
import com.example.GestionDesStagiaire.entities.CandidatResponseCritere;
import com.example.GestionDesStagiaire.entities.Statut;

import java.io.Serializable;
import java.util.List;

public class CandidatDto implements Serializable {

    private int idCandidat;


    private String nomCandidat;


    private String prenomCandidat;


    private String emailCandidat;


    private String telephone;


    private String cv;


    private int reussiSelectionAuto;


    private String commentaire1;


    private String commentaire2;


    private String commentaire3;


    private String commentaire4;


    private int Score;


    private String IsCreatedBy;


    private Campagne campagne;


    private List<CandidatResponseCritere> candidatResponseCriteres;


    private Statut statut;

    public int getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }

    public String getNomCandidat() {
        return nomCandidat;
    }

    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }

    public String getPrenomCandidat() {
        return prenomCandidat;
    }

    public void setPrenomCandidat(String prenomCandidat) {
        this.prenomCandidat = prenomCandidat;
    }

    public String getEmailCandidat() {
        return emailCandidat;
    }

    public void setEmailCandidat(String emailCandidat) {
        this.emailCandidat = emailCandidat;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public int getReussiSelectionAuto() {
        return reussiSelectionAuto;
    }

    public void setReussiSelectionAuto(int reussiSelectionAuto) {
        this.reussiSelectionAuto = reussiSelectionAuto;
    }

    public String getCommentaire1() {
        return commentaire1;
    }

    public void setCommentaire1(String commentaire1) {
        this.commentaire1 = commentaire1;
    }

    public String getCommentaire2() {
        return commentaire2;
    }

    public void setCommentaire2(String commentaire2) {
        this.commentaire2 = commentaire2;
    }

    public String getCommentaire3() {
        return commentaire3;
    }

    public void setCommentaire3(String commentaire3) {
        this.commentaire3 = commentaire3;
    }

    public String getCommentaire4() {
        return commentaire4;
    }

    public void setCommentaire4(String commentaire4) {
        this.commentaire4 = commentaire4;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getIsCreatedBy() {
        return IsCreatedBy;
    }

    public void setIsCreatedBy(String isCreatedBy) {
        IsCreatedBy = isCreatedBy;
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

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
}
