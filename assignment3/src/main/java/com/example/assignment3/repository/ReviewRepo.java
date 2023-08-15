package com.example.assignment3.repository;

import com.example.assignment3.entity.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends ListCrudRepository<Review, Integer> {

    List<Review> findReviewsByProduct_Id(int productId);
}
