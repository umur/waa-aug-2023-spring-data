package com.myapp.myapp.dto;


import com.myapp.myapp.entity.Product;
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