package com.myapp.myapp.service.impl;


import com.myapp.myapp.dto.ProductDto;
import com.myapp.myapp.entity.Product;
import com.myapp.myapp.entity.Review;
import com.myapp.myapp.repo.ProductRepository;
import com.myapp.myapp.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImp  implements ProductService {
    @Autowired
    private ProductRepository productRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        productRepo.save(product);
    }

    @Override
    public List<ProductDto> getAll() {
        List<Product> productList = productRepo.findAll();
        return productList.stream().map(
                product -> modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public ProductDto getById(int id) {
        Optional<Product> productOptional = productRepo.findById(id);
        if(productOptional.isEmpty()){
            throw new EntityNotFoundException("Product with ID " + id + " not found.");
        }
        Product product = productOptional.get();
        return modelMapper.map(productOptional, ProductDto.class);
    }

    @Override
    public void update(ProductDto productDto, int id) {
        ProductDto entityDto = getById(id);
        Product product = modelMapper.map(entityDto, Product.class);
        if(productDto.getName() != null) product.setName(productDto.getName());
        if(productDto.getPrice() != null) product.setPrice(productDto.getPrice());
        if(productDto.getRating() != null) product.setRating(productDto.getRating());

        productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        ProductDto productdto = getById(id);
        Product product = modelMapper.map(productdto, Product.class);
        for (Review review : product.getReviews()) {
            review.setProduct(null);
        }
        for (Review category : product.getReviews()) {
            category.setProduct(null);
        }
        product.setReviews(null);
        product.setCategory(null);

        productRepo.deleteById(id);

    }

    @Override
    public List<ProductDto> findByPriceGreaterThan(Double minPrice) {
        List<Product> productList = productRepo.findByPriceGreaterThan(minPrice);
        return productList.stream().map(product ->
                modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice) {
        List<Product> productList = productRepo.findByCategoryNameAndPriceLessThan(categoryName, maxPrice);
        return productList.stream().map(product ->
                modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findByNameContainingIgnoreCase(String keyword) {
        List<Product> productList = productRepo.findByNameContainingIgnoreCase(keyword);
        return productList.stream().map(product ->
                modelMapper.map(product, ProductDto.class)).collect(Collectors.toList());
    }
}
