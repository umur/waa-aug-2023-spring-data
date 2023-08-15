package com.example.assignment3.service.impl;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.AddressUpdateDto;
import com.example.assignment3.entity.Address;
import com.example.assignment3.repository.AddressRepo;
import com.example.assignment3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final ModelMapper modelMapper;
    public List<AddressDto> getAll() {
        List<Address> entityList = addressRepo.findAll();
        List<AddressDto> addressDtoList = new ArrayList<>();
        entityList.forEach(address -> {
            AddressDto addressDto = modelMapper.map(address,AddressDto.class);
            addressDtoList.add(addressDto);
        });
        return addressDtoList;
    }

    @Override
    public AddressDto getById(int id){
        Address address = addressRepo.findById(id).get();
        return modelMapper.map(address, AddressDto.class);
    }

    @Override
    public void save(AddressDto addressDto){
        Address address = modelMapper.map(addressDto, Address.class);
        addressRepo.save(address);
    }

    @Override
    public void delete(int id){
        addressRepo.deleteById(id);
    }

    @Override
    public AddressDto update(int id, AddressUpdateDto addressDto){
        Address address = addressRepo.findById(id).get();
        if(addressDto.getStreet()!=null)
            address.setStreet(addressDto.getStreet());
        if(addressDto.getCity()!=null)
            address.setCity(addressDto.getCity());
        if(addressDto.getZip()!=null)
            address.setZip(addressDto.getZip());
        addressRepo.save(address);
        return modelMapper.map(address, AddressDto.class);
    }
}
