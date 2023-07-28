package com.example.assignment3.service.impl;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.UserDto;
import com.example.assignment3.entity.Category;
import com.example.assignment3.entity.User;
import com.example.assignment3.repository.UserRepo;
import com.example.assignment3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<UserDto> getAll() {
        List<User> entityList = userRepo.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        entityList.forEach(user -> {
            var dto = modelMapper.map(user, UserDto.class);
            userDtoList.add(dto);
        });
        return userDtoList;
    }

    @Override
    public UserDto getById(int id) {
        User user = userRepo.findById(id).get();
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public void save(UserDto userDto){
        User user = modelMapper.map(userDto, User.class);
        userRepo.save(user);
    }

    @Override
    public void delete(int id){
        userRepo.deleteById(id);
    }
}
