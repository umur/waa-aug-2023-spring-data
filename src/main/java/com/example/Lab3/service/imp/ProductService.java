package com.example.Lab3.service.imp;

import com.example.Lab3.entity.Category;
import com.example.Lab3.entity.Product;
import com.example.Lab3.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.example.Lab3.service.IProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService{
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;
    private final CategoryService categoryService;
    @Override
    public void add(Product product) {
        var categoryId = product.getCategory().getId();
        Category category = categoryService.getById(categoryId);
        product.setCategory(category);
        productRepo.save(product);
    }

    @Override
    public void remove(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public void update(Product product, int id) {
        var model = modelMapper.map(product, Product.class);
        model.setId(id);
        productRepo.save(model);
    }
}
