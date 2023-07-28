package lab3.springdata.demo.controller;

import lab3.springdata.demo.entity.Address;
import lab3.springdata.demo.entity.Category;
import lab3.springdata.demo.service.impl.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;
    @Autowired
    public AddressController( AddressService addressService){
        this.addressService=addressService;

    }
    @PostMapping
    public void save(@RequestBody Address address) {
        addressService.save(address);
    }
    @GetMapping
    public List<Address> getAll() {
        return addressService.getAll();
    }
    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable long id) {
       return addressService.getAddressById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteAddressById(@PathVariable long id) {
        addressService.deleteAddressById(id);
    }
    @PutMapping("/{id}")
    public void updateCategory(@PathVariable long id, @RequestBody Address address) {
        addressService.updateAddress(id,address);
    }
}
