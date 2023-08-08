package com.example.assignmentw1d3.repository;

import com.example.assignmentw1d3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


@Query("select p from Product p where p.price > ?1")
public List<Product> findByPriceGreaterThan(double minprice);
//@Query("select p from Product p join p.category c where c.name = ?1")
//public List<Product> findByCategoryName(String name);

   @Query("select p from Product p where p.category.id = ?1 and p.price < ?2")
//    Find all products in cat category and cost less than maxPrice.
    public List<Product> findByCatagoryIdAndPriceLessThan(int categoryId, double maxprice);



    public List<Product> findByNameContaining(String keyword);


}
