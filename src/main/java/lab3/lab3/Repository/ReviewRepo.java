package lab3.lab3.Repository;

import lab3.lab3.Model.Product;
import lab3.lab3.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Integer> {
    public List<Review> findByProductId(int id);
}
