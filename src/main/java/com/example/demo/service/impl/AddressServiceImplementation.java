package com.example.demo.service.impl;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AddressServiceImplementation implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(int id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(int id, Address updatedAddress) {
        Address existingAddress = addressRepository.findById(id).orElse(null);
        if (existingAddress != null) {
            existingAddress.setStreet(updatedAddress.getStreet());
            existingAddress.setZip(updatedAddress.getZip());
            existingAddress.setCity(updatedAddress.getCity());
            // Update any other fields as needed
            return addressRepository.save(existingAddress);
        }
        return null;
    }

    @Override
    public void deleteAddress(int id) {
        addressRepository.deleteById(id);
    }
}
