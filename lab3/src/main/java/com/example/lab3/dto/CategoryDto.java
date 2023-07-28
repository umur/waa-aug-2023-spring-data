package com.example.lab3.dto;

import com.example.lab3.entity.Product;
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
