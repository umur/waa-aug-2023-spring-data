package waa.lab3.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import waa.lab3.domain.Category;
import waa.lab3.dto.AddressDto;
import waa.lab3.dto.CategoryDto;
import waa.lab3.repository.ICategoryRepository;
import waa.lab3.service.ICategoryService;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;


    @GetMapping
    public List<CategoryDto> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public CategoryDto getById(@PathVariable int id) {
        return categoryService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        categoryService.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody CategoryDto categoryDto) {
        categoryService.save(categoryDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody CategoryDto categoryDto) {
        categoryService.update(id,categoryDto);
    }
}
