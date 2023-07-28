package com.example.assignment3.controller;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public CategoryDto getById(@PathVariable int id){
        return categoryService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody CategoryDto categoryDto){
        categoryService.save(categoryDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }


}
