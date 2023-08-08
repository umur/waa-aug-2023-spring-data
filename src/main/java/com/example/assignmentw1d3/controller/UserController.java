package com.example.assignmentw1d3.controller;

import com.example.assignmentw1d3.entity.User;
import com.example.assignmentw1d3.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }
    @PostMapping
    public String save(@RequestBody User user){
        userService.save(user);
        return "saved";
    }
    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody User user){
        if(!id.equals(user.getId())) throw new IllegalArgumentException();
        userService.update(user);
        return "updated";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        userService.deleteById(id);
        return "deleted";
    }






}
