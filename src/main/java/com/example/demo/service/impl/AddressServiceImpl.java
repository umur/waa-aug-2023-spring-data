package com.example.demo.service.impl;

import com.example.demo.dto.AddressDto;
import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepo;
import com.example.demo.service.AddressService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    @Autowired
    private final AddressRepo addressRepo;
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
    public void update(AddressDto addressDto, int id) {
        AddressDto entityDto = getById(id);
        Address address = modelMapper.map(entityDto, Address.class);
        if (addressDto.getCity() != null)address.setCity(addressDto.getCity());
        if(addressDto.getZip() != null) address.setZip(addressDto.getZip());
        if(addressDto.getStreet() != null) addressDto.setStreet(addressDto.getStreet());
        addressRepo.save(address);
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
