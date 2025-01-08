package org.prince.springsecurity.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.prince.springsecurity.model.Users;
import org.prince.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //     method to get all users
    @GetMapping("/users")
    public List<Users> getUsers(){
        return userService.getUsers();
    }


    //method to get image by id
    @GetMapping("/users/{id}")
    public void fetchImage(@PathVariable int id, HttpServletResponse response) throws IOException {
        byte[] image = userService.fetchImage(id);
        if (image == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.setContentType("image/png"); // Set the content type based on the image type
        response.getOutputStream().write(image);
    }


    //method to update user details by id
    @PutMapping(value = "/users/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Users> updateUser(
            @PathVariable int id,
            @RequestPart Users users,
            @RequestPart("file") MultipartFile file) throws IOException {

        Users user = new Users();
        user.setId(users.getId());
        user.setUsername(users.getUsername());
        user.setPassword(users.getPassword());
        user.setEmail(users.getEmail());
        user.setCountry(users.getCountry());
        user.setFilepath("D:\\Programming\\imageData\\" + file.getOriginalFilename());

        Users updatedUser = userService.updateUser(id, users, file);
        if (updatedUser == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(updatedUser);
    }

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    // Updated method to create user with image file
    @PostMapping(value = "/users", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> createUser(@RequestPart Users users,
                                        @RequestPart MultipartFile file) {
        try {
            Users savedUser = userService.createUser(users, file);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            logger.error("Error creating user", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to create user: " + e.getMessage());
        }
    }


    // method to delete user by id
//    @DeleteMapping("/users/{id}")
//    public ResponseEntity<?> deleteUser(@PathVariable int id) {
//        userService.deleteUser(id);
//        return ResponseEntity.ok("User deleted successfully");
//    }


}
