package com.example.assignment3.service.impl;

import com.example.assignment3.dto.ReviewDto;
import com.example.assignment3.dto.ReviewUpdateDto;
import com.example.assignment3.dto.UserDto;
import com.example.assignment3.entity.Review;
import com.example.assignment3.entity.User;
import com.example.assignment3.repository.ReviewRepo;
import com.example.assignment3.repository.UserRepo;
import com.example.assignment3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<ReviewDto> getAll() {
        List<Review> entityList = reviewRepo.findAll();
        List<ReviewDto> reviewDtoList = new ArrayList<>();
        entityList.forEach(review -> {
            var dto = modelMapper.map(review, ReviewDto.class);
            reviewDtoList.add(dto);
        });
        return reviewDtoList;
    }

    @Override
    public ReviewDto getById(int id) {
        Review review = reviewRepo.findById(id).get();
        return modelMapper.map(review, ReviewDto.class);
    }

    @Override
    public void save(ReviewDto reviewDto){
        Review review = modelMapper.map(reviewDto, Review.class);
        reviewRepo.save(review);
    }

    @Override
    public void delete(int id){
        reviewRepo.deleteById(id);
    }

    public List<ReviewDto> findReviewsByProduct(int productId){
        List<Review> entityList = reviewRepo.findReviewsByProduct_Id(productId);
        List<ReviewDto> reviewDtoList = new ArrayList<>();
        entityList.forEach(review -> {
            var dto = modelMapper.map(review, ReviewDto.class);
            reviewDtoList.add(dto);
        });
        return reviewDtoList;

    }

    public ReviewDto update(int id, ReviewUpdateDto reviewUpdateDto){
        Review review = reviewRepo.findById(id).get();
        review.setComment(reviewUpdateDto.getComment());
        reviewRepo.save(review);
        return modelMapper.map(review, ReviewDto.class);
    }


}
