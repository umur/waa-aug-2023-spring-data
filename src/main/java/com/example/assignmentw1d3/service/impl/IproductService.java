package com.example.assignmentw1d3.service.impl;

import com.example.assignmentw1d3.entity.Category;
import com.example.assignmentw1d3.entity.Product;


import java.util.List;

public interface IproductService {
    public void save(Product product);
    public List<Product> GetAllProduct();
    public Product getProductById(int id);
    public void deleteProductById(int id);

    public void updatePeroduct(int id, Product product);



//    public List<Product> getProductsByPriceGreaterThan(double price);
//    public List<Product> getProductByCatagoryAndPriceIsLessThan(int categoryId, double price) ;
//
//    public List<Product> getProductsByNameIsContaining(String name);




    public List<Product> findByPriceGreaterThan(double price);


    //    @Query("select p from Product p where p.category.id = ?1 and p.price < ?2")
    public List<Product> findByCatagoryIdAndPriceLessThan(int categoryId, double maxprice);

    public List<Product> findByNameContaining(String name);

}
