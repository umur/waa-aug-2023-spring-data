package miu.waa.lab3.service.impl;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.UserDto;
import miu.waa.lab3.entity.User;
import miu.waa.lab3.repository.UserRepo;
import miu.waa.lab3.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<UserDto> getAll() {
        List<User> users = userRepo.findAll();
        List<UserDto> results = new ArrayList<>();
        users.forEach(user->{
            UserDto dto = modelMapper.map(user, UserDto.class);
            results.add(dto);
        });

        return results;
    }

    @Override
    public void create(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepo.save(user);
    }

    @Override
    public UserDto read(int id) {
        Optional<User> address = userRepo.findById(id);
        return modelMapper.map(address, UserDto.class);
    }

    @Override
    public void update(int id, UserDto userDto) {
        userDto.setId(id);
        User user = modelMapper.map(userDto, User.class);
        userRepo.save(user);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
