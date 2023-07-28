package lab3.springdata.demo.service;

import lab3.springdata.demo.entity.User;

import java.util.List;

public interface IuserService {
    public void save(User user);

    public List<User> getAll();

    public User getUserById(long id);
    public void update(Long id ,User user);

    public void deleteById(long id);
}
