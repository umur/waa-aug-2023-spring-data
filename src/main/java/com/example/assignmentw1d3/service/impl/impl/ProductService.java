package com.example.assignmentw1d3.service.impl.impl;

import com.example.assignmentw1d3.entity.Category;
import com.example.assignmentw1d3.entity.Product;
import com.example.assignmentw1d3.repository.ProductRepo;
import com.example.assignmentw1d3.service.impl.IproductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IproductService {

    private ProductRepo productRepo;
    private CategaryService categaryService;
    @Autowired
    public ProductService(ProductRepo productRepo , CategaryService categaryService) {
        this.productRepo = productRepo;
        this.categaryService = categaryService;
    }

    @Override
    public void save(Product product) {
//        Category category = categaryService.getCategoryById(product.getCategory().getId());
//        product.setCategory(category);
//        category.getProducts().add(product);
//        product.getCategory().getProducts().add(product);
//        Category category = categaryService.getCategoryById(categoryId); // Assuming categaryService has a method to get the Category by its ID
//        product.setCategory(category);
//        category.getProducts().add(product);

        product.getReview().forEach(review -> {
            review.setProduct(product);
        });
//        product.getCategory().setProducts(product);
//        product.getCategory().getProducts().add(product);
//        productRepo.save(product);
//        user.getAddress().setUser(user);
//        userRepo.save(user);
//        Product.getCategory().setProducts(product);

        productRepo.save(product);


    }

//    @Override
//    public void save(Product product) {
//        productRepo.save(product);
//
//    }

    @Override
    public List<Product> GetAllProduct() {
        return productRepo.findAll();
    }
    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).get();
    }
    @Override
    public void deleteProductById(int id) {
        productRepo.deleteById(id);

    }
    @Override
    public void updatePeroduct(int id, Product product) {
        Product product1 = productRepo.findById(id).get();
        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        product1.setCategory(product.getCategory());
        productRepo.save(product1);

    }
    @Override
    public List<Product> findByPriceGreaterThan(double price) {
        return productRepo.findByPriceGreaterThan(price);
    }
    @Override
    public List<Product> findByCatagoryIdAndPriceLessThan(int categoryId, double price) {
        return productRepo.findByCatagoryIdAndPriceLessThan(categoryId, price);
    }
    @Override
    public List<Product> findByNameContaining(String name) {
        return productRepo.findByNameContaining(name);
    }


}
