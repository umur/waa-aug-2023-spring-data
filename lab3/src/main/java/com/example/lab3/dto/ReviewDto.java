package com.example.lab3.dto;

import com.example.lab3.entity.Product;
import com.example.lab3.entity.User;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDto {

    private int id;
    private String comment;
    private Product product;
    private User user;
}
