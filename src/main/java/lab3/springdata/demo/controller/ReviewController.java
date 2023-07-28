package lab3.springdata.demo.controller;

import lab3.springdata.demo.entity.Product;
import lab3.springdata.demo.entity.Review;
import lab3.springdata.demo.service.impl.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private ReviewService reviewService;
    @Autowired
    public ReviewController (ReviewService reviewService){
        this.reviewService=reviewService;
    }
    @PostMapping
    public void save (@RequestBody Review review){
        reviewService.save(review);
    }
    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable long id) {
        return reviewService.getReviewById(id);

    }
    @GetMapping
    public List<Review> getAll() {
        return reviewService.getAll();
    }
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable long id) {
      reviewService.deleteReview(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody Review review) {
        reviewService.update(id,review);
    }
@GetMapping("/{id}")
    public List<Review>FindByProductId(@PathVariable long id){
        return reviewService.findByProductId(id);
}}
