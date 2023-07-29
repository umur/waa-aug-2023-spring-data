package lab3.service;

import lab3.dto.AddressDto;
import lab3.model.Address;

import java.util.List;

public interface AddressService {

    void saveAddress(Address address);

    Address updateAddress(int id, Address address);

    void deleteAddress(int id);

    AddressDto getAddress(int id);

    List<AddressDto> findAllAddress();
}
