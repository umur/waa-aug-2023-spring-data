package com.example.assignmentw1d3.service.impl.impl;

import com.example.assignmentw1d3.entity.Category;
import com.example.assignmentw1d3.repository.CategoryRepo;
import com.example.assignmentw1d3.service.impl.IcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategaryService implements IcategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Override
    public void save(Category category) {
        categoryRepo.save(category);

    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void deletCategory(int id) {
categoryRepo.deleteById(id);
    }



}
