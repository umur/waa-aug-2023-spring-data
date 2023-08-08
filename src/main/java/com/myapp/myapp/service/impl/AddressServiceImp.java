package com.myapp.myapp.service.impl;


import com.myapp.myapp.dto.AddressDto;
import com.myapp.myapp.entity.Address;
import com.myapp.myapp.repo.AddressRepository;
import com.myapp.myapp.service.AddressService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AddressServiceImp implements AddressService {

    @Autowired
    private final AddressRepository addressRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(AddressDto addressDto) {
        Address address = modelMapper.map(addressDto, Address.class);
        addressRepo.save(address);
    }

    @Override
    public List<AddressDto> getAll() {
        List<Address> addressList = addressRepo.findAll();
        return addressList.stream().map(address ->
                modelMapper.map(address, AddressDto.class)).collect(Collectors.toList());
    }

    @Override
    public AddressDto getById(int id) {
        Optional<Address> addressOptional = addressRepo.findById(id);
        if (addressOptional.isEmpty()) {
            throw new EntityNotFoundException("Address with ID " + id + " not found.");
        }
        Address address = addressOptional.get();
        return modelMapper.map(address, AddressDto.class);
    }

    @Override
    public void update(Address newadd, int id) {
        addressRepo.save(newadd);
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
