package com.example.assignment3.Services;

import com.example.assignment3.Entities.Category;
import com.example.assignment3.Entities.Product;
import com.example.assignment3.Entities.Review;
import com.example.assignment3.Repositories.CategoryRepository;
import com.example.assignment3.Repositories.ProductRepository;
//import com.example.assignment3.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;
    public List<Product> findAllProductsCostMoreThan(int minprice) {
        return productRepository.findProductByPriceGreaterThan(minprice);
    }
    public List<Product> findProductByCategoryAndPriceLessThan(int categoryId, int maxPrice){
        Category category = categoryRepository.findById(categoryId).orElse(null);
        return productRepository.findProductByCategoryAndPriceLessThan(category, maxPrice);
    }
    public List<Product> findProductByNameContaining(String name){
        return productRepository.findProductByNameContaining(name);
    }

    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setCategory(product.getCategory());
        existingProduct.setName(product.getName());
        existingProduct.setRating(product.getRating());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setReviews(product.getReviews());
        return productRepository.save(existingProduct);

    }

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
