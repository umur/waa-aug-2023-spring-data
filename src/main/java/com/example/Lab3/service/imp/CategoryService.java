package com.example.Lab3.service.imp;

import com.example.Lab3.entity.Category;
import com.example.Lab3.repository.CategoryRepo;
import com.example.Lab3.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService{
    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;
    @Override
    public void add(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void remove(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public void update(Category category, int id) {
        var categor = modelMapper.map(category,Category.class);
        categor.setId(id);
        categoryRepo.save(categor);
    }

    @Override
    public Category getById(int id) {
        return categoryRepo.findById(id).get();
    }

}
