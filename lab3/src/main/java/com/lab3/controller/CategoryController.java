package com.lab3.controller;

import com.lab3.entity.Category;
import com.lab3.service.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public void createCat(@RequestBody Category category){
        categoryService.save(category);
    };

    @GetMapping
    public List<Category> getAllCat(){
        return categoryService.getAll();
    };

    @GetMapping("/{id}")
    public Category getCatById(@PathVariable Integer id){
        return categoryService.getById(id);
    };

    @PutMapping("/{id}")
    public void updateCat(@RequestBody Category cat, @PathVariable Integer id){
        categoryService.update(id, cat);
    };


    @DeleteMapping("/{id}")
    public void deleteCat(@PathVariable Integer id){
        categoryService.delete(id);
    };

};
