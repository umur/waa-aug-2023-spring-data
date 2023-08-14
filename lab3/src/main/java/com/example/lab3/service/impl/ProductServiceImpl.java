package com.example.lab3.service.impl;

import com.example.lab3.dto.ProductDto;
import com.example.lab3.entity.Product;
import com.example.lab3.repository.ProductRepo;
import com.example.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> getAll() {
        var entityList = productRepo.findAll();
        var dtoList = new ArrayList<ProductDto>();
        entityList.forEach(entity->{
                var dto = modelMapper.map(entity, ProductDto.class);
                dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public ProductDto getById(int id) {
        var entity = productRepo.findById(id).get();
        var dto = modelMapper.map(entity, ProductDto.class);
        return dto;
    }


    @Override
    public void save(ProductDto dto) {
        Product entity = modelMapper.map(dto,Product.class);
        productRepo.save(entity);

    }

    @Override
    public void delete(int id) {
        Optional<Product> entity = productRepo.findById(id);
        if(entity.isPresent()){
            productRepo.deleteById(id);
        }
    }

    public List<ProductDto> getByPriceGreater(int minPrice) {
        var entityList = productRepo.findByPriceGreaterThan(minPrice);
        var dtoList = new ArrayList<ProductDto>();
        entityList.forEach(entity->{
            var dto = modelMapper.map(entity, ProductDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public List<ProductDto> getByNameContains(String keyword) {
        var entityList = productRepo.findByNameContains(keyword);
        var dtoList = new ArrayList<ProductDto>();
        entityList.forEach(entity->{
            var dto = modelMapper.map(entity,ProductDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public List<ProductDto> getProductsByCategoryAndPriceLessThan(int categoryId, int price) {
        var entityList = productRepo.findProductsByCategory_IdAndPriceLessThan(categoryId, price);
        var dtoList = new ArrayList<ProductDto>();
        entityList.forEach(entity->{
            var dto = modelMapper.map(entity, ProductDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }




}
