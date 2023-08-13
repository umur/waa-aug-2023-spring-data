package com.assignment3.service;

import com.assignment3.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public void save(Product product);

    public void update (Product product, Integer productId);

    public void delete (Integer productId);

    List<Product> getAll();

    public Optional<Product> getById (Integer productId);

    public List<Product> getProductsGreaterThanPrice (Integer price);

    public List<Product> getProductByCategoryLessThanMaxPrice(String category, Integer maxPrice);

    public List<Product> getProductContaining (String keyWord);
}
