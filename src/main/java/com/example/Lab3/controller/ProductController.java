package com.example.Lab3.controller;

import com.example.Lab3.entity.Product;
import com.example.Lab3.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public void add(@RequestBody Product product) {
        productService.add(product);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable int id) {
        productService.remove(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Product product, @PathVariable int id) {
        productService.update(product, id);
    }
}
