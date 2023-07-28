package w1d3.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.springdata.entity.Review;

import java.util.List;

@Repository
public interface ReviewRepository extends ListCrudRepository<Review, Long> {
    List<Review> findByProductId(Long productId);
}
