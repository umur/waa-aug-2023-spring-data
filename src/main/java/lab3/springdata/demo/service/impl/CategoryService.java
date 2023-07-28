package lab3.springdata.demo.service.impl;

import lab3.springdata.demo.entity.Category;
import lab3.springdata.demo.repository.CategoryRepo;
import lab3.springdata.demo.service.IcategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryService implements IcategoryService {

    private CategoryRepo categoryRepo;
    @Autowired
    public CategoryService (CategoryRepo categoryRepo){
        this.categoryRepo=categoryRepo;
    }
    @Override
    public void save(Category category) {
        categoryRepo.save(category);

    }

    @Override
    public Category getCategoryById(long id) {
      return categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void deletCategory(long id) {
    categoryRepo.deleteById(id);
    }

    @Override
    public void updateCategory(long id, Category category) {
        Category categoryToUpdate=categoryRepo.findById(id).get();
        categoryToUpdate=category;
        categoryRepo.save(categoryToUpdate);

    }

}
