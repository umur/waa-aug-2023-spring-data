package lab3.springdata.demo.service.impl;

import lab3.springdata.demo.entity.User;
import lab3.springdata.demo.repository.UserRepo;
import lab3.springdata.demo.service.IuserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService implements IuserService {
    private UserRepo userRepo;
    @Autowired
    public UserService (UserRepo  userRepo){
        this.userRepo=userRepo;
    }
    @Override
    public void save(User user) {
        userRepo.save(user);

    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void update(Long id, User user) {
        User userToUpdate=userRepo.findById(id).get();
        userToUpdate=user;
        userRepo.save(userToUpdate);
    }

    @Override
    public void deleteById(long id) {
        userRepo.deleteById(id);
    }
}
