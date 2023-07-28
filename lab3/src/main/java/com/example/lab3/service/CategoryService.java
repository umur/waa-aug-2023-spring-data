package com.example.lab3.service;

import com.example.lab3.dto.CategoryDto;
import com.example.lab3.dto.ProductDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAll();

    List<CategoryDto> getById(int id);
    void save(CategoryDto dto);
}
