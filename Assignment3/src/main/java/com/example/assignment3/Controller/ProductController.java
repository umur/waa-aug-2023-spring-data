package com.example.assignment3.Controller;

import com.example.assignment3.Entities.Product;
import com.example.assignment3.Entities.Review;
import com.example.assignment3.Repositories.ProductRepository;
import com.example.assignment3.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{minprice}")
    public List<Product> findAllProductsCostMoreThan(@PathVariable int minprice){
        return productService.findAllProductsCostMoreThan(minprice);
    }
    @GetMapping("/{categoryId}/{maxPrice}")
    public List<Product> findProductByCategoryAndPriceLessThan(@PathVariable int categoryId, @PathVariable int maxPrice){
        return productService.findProductByCategoryAndPriceLessThan(categoryId, maxPrice);
    }
    @GetMapping("/{name}")
    public List<Product> findProductByNameContaining(@PathVariable String name){
        return productService.findProductByNameContaining(name);
    }
    //Sepration of concern flag -- Remember to put it in review controller
    @GetMapping("/{id}/reviews")
    public List<Review> getReviewsByProductId(@PathVariable int id){
        Product product = productService.findById(id);
        return product.getReviews();
    }
    //create:
    @PostMapping("/product")
    public void createProduct(@RequestBody Product product){
        productService.save(product);
    }
    //read
    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product findById(@PathVariable int id){
        return productService.findById(id);
    }
    //update
    @PutMapping
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
    //delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        productService.deleteById(id);
    }

}
