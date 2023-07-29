package lab3.service.impl;

import lab3.dto.CategoryDto;
import lab3.model.Category;
import lab3.repository.CategoryRepo;
import lab3.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Category saveCategory(CategoryDto categoryDto) {
        return categoryRepo.save(modelMapper.map(categoryDto, Category.class));
    }

    @Override
    public Category updateCategory(int id, Category category) {

        Category category1 = categoryRepo.findById(id).get();
        category1.setName(category.getName());
        category1.setProducts(category.getProducts());

        return categoryRepo.save(category1);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public Category getCategory(int id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
}
