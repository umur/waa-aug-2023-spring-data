package com.lab3.service.services;

import com.lab3.entity.Category;

import java.util.List;

public interface CategoryService {
    public void save(Category category);
    public List<Category> getAll();
    public Category getById(Integer id);
    public void update(Integer id, Category category);
    public void delete(Integer id);
};
