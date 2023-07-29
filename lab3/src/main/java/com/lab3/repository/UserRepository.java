package com.lab3.repository;

import com.lab3.entity.Review;
import com.lab3.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>, CrudRepository<User, Integer> {

};
