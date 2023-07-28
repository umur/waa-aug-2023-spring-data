package w1d3.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.springdata.entity.Category;

@Repository
public interface CategoryRepository extends ListCrudRepository<Category, Long> {
}
