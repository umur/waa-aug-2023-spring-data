package com.myapp.myapp.service;



import com.myapp.myapp.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    void save(ReviewDto reviewDto);

    public List<ReviewDto> getAll();
    ReviewDto getById(int id);
    void update(ReviewDto reviewDto, int id);

    void delete(int id);

    List<ReviewDto> findByProductId(Integer id);
}
