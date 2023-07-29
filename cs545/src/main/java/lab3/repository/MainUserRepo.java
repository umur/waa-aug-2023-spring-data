package lab3.repository;

import lab3.model.MainUser;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainUserRepo extends ListCrudRepository<MainUser, Integer> {
}
