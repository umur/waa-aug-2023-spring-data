package com.example.assignment3.dto;

import com.example.assignment3.entity.Category;
import com.example.assignment3.entity.Review;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ProductDto {
    int id;
    String name;
    int price;
    List<Review> reviews;
    Category category;
}
