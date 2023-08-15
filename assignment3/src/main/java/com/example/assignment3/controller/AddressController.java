package com.example.assignment3.controller;


import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.dto.AddressUpdateDto;
import com.example.assignment3.dto.CategoryUpdateDto;
import com.example.assignment3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor
@CrossOrigin
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
    public ResponseEntity<AddressDto> save(@RequestBody AddressDto addressDto){
        addressService.save(addressDto);
        return ResponseEntity.ok().body(addressDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        addressService.delete(id);
        return ResponseEntity.ok().body("Delete Successful");
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressDto> update(@PathVariable int id, @RequestBody AddressUpdateDto addressUpdateDto){
        AddressDto addressDto = addressService.update(id, addressUpdateDto);
        return ResponseEntity.ok().body(addressDto);
    }


}
