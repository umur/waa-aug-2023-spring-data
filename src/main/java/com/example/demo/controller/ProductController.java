package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public void save(@RequestBody ProductDto productDto){
        productService.save(productDto);
    }

    @GetMapping("/filter")
    public ResponseEntity<List<ProductDto>> findProductsByMinPrice(@RequestParam("minPrice") Double minPrice) {
        return ResponseEntity.ok(productService.findByPriceGreaterThan(minPrice));
    }

    @GetMapping("/filter/{categoryName}")
    public ResponseEntity<List<ProductDto>> findProductsByCategoryAndMaxPrice(@PathVariable String categoryName,
                                                           @RequestParam("maxPrice") Double maxPrice) {
        return ResponseEntity.ok(productService.findByCategoryNameAndPriceLessThan(categoryName, maxPrice));
    }

    @GetMapping("/search/{keyword}")
    public ResponseEntity<List<ProductDto>> findProductsByKeyword(@PathVariable String keyword) {
        return ResponseEntity.ok(productService.findByNameContainingIgnoreCase(keyword));
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll(){
        List<ProductDto> productDtoList = productService.getAll();
        return ResponseEntity.ok(productDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable int id){
        ProductDto productDto = productService.getById(id);
        if(productDto != null) return ResponseEntity.ok(productDto);
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ProductDto productDto){
        productService.update(productDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getProductsByMinPrice(@RequestParam double minPrice) {
        return ResponseEntity.ok(productService.findByPriceGreaterThan(minPrice));
    }

}
