package com.example.demo.service;

import com.example.demo.entity.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAllAddresses();

    public Address getAddressById(int id);

    public Address createAddress(Address address);

    public Address updateAddress(int id, Address updatedAddress);

    public void deleteAddress(int id);
}
