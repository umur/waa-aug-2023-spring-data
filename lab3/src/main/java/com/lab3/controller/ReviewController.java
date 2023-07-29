package com.lab3.controller;

import com.lab3.entity.Review;
import com.lab3.service.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public void create(@RequestBody Review review){
        reviewService.save(review);
    };

    @GetMapping
    public List<Review> getALLReview(){
        return reviewService.getAll();
    };

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Integer id){
        return reviewService.getById(id);
    };

    @PutMapping("/{id}")
    public void updateReview(@RequestBody Review review, @PathVariable Integer id){
        reviewService.save(review);
    };

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Integer id){
        reviewService.delete(id);
    };


};


