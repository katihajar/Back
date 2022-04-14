package com.example.GestionDesStagiaire.services;

import com.example.GestionDesStagiaire.daos.UserDao;

import java.util.List;

public interface UserService {

    //List<UserDao> getAllUsers(int page , int limit);
    List<UserDao> getAllUsers();
    UserDao createSalarie(UserDao userDao);

    UserDao getUserById(int idUser);

    UserDao updateUser(int idUser, UserDao userDao);

    Boolean deleteUser(int idUser);
}
