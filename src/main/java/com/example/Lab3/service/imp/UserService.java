package com.example.Lab3.service.imp;

import com.example.Lab3.entity.User;
import com.example.Lab3.repository.UserRepo;
import com.example.Lab3.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepo userRepo;
    @Override
    public void add(User user) {
        userRepo.save(user);
    }

    @Override
    public void remove(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void update(User user, int id) {
        User user1 = userRepo.findById(id).get();
        user1.setAddress(user.getAddress());
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setPassword(user.getPassword());
        user1.setReviews(user.getReviews());
        user1.setId(id);
        userRepo.save(user1);
    }
}
