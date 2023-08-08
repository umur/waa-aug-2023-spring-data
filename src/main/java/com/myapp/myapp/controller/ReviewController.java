package com.myapp.myapp.controller;

import com.myapp.myapp.dto.ReviewDto;
import com.myapp.myapp.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@CrossOrigin(origins = {"http://localhost:3000"})
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<ReviewDto>> findReviewsByProductId(@PathVariable Integer productId) {
        return ResponseEntity.ok(reviewService.findByProductId(productId));
    }

    @PostMapping
    public void save(@RequestBody ReviewDto reviewDto){
        reviewService.save(reviewDto);
    }

    @GetMapping
    public ResponseEntity<List<ReviewDto>> getAll(){
        List<ReviewDto> reviewDtoList = reviewService.getAll();
        return ResponseEntity.ok(reviewDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReviewDto> getById(@PathVariable int id){
        ReviewDto reviewDto = reviewService.getById(id);
        if(reviewDto != null) return ResponseEntity.ok(reviewDto);
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ReviewDto reviewDto){
        reviewService.update(reviewDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        reviewService.delete(id);
    }
};
