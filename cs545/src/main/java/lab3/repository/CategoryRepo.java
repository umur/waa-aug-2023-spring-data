package lab3.repository;

import lab3.dto.CategoryDto;
import lab3.dto.ProductDto;
import lab3.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
    //Find all products in cat category and cost less than maxPrice.
//    List<CategoryDto> findAllProductsByCategoryIdAndPriceLessThan(int categoryId, int price);

//    List<Category> findAllProductsByCategoryIdAndPAndProducts
}
