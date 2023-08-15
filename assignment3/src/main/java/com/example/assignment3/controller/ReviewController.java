package com.example.assignment3.controller;


import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.ReviewDto;
import com.example.assignment3.dto.ReviewUpdateDto;
import com.example.assignment3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
@CrossOrigin
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> getAll(){
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public ReviewDto getById(@PathVariable int id){
        return reviewService.getById(id);
    }

    @PostMapping
    public ResponseEntity<ReviewDto> save(@RequestBody ReviewDto reviewDto){
        reviewService.save(reviewDto);
        return ResponseEntity.ok().body(reviewDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        reviewService.delete(id);
        return ResponseEntity.ok().body("Delete Successful");
    }

    @GetMapping("/findReviewsByProduct")
    public List<ReviewDto> findReviewsByProduct(@RequestParam int productId){
        return reviewService.findReviewsByProduct(productId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReviewDto> update(@PathVariable int id, @RequestBody ReviewUpdateDto reviewUpdateDto){
        ReviewDto reviewDto = reviewService.update(id, reviewUpdateDto);
        return ResponseEntity.ok().body(reviewDto);
    }

}
