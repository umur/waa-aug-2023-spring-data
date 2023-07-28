package lab3.springdata.demo.controller;

import lab3.springdata.demo.entity.Product;
import lab3.springdata.demo.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;
      @Autowired
    public ProductController(ProductService productService){
    this.productService=productService;
}
@PostMapping
    public void save (@RequestBody Product product){
        productService.save(product);
    }
    @GetMapping
    public List<Product> getAll() {
       return productService.getAll();

}
@GetMapping("/{id}")
    public Product getProductById(@PathVariable long id){
          return productService.getProductById(id);
    }
@DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        productService.deleteById(id);
    }

@GetMapping("/{price}")
    public List<Product> findByPriceGreaterThan(@PathVariable double price){
         return  productService.findByPriceGreaterThan(price);
    }
@GetMapping("/{categoryId}/{price}")
    public List <Product> findByCatagoryIdAndPriceLessThan(@PathVariable long categoryId ,@PathVariable double price){
          return productService.findByCatagoryIdAndPriceLessThan(categoryId,price);
    }
    @GetMapping("/{name}")
    public List<Product> findByNameContaining(@PathVariable String name) {
          return productService.findByNameContaining(name);
    }
}
