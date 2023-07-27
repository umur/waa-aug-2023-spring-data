package com.example.demo.service;

import com.example.demo.entity.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> getAllReviews();

    public Review getReviewById(int id);

    public Review createReview(Review review);

    public Review updateReview(int id, Review updatedReview);

    public void deleteReview(int id);

    public List<Review> getProductReviews(int productId);
}
