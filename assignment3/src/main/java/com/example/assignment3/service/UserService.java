package com.example.assignment3.service;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.ReviewDto;
import com.example.assignment3.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();

    UserDto getById(int id);

    void save(UserDto userDto);

    void delete(int id);
}
