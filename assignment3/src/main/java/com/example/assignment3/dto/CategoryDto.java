package com.example.assignment3.dto;

import com.example.assignment3.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDto {
    int id;
    String name;
    List<Product> products;
}
