package lab3.springdata.demo.service.impl;

import lab3.springdata.demo.entity.Product;

import lab3.springdata.demo.repository.ProductRepo;
import lab3.springdata.demo.service.IproductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ProductService implements IproductService {
    private ProductRepo productRepo;
@Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void save(Product product) {
        productRepo.save(product);


    }

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(long id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void update(Long id, Product product) {
    Product productToUpdate =productRepo.findById(id).get();
    productToUpdate=product;
    productRepo.save(productToUpdate);

    }

    @Override
    public void deleteById(long id) {
     productRepo.deleteById(id);

    }

    @Override
    public List<Product> findByPriceGreaterThan(double price) {
       return productRepo.findByPriceGreaterThan(price);
    }

    @Override
    public List<Product> findByCatagoryIdAndPriceLessThan(long categoryId, double price) {
     return productRepo.findByCatagoryIdAndPriceLessThan(categoryId ,price);
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return productRepo.findByNameContaining(name);
    }
}
