package com.example.GestionDesStagiaire.repositories;


import com.example.GestionDesStagiaire.entities.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampagneRepository extends JpaRepository<Campagne,Integer> {
}
