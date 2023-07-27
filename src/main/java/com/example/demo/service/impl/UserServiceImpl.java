package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public void save(UserDto userDto) {

    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    public UserDto getById(int id) {
        return null;
    }

    @Override
    public void update(UserDto userDto, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
