package com.example.demo.repository;

import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ReviewRepository extends ListCrudRepository<Review, Integer> {
    List<Review> findByProduct(Product product);
}
