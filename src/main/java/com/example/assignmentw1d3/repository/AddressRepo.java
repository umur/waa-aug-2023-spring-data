package com.example.assignmentw1d3.repository;

import com.example.assignmentw1d3.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
