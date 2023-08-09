package com.example.Lab3.controller;

import com.example.Lab3.entity.User;
import com.example.Lab3.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
     @Autowired
     private IUserService userService;

     @GetMapping
     public List<User> findAll(){
         return userService.findAll();
     }

     @PostMapping
     public void add(@RequestBody User user){
         userService.add(user);
     }

     @DeleteMapping("/{id}")
     public void remove(@PathVariable int id){
         userService.remove(id);
     }

     @PutMapping("/{id}")
     public void update(@RequestBody User user,@PathVariable int id){
         userService.update(user,id);
     }
}
