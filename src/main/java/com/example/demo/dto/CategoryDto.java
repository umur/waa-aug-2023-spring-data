package com.example.demo.dto;

import com.example.demo.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDto {
    private int id;
    private String name;
    private List<Product> products;
}
