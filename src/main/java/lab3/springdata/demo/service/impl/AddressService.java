package lab3.springdata.demo.service.impl;

import lab3.springdata.demo.entity.Address;
import lab3.springdata.demo.entity.Category;
import lab3.springdata.demo.repository.AdressRepo;
import lab3.springdata.demo.service.IaddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService implements IaddressService {

   private AdressRepo adressRepo;
   @Autowired
   public AddressService(AdressRepo adressRepo){
     this.adressRepo=adressRepo;
   }
    @Override
    public void save(Address address) {
     adressRepo.save(address);

    }

    @Override
    public List<Address> getAll() {
      return adressRepo.findAll();
    }

    @Override
    public Address getAddressById(long id) {
        return adressRepo.findById(id).get();
    }

    @Override
    public void deleteAddressById(long id) {
       adressRepo.deleteById(id);

    }

    @Override
    public void updateAddress(long id, Address address) {
       Address addressToUpdate=adressRepo.findById(id).get();
        addressToUpdate=address;
       adressRepo.save(addressToUpdate);

    }
}
