package com.example.assignment3.controller;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.ProductDto;
import com.example.assignment3.dto.ProductUpdateDto;
import com.example.assignment3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> getAll(){
        return productService.getAll();
    }

    @PostMapping
    public ResponseEntity<ProductDto> save(@RequestBody ProductDto productDto){
        productService.save(productDto);
        return ResponseEntity.ok().body(productDto);
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id){
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        productService.delete(id);
        return ResponseEntity.ok().body("Delete Successful");
    }

    @GetMapping("/findByMinPrice")
    public List<ProductDto> productCostMoreThan(@RequestParam int minPrice){
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("/findByCatAndMaxPrice")
    public List<ProductDto> findAllByCategoryAndPriceLessThan(@RequestParam int catId, int maxPrice){
        return productService.findAllByCategoryAndPriceLessThan(catId, maxPrice);
    }

    @GetMapping("/findAllByNameContains")
    public List<ProductDto> findAllByNameContains(@RequestParam String name){
        return productService.findAllByNameContains(name);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable int id, @RequestBody ProductUpdateDto productUpdateDto){
        ProductDto productDto = productService.update(id, productUpdateDto);
        return ResponseEntity.ok().body(productDto);
    }
}
