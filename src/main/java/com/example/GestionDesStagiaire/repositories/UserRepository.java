package com.example.GestionDesStagiaire.repositories;

import com.example.GestionDesStagiaire.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
