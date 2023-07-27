package com.example.demo.service;

import com.example.demo.dto.AddressDto;

import java.util.List;

public interface AddressService {
    void save(AddressDto addressDto);

    public List<AddressDto> getAll();
    AddressDto getById(int id);
    void update(AddressDto addressDto, int id);

    void delete(int id);
}
