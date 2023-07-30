package lab3.lab3.Controller;

import lab3.lab3.Model.Category;
import lab3.lab3.Model.Product;
import lab3.lab3.Service.IMP.ProductService;
import lab3.lab3.Service.IproductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void save(@RequestBody Product product){
        productService.save(product);

    }
    @GetMapping
    public List<Product> getAll(){
        return productService.GetAllProduct();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable int id){
        productService.deleteProductById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Product product){
        productService.updatePeroduct(id, product);


    }
    @GetMapping("/{price}")
    public List<Product> getProductsByPriceGreaterThan(@RequestParam double price){
       return productService.getProductsByPriceGreaterThan(price);
    }
    @GetMapping("/{id}/{price}")
    public List<Product> getProductByCatagoryAndPriceIsLessThan(@RequestBody int categoryid,
                                                                @PathVariable double price){

        return productService.getProductByCategoryAndPriceIsLessThan(categoryid, price);
    }
    @GetMapping("/{name}")
    public List<Product> getProductsByNameIsContaining(@RequestParam String name){
        return productService.getProductsByNameIsContaining(name);

    }


}
