package lab3.controller;

import lab3.dto.ProductDto;
import lab3.model.Category;
import lab3.model.Product;
import lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        Product savedProduct = productService.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ProductDto getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.findAllProducts();
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id){
        productService.deleteProduct(id);
    }

    @PutMapping({"id"})
    public Product update(@PathVariable int id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    @GetMapping("/price/{minPrice}")
    List<Product> findAllByPriceGreaterThanEqual(@PathVariable int minPrice){
        return productService.findAllByPriceGreaterThanEqual(minPrice);

    }

    @GetMapping("/item/{keyword}")
    List<Product> findAllByNameContaining(@PathVariable String keyword){
        return productService.findAllByNameContaining(keyword);}


    @GetMapping("/item/{cat}/{maxPrice}")
    List<Product> findAllByCategoryAndPriceLessThanEqual(@PathVariable Category cat, @PathVariable int maxPrice){
        return productService.findAllByCategoryAndPriceLessThanEqual(cat,maxPrice);

    }



}
