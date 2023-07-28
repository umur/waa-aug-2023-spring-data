package lab3.springdata.demo.repository;

import lab3.springdata.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepo extends JpaRepository<Product,Long> {

    @Query("select p from Product  p where p.price>?1")
public List<Product> findByPriceGreaterThan(double price);

@Query("select p from Product p where p.category.id=?1 and p.price < ? 2")

public List <Product> findByCatagoryIdAndPriceLessThan(long categoryId ,double price);


public List<Product>findByNameContaining(String name);

}
