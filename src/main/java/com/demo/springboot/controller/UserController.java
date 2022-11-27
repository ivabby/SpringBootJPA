package com.demo.springboot.controller;

import com.demo.springboot.model.User;
import com.demo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //  Get All Users
    @GetMapping("/")
    public ResponseEntity getAllUsers() {
        List<User> users = userService.getAllUsers();
        if(users.isEmpty()) {
            return ResponseEntity.ok("No Users Present!!");
        }
        return ResponseEntity.ok(users);
    }

    //  Save user
    @PostMapping("/")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        boolean userSaved = userService.addUser(user);

        if(userSaved) {
            return ResponseEntity.ok("User Saved!!!!");
        }
        return ResponseEntity.status(405).body("User Already Present!!!");
    }

    //  Get User by Id
    @GetMapping("/{userId}")
    public ResponseEntity<Object> getUserById(@PathVariable int userId) {
        User user = userService.getUser(userId);
        if(user == null) {
            return ResponseEntity.status(404).body("No user found with id:"+userId);
        }
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    //  Update user By Id
    @PutMapping("/{userId}")
    public ResponseEntity updateUserById(@RequestBody User user) {
        if(userService.checkUserPresent(user.getId())) {
            userService.updateUser(user);
            return ResponseEntity.ok("User Updated!!");
        }
        return ResponseEntity.ok("No user found with the given id");
    }
}
