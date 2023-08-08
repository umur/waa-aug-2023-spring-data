package com.example.assignmentw1d3.repository;

import com.example.assignmentw1d3.entity.Category;
import com.example.assignmentw1d3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
