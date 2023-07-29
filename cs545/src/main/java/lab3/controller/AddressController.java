package lab3.controller;

import lab3.dto.AddressDto;
import lab3.model.Address;
import lab3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Address")
public class AddressController {

    @Autowired
    private AddressService addressService;


    @PostMapping
    public void saveAddress(@RequestBody Address address) {

        addressService.saveAddress(address);
    }

    @PutMapping("{id}")
    public void updateAddress(@PathVariable int id, @RequestBody Address address) {
        addressService.updateAddress(id, address);
    }

    @DeleteMapping("{id}")
    public void deleteAddress(@PathVariable int id) {

        addressService.deleteAddress(id);
    }

    @GetMapping("{id}")
    public AddressDto getAddress(@PathVariable int id) {

        return addressService.getAddress(id);
    }

    @GetMapping
    public List<AddressDto> getAddresses() {
        return addressService.findAllAddress();
    }

}
