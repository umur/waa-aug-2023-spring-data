package com.example.assignmentw1d3.service.impl;

import com.example.assignmentw1d3.entity.Review;

import java.util.List;

public interface IreviewService {
    public void save(Review review);
    public Review getReviewById(int id);
    public List<Review> getAll();
    public void deletReview(int id);
//    List<Review> getReviewsByProductId(int productId);
    public void updateReview(int id, Review review);

    public List<Review> findByProductId(int id);
}
