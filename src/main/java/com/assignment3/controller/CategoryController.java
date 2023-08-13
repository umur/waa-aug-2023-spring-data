package com.assignment3.controller;

import com.assignment3.entity.Category;
import com.assignment3.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    public void save(@RequestBody Category category){
        categoryService.save(category);
    }

    @DeleteMapping("/{categoryId}")
    public void delete(@PathVariable Integer categoryId){
        categoryService.delete(categoryId);
    }

    @PutMapping("/{categoryId}")
    public void update(@RequestBody Category category, @PathVariable Integer categoryId){
        categoryService.update(category, categoryId);
    }

    @GetMapping("/{categoryId}")
    public Optional<Category> getById (@PathVariable Integer categoryId){
        return categoryService.getById(categoryId);
    }

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }

}
