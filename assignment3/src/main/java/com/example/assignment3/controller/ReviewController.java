package com.example.assignment3.controller;


import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.ReviewDto;
import com.example.assignment3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
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
    public void save(@RequestBody ReviewDto reviewDto){
        reviewService.save(reviewDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        reviewService.delete(id);
    }

    @GetMapping("/findReviewsByProduct")
    public List<ReviewDto> findReviewsByProduct(@RequestParam int productId){
        return reviewService.findReviewsByProduct(productId);
    }

}
