package com.example.assignment3.controller;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.CategoryUpdateDto;
import com.example.assignment3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<CategoryDto> save(@RequestBody CategoryDto categoryDto){
        categoryService.save(categoryDto);
        return ResponseEntity.ok().body(categoryDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        categoryService.delete(id);
        return ResponseEntity.ok().body("Delete Successful");
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDto> update(@PathVariable int id, @RequestBody CategoryUpdateDto categoryUpdateDto){
        CategoryDto categoryDto = categoryService.update(id, categoryUpdateDto);
        return ResponseEntity.ok().body(categoryDto);
    }


}
