package com.example.lab3.dto;

import com.example.lab3.entity.Category;
import com.example.lab3.entity.Review;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDto {
    private int id;
    private String name;
    private int price;
    private int rating;
    private Category category;
    private List<Review> reviews;
}
