package com.example.assignment3.service.imp;

import com.example.assignment3.entity.Category;
import com.example.assignment3.repositry.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public void add(Category category) {
        categoryRepo.save(category);
    }

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
    public void update(Category category,int id){
        categoryRepo.save(category);
    }
    public void remove(int id){
        categoryRepo.deleteById(id);
    }
}
