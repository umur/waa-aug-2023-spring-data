package lab3.lab3.Repository;

import lab3.lab3.Model.Category;
import lab3.lab3.Model.Product;
import lab3.lab3.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {



    public List<Product> findProductsByPriceGreaterThan(double price);
    public List<Product> findProductsByCategoryIdAndPriceLessThan(int categoryId, double price);

    public List<Product> findProductsByNameIsContaining(String name);


}
