package com.example.lab3.service.impl;

import com.example.lab3.dto.CategoryDto;

import com.example.lab3.entity.Category;
import com.example.lab3.repository.CategoryRepo;

import com.example.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getAll() {
        var entityList = categoryRepo.findAll();
        var dtoList = new ArrayList<CategoryDto>();
        entityList.forEach(entity->{


            var dto = modelMapper.map(entity, CategoryDto.class);

            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public CategoryDto getById(int id) {
        var entity = categoryRepo.findById(id).get();
        var dto = modelMapper.map(entity, CategoryDto.class);
        return dto;
    }


    @Override
    public void save(CategoryDto dto) {
        Category entity = modelMapper.map(dto, Category.class);
        categoryRepo.save(entity);

    }

    @Override
    public void delete(int id) {
        Optional<Category> entity = categoryRepo.findById(id);
        if(entity.isPresent()){
            categoryRepo.deleteById(id);
        }
    }
}
