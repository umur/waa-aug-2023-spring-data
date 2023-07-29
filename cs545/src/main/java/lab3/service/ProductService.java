package lab3.service;

import lab3.dto.ProductDto;
import lab3.model.Category;
import lab3.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(Product product);

    ProductDto getProduct(int id);

    List<Product> findAllProducts();

    void deleteProduct(int id);

    Product updateProduct(int id, Product product);

    // Find all products that cost more than minPrice.
    List<Product> findAllByPriceGreaterThanEqual(int minPrice);

    // Find all products that contain keyword in the name.
    List<Product> findAllByNameContaining(String keyword);

    // Find all products in cat category and cost less than maxPrice.
    List<Product> findAllByCategoryAndPriceLessThanEqual(Category cat, int maxPrice);



}
