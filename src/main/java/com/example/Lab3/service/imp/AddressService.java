package com.example.Lab3.service.imp;

import com.example.Lab3.dto.AddressDto;
import com.example.Lab3.entity.Address;
import com.example.Lab3.repository.AddressRepo;
import com.example.Lab3.service.IAddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddressService implements IAddressService {
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void add(AddressDto address) {
        Address addressVal = modelMapper.map(address, Address.class);
        addressRepo.save(addressVal);
    }

    @Override
    public void remove(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public List<AddressDto> findAll() {
        var addressList = addressRepo.findAll();
        var resultList = new ArrayList<AddressDto>();
        addressList.forEach(add->{
            var data = modelMapper.map(add,AddressDto.class);
            resultList.add(data);
        });
        return resultList;
    }

    @Override
    public void update(AddressDto address, int id) {
        Address addressVal = modelMapper.map(address, Address.class);
        addressVal.setId(id);
        addressRepo.save(addressVal);
    }
}
