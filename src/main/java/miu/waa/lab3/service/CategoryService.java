package miu.waa.lab3.service;

import miu.waa.lab3.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAll();

    void create(CategoryDto categoryDto);

    CategoryDto read(int id);
    void update(int id, CategoryDto categoryDto);
    void delete(int id);
}
