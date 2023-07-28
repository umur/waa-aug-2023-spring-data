package lab3.springdata.demo.repository;

import lab3.springdata.demo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review,Long> {

    public List<Review> findByProductId(long id);
}
