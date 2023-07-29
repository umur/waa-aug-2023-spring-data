package miu.waa.lab3.repository;

import miu.waa.lab3.entity.Category;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryRepo extends ListCrudRepository<Category, Integer> {
}
