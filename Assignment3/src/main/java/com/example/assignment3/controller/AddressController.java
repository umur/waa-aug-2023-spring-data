package com.example.assignment3.controller;

import com.example.assignment3.dto.AddressDto;
import com.example.assignment3.service.imp.AddressService;
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
    public ResponseEntity<String> add(@RequestBody AddressDto addressDto) {
        addressService.add(addressDto);
        return ResponseEntity.ok("post is working correctly");
    }

    @GetMapping
    public List<AddressDto> get() {
        return addressService.finalAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        addressService.remove(id);
        return ResponseEntity.ok("delete is working correctly");
    }
@PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody AddressDto addressDto,@PathVariable int id){
        addressService.update(addressDto,id);
        return ResponseEntity.ok("update is working correctly");

    }

}
