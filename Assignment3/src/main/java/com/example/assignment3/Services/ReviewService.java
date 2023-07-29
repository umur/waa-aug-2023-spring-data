/*
package com.example.assignment3.Services;

import com.example.assignment3.Entities.Product;
import com.example.assignment3.Entities.Review;
import com.example.assignment3.Repositories.ProductRepository;
import com.example.assignment3.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    ProductRepository productRepository;
    public List<Review> findReviewsOfProductById(int id) {
        Product product = productRepository.findById(id).orElse(null);
        return reviewRepository.findReviewByProduct(product);
    }
}
*/
