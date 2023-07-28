package waa.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import waa.lab3.domain.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
