package waa.lab3.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddressDto {
    private int addressId;
    private String street;
    private String zip;
    private String city;

}
