package com.example.demo.repository;

import com.example.demo.entity.Category;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryRepo extends ListCrudRepository<Category,Integer> {
}
