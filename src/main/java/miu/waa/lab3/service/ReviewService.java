package miu.waa.lab3.service;

import miu.waa.lab3.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> getAll();
    void create(ReviewDto reviewDto);
    ReviewDto read(int id);
    void update(int id, ReviewDto reviewDto);
    void delete(int id);
}
