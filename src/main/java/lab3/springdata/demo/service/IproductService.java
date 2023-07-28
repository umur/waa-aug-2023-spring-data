package lab3.springdata.demo.service;

import lab3.springdata.demo.entity.Product;

import java.util.List;

public interface IproductService {
    public void save (Product product);

    public List<Product> getAll();

    public Product getProductById(long id);

    public void update(Long id ,Product product);

    public void deleteById(long id);


    public List<Product> findByPriceGreaterThan(double price);


    List<Product> findByCatagoryIdAndPriceLessThan(long categoryId, double price);

    public List<Product>findByNameContaining(String name);

}
