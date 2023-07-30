package com.example.assignment3.service.imp;


import com.example.assignment3.entity.Product;
import com.example.assignment3.repositry.ProductRepo;
import com.example.assignment3.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepo productRepo;
    public void add(Product product) {
        productRepo.save(product);
    }

    public List<Product> findAll() {
        return  productRepo.findAll();
    }

    public void update(Product product, int id) {
        productRepo.save(product);
    }

    public void remove(int id) {
        productRepo.deleteById(id);
    }
}
