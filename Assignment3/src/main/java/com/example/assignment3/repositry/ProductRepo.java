package com.example.assignment3.repositry;

import com.example.assignment3.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ListCrudRepository <Product,Integer> {
}
