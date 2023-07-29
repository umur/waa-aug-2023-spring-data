package lab3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    private MainUser mainUser;

}
