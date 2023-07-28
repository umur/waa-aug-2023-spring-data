package com.example.assignment3.service;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.ReviewDto;
import com.example.assignment3.dto.ReviewUpdateDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> getAll();
    ReviewDto getById(int id);

    void save(ReviewDto reviewDto);
    void delete(int id);

    ReviewDto update(int id, ReviewUpdateDto reviewUpdateDto);

    List<ReviewDto> findReviewsByProduct(int productId);
}
