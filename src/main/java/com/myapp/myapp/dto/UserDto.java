package com.myapp.myapp.dto;


import com.myapp.myapp.entity.Address;
import com.myapp.myapp.entity.Review;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<Review> reviews;
    private Address address;
}