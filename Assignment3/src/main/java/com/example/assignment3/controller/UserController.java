package com.example.assignment3.controller;

import com.example.assignment3.entity.User;
import com.example.assignment3.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody User user){
        userService.add(user);
        return  ResponseEntity.ok("Post is working correctly");
    }
    @GetMapping
    public List<User> get(){
        return userService.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody User user,@PathVariable int id){
        userService.update(user,id);
        return ResponseEntity.ok("update is working correctly");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        userService.remove(id);
        return ResponseEntity.ok("delete is working correctly");

    }

}
