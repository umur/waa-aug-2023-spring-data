package miu.waa.lab3.service;

import miu.waa.lab3.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();
    void create(UserDto userDto);
    UserDto read(int id);
    void update(int id, UserDto userDto);
    void delete(int id);
}
