package com.example.GestionDesStagiaire.services.servicesImpli;

import com.example.GestionDesStagiaire.daos.CampagneDao;
import com.example.GestionDesStagiaire.entities.Campagne;
import com.example.GestionDesStagiaire.repositories.CampagneRepository;
import com.example.GestionDesStagiaire.services.CampagneService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CampagneServiceImpli implements CampagneService {

    CampagneRepository campagneRepository ;

    @Override
    public List<CampagneDao> getAllCampagnes(int page, int limit) {
        List<CampagneDao> CampagneDaos=new ArrayList<>();
        List<Campagne> Campagnes = campagneRepository.findAll();
        if (Campagnes != null) {
            CampagneDaos= ObjectMapperUtils.mapAll(Campagnes,CampagneDao.class);
        }
        return CampagneDaos;
    }

    @Override
    public CampagneDao createCampagne(CampagneDao campagneDao) {
        Campagne newCampagne = campagneRepository.save(ObjectMapperUtils.map(campagneDao, Campagne.class));
        return ObjectMapperUtils.map(newCampagne, CampagneDao.class);
    }

    @Override
    public CampagneDao getCampagne(String idf) {
        Optional<Campagne> campagne = campagneRepository.findById(idf);

        if (campagne.isEmpty())
            return null;

        return ObjectMapperUtils.map(campagne.get(), CampagneDao.class);
    }

    @Override
    public CampagneDao updateCampagne(String idf, CampagneDao campagnePresDao) {
        if (!campagneRepository.existsById(idf))
            return null;
        Campagne savedCampagne = campagneRepository.save(ObjectMapperUtils.map(campagnePresDao, Campagne.class));
        return ObjectMapperUtils.map(savedCampagne, CampagneDao.class);
    }
    }

