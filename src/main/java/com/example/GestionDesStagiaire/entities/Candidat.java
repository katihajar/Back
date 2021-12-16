package com.example.GestionDesStagiaire.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Candidat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCandidat;

    @Column(length = 50)
    private String nomCandidat;

    @Column(length = 50)
    private String prenomCandidat;

    @Column(length = 50)
    private String emailCandidat;

    @Column(length = 50)
    private String telephone;

    @Column(length = 50)
    private String cv;

    @Column
    private int reussiSelectionAuto;

    @Column(length = 200)
    private String commentaire1;

    @Column(length = 200)
    private String commentaire2;

    @Column(length = 200)
    private String commentaire3;

    @Column(length = 200)
    private String commentaire4;

    @Column
    private int Score;

    @Column(length = 50)
    private String IsCreatedBy;

    @ManyToOne
    @JoinColumn(name="idCampagne", nullable=false)
    @JsonBackReference
    private Campagne campagne;

    @OneToMany(mappedBy = "candidat")
    @JsonManagedReference
    private List<CandidatResponseCritere> candidatResponseCriteres;

    @ManyToOne
    @JoinColumn(name="idStatut", nullable=false)
    @JsonManagedReference
    private Statut statut;

    public Candidat() {  }

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
}
