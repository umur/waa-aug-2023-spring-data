package com.example.assignment3.service;


import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.AddressUpdateDto;

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
    AddressDto update(int id, AddressUpdateDto addressDto);


}
