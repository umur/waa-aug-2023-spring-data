package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepo.save(user);
    }

    @Override
    public List<UserDto> getAll() {
        List<User> userList = userRepo.findAll();
        return userList.stream().map(user ->
                modelMapper.map(user, UserDto.class)).collect(Collectors.toList());
    }

    @Override
    public UserDto getById(int id) {
        Optional<User> userOptional = userRepo.findById(id);
        if(userOptional.isEmpty()){
            throw new EntityNotFoundException("User with ID " + id + " not found.");
        }
        User user = userOptional.get();
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public void update(UserDto userDto, int id) {
        UserDto entityDto = getById(id);
        User user = modelMapper.map(entityDto, User.class);
        if(userDto.getEmail() != null) user.setEmail(userDto.getEmail());
        if(userDto.getFirstName() != null) user.setFirstName(userDto.getFirstName());
        if(userDto.getLastName() != null) user.setLastName(userDto.getLastName());
        if(userDto.getPassword() != null) user.setPassword(userDto.getPassword());

        userRepo.save(user);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
