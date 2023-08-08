package com.example.assignmentw1d3.service.impl;

import com.example.assignmentw1d3.entity.Category;

import java.util.List;

public interface IcategoryService {

    public void save(Category category);
    public Category getCategoryById(int id);
    public List<Category> getAll();
    public void deletCategory(int id);

}
