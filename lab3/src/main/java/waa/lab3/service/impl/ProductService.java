package waa.lab3.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab3.domain.Category;
import waa.lab3.domain.Product;
import waa.lab3.dto.CategoryDto;
import waa.lab3.dto.ProductDto;
import waa.lab3.repository.ICategoryRepository;
import waa.lab3.repository.IProductRepository;
import waa.lab3.service.IProductService;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> getAll() {
        var entityList= productRepository.findAll();
        List<ProductDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,ProductDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public ProductDto getById(int id) {
        var entity=productRepository.findById(id);
        return modelMapper.map(entity,ProductDto.class);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void save(ProductDto productDto) {
        var entity= modelMapper.map(productDto, Product.class);
        productRepository.save(entity);
    }

    @Override
    public void update(int id, ProductDto productDto) {
        Product entity= productRepository.findById(id).orElse(null);
        modelMapper.map(productDto,entity);
        assert entity != null;
        productRepository.save(entity);
    }

    @Override
    public List<ProductDto> getProductsByMinPrice(double minPrice) {
        var entityList = productRepository.getProductsByPriceGreaterThan(minPrice);
        List<ProductDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,ProductDto.class);
            dtoList.add(dto);
        });
        return dtoList;

    }

    @Override
    public List<ProductDto> getProductsByCategoryNameAndPrice(String categoryName, double maxPrice) {
        var entityList=productRepository.getProductsByCategory_NameAndPriceLessThan(categoryName,maxPrice);
        List<ProductDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,ProductDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }

    @Override
    public List<ProductDto> getProductsByProductNameKeyWord(String keyword) {
        var entityList=productRepository.getProductsByNameContainingIgnoreCase(keyword);
        List<ProductDto> dtoList = new ArrayList<>();
        entityList.forEach(entity->{
            var dto= modelMapper.map(entity,ProductDto.class);
            dtoList.add(dto);
        });
        return dtoList;
    }
}
