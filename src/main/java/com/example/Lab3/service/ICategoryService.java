package com.example.Lab3.service;


import com.example.Lab3.entity.Category;

import java.util.List;

public interface ICategoryService {
    void add(Category category);
    void remove(int id);
    List<Category> findAll();
    void update(Category category,int id);
    Category getById(int id);
}
