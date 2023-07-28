package waa.lab3.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import waa.lab3.domain.Review;
import waa.lab3.dto.ProductDto;
import waa.lab3.dto.ReviewDto;
import waa.lab3.repository.IReviewRepository;
import waa.lab3.service.IProductService;
import waa.lab3.service.IReviewService;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/reviews")
public class ReviewController{
    @Autowired
    private IReviewService reviewService;

    @GetMapping
    public List<ReviewDto> getAll() {
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public ReviewDto getById(@PathVariable int id) {
        return reviewService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        reviewService.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody ReviewDto reviewDto) {
        reviewService.save(reviewDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ReviewDto reviewDto) {
        reviewService.update(id,reviewDto);
    }
    @GetMapping("/byproductid/{id}")
    public List<ReviewDto> getReviewsByProductId(@PathVariable int id){
        return reviewService.getReviewsByProductId(id);
    }
}
