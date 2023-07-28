package com.example.assignment3.repository;

import com.example.assignment3.entity.Category;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends ListCrudRepository<Category, Integer> {
}
