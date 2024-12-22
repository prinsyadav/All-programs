package org.prince.simplebackend.service;

import org.prince.simplebackend.model.UsersData;
import org.prince.simplebackend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    //Get all users
    public List<UsersData> getUsersData(){
        return userRepo.findAll();
    }

    // Method to create user
    public UsersData createUser(UsersData userData) {
        userData.setUsername(userData.getUsername());
        userData.setEmail(userData.getEmail());
        return userRepo.save(userData);
    }

    // Method to update user details
    public UsersData updateUser(int id, UsersData usersData) {
        UsersData usersData1 = userRepo.findById(id).orElseThrow();
        usersData1.setUsername(usersData.getUsername());
        usersData1.setEmail(usersData.getEmail());

        return userRepo.save(usersData1);
    }

    // Method to get user by id
    public UsersData getUserById(int id){
        return userRepo.findById(id).orElseThrow();
    }
}
