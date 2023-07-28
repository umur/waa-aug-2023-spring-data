package waa.lab3.service;


import waa.lab3.dto.CategoryDto;

import java.util.List;

public interface ICategoryService {
    List<CategoryDto> getAll();
    CategoryDto getById(int id);
    void deleteById(int id);
    void save(CategoryDto categoryDto);
    void update(int id, CategoryDto categoryDto);
}
