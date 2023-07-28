package waa.lab3.service;

import waa.lab3.dto.CategoryDto;
import waa.lab3.dto.UserDto;

import java.util.List;

public interface IUserService {

    List<UserDto> getAll();
    UserDto getById(int id);
    void deleteById(int id);
    void save(UserDto userDto);
    void update(int id, UserDto userDto);
}
