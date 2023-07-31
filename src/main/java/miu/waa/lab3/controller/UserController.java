package miu.waa.lab3.controller;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.UserDto;
import miu.waa.lab3.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDto> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public void create(@RequestBody UserDto addressDto){
        userService.create(addressDto);
    }

    @GetMapping("/{id}")
    public UserDto read(@PathVariable int id){
        return userService.read(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody UserDto addressDto){
        userService.update(id, addressDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }
}
