package edu.miu.cs545.assignment03.repository;

import edu.miu.cs545.assignment03.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

   public List<Product> findByPriceGreaterThan(double price);

   public  List<Product> findByCategory_IdAndPriceLessThan(Long categoryId, double price);

   public List<Product>findProductsByNameContainingIgnoreCase(String name);


}
