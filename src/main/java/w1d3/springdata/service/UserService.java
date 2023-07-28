package w1d3.springdata.service;

import w1d3.springdata.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);

    List<User> findAll();

    User findById(Long id);

    User update(Long id, User user);

    void delete(Long id);
}
