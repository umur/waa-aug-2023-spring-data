package com.example.demo.dto;

import com.example.demo.entity.Category;
import com.example.demo.entity.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProductDto {
    private int id;
    private String name;
    private Double price;
    private Integer rating;
    private Category category;
    private List<Review> reviews;
}
