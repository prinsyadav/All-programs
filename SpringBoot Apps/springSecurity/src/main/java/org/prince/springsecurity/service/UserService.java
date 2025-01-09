package org.prince.springsecurity.service;

import org.prince.springsecurity.model.Users;
import org.prince.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    private final String IMAGE_PATH = "D:\\Programming\\imageData\\";

    // method to get all users
    public List<Users> getUsers() {
        return userRepo.findAll();
    }
    // method to create user
     public Users createUser(Users users, MultipartFile file) throws IOException {
        users.setId(0);
        users.setUsername(users.getUsername());
        users.setPassword(users.getPassword());
        users.setEmail(users.getEmail());
        users.setCountry(users.getCountry());
        users.setFilepath(IMAGE_PATH + file.getOriginalFilename());
        file.transferTo(new File(users.getFilepath()));
        return userRepo.save(users);
}


    // method to update user details by id
    public Users updateUser(int id, Users users, MultipartFile file) throws IOException {
        Users user = userRepo.findById(id).orElse(null);
        if (user == null) {
            return null;
        }
        user.setUsername(users.getUsername());
        user.setPassword(users.getPassword());
        user.setEmail(users.getEmail());
        user.setCountry(users.getCountry());
        user.setFilepath(IMAGE_PATH + file.getOriginalFilename());
        file.transferTo(new File(user.getFilepath()));

        return userRepo.save(user);
    }

    // method to get user by id
    public Object getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    //method to get image by id
    public byte[] fetchImage(int id) {
        Users user = userRepo.findById(id).orElse(null);
        if (user == null || user.getFilepath() == null) {
            return null;
        }

        try {
            return Files.readAllBytes(Paths.get(user.getFilepath()));
        } catch (IOException e) {
            // Handle the exception, e.g., log the error
            return null;
        }

    }

    // method to delete user by id
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}
