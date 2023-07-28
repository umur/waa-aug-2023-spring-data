package com.example.assignment3.repository;

import com.example.assignment3.entity.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends ListCrudRepository<Address, Integer> {
}
