/*
package com.example.assignment3.Controller;

import com.example.assignment3.Entities.Review;
import com.example.assignment3.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping("/{id}")
    public List<Review> findReviewsOfProductById(int id){
        return reviewService.findReviewsOfProductById(id);
    }
}
*/
