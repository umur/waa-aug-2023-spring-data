package com.example.demo.service.impl;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepo;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElse(null);
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    @Override
    public Address updateAddress(Long id, Address address) {
        Address existingAddress = getAddressById(id);
        if (existingAddress != null) {
            existingAddress.setStreet(address.getStreet());
            existingAddress.setZip(address.getZip());
            existingAddress.setCity(address.getCity());
            existingAddress.setUser(address.getUser());
            return addressRepo.save(existingAddress);
        }
        return null;
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepo.deleteById(id);
    }
}
