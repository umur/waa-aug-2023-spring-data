package miu.waa.lab3.controller;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.ProductDto;
import miu.waa.lab3.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> getAll(){
        return productService.getAll();
    }

    @PostMapping
    public void create(@RequestBody ProductDto dto){
        productService.create(dto);
    }

    @GetMapping("/{id}")
    public ProductDto read(@PathVariable int id){
        return productService.read(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ProductDto dto){
        productService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }

}
