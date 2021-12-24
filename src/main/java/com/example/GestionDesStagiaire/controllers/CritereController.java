package com.example.GestionDesStagiaire.controllers;


import com.example.GestionDesStagiaire.daos.CampagneDao;
import com.example.GestionDesStagiaire.daos.CritereDao;
import com.example.GestionDesStagiaire.dtos.CampagneDto;
import com.example.GestionDesStagiaire.dtos.CritereDto;
import com.example.GestionDesStagiaire.services.CampagneService;
import com.example.GestionDesStagiaire.services.CritereService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Critere")
public class CritereController {

    private static final Logger LOGGER= LoggerFactory.getLogger(CritereController.class);

    @Autowired
    CritereService critereService;


    // API get All Criteres
    @GetMapping
    public List<CritereDto> getAllCriteres(){

        List<CritereDto> critereDtos=new ArrayList<>();
        List<CritereDao> critereDaos=critereService.getAllCriteres();
        if (critereDaos!=null){
            critereDtos= ObjectMapperUtils.mapAll(critereDaos,CritereDto.class);
        }
        return  critereDtos;
    }

    //API create Critere
    @PostMapping
    public ResponseEntity<CritereDto> createCritere(@RequestBody(required = true) CritereDto critere) {

        CritereDao critereDao = critereService.createCritere(ObjectMapperUtils.map(critere, CritereDao.class));

        return new ResponseEntity<>(ObjectMapperUtils.map(critereDao, CritereDto.class), HttpStatus.CREATED);

    }

}
