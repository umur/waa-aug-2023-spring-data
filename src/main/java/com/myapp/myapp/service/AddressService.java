package com.myapp.myapp.service;



import com.myapp.myapp.dto.AddressDto;
import com.myapp.myapp.entity.Address;

import java.util.List;

public interface AddressService {
    void save(AddressDto addressDto);

    public List<AddressDto> getAll();
    AddressDto getById(int id);
    void update(Address address, int id);

    void delete(int id);
}
