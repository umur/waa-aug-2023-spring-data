package waa.lab3.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import waa.lab3.domain.User;
import waa.lab3.dto.ProductDto;
import waa.lab3.dto.ReviewDto;
import waa.lab3.dto.UserDto;
import waa.lab3.repository.IUserRepository;
import waa.lab3.service.IProductService;
import waa.lab3.service.IUserService;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        userService.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody UserDto userDto) {
        userService.save(userDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody UserDto userDto) {
        userService.update(id,userDto);
    }
}
