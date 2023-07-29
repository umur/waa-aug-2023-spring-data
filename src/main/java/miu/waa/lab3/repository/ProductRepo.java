package miu.waa.lab3.repository;

import miu.waa.lab3.entity.Category;
import miu.waa.lab3.entity.Product;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ProductRepo extends ListCrudRepository<Product,Integer> {
    List<Product> findByPriceGreaterThan(double minPrice);

    List<Product> findByCategoryAndPriceLessThan(Category category, double maxPrice);

    List<Product> findByNameContaining(String keyword);
}
