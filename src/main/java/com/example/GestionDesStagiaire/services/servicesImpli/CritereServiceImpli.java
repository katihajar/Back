package com.example.GestionDesStagiaire.services.servicesImpli;


import com.example.GestionDesStagiaire.daos.CritereDao;

import com.example.GestionDesStagiaire.entities.Critere;

import com.example.GestionDesStagiaire.repositories.CritereRepository;
import com.example.GestionDesStagiaire.services.CritereService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CritereServiceImpli implements CritereService {
    @Autowired
    CritereRepository critereRepository ;


    @Override
    public List<CritereDao> getAllCriteres() {
        List<CritereDao> CritereDaos=new ArrayList<>();
        List<Critere> Criteres = critereRepository.findAll();
        if (Criteres != null) {
            CritereDaos= ObjectMapperUtils.mapAll(Criteres,CritereDao.class);
        }
        return CritereDaos;
    }

    @Override
    public CritereDao createCritere(CritereDao critereDao) {
        Critere newCritere = critereRepository.save(ObjectMapperUtils.map(critereDao, Critere.class));
        return ObjectMapperUtils.map(newCritere, CritereDao.class);
    }

    @Override
    public CritereDao getCritere(int idf) {
        Optional<Critere> critere = critereRepository.findById(idf);

        if (critere.isEmpty())
            return null;

        return ObjectMapperUtils.map(critere.get(), CritereDao.class);
    }

    @Override
    public CritereDao updateCritere(int idf, CritereDao criterePresDao) {
        if (!critereRepository.existsById(idf))
            return null;
        Critere savedCritere = critereRepository.save(ObjectMapperUtils.map(criterePresDao, Critere.class));
        return ObjectMapperUtils.map(savedCritere, CritereDao.class);

    }
}
