package com.example.assignmentw1d3.service.impl.impl;

import com.example.assignmentw1d3.entity.Product;
import com.example.assignmentw1d3.entity.Review;
import com.example.assignmentw1d3.repository.ProductRepo;
import com.example.assignmentw1d3.repository.ReviewRepo;
import com.example.assignmentw1d3.service.impl.IreviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReviewService implements IreviewService {
    private ReviewRepo reviewRepo;
//    private ProductRepo productRepo;

    @Autowired
    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void save(Review review) {
    reviewRepo.save(review);

    }

    @Override
    public Review getReviewById(int id) {
        return null;
    }

    @Override
    public List<Review> getAll() {
        return reviewRepo.findAll();
    }

    @Override
    public void deletReview(int id) {
    reviewRepo.deleteById(id);

    }

    @Override
    public void updateReview(int id, Review review) {
        Review review1 = reviewRepo.findById(id).get();
        review1.setComment(review.getComment());
        review1.setProduct(review.getProduct());
        reviewRepo.save(review1);
    }

    @Override
    public List<Review> findByProductId(int id) {
        return reviewRepo.findByProductId(id);
    }


}
