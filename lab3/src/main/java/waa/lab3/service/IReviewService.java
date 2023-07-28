package waa.lab3.service;

import waa.lab3.dto.CategoryDto;
import waa.lab3.dto.ReviewDto;

import java.util.List;

public interface IReviewService {
    List<ReviewDto> getAll();
    ReviewDto getById(int id);
    void deleteById(int id);
    void save(ReviewDto reviewDto);
    void update(int id, ReviewDto reviewDto);
    List<ReviewDto> getReviewsByProductId(int id);
}
