package com.myapp.myapp.service.impl;


import com.myapp.myapp.dto.CategoryDto;
import com.myapp.myapp.entity.Category;
import com.myapp.myapp.repo.CategoryRepository;
import com.myapp.myapp.service.CategoryService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;
    private final ModelMapper modelMapper;

    @Override
    public void save(CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        categoryRepo.save(category);
    }

    @Override
    public List<CategoryDto> getAll() {
        List<Category> categoryList = categoryRepo.findAll();
        return categoryList.stream().map(
                category -> modelMapper.map(category, CategoryDto.class)).collect(Collectors.toList());
    }

    @Override
    public CategoryDto getById(int id) {
        Optional<Category> categoryOptional = categoryRepo.findById(id);
        if(categoryOptional.isEmpty()){
            throw new EntityNotFoundException("Category with Id " + id + " not found." );
        }
        Category category = categoryOptional.get();
        return modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public void update(CategoryDto categoryDto, int id) {
        CategoryDto entityDto = getById(id);
        Category category = modelMapper.map(entityDto, Category.class);
        if(categoryDto.getName() != null) category.setName(categoryDto.getName());
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
