package com.example.demo.service.impl;

import com.example.demo.dto.ReviewDto;
import com.example.demo.entity.Review;
import com.example.demo.repository.ReviewRepo;
import com.example.demo.service.ReviewService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(ReviewDto reviewDto) {
        Review review = modelMapper.map(reviewDto, Review.class);
        reviewRepo.save(review);
    }

    @Override
    public List<ReviewDto> getAll() {
        List<Review> reviewList = reviewRepo.findAll();
        return reviewList.stream().map(review ->
                modelMapper.map(review, ReviewDto.class)).collect(Collectors.toList());
    }

    @Override
    public ReviewDto getById(int id) {
        Optional<Review> reviewOptional = reviewRepo.findById(id);
        if(reviewOptional.isEmpty()){
            throw new EntityNotFoundException("Review with ID " + id + " not found.");
        }
        Review review = reviewOptional.get();
        return modelMapper.map(review, ReviewDto.class);
    }

    @Override
    public void update(ReviewDto reviewDto, int id) {
        ReviewDto entityDto = getById(id);
        Review review = modelMapper.map(entityDto, Review.class);
        if(reviewDto.getComment() != null) review.setComment(reviewDto.getComment());
        reviewRepo.save(review);
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public List<ReviewDto> findByProductId(Integer id) {
        List<Review> reviewList = reviewRepo.findByProductId(id);
        return reviewList.stream().map(review -> modelMapper.map(review, ReviewDto.class)).collect(Collectors.toList());
    }
}
