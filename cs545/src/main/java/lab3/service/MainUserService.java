package lab3.service;

import lab3.dto.MainUserDto;
import lab3.model.MainUser;

import java.util.List;

public interface MainUserService {

    void saveUser(MainUser user);
    void updateUser(MainUser user);

    void deleteUser(int id);

    MainUserDto getUser(int id);

    List<MainUser> findAll();


}
