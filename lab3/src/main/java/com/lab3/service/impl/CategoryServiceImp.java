package com.lab3.service.impl;

import com.lab3.entity.Category;
import com.lab3.repository.CategoryRepository;
import com.lab3.service.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    };

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    };

    @Override
    public Category getById(Integer id) {
        return categoryRepository.getById(id);
    }

    @Override
    public void update(Integer id, Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }
}
