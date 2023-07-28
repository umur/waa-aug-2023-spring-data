package com.example.assignment3.controller;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.ProductDto;
import com.example.assignment3.service.ProductService;
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
        return productService.getAll();
    }

    @PostMapping
    public void save(@RequestBody ProductDto studentDto){
        productService.save(studentDto);
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id){
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
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
    List<ProductDto> findAllByNameContains(@RequestParam String str){
        return productService.findAllByNameContains(str);
    }
}
