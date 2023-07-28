package waa.lab3.service;

import org.springframework.stereotype.Service;
import waa.lab3.dto.AddressDto;

import java.util.List;

public interface IAddressService {
    List<AddressDto> getAll();
    AddressDto getById(int id);
    void deleteById(int id);
    void save(AddressDto addressDto);
    void update(int id, AddressDto addressDto);

}
