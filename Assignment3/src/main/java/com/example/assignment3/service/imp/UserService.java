package com.example.assignment3.service.imp;


import com.example.assignment3.entity.User;
import com.example.assignment3.repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public void add(User user) {
        userRepo.save(user);
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public void update(User user, int id) {
        userRepo.save(user);
    }

    public void remove(int id) {
        userRepo.deleteById(id);
    }
}
