package com.example.demo.service.impl;

import com.example.demo.dto.ProductDto;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Override
    public void save(ProductDto productDto) {

    }

    @Override
    public List<ProductDto> getAll() {
        return null;
    }

    @Override
    public ProductDto getById(int id) {
        return null;
    }

    @Override
    public void update(ProductDto productDto, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
