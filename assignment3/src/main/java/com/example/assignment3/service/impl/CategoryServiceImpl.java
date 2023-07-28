package com.example.assignment3.service.impl;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.CategoryUpdateDto;
import com.example.assignment3.entity.Address;
import com.example.assignment3.entity.Category;
import com.example.assignment3.repository.CategoryRepo;
import com.example.assignment3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDto> getAll() {
        List<Category> entityList = categoryRepo.findAll();
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        entityList.forEach(category -> {
            var dto = modelMapper.map(category, CategoryDto.class);
            categoryDtoList.add(dto);
        });
        return categoryDtoList;
    }

    @Override
    public CategoryDto getById(int id) {
        Category category = categoryRepo.findById(id).get();
        return modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public void save(CategoryDto categoryDto){
        Category category = modelMapper.map(categoryDto, Category.class);
        categoryRepo.save(category);
    }

    @Override
    public void delete(int id){
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryDto update(int id, CategoryUpdateDto categoryDto){
        Category category = categoryRepo.findById(id).get();
        if(categoryDto.getName()!=null){
            category.setName(categoryDto.getName());
        }
        categoryRepo.save(category);
        return modelMapper.map(category,CategoryDto.class);
    }


}
