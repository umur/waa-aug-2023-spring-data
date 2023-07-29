package miu.waa.lab3.controller;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.CategoryDto;
import miu.waa.lab3.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getAll(){
        return categoryService.getAll();
    }

    @PostMapping
    public void create(@RequestBody CategoryDto categoryDto){
        categoryService.create(categoryDto);
    }

    @GetMapping("/{id}")
    public CategoryDto read(@PathVariable int id){
        return categoryService.read(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody CategoryDto categoryDto){
        categoryService.update(id, categoryDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        categoryService.delete(id);
    }
}
