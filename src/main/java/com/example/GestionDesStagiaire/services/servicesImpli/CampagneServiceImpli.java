package com.example.GestionDesStagiaire.services.servicesImpli;

import com.example.GestionDesStagiaire.daos.CampagneDao;
import com.example.GestionDesStagiaire.entities.Campagne;
import com.example.GestionDesStagiaire.repositories.CampagneRepository;
import com.example.GestionDesStagiaire.services.CampagneService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CampagneServiceImpli implements CampagneService {

    @Autowired
    CampagneRepository campagneRepository ;

    @Override
    public List<CampagneDao> getAllCampagnes() {
        List<CampagneDao> campagneDaos=new ArrayList<>();
        List<Campagne> campagnes = campagneRepository.findAll();
        if (campagnes != null) {
            campagneDaos= ObjectMapperUtils.mapAll(campagnes,CampagneDao.class);
        }
        return campagneDaos;
    }

    @Override
    public CampagneDao createCampagne(CampagneDao campagneDao) {
        Campagne newCampagne = campagneRepository.save(ObjectMapperUtils.map(campagneDao, Campagne.class));
        return ObjectMapperUtils.map(newCampagne, CampagneDao.class);
    }

    @Override
    public CampagneDao getCampagne(int idf) {
        Optional<Campagne> campagne = campagneRepository.findById(idf);

        if (campagne.isEmpty())
            return null;

        return ObjectMapperUtils.map(campagne.get(), CampagneDao.class);
    }

    @Override
    public CampagneDao updateCampagne(int idf, CampagneDao campagnePresDao) {
        if (!campagneRepository.existsById(idf))
            return null;
        Campagne savedCampagne = campagneRepository.save(ObjectMapperUtils.map(campagnePresDao, Campagne.class));
        return ObjectMapperUtils.map(savedCampagne, CampagneDao.class);
    }
    }

