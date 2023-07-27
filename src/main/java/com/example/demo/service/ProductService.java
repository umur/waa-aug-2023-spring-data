package com.example.demo.service;

import com.example.demo.dto.ProductDto;

import java.util.List;

public interface ProductService {
    void save(ProductDto productDto);

    public List<ProductDto> getAll();
    ProductDto getById(int id);
    void update(ProductDto productDto, int id);

    void delete(int id);
}
