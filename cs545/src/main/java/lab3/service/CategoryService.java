package lab3.service;

import lab3.dto.CategoryDto;
import lab3.model.Category;

import java.util.List;

public interface CategoryService {

    Category saveCategory(CategoryDto categoryDto);

    Category updateCategory(int id, Category category);

    void deleteCategory(int id);

    Category getCategory(int id);

    List<Category> getAllCategories();
}
