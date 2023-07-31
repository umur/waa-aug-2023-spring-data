package miu.waa.lab3.controller;

import lombok.RequiredArgsConstructor;
import miu.waa.lab3.dto.AddressDto;
import miu.waa.lab3.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/addresses")
public class AddressController {
    private final AddressService addressService;

    @GetMapping
    public List<AddressDto> getAll(){
        return addressService.getAll();
    }

    @PostMapping
    public void create(@RequestBody AddressDto addressDto){
        addressService.create(addressDto);
    }

    @GetMapping("/{id}")
    public AddressDto read(@PathVariable int id){
        return addressService.read(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id,@RequestBody AddressDto addressDto){
        addressService.update(id, addressDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        addressService.delete(id);
    }
}
