package miu.waa.lab3.service.impl;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.AddressDto;
import miu.waa.lab3.entity.Address;
import miu.waa.lab3.repository.AddressRepo;
import miu.waa.lab3.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<AddressDto> getAll() {

        List<Address> addresses = addressRepo.findAll();
        List<AddressDto> results = new ArrayList<>();
        addresses.forEach(address->{
            AddressDto dto = modelMapper.map(address, AddressDto.class);
            results.add(dto);
        });

        return results;
    }

    @Override
    public void create(AddressDto addressDto) {
        Address address = modelMapper.map(addressDto, Address.class);
        addressRepo.save(address);
    }

    @Override
    public AddressDto read(int id) {
        Optional<Address> address = addressRepo.findById(id);
        return modelMapper.map(address, AddressDto.class);
    }

    @Override
    public void update(int id, AddressDto addressDto) {
        addressDto.setId(id);
        Address address = modelMapper.map(addressDto, Address.class);
        addressRepo.save(address);
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
