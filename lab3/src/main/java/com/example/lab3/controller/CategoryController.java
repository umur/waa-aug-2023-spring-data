package com.example.lab3.controller;

import com.example.lab3.dto.CategoryDto;
import com.example.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/category")
@RequiredArgsConstructor

public class CategoryController {
   
    
        private final CategoryService categoryService;

        @GetMapping
        public List<CategoryDto> getAll(){

            System.out.println("Test");
            return categoryService.getAll();
        }

        @GetMapping("/{id}")
        public CategoryDto getById(@PathVariable int id){
            return categoryService.getById(id);
        }

//        @GetMapping("/priceGreater/{minPrice}")
//        public List<CategoryDto> getByPriceGreater(@PathVariable int minPrice){
//            return CategoryService.getByPriceGreater(minPrice);
//        }

//        @GetMapping("/nameContains/{keyword}")
//        public List<CategoryDto> getByKeyword(@PathVariable String keyword){
//            return CategoryService.getByNameContains(keyword);
//        }

        @PostMapping
        public void save(@RequestBody CategoryDto dto){
            categoryService.save(dto);
        }

        @DeleteMapping("/{id}")
        public  void delete(@PathVariable int id){
            categoryService.delete(id);
        }
}
