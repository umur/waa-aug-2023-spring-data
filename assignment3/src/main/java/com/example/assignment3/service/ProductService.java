package com.example.assignment3.service;

import com.example.assignment3.dto.ProductDto;
import com.example.assignment3.entity.Product;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();

    void save(ProductDto productDto);

    void delete(int id);

    ProductDto getById(int id);

    List<ProductDto> findAllByPriceGreaterThan(int minPrice);

    List<ProductDto> findAllByCategoryAndPriceLessThan(int catId, int maxPrice);

    List<ProductDto> findAllByNameContains(String str);


}
