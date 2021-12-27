package com.example.GestionDesStagiaire.services.servicesImpli;

import com.example.GestionDesStagiaire.daos.UserDao;
import com.example.GestionDesStagiaire.entities.User;
import com.example.GestionDesStagiaire.repositories.UserRepository;
import com.example.GestionDesStagiaire.services.UserService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpli implements UserService {

    @Autowired
    UserRepository userRepository;

    /*@Override
    public List<UserDao> getAllUsers(int page , int limit) {

        if (page > 0) page -= 1;

        List<UserDao> usersDao = new ArrayList<>();
        Pageable pageableRequest = PageRequest.of(page,limit);
        Page<User> userPage = userRepository.findAll(pageableRequest);
        List<User> users = userPage.getContent();
        if(users != null) {
            usersDao = ObjectMapperUtils.mapAll(users,UserDao.class);
        }
        return usersDao;
    }*/
    @Override
    public List<UserDao> getAllUsers() {

        List<UserDao> usersDao = new ArrayList<>();
        List<User> users = userRepository.findAll();
        if(users != null) {
            usersDao = ObjectMapperUtils.mapAll(users,UserDao.class);
        }
        return usersDao;
    }

    @Override
    public UserDao createSalarie(UserDao userDao) {
        User user = userRepository.save(ObjectMapperUtils.map(userDao,User.class));
        return ObjectMapperUtils.map(user,UserDao.class);
    }

    @Override
    public UserDao getUserById(int idUser) {
        Optional<User> user = userRepository.findById(idUser);

        if(user.isEmpty()) return null;

        return ObjectMapperUtils.map(user.get(),UserDao.class);
    }

    @Override
    public UserDao updateUser(int idUser, UserDao userDao) {

        if(!userRepository.existsById(idUser)) return null;

        User user = userRepository.save(ObjectMapperUtils.map(userDao,User.class));
        return ObjectMapperUtils.map(user,UserDao.class);
    }

    @Override
    public Boolean deleteUser(int idUser) {
        if(!userRepository.existsById(idUser)) return false;
        userRepository.deleteById(idUser);
        return true;
    }
}
