package com.example.assignment3.service;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.CategoryUpdateDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAll();

    CategoryDto getById(int id);

    void save(CategoryDto categoryDto);

    void delete(int id);

    CategoryDto update(int id, CategoryUpdateDto categoryDto);
}
