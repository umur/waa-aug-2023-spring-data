package w1d3.springdata.service;

import w1d3.springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    Review create(Review review);

    List<Review> findAll();

    Review findById(Long id);

    Review update(Long id, Review review);

    void delete(Long id);
}
