package lab3.lab3.Repository;

import lab3.lab3.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {
}
