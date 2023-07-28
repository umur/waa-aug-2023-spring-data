package com.example.assignment3.service;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    public List<ReviewDto> getAll();
    ReviewDto getById(int id);

    public void save(ReviewDto reviewDto);
    public void delete(int id);

    List<ReviewDto> findReviewsByProduct(int productId);
}
