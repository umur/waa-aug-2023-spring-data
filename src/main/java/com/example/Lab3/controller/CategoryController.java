package com.example.Lab3.controller;

import com.example.Lab3.entity.Category;
import com.example.Lab3.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }
    @PostMapping
    public void add(@RequestBody Category category) {
        categoryService.add(category);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        categoryService.remove(id);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Category category, @PathVariable int id) {
        categoryService.update(category, id);
    }
}
