package miu.waa.lab3.service;

import miu.waa.lab3.dto.AddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> getAll();
    void create(AddressDto addressDto);
    AddressDto read(int id);
    void update(int id, AddressDto addressDto);
    void delete(int id);
}
