package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDto {
    private int id;
    private String name;
    private Double price;
    private  int rating;
}
