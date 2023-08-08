package com.example.assignmentw1d3.repository;

import com.example.assignmentw1d3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>
{



}
