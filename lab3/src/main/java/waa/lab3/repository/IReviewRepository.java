package waa.lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import waa.lab3.domain.Review;

import java.util.List;

@Repository
public interface IReviewRepository extends JpaRepository<Review,Integer> {

    List<Review> getReviewsByProductId(int id);
}
