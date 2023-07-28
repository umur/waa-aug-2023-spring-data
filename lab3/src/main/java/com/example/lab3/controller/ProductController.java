package com.example.lab3.controller;

import com.example.lab3.dto.ProductDto;
import com.example.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> getAll(){

        System.out.println("Test");
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id){
        return productService.getById(id);
    }

    @GetMapping("/priceGreater/{minPrice}")
    public List<ProductDto> getByPriceGreater(@PathVariable int minPrice){
        return productService.getByPriceGreater(minPrice);
    }

    @GetMapping("/nameContains/{keyword}")
    public List<ProductDto> getByKeyword(@PathVariable String keyword){
        return productService.getByNameContains(keyword);
    }

    @PostMapping
    public void save(@RequestBody ProductDto dto){
        productService.save(dto);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        productService.delete(id);
    }


}
