package lab3.springdata.demo.service;

import lab3.springdata.demo.entity.Product;
import lab3.springdata.demo.entity.Review;

import java.util.List;

public interface IreviewService {
    public void save(Review review);
    public Review getReviewById(long id);

    public List<Review> getAll();

    public void deleteReview(long id);

    public void update(Long id ,Review review);


    public List<Review> findByProductId(long id);
}
