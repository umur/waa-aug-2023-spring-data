package com.example.demo.controller;

import com.example.demo.dto.AddressDto;
import com.example.demo.service.AddressService;
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
    public void save(@RequestBody AddressDto addressDto){
        addressService.save(addressDto);
    }

    @GetMapping
    public ResponseEntity<List<AddressDto>> getAll(){
        List<AddressDto> addressDtoList = addressService.getAll();
        return ResponseEntity.ok(addressDtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> getById(@PathVariable int id) {
        AddressDto addressDto = addressService.getById(id);
        if( addressDto != null) return ResponseEntity.ok(addressDto);
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody AddressDto addressDto){
        addressService.update(addressDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        addressService.delete(id);
    }
}
