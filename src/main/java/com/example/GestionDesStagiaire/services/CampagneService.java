package com.example.GestionDesStagiaire.services;

import com.example.GestionDesStagiaire.daos.CampagneDao;

import java.util.List;

public interface CampagneService {


    List<CampagneDao> getAllCampagnes();

    CampagneDao createCampagne(CampagneDao campagneDao);

    public CampagneDao getCampagne(int idf);

    CampagneDao updateCampagne(int idf, CampagneDao campagneDao);

}
