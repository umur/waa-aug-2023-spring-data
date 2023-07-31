package miu.waa.lab3.repository;

import miu.waa.lab3.entity.Product;
import miu.waa.lab3.entity.Review;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ReviewRepo extends ListCrudRepository<Review, Integer> {
    List<Review> findByProduct(Product product);
}
