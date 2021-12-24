package com.example.GestionDesStagiaire.services;

import com.example.GestionDesStagiaire.daos.CritereDao;

import java.util.List;

public interface CritereService {

    List<CritereDao> getAllCriteres();

    CritereDao createCritere(CritereDao critereDao);

    public CritereDao getCritere(int idf);

    CritereDao updateCritere(int idf, CritereDao critereDao);
}
