package lab3.springdata.demo.controller;

import lab3.springdata.demo.entity.User;
import lab3.springdata.demo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);


    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping({"/id"})
    public User getUserById(long id) {
       return userService.getUserById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteBYId(@PathVariable long id){
        userService.deleteById(id);

    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody User user) {
        userService.update(id ,user);


    }
}