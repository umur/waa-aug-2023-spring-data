package waa.lab3.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab3.domain.Review;
import waa.lab3.domain.User;
import waa.lab3.dto.ReviewDto;
import waa.lab3.dto.UserDto;
import waa.lab3.repository.IReviewRepository;
import waa.lab3.repository.IUserRepository;
import waa.lab3.service.IUserService;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserDto> getAll() {
        var entityList= userRepository.findAll();
        List<UserDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,UserDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public UserDto getById(int id) {
        var entity=userRepository.findById(id);
        return modelMapper.map(entity, UserDto.class);
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void save(UserDto userDto) {
        var entity= modelMapper.map(userDto, User.class);
        userRepository.save(entity);
    }

    @Override
    public void update(int id, UserDto userDto) {
        User entity= userRepository.findById(id).orElse(null);
        modelMapper.map(userDto,entity);
        assert entity != null;
        userRepository.save(entity);
    }
}
