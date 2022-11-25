package com.demo.springboot.service;

import com.demo.springboot.model.User;
import com.demo.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean checkUserPresent(int userId) {
        return getUser(userId) != null;
    }

    public List<User> getAllUsers() {
        List<User> userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }

    public boolean addUser(User user) {
        if(checkUserPresent(user.getId())) {
            userRepository.save(user);
            return true;
        }
        else {
            return false;
        }
    }

    public User getUser(int id) {
        return (User) userRepository.findById(Integer.valueOf(id)).orElse(null);
    }
}
