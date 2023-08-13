package com.assignment3.service.impl;


import com.assignment3.entity.Category;
import com.assignment3.repository.CategoryRepo;
import com.assignment3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CategoryServiceImpl implements CategoryService {


    private CategoryRepo categoryRepo;

    @Autowired
    public CategoryServiceImpl (CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void update(Category newCategory, Integer categoryId) {

        Optional<Category> categoryOptional = categoryRepo.findById(categoryId);

        if(categoryOptional.isPresent()){

            Category category = categoryOptional.get();

            category.setId(newCategory.getId());
            category.setName(newCategory.getName());

            categoryRepo.save(category);
        }

    }

    @Override
    public void delete(Integer categoryId) {
        categoryRepo.deleteById(categoryId);
    }

    @Override
    public List<Category> getAll() {
       return categoryRepo.findAll();
    }

    @Override
    public Optional<Category> getById(Integer categoryId) {

       if (categoryRepo.existsById(categoryId)){
           return categoryRepo.findById(categoryId);
       }
       throw new RuntimeException("The Category can not be found");
    }
}
