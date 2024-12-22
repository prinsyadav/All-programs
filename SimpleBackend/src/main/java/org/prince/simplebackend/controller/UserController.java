package org.prince.simplebackend.controller;

import lombok.Getter;
import org.prince.simplebackend.model.UsersData;
import org.prince.simplebackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class UserController {

    @Autowired
    private UserService userService;

    //Method to get all users
    @GetMapping("/users")
    public List<UsersData> getUsers(){
       return userService.getUsersData();
    }

    //Method to create new user
    @PutMapping("/user")
    public UsersData createUser (@RequestBody UsersData usersData){
        return userService.createUser(usersData);
    }

    //Method to Update user by id
    @PostMapping("/user/{id}")
    public UsersData updateUser (@PathVariable int id, @RequestBody UsersData usersData){
        return userService.updateUser(id, usersData);
    }

    //Method to fetch user by id
    @GetMapping("/user/{id}")
    public UsersData getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }


}
