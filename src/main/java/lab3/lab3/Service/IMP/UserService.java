package lab3.lab3.Service.IMP;

import lab3.lab3.Model.Adress;
import lab3.lab3.Model.User;
import lab3.lab3.Repository.UserRepo;
import lab3.lab3.Service.IuserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService implements IuserService {
    private UserRepo userRepo;
@Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void save(User user) {
    //user.setAdress(user);
        user.getReviewList().forEach(review -> {
            review.setUser(user);
        });

    userRepo.save(user);

    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void deleteUserById(int id) {
userRepo.deleteById(id);
    }

    @Override
    public void update(int id, User user) {

    }
}
