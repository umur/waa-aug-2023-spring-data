package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public User createUser(User user);

    public User updateUser(int id, User updatedUser);

    public void deleteUser(int id);
}
