package com.example.Lab3.controller;

import com.example.Lab3.dto.AddressDto;
import com.example.Lab3.service.imp.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<String> add(@RequestBody AddressDto address){
        addressService.add(address);
        return ResponseEntity.ok("successfully added address");
    }

    @GetMapping
    public List<AddressDto> get(){
        return addressService.findAll();
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<String> delete(@PathVariable int id){
        addressService.remove(id);
        return ResponseEntity.ok("removed correctly");
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody AddressDto address,@PathVariable int id){
        addressService.update(address,id);
        return ResponseEntity.ok("successfully updated address");
    }
}
