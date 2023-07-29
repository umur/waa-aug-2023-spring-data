package miu.waa.lab3.service.impl;

import lombok.RequiredArgsConstructor;

import miu.waa.lab3.dto.ProductDto;
import miu.waa.lab3.entity.Product;
import miu.waa.lab3.repository.ProductRepo;
import miu.waa.lab3.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<ProductDto> getAll() {

        List<Product> products = productRepo.findAll();
        List<ProductDto> results = new ArrayList<>();
        products.forEach(product->{
            ProductDto dto = modelMapper.map(product, ProductDto.class);
            results.add(dto);
        });

        return results;
    }

    @Override
    public void create(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        productRepo.save(product);
    }

    @Override
    public ProductDto read(int id) {
        Optional<Product> product = productRepo.findById(id);
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public void update(int id, ProductDto productDto) {
        Optional<Product> product = productRepo.findById(id);
        product.get().setName(productDto.getName());
        product.get().setPrice(productDto.getPrice());
        product.get().setRating(productDto.getRating());
        productRepo.save(product.get());
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }
}
