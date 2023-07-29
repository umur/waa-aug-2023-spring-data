package lab3.repository;

import lab3.dto.ProductDto;
import lab3.model.Category;
import lab3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    // Find all products that cost more than minPrice.
    List<Product> findAllByPriceGreaterThanEqual(int minPrice);

    // Find all products that contain keyword in the name.
    List<Product> findAllByNameContaining(String keyword);

    // Find all products in cat category and cost less than maxPrice.
    List<Product> findAllByCategoryAndPriceLessThanEqual(Category cat, int maxPrice);

    Product findByRating(int rating);// prduct where rating =rating

}
