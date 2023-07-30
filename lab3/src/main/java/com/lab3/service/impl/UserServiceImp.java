package com.lab3.service.impl;

import com.lab3.entity.User;
import com.lab3.repository.UserRepository;
import com.lab3.service.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {
    @Autowired
    private  UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    };

    @Override
    public List<User> getAll() {
       return userRepository.findAll();
    };

    @Override
    public Optional<User> getById(Integer id) {
        return userRepository.findById(id);
    };


    //is this correct implementation?
    @Override
    public void updateUser(Integer id, User user) {
        userRepository.save(user);

    };

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    };
};
