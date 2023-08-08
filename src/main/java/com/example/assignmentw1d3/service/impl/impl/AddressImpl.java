package com.example.assignmentw1d3.service.impl.impl;

import com.example.assignmentw1d3.entity.Address;
import com.example.assignmentw1d3.repository.AddressRepo;
import com.example.assignmentw1d3.service.impl.AddressService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;
    @Override
    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address getById(Long id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public void save(Address address) {
        addressRepo.save(address);

    }

    @Override
    public void delete(Long id) {
        addressRepo.deleteById(id);

    }

    @Override
    public void update(Address address) {
        addressRepo.save(address);

    }
}
