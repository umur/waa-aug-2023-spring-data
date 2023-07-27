package edu.miu.cs545.assignment03.controller;

import edu.miu.cs545.assignment03.dto.ProductDto;
import edu.miu.cs545.assignment03.server.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<ProductDto> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping()
    public void create(@RequestBody ProductDto dto){
         service.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/minPrice")
    public List<ProductDto> findCostMoreThanMinPrice(@RequestParam double minPrice){
            return service.findCostMoreThanMinPrice(minPrice);

    }

    @GetMapping("/category/maxPrice")
    public List<ProductDto> findInCategoryCostLessThanMaxPrice(@RequestParam Long categoryId ,@RequestParam double maxPrice){
            return service.findInCategoryCostLessThanMaxPrice(categoryId, maxPrice);
    }

    @GetMapping("/filterProduct")
    public List<ProductDto>  findProductsContainName(@RequestParam String name){
        return service.findProductsContainName(name);
    }

    //Find reviews of the product whose id is id.


}
