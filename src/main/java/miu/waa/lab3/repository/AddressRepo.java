package miu.waa.lab3.repository;

import miu.waa.lab3.entity.Address;
import org.springframework.data.repository.ListCrudRepository;


public interface AddressRepo extends ListCrudRepository<Address, Integer> {

}
