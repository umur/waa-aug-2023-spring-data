package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/minPrice/{minPrice}")
    public List<Product> getProductsByMinPrice(@PathVariable double minPrice) {
        return productService.getProductsByMinPrice(minPrice);
    }

    @GetMapping("/categoryAndMaxPrice")
    public List<Product> getProductsByCategoryAndMaxPrice(@RequestParam("category") Long categoryId, @RequestParam("maxPrice") double maxPrice) {
        Category category = new Category();
        category.setId(categoryId);
        return productService.getProductsByCategoryAndMaxPrice(category, maxPrice);
    }

    @GetMapping("/keyword")
    public List<Product> getProductsByNameContainingKeyword(@RequestParam("keyword") String keyword) {
        return productService.getProductsByNameContainingKeyword(keyword);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}


