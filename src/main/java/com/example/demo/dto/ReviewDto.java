package com.example.demo.dto;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReviewDto {
    private int id;
    private String comment;
    private User user;
    private Product product;
}
