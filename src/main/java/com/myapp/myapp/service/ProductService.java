package com.myapp.myapp.service;



 import com.myapp.myapp.dto.ProductDto;

 import java.util.List;

public interface ProductService {

    void save(ProductDto productDto);

    public List<ProductDto> getAll();
    ProductDto getById(int id);
    void update(ProductDto productDto, int id);

    void delete(int id);

    List<ProductDto> findByPriceGreaterThan(Double minPrice);
    List<ProductDto> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice);
    List<ProductDto> findByNameContainingIgnoreCase(String keyword);
}
