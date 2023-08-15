package com.example.assignment3.controller;

import com.example.assignment3.dto.UserDto;

import com.example.assignment3.dto.UserUpdateDto;
import com.example.assignment3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto) {
        userService.save(userDto);
        return ResponseEntity.ok().body(userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        userService.delete(id);
        return ResponseEntity.ok().body("Delete Successful");
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> update(@PathVariable int id, @RequestBody UserUpdateDto userUpdateDto){
       UserDto userDto =  userService.update(id, userUpdateDto);
       return ResponseEntity.ok().body(userDto);
    }
}
