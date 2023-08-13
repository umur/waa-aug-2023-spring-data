package com.assignment3.controller;

import com.assignment3.entity.Review;
import com.assignment3.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }


    @PostMapping
    public void save(@RequestBody Review review){
        reviewService.save(review);
    }

    @DeleteMapping("/{reviewId}")
    public void delete(@PathVariable Integer reviewId){
        reviewService.delete(reviewId);
    }

    @PutMapping("/{reviewId}")
    public void update(@RequestBody Review review, @PathVariable Integer reviewId){
        reviewService.update(review, reviewId);
    }

    @GetMapping("/{reviewId}")
    public Optional<Review> getById (@PathVariable Integer reviewId){
        return reviewService.getById(reviewId);
    }

    @GetMapping
    public List<Review> getAll(){
        return reviewService.getAll();
    }
    @GetMapping("/{productId}")
    public List<Review> getReviewsByProductId(@PathVariable Integer productId) {
        return reviewService.getReviewsByProductId(productId);
    }

}

