package lab3.lab3.Service.IMP;

import lab3.lab3.Model.Review;
import lab3.lab3.Repository.ProductRepo;
import lab3.lab3.Repository.ReviewRepo;
import lab3.lab3.Service.IreviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReviewService implements IreviewService {
    private ReviewRepo reviewRepo;
    private ProductRepo productRepo;

    @Autowired
    public ReviewService(ReviewRepo reviewRepo, ProductRepo productRepo) {
        this.reviewRepo = reviewRepo;
        this.productRepo = productRepo;
    }

    @Override
    public void save(Review review) {
    reviewRepo.save(review);

    }

    @Override
    public Review getReviewById(int id) {
        return null;
    }

    @Override
    public List<Review> getAll() {
        return reviewRepo.findAll();
    }

    @Override
    public void deletReview(int id) {
    reviewRepo.deleteById(id);

    }

    @Override
    public List<Review> getReviewsByProductId(int productId) {
        return productRepo.findById(productId).get().getReviewList();
    }

    @Override
    public List<Review> findByProductId(int id) {
        return reviewRepo.findByProductId(id);
    }
}
