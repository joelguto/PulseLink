package com.pulselink.user_service.controller;

import com.pulselink.user_service.model.User;
import com.pulselink.user_service.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/all")
    public List<User> findAll() {
        return userService.getAllUsers();
    }
    @PostMapping("/create")
    public User save(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @GetMapping("/username/{username}")
    public Optional<User> findByUsername(@PathVariable String username) {
        return userService.getUserByUserName(username);
    }
}
