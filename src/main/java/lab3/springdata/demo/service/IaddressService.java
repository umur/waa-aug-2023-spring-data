package lab3.springdata.demo.service;

import lab3.springdata.demo.entity.Address;

import java.util.List;

public interface IaddressService {
    public void save(Address address);
    public List<Address> getAll();

    public Address getAddressById(long id);

    public void deleteAddressById(long id);

    public void updateAddress(long id,Address address);

}
