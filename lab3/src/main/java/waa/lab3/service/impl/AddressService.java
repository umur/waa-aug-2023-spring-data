package waa.lab3.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import waa.lab3.domain.Address;
import waa.lab3.dto.AddressDto;
import waa.lab3.repository.IAddressRepository;
import waa.lab3.service.IAddressService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository addressRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AddressDto> getAll() {
         var entityList= addressRepository.findAll();
         List<AddressDto> dtoList = new ArrayList<>();
         entityList.forEach(entity->{
             var dto= modelMapper.map(entity,AddressDto.class);
             dtoList.add(dto);
         });
         return dtoList;
    }

    @Override
    public AddressDto getById(int id) {
        var entity=addressRepository.findById(id);
        return modelMapper.map(entity,AddressDto.class);
    }

    @Override
    public void deleteById(int id) {
        addressRepository.deleteById(id);
    }

    @Override
    public void save(AddressDto addressDto) {
        var entity= modelMapper.map(addressDto, Address.class);
        addressRepository.save(entity);
    }

    @Override
    public void update(int id, AddressDto addressDto) {
        Address entity= addressRepository.findById(id).orElse(null);
        modelMapper.map(addressDto,entity);
        assert entity != null;
        addressRepository.save(entity);
    }
}
