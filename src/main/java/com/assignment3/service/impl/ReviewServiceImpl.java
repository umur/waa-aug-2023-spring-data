package com.assignment3.service.impl;

import com.assignment3.entity.Review;
import com.assignment3.repository.ReviewRepo;
import com.assignment3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {


    private ReviewRepo reviewRepo;

    @Autowired
    public ReviewServiceImpl (ReviewRepo reviewRepo){
        this.reviewRepo = reviewRepo;
    }

    @Override
    public void save(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public void update(Review newReview, Integer reviewId) {

        Optional<Review> reviewOptional = getById(reviewId);

        if(reviewOptional.isPresent()){

            Review review = reviewOptional.get();

            review.setId(newReview.getId());
            review.setName(newReview.getName());

            reviewRepo.save(review);

        }
    }

    @Override
    public void delete(Integer reviewId) {
        reviewRepo.deleteById(reviewId);

    }

    @Override
    public List<Review> getAll() {
        return reviewRepo.findAll();
    }

    @Override
    public Optional<Review> getById(Integer reviewId) {

        if(reviewRepo.existsById(reviewId)){
            return reviewRepo.findById(reviewId);
        }
        throw new RuntimeException("Review can not be found");
    }

    @Override
    public List<Review> getReviewsByProductId(Integer productId) {
        return reviewRepo.getReviewsByProduct_Id(productId);
    }
}
