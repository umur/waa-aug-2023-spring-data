package com.assignment3.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

    private int id;
    private String street;
    private int zip;
    private String city;
}
