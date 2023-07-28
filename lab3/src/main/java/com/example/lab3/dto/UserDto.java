package com.example.lab3.dto;

import com.example.lab3.entity.Address;
import com.example.lab3.entity.Review;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {

    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;
    private List<Review> review;
    private Address address;
}
