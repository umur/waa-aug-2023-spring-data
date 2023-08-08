package com.example.assignmentw1d3.controller;

import com.example.assignmentw1d3.entity.Review;
import com.example.assignmentw1d3.service.impl.IreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/require")
public class ReviewController {
    @Autowired
    private IreviewService ireviewService;
    @GetMapping
    public List<Review> getAll(){
        return ireviewService.getAll();
    }
    @GetMapping("/{id}")
    private Review getReviewById(@PathVariable int id){
        return ireviewService.getReviewById(id);
    }
    @PostMapping
    public void save(@RequestBody Review review){
        ireviewService.save(review);
    }
    @DeleteMapping("/{id}")
    public void deleteReviewById(@PathVariable int id){
        ireviewService.deletReview(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Review review){
        ireviewService.save(review);
    }
    @GetMapping("/{productId}")
    public List<Review> findByProductId(@PathVariable int productId){
        return ireviewService.findByProductId(productId);
    }





}
