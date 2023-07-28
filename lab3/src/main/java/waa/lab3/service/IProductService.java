package waa.lab3.service;

import waa.lab3.dto.ProductDto;

import java.util.List;

public interface IProductService {

    List<ProductDto> getAll();
    ProductDto getById(int id);
    void deleteById(int id);
    void save(ProductDto productDto);
    void update(int id, ProductDto productDto);
    List<ProductDto> getProductsByMinPrice(double minPrice);
    List<ProductDto> getProductsByCategoryNameAndPrice(String categoryName, double maxPrice);
    List<ProductDto> getProductsByProductNameKeyWord(String keyword);
}
