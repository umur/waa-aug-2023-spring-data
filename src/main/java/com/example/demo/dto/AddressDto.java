package com.example.demo.dto;

import com.example.demo.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private int id;
    private String street;
    private String zip;
    private String city;
    private User user;
}
