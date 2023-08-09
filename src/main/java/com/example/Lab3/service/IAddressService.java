package com.example.Lab3.service;

import com.example.Lab3.dto.AddressDto;
import com.example.Lab3.entity.Address;

import java.util.List;

public interface IAddressService {
    public void add(AddressDto address);
    public void remove(int id);
    public List<AddressDto> findAll();
    public void update(AddressDto address,int id);
}
