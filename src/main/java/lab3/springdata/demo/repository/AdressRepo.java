package lab3.springdata.demo.repository;

import lab3.springdata.demo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepo extends JpaRepository<Address ,Long> {
}
