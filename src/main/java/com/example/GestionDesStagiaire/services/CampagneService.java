package com.example.GestionDesStagiaire.services;

import com.example.GestionDesStagiaire.daos.CampagneDao;

import java.util.List;

public interface CampagneService {


    List<CampagneDao> getAllCampagnes(int page , int limit);

    CampagneDao createCampagne(CampagneDao campagneDao);

    public CampagneDao getCampagne(String idf);

    CampagneDao updateCampagne(String idf, CampagneDao campagneDao);

}
