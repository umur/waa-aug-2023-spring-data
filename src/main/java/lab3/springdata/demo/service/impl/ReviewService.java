package lab3.springdata.demo.service.impl;

import lab3.springdata.demo.entity.Review;
import lab3.springdata.demo.repository.ProductRepo;
import lab3.springdata.demo.repository.ReviewRepo;
import lab3.springdata.demo.service.IreviewService;
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
   public  ReviewService (ReviewRepo reviewRepo ,ProductRepo productRepo){
        this.reviewRepo=reviewRepo;
        this.productRepo=productRepo;
    }

    @Override
    public void save(Review review) {
        reviewRepo.save(review );

    }

    @Override
    public Review getReviewById(long id) {
       return null;
    }

    @Override
    public List<Review> getAll() {
        return reviewRepo.findAll();
    }

    @Override
    public void deleteReview(long id) {
        reviewRepo.deleteById(id);

    }

    @Override
    public void update(Long id, Review review) {
        Review reviewToUpdate= reviewRepo.findById(id).get();
        reviewToUpdate=review;
        reviewRepo.save(reviewToUpdate);

    }

    @Override
    public List<Review> findByProductId(long id) {

        return reviewRepo.findByProductId(id);
    }


}
