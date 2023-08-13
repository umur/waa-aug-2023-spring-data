package com.assignment3.service;

import com.assignment3.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public void save(User user);

    public void update(User user, Integer userId);

    public void delete(Integer userId);

    public Optional<User> getById(Integer userId);

    List<User> getAll();
}


