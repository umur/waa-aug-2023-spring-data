package lab3.lab3.Service;

import lab3.lab3.Model.Category;
import lab3.lab3.Model.Review;

import java.util.List;

public interface IreviewService {
    public void save(Review review);
    public Review getReviewById(int id);
    public List<Review> getAll();
    public void deletReview(int id);
    List<Review> getReviewsByProductId(int productId);

    public List<Review> findByProductId(int id);
}
