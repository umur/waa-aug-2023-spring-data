package com.example.lab3.repository;

import com.example.lab3.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends ListCrudRepository<Product,Integer> {
    List<Product> findByPriceGreaterThan(int minPrice);
    List<Product> findByNameContains(String keyword);
    List<Product> findProductsByCategory_IdAndPriceLessThan(int categoryID,int maxPrice);
}
