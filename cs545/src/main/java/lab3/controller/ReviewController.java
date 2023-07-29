package lab3.controller;

import lab3.dto.ReviewDto;
import lab3.model.Review;
import lab3.repository.ReviewRepo;
import lab3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;
    @Autowired
    private ReviewRepo reviewRepo;

    @PostMapping
    public void save(@RequestBody Review review){
        reviewService.saveReview(review);
    }

    @GetMapping("{id}")
    public ReviewDto getReview(@PathVariable int id){
        return reviewService.getReview(id);
    }

    @GetMapping("/all")
    public List<Review> getAll(){
        return reviewService.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        reviewService.deleteReview(id);
    }

    @PutMapping("{id}")
    public Review update(@PathVariable int id,@RequestBody Review review){
        return reviewService.updateReview(id,review);
    }

    @GetMapping("/{productId}")
    List<Review> findByProduct(@PathVariable int productId){
        return reviewRepo.findByProductContaining(productId);
    }
}
