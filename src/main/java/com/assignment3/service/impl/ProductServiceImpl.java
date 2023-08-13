package com.assignment3.service.impl;

import com.assignment3.entity.Category;
import com.assignment3.entity.Product;
import com.assignment3.repository.ProductRepo;
import com.assignment3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl (ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);

    }

    @Override
    public void update(Product newProduct, Integer productId) {

        Optional <Product> productOptional = productRepo.findById(productId);

        if(productOptional.isPresent()){

            Product product = productOptional.get();

            product.setId(newProduct.getId());
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
            product.setRating(newProduct.getRating());

            productRepo.save(product);
        }
        throw new RuntimeException("Product can not be found");

    }

    @Override
    public void delete(Integer productId) {
        productRepo.deleteById(productId);
    }

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> getById(Integer productId) {

        if(productRepo.existsById(productId)){
            return productRepo.findById(productId);
        }
        throw new RuntimeException("Product can not be found");
    }
    @Override
    public List<Product> getProductsGreaterThanPrice (Integer price){
        return productRepo.getProductsByPriceGreaterThan(price);
    }

    @Override
    public List<Product> getProductByCategoryLessThanMaxPrice(String category, Integer maxPrice) {
        return productRepo.getProductsByCategory_NameAndPriceLessThan(category, maxPrice);
    }

    @Override
    public List<Product> getProductContaining(String keyWord) {
        return productRepo.getProductsByNameContaining(keyWord);
    }
}
