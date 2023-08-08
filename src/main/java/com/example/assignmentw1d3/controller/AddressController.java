package com.example.assignmentw1d3.controller;

import com.example.assignmentw1d3.entity.Address;
import com.example.assignmentw1d3.service.impl.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }
    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id){
        return addressService.getById(id);
    }
    @PostMapping
    public String save(@RequestBody Address address){
        addressService.save(address);
     return "saved";
    }
    @PutMapping("/{id}")
    public Address update(@PathVariable Long id, @RequestBody Address address){
        if(!id.equals(address.getId())) throw new IllegalArgumentException();
        addressService.update(address);
        return address;
    }
    @DeleteMapping
    public void delete(@PathVariable Long id){
        addressService.delete(id);
    }

}
