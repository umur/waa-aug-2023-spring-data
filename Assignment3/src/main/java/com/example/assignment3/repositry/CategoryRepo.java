package com.example.assignment3.repositry;

import com.example.assignment3.entity.Address;
import com.example.assignment3.entity.Category;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends ListCrudRepository <Category,Integer>{
}
