package lab3.service;

import lab3.dto.ReviewDto;
import lab3.model.Review;

import java.util.List;

public interface ReviewService {

    void saveReview(Review review);
    Review updateReview(int id, Review review);
    void deleteReview(int id);

    ReviewDto getReview(int id);
    List<Review> findAll();
//    List<Review> findByProduct_Id(Long productId);


}
