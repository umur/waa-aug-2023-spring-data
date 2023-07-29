package com.lab3.controller;

import com.lab3.entity.Product;
import com.lab3.service.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping ("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public void createProduct(@RequestBody Product product){
        productService.save(product);
    };

    @GetMapping
    public List<Product> getAllProduct(){
       return productService.getAll();
    };

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getById(id);
    };

    @PutMapping("/{id}")
    public void  updateProduct(@RequestBody Product product, @PathVariable Integer id){
        productService.update(id, product);
    };



};
