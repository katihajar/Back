package com.example.GestionDesStagiaire.controllers;


import com.example.GestionDesStagiaire.daos.ProfileDao;
import com.example.GestionDesStagiaire.dtos.ProfileDto;
import com.example.GestionDesStagiaire.services.ProfileService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping
    public List<ProfileDto> getAllProfiles() {
        List<ProfileDto> profileDtos = new ArrayList<>();
        List<ProfileDao> profileDaos = profileService.getAllProfile();
        if (profileDaos != null) {
            profileDtos = ObjectMapperUtils.mapAll(profileDaos, ProfileDto.class);
        }
        return profileDtos;
    }
}
