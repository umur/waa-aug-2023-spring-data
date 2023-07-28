package com.example.assignment3.service;


import com.example.assignment3.dto.AddressDto;

import java.util.List;

public interface AddressService {
    //Get all addresses
    public List<AddressDto> getAll();

    //Get Address by id
    AddressDto getById(int id);

    //Save function
    void save(AddressDto addressDto);

    //Delete Address
    void delete(int id);

    //Update address
    void update(int id, AddressDto addressDto);
}
