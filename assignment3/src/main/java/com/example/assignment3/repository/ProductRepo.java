package com.example.assignment3.repository;

import com.example.assignment3.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends ListCrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(int minPrice);
//    @Query("SELECT * FROM product where category_id=catId and price<maxPrice")
    List<Product> findProductsByPriceLessThanAndAndCategory_Id(int price, int categoryId);
    List<Product> findAllByNameContains(String str);



}
