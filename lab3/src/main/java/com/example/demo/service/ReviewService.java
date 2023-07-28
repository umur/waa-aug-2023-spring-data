package com.example.demo.service;

import com.example.demo.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();
    Review getReviewById(Long id);
    Review createReview(Review review);
    Review updateReview(Long id, Review review);
    void deleteReview(Long id);
}
