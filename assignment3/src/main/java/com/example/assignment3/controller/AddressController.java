package com.example.assignment3.controller;


import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public List<AddressDto> getAll(){
        return addressService.getAll();
    }

    @GetMapping("/{id}")
    public AddressDto getById(@PathVariable int id){
        return addressService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody AddressDto addressDto){
        addressService.save(addressDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        addressService.delete(id);
    }


}
