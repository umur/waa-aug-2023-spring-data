package lab3.lab3.Repository;

import lab3.lab3.Model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepo extends JpaRepository<Adress, Integer> {
}
