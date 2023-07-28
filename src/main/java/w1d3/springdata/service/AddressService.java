package w1d3.springdata.service;

import w1d3.springdata.entity.Address;

import java.util.List;

public interface AddressService {
    Address create(Address address);

    List<Address> findAll();

    Address findById(Long id);

    Address update(Long id, Address address);

    void delete(Long id);
}
