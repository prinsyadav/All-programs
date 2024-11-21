package org.prince.springsecurity.service;

import org.apache.catalina.User;
import org.prince.springsecurity.model.Users;
import org.prince.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<Users> getUsers() {
        return userRepo.findAll();
    }

    public Users createUser(Users users, byte[] imageData) throws IOException {
        users.setImageData(imageData);
        return userRepo.save(users);
    }

    public Object getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }

    // find the image by id
//    public byte[] getImageById(int id) {
//        return userRepo.findById(id).get().getImageData();
//    }

    public Optional<byte[]> getImageById(int id) {
        Optional<User> users = UserRepo.findById(id);
        return users.map(User::getImage);
    }
}
