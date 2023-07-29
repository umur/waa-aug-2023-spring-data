package lab3.service.impl;

import lab3.dto.MainUserDto;
import lab3.model.MainUser;
import lab3.repository.MainUserRepo;
import lab3.service.MainUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements MainUserService {
    @Autowired
    private MainUserRepo mainUserRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void saveUser(MainUser user) {
        mainUserRepo.save(user);
    }

    @Override
    public void updateUser(MainUser user) {

    }

    @Override
    public void deleteUser(int id) {
        mainUserRepo.deleteById(id);

    }

    @Override
    public MainUserDto getUser(int id) {
        return modelMapper.map(mainUserRepo.findById(id).get(), MainUserDto.class);
    }

    @Override
    public List<MainUser> findAll() {
        return mainUserRepo.findAll();
    }
}
