package com.lab3.service.impl;

import com.lab3.entity.Address;
import com.lab3.repository.AddressRepository;
import com.lab3.service.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public void save(Address address) {
        addressRepository.save(address);
    };

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    };

    @Override
    public Address getById(Integer id) {
        return addressRepository.getById(id);
    }

    @Override
    public void update(Integer id, Address address) {
        addressRepository.save(address);
    };

    @Override
    public void delete(Integer id) {
        addressRepository.deleteById(id);
    };
}
