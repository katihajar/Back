package com.example.GestionDesStagiaire.services;

import com.example.GestionDesStagiaire.daos.CritereDao;

import java.util.List;

public interface CritereService {

    List<CritereDao> getAllCriteres(int page , int limit);

    CritereDao createCritere(CritereDao critereDao);

    public CritereDao getCritere(String idf);

    CritereDao updateCritere(String idf, CritereDao critereDao);
}
