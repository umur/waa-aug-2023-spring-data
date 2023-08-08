package com.example.assignmentw1d3.service.impl;

import com.example.assignmentw1d3.entity.Review;
import com.example.assignmentw1d3.entity.User;
import com.example.assignmentw1d3.repository.UserRepo;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public void save(User user);
     public void delete(Long id);
    void update(User user);
    User getById(Long id);

    void deleteById(Long id);
}
