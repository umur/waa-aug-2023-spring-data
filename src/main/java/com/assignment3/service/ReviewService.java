package com.assignment3.service;

import com.assignment3.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    public void save(Review review);

    public void update(Review review, Integer reviewId);

    public void delete (Integer reviewId);

    List<Review> getAll();

    public Optional<Review> getById(Integer reviewId);

    public List<Review> getReviewsByProductId(Integer productId);
}
