package lab3.controller;

import lab3.dto.MainUserDto;
import lab3.model.MainUser;
import lab3.service.MainUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private MainUserService mainUserService;

    @PostMapping
    public void save(@RequestBody MainUser mainUser){
        mainUserService.saveUser(mainUser);
    }

    @GetMapping("{id}")
    public MainUserDto getUser(@PathVariable int id){
        return mainUserService.getUser(id);
    }

    @GetMapping("/all")
    public List<MainUser> getAll(){
        return mainUserService.findAll();
    }

}
