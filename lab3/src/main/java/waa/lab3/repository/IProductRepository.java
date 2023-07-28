package waa.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import waa.lab3.domain.Product;
import waa.lab3.domain.Review;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {
    List<Product> getProductsByPriceGreaterThan(double minPrice);
    List<Product> getProductsByCategory_NameAndPriceLessThan(String categoryName,double maxPrice);
    List<Product> getProductsByNameContainingIgnoreCase(String keyword);

}
