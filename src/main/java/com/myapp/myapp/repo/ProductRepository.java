package com.myapp.myapp.repo;


import com.myapp.myapp.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, Integer> {
    List<Product> findByPriceGreaterThan(Double minPrice);
    List<Product> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice);
    List<Product> findByNameContainingIgnoreCase(String keyword);
}
