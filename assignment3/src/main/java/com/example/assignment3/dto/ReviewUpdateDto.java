package com.example.assignment3.dto;

import com.example.assignment3.entity.Product;
import com.example.assignment3.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewUpdateDto {
    int id;
    String comment;
}
