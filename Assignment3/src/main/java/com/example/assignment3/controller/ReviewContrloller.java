package com.example.assignment3.controller;

import com.example.assignment3.entity.Review;
import com.example.assignment3.service.imp.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewContrloller {
    @Autowired
    private ReviewService ReviewService;


    @PostMapping
    public ResponseEntity<String> add(@RequestBody Review review) {
        ReviewService.add(review);
        return ResponseEntity.ok("post is working correctly");
    }

    @GetMapping
    public List<Review> get() {
        return ReviewService.findAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        ReviewService.remove(id);
        return ResponseEntity.ok("delete is working correctly");
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody Review review,@PathVariable int id){
        ReviewService.update(review,id);
        return ResponseEntity.ok("update is working correctly");

    }

}
