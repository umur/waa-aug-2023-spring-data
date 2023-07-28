package com.example.assignment3.dto;

import com.example.assignment3.entity.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserUpdateDto {
    int id;
    String firstName;
    String lastName;
    String email;
    String password;
}
