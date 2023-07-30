package com.example.assignment3.controller;


import com.example.assignment3.entity.Product;
import com.example.assignment3.service.imp.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody Product product){
        productService.add(product);
          return  ResponseEntity.ok("Post is working correctly");
    }
    @GetMapping
    public List<Product> get(){
        return productService.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody Product product,@PathVariable int id){
        productService.update(product,id);
        return ResponseEntity.ok("update is working correctly");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        productService.remove(id);
        return ResponseEntity.ok("delete is working correctly");

    }


}
