package com.example.demo.service.impl;

import com.example.demo.dto.ReviewDto;
import com.example.demo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    @Override
    public void save(ReviewDto reviewDto) {

    }

    @Override
    public List<ReviewDto> getAll() {
        return null;
    }

    @Override
    public ReviewDto getById(int id) {
        return null;
    }

    @Override
    public void update(ReviewDto reviewDto, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
