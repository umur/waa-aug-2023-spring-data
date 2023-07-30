package com.example.assignment3.service.imp;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.entity.Address;
import com.example.assignment3.repositry.AddressRepo;
import com.example.assignment3.repositry.ProductRepo;
import com.example.assignment3.service.IAddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class AddressService implements IAddressService {
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void add(AddressDto address) {
        Address addressVal=modelMapper.map(address, Address.class);
        addressRepo.save(addressVal);
    }

    @Override
    public void remove(int id) {
      addressRepo.deleteById(id);
    }

    @Override
    public List<AddressDto> finalAll() {
       var addressList= addressRepo.findAll();
       var resultList=new ArrayList<AddressDto>();
       addressList.forEach(d->{
           var data=modelMapper.map(d,AddressDto.class);
           resultList.add(data);
       });
        return resultList;
    }

    @Override
    public void update(AddressDto address, int id) {
        Address addressVal=modelMapper.map(address, Address.class);
        addressVal.setId(id);

        addressRepo.save(addressVal);

    }
}
