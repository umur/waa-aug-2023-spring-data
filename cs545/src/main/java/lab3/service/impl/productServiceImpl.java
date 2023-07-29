package lab3.service.impl;

import lab3.dto.ProductDto;
import lab3.model.Category;
import lab3.model.Product;
import lab3.repository.ProductRepo;
import lab3.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public ProductDto getProduct(int id) {
        return modelMapper.map(productRepo.findById(id).get(), ProductDto.class);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);

    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product product1 = productRepo.findById(id).get();
        product1.setName(product.getName());
        product1.setCategory(product.getCategory());
        product1.setRating(product.getRating());
        product1.setReviewList(product.getReviewList());
        product1.setPrice(product.getPrice());

        return productRepo.save(product1);

    }

    @Override
    public List<Product> findAllByPriceGreaterThanEqual(int minPrice) {
        return productRepo.findAllByPriceGreaterThanEqual(minPrice);
    }

    @Override
    public List<Product> findAllByNameContaining(String keyword) {
        return productRepo.findAllByNameContaining(keyword);
    }

    @Override
    public List<Product> findAllByCategoryAndPriceLessThanEqual(Category cat, int maxPrice) {
        return productRepo.findAllByCategoryAndPriceLessThanEqual(cat,maxPrice);
    }


}
