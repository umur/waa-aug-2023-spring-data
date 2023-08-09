package com.example.Lab3.service;

import com.example.Lab3.entity.Review;

import java.util.List;


public interface IReviewService {
    void add(Review product);
    void remove(int id);
    List<Review> findAll();
    void update(Review review,int id);
}
