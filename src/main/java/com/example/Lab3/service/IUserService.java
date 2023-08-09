package com.example.Lab3.service;

import com.example.Lab3.entity.User;

import java.util.List;

public interface IUserService {
    void add(User user);
    void remove(int id);
    List<User> findAll();
    void update(User user,int id);
}
