package com.example.demo.service;

import com.example.demo.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    void save(ReviewDto reviewDto);

    public List<ReviewDto> getAll();
    ReviewDto getById(int id);
    void update(ReviewDto reviewDto, int id);

    void delete(int id);
}
