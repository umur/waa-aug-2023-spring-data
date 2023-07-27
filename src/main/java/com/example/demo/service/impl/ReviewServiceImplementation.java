package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.repository.ReviewRepository;
import com.example.demo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ReviewServiceImplementation implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReviewById(int id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(int id, Review updatedReview) {
        Review existingReview = reviewRepository.findById(id).orElse(null);
        if (existingReview != null) {
            existingReview.setComment(updatedReview.getComment());
            existingReview.setUser(updatedReview.getUser());
            existingReview.setProduct(updatedReview.getProduct());
            // Update any other fields as needed
            return reviewRepository.save(existingReview);
        }
        return null;
    }

    @Override
    public void deleteReview(int id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public List<Review> getProductReviews(int productId) {
        Product product = new Product();
        product.setId(productId);
        return reviewRepository.findByProduct(product);
    }
}
