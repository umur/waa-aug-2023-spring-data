package com.assignment3.service;

import com.assignment3.entity.Category;


import java.util.List;
import java.util.Optional;

public interface CategoryService {

    public void save(Category category);

    public void update (Category category, Integer categoryId);

    public void delete (Integer categoryId);

    List<Category> getAll();

    public Optional<Category> getById (Integer categoryId);
}
