package com.lab3.service.impl;

import com.lab3.entity.Product;
import com.lab3.repository.ProductRepository;
import com.lab3.service.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public void save(Product product) {
        productRepository.save(product);
    };

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    };

    //what is the difference of the getById and findById?
    @Override
    public Product getById(Integer id) {
        return productRepository.getById(id);
    };

    @Override
    public void update(Integer id, Product product) {
        productRepository.save(product);
    };

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    };
}
