package com.example.demo.repository;

import com.example.demo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
