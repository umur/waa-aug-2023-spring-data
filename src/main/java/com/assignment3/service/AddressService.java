package com.assignment3.service;

import com.assignment3.entity.Address;


import java.util.List;
import java.util.Optional;

public interface AddressService {

    void save(Address address);

    List<Address> getAll ();

    Optional<Address> getById (Integer addressId);

    void delete(Integer addressId);

    void update(Address address, Integer addressId);
}
