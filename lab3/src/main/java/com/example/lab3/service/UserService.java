package com.example.lab3.service;

import com.example.lab3.dto.AddressDto;
import com.example.lab3.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();
    UserDto getById(int id);
    public void delete(int id);
    void save(AddressDto dto);

}
