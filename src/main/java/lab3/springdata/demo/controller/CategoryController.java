package lab3.springdata.demo.controller;

import lab3.springdata.demo.entity.Category;
import lab3.springdata.demo.service.impl.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService=categoryService;
    }
    @PostMapping
public void save(@RequestBody Category category){
        categoryService.save(category);
}

    @GetMapping
    public List<Category> getAll() {
      return categoryService.getAll();
    }
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable long id) {
        return categoryService.getCategoryById(id);
    }
    @DeleteMapping("/{id}")
    public void deletCategory(@PathVariable long id) {
        categoryService.deletCategory(id);

    }
    @PutMapping("/{id}")
    public void updateCategory(@PathVariable long id, @RequestBody Category category) {
        categoryService.updateCategory(id,category);

    }

}
