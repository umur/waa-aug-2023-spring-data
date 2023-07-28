package waa.lab3.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import waa.lab3.domain.Address;
import waa.lab3.dto.AddressDto;
import waa.lab3.repository.IAddressRepository;
import waa.lab3.service.IAddressService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController  {
    @Autowired
    private IAddressService addressService;

    @GetMapping
    public List<AddressDto> getAll() {
        return addressService.getAll();
    }

    @GetMapping("/{id}")
    public AddressDto getById(@PathVariable int id) {
        return addressService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        addressService.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody AddressDto addressDto) {
        addressService.save(addressDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody AddressDto addressDto) {
        addressService.update(id,addressDto);
    }
}
