package com.example.lab3.service;

import com.example.lab3.dto.ProductDto;
import com.example.lab3.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> getAll();
    ReviewDto getById(int id);
    public void delete(int id);
    void save(ReviewDto dto);
    List<ReviewDto> getAllByProductId(int id);
}
