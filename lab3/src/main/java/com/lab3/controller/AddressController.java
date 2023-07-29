package com.lab3.controller;

import com.lab3.entity.Address;
import com.lab3.service.services.AddressService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

     @PostMapping
    public void createAddress(@RequestBody Address address){
         addressService.save(address);
     };

     @GetMapping
    public List<Address> getAllAddress(){
         return addressService.getAll();
     };

     @GetMapping("/{id}")
    public Address getAddById(@PathVariable Integer id){
         return addressService.getById(id);
     };

     @PutMapping("/{id}")
    public void  updateAddress(@RequestBody Address address, @PathVariable Integer id){
         addressService.update(id, address);
     };

     @DeleteMapping("{id}")
    public void deleteAddress(@PathVariable Integer id){
         addressService.delete(id);
     };
};
