package w1d3.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.springdata.entity.User;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {
}
