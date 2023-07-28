package waa.lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waa.lab3.dto.ProductDto;
import waa.lab3.service.IProductService;

import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;


    @GetMapping
    public List<ProductDto> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto getById(@PathVariable int id) {
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody ProductDto productDto) {
        productService.save(productDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ProductDto productDto) {
        productService.update(id,productDto);
    }
    @GetMapping("/byminprice")
    public List<ProductDto> getProductsByMinPrice(@RequestParam("minPrice") double minPrice ){
        return productService.getProductsByMinPrice(minPrice);
    }
    @GetMapping("/bycategoryandmaxprice")
    public List<ProductDto> getProductsByCategoryNameAndPrice(
            @RequestParam("categoryName") String categoryName,
            @RequestParam("maxPrice") double maxPrice) {
        return productService.getProductsByCategoryNameAndPrice(categoryName,maxPrice);
    }
    @GetMapping("/byproductkeyword")
    public List<ProductDto> getProductsByProductNameKeyWord(@RequestParam("keyword") String keyword){
        return productService.getProductsByProductNameKeyWord(keyword);
    }


}
