package com.myapp.myapp.repo;


import com.myapp.myapp.entity.Review;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends ListCrudRepository<Review, Integer> {
    List<Review> findByProductId(Integer id);
}
