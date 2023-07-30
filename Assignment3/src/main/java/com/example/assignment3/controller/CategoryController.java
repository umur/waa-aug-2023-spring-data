package com.example.assignment3.controller;


import com.example.assignment3.entity.Category;
import com.example.assignment3.service.ICategoryService;
import com.example.assignment3.service.imp.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.nio.file.Path;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/category")
public class CategoryController {
   @Autowired
   CategoryService categoryService;

   @PostMapping
    public ResponseEntity<String> add(@RequestBody Category category){
       categoryService.add(category);
       return ResponseEntity.ok("Post is working correctly");
   }
   @GetMapping
    public List<Category> get(){
       return categoryService.findAll();
   }
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody Category category,@PathVariable int id){
        categoryService.update(category,id);
        return ResponseEntity.ok("update is working correctly");

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        categoryService.remove(id);
       return ResponseEntity.ok("delete is working correctly");
    }


}
