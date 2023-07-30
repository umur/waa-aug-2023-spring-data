package lab3.lab3.Service;

import lab3.lab3.Model.Adress;
import lab3.lab3.Model.User;

import java.util.List;

public interface IuserService {
    public void save(User user);
    public List<User> getAll();
    public User getUserById(int id);
    public void deleteUserById(int id);
    public void update(int id, User user);
}
