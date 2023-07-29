package com.lab3.service.services;

import com.lab3.entity.Review;

import java.util.List;

public interface ReviewService {
    public void save(Review review);
    public List<Review> getAll();
    public Review getById(Integer id);
    public void update(Integer id, Review review);
    public void delete(Integer id);
}
