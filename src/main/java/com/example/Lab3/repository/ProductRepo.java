package com.example.Lab3.repository;

import com.example.Lab3.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ListCrudRepository<Product,Integer> {
}
