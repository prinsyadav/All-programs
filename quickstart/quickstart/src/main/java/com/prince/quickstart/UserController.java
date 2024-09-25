package com.prince.quickstart;

@RestController
@RequestMapping("/api")
public class UserController {
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody User user) {
        // Save user to database

        return ResponseEntity.ok("User created successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        // Authenticate user
        return ResponseEntity.ok("User logged in successfully");
    }
}
