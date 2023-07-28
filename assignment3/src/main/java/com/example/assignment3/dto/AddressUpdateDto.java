package com.example.assignment3.dto;

import com.example.assignment3.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressUpdateDto {
    int id;
    String Street;
    String city;
    Integer zip;
}
