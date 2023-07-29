package miu.waa.lab3.dto;

import lombok.Getter;
import lombok.Setter;
import miu.waa.lab3.entity.User;

@Getter
@Setter
public class AddressDto {
    private int id;
    private String street;
    private int zip;
    private String city;
    private User user;
}
