package com.example.assignment3.dto;

import com.example.assignment3.entity.Product;
import com.example.assignment3.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDto {
    int id;
    String comment;
    User user;
    Product product;
}
