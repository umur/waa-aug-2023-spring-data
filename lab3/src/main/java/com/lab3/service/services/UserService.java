package com.lab3.service.services;

import com.lab3.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void save(User user);
    public List<User> getAll();
    public Optional<User> getById(Integer id);
    public void updateUser(Integer id, User user);
    public void deleteById(Integer id);
}
