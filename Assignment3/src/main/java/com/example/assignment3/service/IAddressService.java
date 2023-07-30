package com.example.assignment3.service;

import com.example.assignment3.dto.AddressDto;

import java.util.List;

public interface IAddressService {
    public void add(AddressDto address);
    public void remove(int id);
    public List<AddressDto> finalAll();
    public void update(AddressDto address,int id);
}
