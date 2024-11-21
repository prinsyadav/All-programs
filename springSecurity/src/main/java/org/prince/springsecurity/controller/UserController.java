package org.prince.springsecurity.controller;

import org.prince.springsecurity.model.Users;
import org.prince.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;
//    private UserRepo UserRepo;

//     method to get all users
    @GetMapping("/users")
    public List<Users> getUsers(){
        return userService.getUsers();
    }

//    @GetMapping("/users/image/{id}")
//    public ResponseEntity<byte[]> getUserImage(@PathVariable int id) {
//        Users user = (Users) userService.getUserById(id);
//        if (user != null && user.getImageData() != null) {
//            return ResponseEntity
//                    .ok()
//                    .contentType(MediaType.IMAGE_JPEG)
//                    .body(user.getImageData());
//        }
//        return ResponseEntity.notFound().build();
//    }

    @GetMapping("/image/{id}")
    public ResponseEntity<Optional<byte[]>> getUserImage(@PathVariable int id) {
//        Optional<Users> userOptional = UserRepo.findById(id);
//
//        if (userOptional.isPresent() && userOptional.get().getImage() != null) {
//            byte[] imageBytes = userOptional.get().getImage();
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.IMAGE_JPEG); // Adjust based on your image type
//
//            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
//        }
//
//        return ResponseEntity.notFound().build();
        Optional<byte[]> imageBytes = userService.getImageById(id);
        if (imageBytes.isPresent()) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.ALL); // Adjust based on your image type
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Users> updateUser(@PathVariable id id, @RequestBody Users userDetails) {
//        Users user = UserRepo.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
//
//        user.setUsername(userDetails.getUsername());
//        user.setEmail(userDetails.getEmail());
//        user.setCountry(userDetails.getCountry());
//
//        User updatedUser = userRepository.save(user);
//        return ResponseEntity.ok(updatedUser);
//    }

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping(value = "/users", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> createUser(@RequestPart Users users,
                                        @RequestPart (required = false) MultipartFile imageData) {
        try {
            // Log the image data content type and size
            if (imageData != null) {
                logger.info("Received image file: OriginalFilename={}, ContentType={}, Size={}",
                        imageData.getOriginalFilename(),
                        imageData.getContentType(),
                        imageData.getSize());
            } else {
                logger.warn("No image file received.");
            }

            // Convert image data to byte[] and assign
            assert imageData != null;
            byte[] imageBytes = imageData.getBytes();
            logger.info("Image byte array length: {}", imageBytes.length);


            Users savedUser = userService.createUser(users, imageData.getBytes());
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            logger.error("Error creating user", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to create user: " + e.getMessage());
        }
    }

//    @PostMapping(value = "/users", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//    public ResponseEntity<?> createUser(
//            @RequestParam int id,
//            @RequestParam String username,
//            @RequestParam String password,
//            @RequestParam String email,
//            @RequestParam String country,
//            @RequestParam MultipartFile imageData) {
//        try {
//            Users user = new Users();
//            user.setId(id);
//            user.setUsername(username);
//            user.setPassword(password);
//            user.setEmail(email);
//            user.setCountry(country);
//            user.setImageData(imageData.getBytes());
//
//            Users savedUser = userService.createUser(user, imageData);
//            return ResponseEntity.ok(savedUser);
//        } catch (Exception e) {
//            logger.error("Error creating user", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body("Failed to create user: " + e.getMessage());
//        }
//    }

}
