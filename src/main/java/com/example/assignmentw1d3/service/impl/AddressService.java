package com.example.assignmentw1d3.service.impl;

import com.example.assignmentw1d3.entity.Address;
import com.example.assignmentw1d3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public interface AddressService  {
    public List<Address> getAll();
    public Address getById(Long id);
    public void save(Address address);
    public void delete(Long id);
    public void update(Address address);

}
