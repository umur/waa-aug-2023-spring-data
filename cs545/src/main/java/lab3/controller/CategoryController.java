package lab3.controller;

import lab3.dto.CategoryDto;
import lab3.model.Category;
import lab3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category saveCategory(CategoryDto categoryDto){
        return categoryService.saveCategory(categoryDto);
    }

    @GetMapping("{id}")
    public Category getCategory(@PathVariable int id){
        return categoryService.getCategory(id);
    }

    @GetMapping("/all")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
         categoryService.deleteCategory(id);
    }

    @PutMapping("{id}")
    public Category update(@PathVariable int id, @RequestBody Category category){
        return categoryService.updateCategory(id, category);
    }


}
