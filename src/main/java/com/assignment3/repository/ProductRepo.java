package com.assignment3.repository;

import com.assignment3.entity.Category;
import com.assignment3.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends ListCrudRepository<Product, Integer> {

    List<Product> getProductsByPriceGreaterThan(Integer minPrice);

    List<Product> getProductsByCategory_NameAndPriceLessThan(String category, Integer maxPrice);

    List<Product> getProductsByNameContaining(String keyword);


}
