package com.example.assignment3.service.imp;

import com.example.assignment3.entity.Review;
import com.example.assignment3.entity.User;
import com.example.assignment3.repositry.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
@Autowired
    ReviewRepo reviewRepo;
    public void add(Review review) {
        reviewRepo.save(review);
    }

    public List<Review> findAll() {
        return reviewRepo.findAll();
    }


    public void remove(int id) {
     reviewRepo.deleteById(id);
    }

    public void update(Review review, int id) {
        reviewRepo.save(review);

    }
}
