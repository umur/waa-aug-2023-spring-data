package com.assignment3.service.impl;
import com.assignment3.entity.Address;
import com.assignment3.repository.AddressRepo;
import com.assignment3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor

public class AddressServiceImpl implements AddressService {

    private AddressRepo addressRepo;

    @Autowired
    public AddressServiceImpl (AddressRepo addressRepo){
        this.addressRepo = addressRepo;
    }

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> getAll() {
       return addressRepo.findAll();
    }

    @Override
    public Optional<Address> getById(Integer addressId) {

        if (addressRepo.existsById(addressId)) {
            return addressRepo.findById(addressId);
        }
        throw new RuntimeException("Address not found");
    }

    @Override
    public void delete(Integer addressId) {
        addressRepo.deleteById(addressId);
    }

    @Override
    public void update(Address newAddress, Integer addressId) {

        Optional<Address> addressOptional = getById(addressId);

        if(addressOptional.isPresent()){

            Address address = addressOptional.get();

            address.setCity(newAddress.getCity());
            address.setId(newAddress.getId());
            address.setZip(newAddress.getZip());
            address.setStreet(newAddress.getStreet());

            addressRepo.save(address);
        }
        throw new RuntimeException("Address not found");
    }
}
