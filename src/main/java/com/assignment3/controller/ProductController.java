package com.assignment3.controller;

import com.assignment3.entity.Product;
import com.assignment3.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)

@RestController
@RequestMapping("/products")
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @CrossOrigin

    @PostMapping
    public void save(@RequestBody Product product){
        productService.save(product);
    }

    @DeleteMapping("/{productId}")
    public void delete(@PathVariable Integer productId){
        productService.delete(productId);
    }

    @PutMapping("/{productId}")
    public void update(@RequestBody Product product, @PathVariable Integer productId){
        productService.update(product, productId);
    }

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{productId}")
    public Optional<Product> getById(@PathVariable Integer productId){
        return productService.getById(productId);
    }

    @GetMapping("/price")
    public List<Product> getProductsGreaterThanPrice (@RequestParam Integer price){
        return productService.getProductsGreaterThanPrice(price);
    }

    @GetMapping("/category/maxPrice")
    public List<Product> getProductByCategoryLessThanMaxPrice(@RequestParam String category, @RequestParam Integer maxPrice) {
        return productService.getProductByCategoryLessThanMaxPrice(category, maxPrice);
    }

    @GetMapping("/keyword")
    public List<Product> getProductContaining(@RequestParam String keyWord) {
        return productService.getProductContaining(keyWord);
    }


}

