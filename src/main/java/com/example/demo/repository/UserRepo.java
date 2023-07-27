package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepo extends ListCrudRepository<User,Integer> {
}
