package com.example.demo.service;

import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();

    public Category getCategoryById(int id);

    public Category createCategory(Category category);

    public Category updateCategory(int id, Category updatedCategory);

    public void deleteCategory(int id);
}
