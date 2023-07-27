package edu.miu.cs545.assignment03.server;

import edu.miu.cs545.assignment03.dto.ProductDto;
import edu.miu.cs545.assignment03.entity.Product;
import edu.miu.cs545.assignment03.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repo;
    private final ModelMapper mapper;

    public List<ProductDto> getAll() {

        var entities = repo.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        entities.forEach(entity ->{
            ProductDto dto = mapper.map(entity, ProductDto.class);
            productDtoList.add(dto);
        });

        return productDtoList;
    }

    public ProductDto getById(Long id) {
        var entity = repo.findById(id);
        return mapper.map(entity, ProductDto.class);
    }

    public void create(ProductDto dto) {
        var entity = mapper.map(dto, Product.class);
        repo.save(entity);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<ProductDto> findCostMoreThanMinPrice(double minPrice) {
        var entities = repo.findByPriceGreaterThan(minPrice);
        List<ProductDto> productDtoList = new ArrayList<>();
        entities.forEach(entity ->{
            ProductDto dto = mapper.map(entity, ProductDto.class);
            productDtoList.add(dto);
        });
        return productDtoList;
    }

    public List<ProductDto> findInCategoryCostLessThanMaxPrice(Long categoryId, double maxPrice) {
        var entities = repo.findByCategory_IdAndPriceLessThan(categoryId, maxPrice);
        List<ProductDto> productDtoList = new ArrayList<>();
        entities.forEach(entity ->{
            ProductDto dto = mapper.map(entity, ProductDto.class);
            productDtoList.add(dto);
        });
        return productDtoList;
    }


    public List<ProductDto> findProductsContainName(String name) {
        var entities = repo.findProductsByNameContainingIgnoreCase(name);
        List<ProductDto> productDtoList = new ArrayList<>();
        entities.forEach(entity ->{
            ProductDto dto = mapper.map(entity, ProductDto.class);
            productDtoList.add(dto);
        });
        return productDtoList;
    }
}
