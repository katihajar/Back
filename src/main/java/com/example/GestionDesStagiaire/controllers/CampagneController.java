package com.example.GestionDesStagiaire.controllers;


import com.example.GestionDesStagiaire.daos.CampagneDao;
import com.example.GestionDesStagiaire.dtos.CampagneDto;
import com.example.GestionDesStagiaire.services.CampagneService;
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
@RequestMapping("/Campagne")
public class CampagneController {


    private static final Logger LOGGER= LoggerFactory.getLogger(CampagneController.class);

    @Autowired
    CampagneService campagneService;



    // API get All Campagnes
    @GetMapping
    public List<CampagneDto> getAllCampagnes( ){

        List<CampagneDto> campagneDtos=new ArrayList<>();
        List<CampagneDao> campagneDaos=campagneService.getAllCampagnes();
        if (campagneDaos!=null){
            campagneDtos= ObjectMapperUtils.mapAll(campagneDaos,CampagneDto.class);
        }
        return  campagneDtos;
    }

    //API create campagne
    @PostMapping
    public ResponseEntity<CampagneDto> createCampagne(@RequestBody(required = true) CampagneDto campagne) {

        CampagneDao campagneDao = campagneService.createCampagne(ObjectMapperUtils.map(campagne, CampagneDao.class));

        return new ResponseEntity<>(ObjectMapperUtils.map(campagneDao, CampagneDto.class), HttpStatus.CREATED);

    }
}
