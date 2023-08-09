package com.example.Lab3.service.imp;

import com.example.Lab3.entity.Review;
import com.example.Lab3.repository.ReviewRepo;
import com.example.Lab3.service.IReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReviewService implements IReviewService {
    private final ReviewRepo reviewRepo;
    @Override
    public void add(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void remove(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public List<Review> findAll() {
        return reviewRepo.findAll();
    }

    @Override
    public void update(Review review, int id) {
        Review review1 = reviewRepo.findById(id).get();
        review1.setComment(review.getComment());
        review1.setProduct(review.getProduct());
        review1.setUser(review.getUser());
        review1.setId(id);
        reviewRepo.save(review1);
    }
}
