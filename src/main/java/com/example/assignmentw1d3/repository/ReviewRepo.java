package com.example.assignmentw1d3.repository;

import com.example.assignmentw1d3.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Integer> {

    //Find reviews of the product whose id is id
    public List<Review> findByProductId(int productId);
}
