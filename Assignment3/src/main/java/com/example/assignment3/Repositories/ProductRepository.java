package com.example.assignment3.Repositories;

import com.example.assignment3.Entities.Category;
import com.example.assignment3.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findProductByPriceGreaterThan(int minPrice);
    public List<Product> findProductByCategoryAndPriceLessThan(Category category, int maxPrice);
    public List<Product> findProductByNameContaining(String name);

}
