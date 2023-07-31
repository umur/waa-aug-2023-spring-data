package miu.waa.lab3.repository;

import miu.waa.lab3.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepo extends ListCrudRepository<User, Integer> {
}
