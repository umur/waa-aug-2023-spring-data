package lab3.service.impl;

import lab3.dto.ReviewDto;
import lab3.model.Review;
import lab3.repository.ReviewRepo;
import lab3.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveReview(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public Review updateReview(int id, Review review) {

        Review review1 = reviewRepo.findById(id).get();
        review1.setComment(review.getComment());
        review1.setUser(review.getUser());
        review1.setProduct(review.getProduct());
        return reviewRepo.save(review1);

    }

    @Override
    public void deleteReview(int id) {
        reviewRepo.deleteById(id);

    }

    @Override
    public ReviewDto getReview(int id) {
        return modelMapper.map(reviewRepo.findById(id).get(), ReviewDto.class);
    }

    @Override
    public List<Review> findAll() {
        return reviewRepo.findAll();
    }

//    @Override
//    public List<Review> findByProduct_Id(Long productId) {
//        return reviewRepo.findByProduct_Id(productId);
//    }
}
