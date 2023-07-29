package com.example.lab3.service;

import com.example.lab3.dto.AddressDto;
import com.example.lab3.dto.ReviewDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> getAll();
    AddressDto getById(int id);
    public void delete(int id);
    void save(AddressDto dto);
}
