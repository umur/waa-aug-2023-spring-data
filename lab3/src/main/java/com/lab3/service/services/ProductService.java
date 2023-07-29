package com.lab3.service.services;

import com.lab3.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public void save(Product product);
    public List<Product> getAll();
    public Product getById(Integer id);
    public void update(Integer id, Product product);
    public void delete(Integer id);
}
