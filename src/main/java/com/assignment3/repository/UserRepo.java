package com.assignment3.repository;

import com.assignment3.entity.Address;
import com.assignment3.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends ListCrudRepository <User, Integer> {
}
