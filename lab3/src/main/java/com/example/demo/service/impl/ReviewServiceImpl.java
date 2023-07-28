package com.example.demo.service.impl;

import com.example.demo.entity.Review;
import com.example.demo.repository.ReviewRepo;
import com.example.demo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepo reviewRepo;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    @Override
    public Review getReviewById(Long id) {
        return reviewRepo.findById(id).orElse(null);
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepo.save(review);
    }

    @Override
    public Review updateReview(Long id, Review review) {
        Review existingReview = getReviewById(id);
        if (existingReview != null) {
            existingReview.setComment(review.getComment());
            return reviewRepo.save(existingReview);
        }
        return null;
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepo.deleteById(id);
    }
}
