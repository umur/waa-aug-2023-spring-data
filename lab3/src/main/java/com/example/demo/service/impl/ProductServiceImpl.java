package com.example.demo.service.impl;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public List<Product> getProductsByMinPrice(double minPrice) {
        return productRepo.findByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> getProductsByCategoryAndMaxPrice(Category category, double maxPrice) {
        return productRepo.findByCategoryAndPriceLessThan(category, maxPrice);
    }

    @Override
    public List<Product> getProductsByNameContainingKeyword(String keyword) {
        return productRepo.findByNameContainingIgnoreCase(keyword);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product existingProduct = getProductById(id);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setCategory(product.getCategory());
            return productRepo.save(existingProduct);
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }



}
