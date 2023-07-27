package com.example.demo.service.impl;

import com.example.demo.dto.CategoryDto;
import com.example.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Override
    public void save(CategoryDto categoryDto) {

    }

    @Override
    public List<CategoryDto> getAll() {
        return null;
    }

    @Override
    public CategoryDto getById(int id) {
        return null;
    }

    @Override
    public void update(CategoryDto courseDto, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
