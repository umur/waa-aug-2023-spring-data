package com.example.assignmentw1d3.controller;

import com.example.assignmentw1d3.entity.Product;

import com.example.assignmentw1d3.service.impl.impl.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll(){
        return productService.GetAllProduct();

    }
    @PostMapping()
    public void save(@RequestBody Product product){
        productService.save(product);
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Product product){
        productService.updatePeroduct(id,product);
    }
    @GetMapping("/{price}")
    public List<Product> findByPriceGreaterThan(@PathVariable double price){
        return productService.findByPriceGreaterThan(price);
    }
    @GetMapping("/{categoryId}/{price}")
    public List<Product> findByCatagoryIdAndPriceLessThan(@PathVariable int categoryId, @PathVariable double price){
        return productService.findByCatagoryIdAndPriceLessThan(categoryId,price);
    }
    @GetMapping("/{name}")
    public List<Product> findByNameContaining(@PathVariable String name){
        return productService.findByNameContaining(name);
    }




}
