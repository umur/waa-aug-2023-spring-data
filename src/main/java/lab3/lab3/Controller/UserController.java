package lab3.lab3.Controller;

import lab3.lab3.Model.User;
import lab3.lab3.Service.IMP.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.save(user);
    }
    @GetMapping()
    public List<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @DeleteMapping ("/{id}")
    public void delete(@PathVariable int id){
         userService.deleteUserById(id);
    }
    @PutMapping("/{id}")
    public void update (@PathVariable int id, @RequestBody User use){

    }
}
