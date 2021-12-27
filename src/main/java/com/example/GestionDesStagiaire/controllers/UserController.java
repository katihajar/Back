package com.example.GestionDesStagiaire.controllers;

import com.example.GestionDesStagiaire.daos.UserDao;
import com.example.GestionDesStagiaire.dtos.UserDto;
import com.example.GestionDesStagiaire.exceptions.UserNotFoundException;
import com.example.GestionDesStagiaire.services.UserService;
import com.example.GestionDesStagiaire.utils.ObjectMapperUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Users")
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    //getAllUser api
   /* @GetMapping
    public List<UserDto> getAllUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                                     @RequestParam(value = "limit", defaultValue = "10") int limit){
        List<UserDto> userDtos = new ArrayList<>();
        List<UserDao> userDaos = userService.getAllUsers(page,limit);
        if(userDaos != null){
            userDtos = ObjectMapperUtils.mapAll(userDaos,UserDto.class);
        }
        return userDtos;
    }*/
    @GetMapping
    public List<UserDto> getAllUsers() {
        List<UserDto> userDtos = new ArrayList<>();
        List<UserDao> userDaos = userService.getAllUsers();
        if (userDaos != null) {
            userDtos = ObjectMapperUtils.mapAll(userDaos, UserDto.class);
        }
        return userDtos;
    }
    //createUser api
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody(required = true) UserDto user){
        UserDao newUserDao = userService.createSalarie(ObjectMapperUtils.map(user,UserDao.class));
        return new ResponseEntity<>(ObjectMapperUtils.map(newUserDao,UserDto.class), HttpStatus.CREATED);
    }

    //getUserById api
    @GetMapping(path = "/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("userId") int idUser) throws UserNotFoundException {

        UserDao userDao = userService.getUserById(idUser);

        if(userDao == null){
            LOGGER.error("User with id: " + idUser + " is not found");
            throw new UserNotFoundException("Element with " + idUser + "is not found");
        }
        return new ResponseEntity<>(ObjectMapperUtils.map(userDao,UserDto.class),HttpStatus.OK);
    }

    //updateUser api
    @PutMapping
    public ResponseEntity<UserDto> updateUser(@RequestBody(required = true) UserDto userDto) throws UserNotFoundException{

        UserDao userDao = userService.updateUser(userDto.getIdUser(), (ObjectMapperUtils.map(userDto,UserDao.class)));

        if(userDao == null){
            LOGGER.error("User with id: " + userDto.getIdUser() + " is not found");
            throw new UserNotFoundException("Element with " + userDto.getIdUser() + "is not found");
        }
        return new ResponseEntity<>(ObjectMapperUtils.map(userDao,UserDto.class), HttpStatus.OK);

    }

    //deleteUser api
    @DeleteMapping(path = "/{userId}")
    public ResponseEntity DeleteUserById(@PathVariable("userId") int idUser) throws UserNotFoundException {
        Boolean res = userService.deleteUser(idUser);
        if(!res){
            LOGGER.error("User with id: " + idUser + " is not found");
            throw new UserNotFoundException("Element with " + idUser + "is not found");
        }
        return new ResponseEntity(HttpStatus.OK);
    }

}
