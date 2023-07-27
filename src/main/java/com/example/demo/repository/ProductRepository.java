package com.example.demo.repository;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ProductRepository extends ListCrudRepository<Product, Integer> {
    List<Product> findByPriceGreaterThan(double minPrice);

    List<Product> findByCategoryAndPriceLessThan(Category category, double maxPrice);

    List<Product> findByNameContaining(String keyword);
}
