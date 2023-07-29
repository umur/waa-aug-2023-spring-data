package com.lab3.controller;

import com.lab3.entity.User;
import com.lab3.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public void create(@RequestBody User user){
        userService.save(user);
    };

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getById(id);
    };

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody User user){
        userService.updateUser(id, user);
    };
};

