package com.example.GestionDesStagiaire.services.servicesImpli;

import com.example.GestionDesStagiaire.daos.ProfileDao;
import com.example.GestionDesStagiaire.entities.Profile;
import com.example.GestionDesStagiaire.repositories.ProfileRepository;
import com.example.GestionDesStagiaire.services.ProfileService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileServiceImpli implements ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    @Override
    public List<ProfileDao> getAllProfile() {
        List<ProfileDao> profileDaos = new ArrayList<>();
        List<Profile> profiles = profileRepository.findAll();
        if(profiles != null) {
            profileDaos = ObjectMapperUtils.mapAll(profiles,ProfileDao.class);
        }
        return profileDaos;
    }
}
