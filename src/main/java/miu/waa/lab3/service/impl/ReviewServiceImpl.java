package miu.waa.lab3.service.impl;

import lombok.RequiredArgsConstructor;

import miu.waa.lab3.dto.ReviewDto;
import miu.waa.lab3.entity.Review;
import miu.waa.lab3.repository.ReviewRepo;
import miu.waa.lab3.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<ReviewDto> getAll() {

        List<Review> reviews = reviewRepo.findAll();
        List<ReviewDto> results = new ArrayList<>();
        reviews.forEach(review->{
            ReviewDto dto = modelMapper.map(review, ReviewDto.class);
            results.add(dto);
        });

        return results;
    }

    @Override
    public void create(ReviewDto reviewDto) {
        Review review = modelMapper.map(reviewDto, Review.class);
        reviewRepo.save(review);
    }

    @Override
    public ReviewDto read(int id) {
        Optional<Review> address = reviewRepo.findById(id);
        return modelMapper.map(address, ReviewDto.class);
    }

    @Override
    public void update(int id, ReviewDto reviewDto) {
        reviewDto.setId(id);
        Review user = modelMapper.map(reviewDto, Review.class);
        reviewRepo.save(user);
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }
}
