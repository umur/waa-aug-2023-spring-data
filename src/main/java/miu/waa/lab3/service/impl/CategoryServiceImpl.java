package miu.waa.lab3.service.impl;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.CategoryDto;
import miu.waa.lab3.entity.Category;
import miu.waa.lab3.repository.CategoryRepo;
import miu.waa.lab3.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<CategoryDto> getAll() {
        List<Category> categories = categoryRepo.findAll();
        List<CategoryDto> results = new ArrayList<>();
        categories.forEach(c->{
            CategoryDto dto = modelMapper.map(c, CategoryDto.class);
            results.add(dto);
        });

        return results;
    }

    @Override
    public void create(CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        categoryRepo.save(category);
    }

    @Override
    public CategoryDto read(int id) {
        Optional<Category> category = categoryRepo.findById(id);
        return modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public void update(int id, CategoryDto categoryDto) {
        Optional<Category> category = categoryRepo.findById(id);
        category.get().setName(categoryDto.getName());
        categoryRepo.save(category.get());
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
