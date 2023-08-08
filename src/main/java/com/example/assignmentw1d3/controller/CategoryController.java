package com.example.assignmentw1d3.controller;

import com.example.assignmentw1d3.entity.Category;
import com.example.assignmentw1d3.service.impl.IcategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")

public class CategoryController {

    private IcategoryService icategoryService;
    @Autowired
    public CategoryController(IcategoryService icategoryService) {
        this.icategoryService = icategoryService;
    }

    @PostMapping
    public void save(@RequestBody Category category){
        icategoryService.save(category);

    }
    @GetMapping
    public List<Category> getAllCategory(){
       return icategoryService.getAll();

    }
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id){
        return icategoryService.getCategoryById(id);
    }

    @DeleteMapping("/{id}")
    public void deletCategory(@PathVariable  int id){
        icategoryService.getCategoryById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Category category){
        icategoryService.save(category);
    }
    @PutMapping
    public void update(@RequestBody Category category){
        icategoryService.save(category);
    }



}

