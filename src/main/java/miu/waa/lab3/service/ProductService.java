package miu.waa.lab3.service;

import miu.waa.lab3.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();

    void create(ProductDto productDto);

    ProductDto read(int id);
    void update(int id, ProductDto productDto);
    void delete(int id);
}

