package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.dto.SimpleProductDto;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    List<Product> getProductsByMinPrice(double minPrice);
    List<Product> getProductsByCategoryAndMaxPrice(Category category, double maxPrice);
    List<Product> getProductsByNameContainingKeyword(String keyword);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
