package com.example.Lab3.controller;

import com.example.Lab3.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Lab3.service.IReviewService;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private IReviewService reviewService;

    @GetMapping
    public List<Review> findAll() {
        return reviewService.findAll();
    }
    @PostMapping
    public void add(@RequestBody Review review) {
        reviewService.add(review);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        reviewService.remove(id);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Review review, @PathVariable int id) {
        reviewService.update(review, id);
    }
}
