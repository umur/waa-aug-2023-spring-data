package com.example.assignment3.repositry;

import com.example.assignment3.entity.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends ListCrudRepository <Review,Integer> {
}
