package com.assignment3.controller;

import com.assignment3.entity.Address;
import com.assignment3.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

//    @PostMapping
//    public void save(@RequestBody Address address){
//        addressService.save(address);
//    }

//    @DeleteMapping("/{addressId}")
//    public void delete(@PathVariable Integer addressId){
//        addressService.delete(addressId);
//    }

    @PutMapping("/{addressId}")
    public void update(@RequestBody Address address, @PathVariable Integer addressId){
        addressService.update(address, addressId);
    }

    @GetMapping("/{addressId}")
    public Optional<Address> getById (@PathVariable Integer addressId){
        return addressService.getById(addressId);
    }

    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }

}
