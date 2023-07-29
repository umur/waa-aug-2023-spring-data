package com.example.lab3.repository;


import com.example.lab3.entity.Category;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends ListCrudRepository<Category, Integer> {

}
