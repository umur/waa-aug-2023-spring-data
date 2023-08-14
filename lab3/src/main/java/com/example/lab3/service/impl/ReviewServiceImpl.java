package com.example.lab3.service.impl;

import com.example.lab3.dto.ReviewDto;
import com.example.lab3.entity.Review;
import com.example.lab3.repository.ReviewRepo;
import com.example.lab3.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<ReviewDto> getAll() {
        var entityList = reviewRepo.findAll();
        var dtoList = new ArrayList<ReviewDto>();
        entityList.forEach(entity->{
            var dto = modelMapper.map(entity, ReviewDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public ReviewDto getById(int id) {
        var entity = reviewRepo.findById(id).get();
        var dto = modelMapper.map(entity, ReviewDto.class);
        return dto;
    }


    @Override
    public void save(ReviewDto dto) {
        Review entity = modelMapper.map(dto,Review.class);
        reviewRepo.save(entity);

    }

    @Override
    public List<ReviewDto> getAllByProductId(int id) {
        var entityList = reviewRepo.findReviewsByProductId(id);
        var dtoList = new ArrayList<ReviewDto>();
        entityList.forEach(entity->{
            var dto = modelMapper.map(entity,ReviewDto.class);
            dtoList.add(dto);
        });

        return dtoList;
    }

    @Override
    public void delete(int id) {
        Optional<Review> entity = reviewRepo.findById(id);
        if(entity.isPresent()){
            reviewRepo.deleteById(id);
        }
    }
}
