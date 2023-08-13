package com.assignment3.service.impl;

import com.assignment3.entity.Address;
import com.assignment3.entity.User;
import com.assignment3.repository.UserRepo;
import com.assignment3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl (UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public void save(User user) {
        user.getAddress().setUser(user);
        userRepo.save(user);
    }

    @Override
    public void update(User newUser, Integer userId) {

        Optional<User> userOptional = userRepo.findById(newUser.getId());

        if(userOptional.isPresent()){

            User user = userOptional.get();

            user.setEmail(newUser.getEmail());
            user.setPassword(newUser.getPassword());
            user.setFirstName(newUser.getFirstName());
            user.setLastName(newUser.getLastName());

//Updating address

            if(newUser.getAddress() != null) {

                Address address = user.getAddress();

                address.setStreet(newUser.getAddress().getStreet());
                address.setZip(newUser.getAddress().getZip());
                address.setCity(newUser.getAddress().getCity());
            }

            userRepo.save(user);
        }

    }

    @Override
    public void delete(Integer userId) {
        userRepo.deleteById(userId);
    }

    @Override
    public Optional<User> getById(Integer userId) {

        if (userRepo.existsById(userId)){
            return userRepo.findById(userId);
        }
        throw new RuntimeException("User was not found");
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
