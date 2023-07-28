package w1d3.springdata.service;

import w1d3.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);

    List<Product> findAll();

    Product findById(Long id);

    Product update(Long id, Product product);

    void delete(Long id);
}
