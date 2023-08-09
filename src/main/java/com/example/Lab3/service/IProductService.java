package com.example.Lab3.service;

import com.example.Lab3.entity.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);
    void remove(int id);
    List<Product> findAll();
    void update(Product product,int id);
}
