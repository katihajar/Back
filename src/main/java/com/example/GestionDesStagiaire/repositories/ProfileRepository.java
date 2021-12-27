package com.example.GestionDesStagiaire.repositories;

import com.example.GestionDesStagiaire.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Integer> {
}
