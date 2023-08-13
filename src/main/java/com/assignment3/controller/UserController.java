package com.assignment3.controller;

import com.assignment3.entity.User;
import com.assignment3.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void save(@RequestBody User user){
        userService.save(user);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable Integer userId){
        userService.delete(userId);
    }

    @PutMapping("/{userId}")
    public void update(@RequestBody User user, @PathVariable Integer userId){
        userService.update(user, userId);
    }

    @GetMapping("/{userId}")
    public Optional<User> getById (@PathVariable Integer userId){
        return userService.getById(userId);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

}
