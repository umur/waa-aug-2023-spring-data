package com.lab3.service.services;

import com.lab3.entity.Address;

import java.util.List;

public interface AddressService {
  public void save(Address address);
  public List<Address> getAll();
  public Address getById(Integer id);
  public void update(Integer id, Address address);
  public void delete(Integer id);
};
