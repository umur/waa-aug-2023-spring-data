package com.lab3.service.impl;

import com.lab3.entity.Review;
import com.lab3.repository.ReviewRepository;
import com.lab3.service.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReviewServiceImp implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public void save(Review review) {
        reviewRepository.save(review);

    }

    @Override
    public List<Review> getAll() {
        return reviewRepository.findAll();
    };

    @Override
    public Review getById(Integer id) {
        return reviewRepository.getById(id);
    }



    ;

    @Override
    public void update(Integer id, Review review) {
        reviewRepository.save(review);
    };

    @Override
    public void delete(Integer id) {
        reviewRepository.deleteById(id);
    };
}
