package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();

    public Product getProductById(int id);

    public Product createProduct(Product product);

    public Product updateProduct(int id, Product updatedProduct);

    public void deleteProduct(int id);

    public List<Product> getProductsAboveMinPrice(double minPrice);

    public List<Product> getProductsInCategoryBelowMaxPrice(Category category, double maxPrice);

    public List<Product> getProductsByNameContaining(String keyword);
}
