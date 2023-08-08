package com.example.assignmentw1d3.service.impl.impl;

import com.example.assignmentw1d3.entity.Review;
import com.example.assignmentw1d3.entity.User;
import com.example.assignmentw1d3.repository.UserRepo;
import com.example.assignmentw1d3.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public void save(User user) {
//        System.out.println("user = " + user.getReview().toString() );
//        System.out.println("user = " + user.getAddress().toString());

        user.getReview().forEach(review -> {
            review.setUser(user);
        });
        user.getAddress().setUser(user);
        userRepo.save(user);

    }

    @Override
    public void delete(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void update(User user) {
        userRepo.save(user);

    }

    @Override
    public User getById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);

    }
}
