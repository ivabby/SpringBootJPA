package com.demo.springboot.controller;

import com.demo.springboot.model.User;
import com.demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers() {
        System.out.println("Return all users");
        return userService.getAllUsers();
    }

    @PostMapping("/")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
        System.out.println("User added");
    }
}
