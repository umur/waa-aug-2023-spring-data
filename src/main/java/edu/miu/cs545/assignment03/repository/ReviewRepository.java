package edu.miu.cs545.assignment03.repository;

import edu.miu.cs545.assignment03.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
