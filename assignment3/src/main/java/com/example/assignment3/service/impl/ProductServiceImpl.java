package com.example.assignment3.service.impl;

import com.example.assignment3.dto.CategoryDto;
import com.example.assignment3.dto.ProductDto;
import com.example.assignment3.dto.ProductUpdateDto;
import com.example.assignment3.entity.Category;
import com.example.assignment3.entity.Product;
import com.example.assignment3.repository.ProductRepo;
import com.example.assignment3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> getAll() {
        List<Product> productList = productRepo.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        productList.forEach(product -> {
            ProductDto dto = modelMapper.map(product, ProductDto.class);
            productDtoList.add(dto);
        });
        return productDtoList;
    }

    @Override
    public void save(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        productRepo.save(product);
    }

    public void delete(int id){
        productRepo.deleteById(id);
    }

    @Override
    public ProductDto getById(int id) {
        Product product = productRepo.findById(id).get();
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public List<ProductDto> findAllByPriceGreaterThan(int minPrice){
        List<Product> productList = productRepo.findAllByPriceGreaterThan(minPrice);
        List<ProductDto> productDtoList = new ArrayList<>();
        productList.forEach(product -> {
            ProductDto dto = modelMapper.map(product, ProductDto.class);
            productDtoList.add(dto);
        });
        return productDtoList;
    }

    @Override
    public List<ProductDto> findAllByCategoryAndPriceLessThan(int catId, int maxPrice){
        List<Product> productList = productRepo.findProductsByPriceLessThanAndAndCategory_Id(maxPrice, catId);
        List<ProductDto> productDtoList = new ArrayList<>();
        productList.forEach(product -> {
            ProductDto dto = modelMapper.map(product, ProductDto.class);
            productDtoList.add(dto);
        });
        return productDtoList;
//        return null;
    }

    public List<ProductDto> findAllByNameContains(String str){
        List<Product> productList = productRepo.findAllByNameContains(str);
        List<ProductDto> productDtoList = new ArrayList<>();
        productList.forEach(product -> {
            ProductDto dto = modelMapper.map(product, ProductDto.class);
            productDtoList.add(dto);
        });
        return productDtoList;
    }

    public ProductDto update(int id, ProductUpdateDto productUpdateDto){
        Product product = productRepo.findById(id).get();
        if(productUpdateDto.getName()!=null)
            product.setName(productUpdateDto.getName());
        if(productUpdateDto.getPrice()!=product.getPrice())
            product.setPrice(productUpdateDto.getPrice());
        productRepo.save(product);
        return modelMapper.map(product, ProductDto.class);
    }


}
