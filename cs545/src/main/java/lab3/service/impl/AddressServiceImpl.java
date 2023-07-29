package lab3.service.impl;

import lab3.dto.AddressDto;
import lab3.model.Address;
import lab3.model.MainUser;
import lab3.repository.AddressRepo;
import lab3.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void saveAddress(Address address) {
        addressRepo.save(address);
    }

    @Override
    public Address updateAddress(int id, Address address) {
        Address address1 = addressRepo.findById(id).get();
        address1.setCity(address.getCity());
        address1.setStreet(address.getStreet());
        address1.setZip(address.getZip());
        address1.setMainUser(modelMapper.map(address.getMainUser(), MainUser.class));
        return addressRepo.save(address1);

    }

    @Override
    public void deleteAddress(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public AddressDto getAddress(int id) {
        return modelMapper.map(addressRepo.findById(id).get(), AddressDto.class);    }

    @Override
    public List<AddressDto> findAllAddress() {
        return StreamSupport.stream(addressRepo.findAll()
                .spliterator(),false)
                .map(address -> modelMapper.map(address, AddressDto.class))
                .toList();

    }
}
