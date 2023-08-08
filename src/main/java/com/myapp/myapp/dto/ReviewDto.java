package com.myapp.myapp.dto;



import com.myapp.myapp.entity.Product;
import com.myapp.myapp.entity.User;
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