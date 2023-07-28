package lab3.springdata.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id
    private Long id;

    private String street;

    private String zip;

    private String city;

    @OneToOne
    private User user;

}

