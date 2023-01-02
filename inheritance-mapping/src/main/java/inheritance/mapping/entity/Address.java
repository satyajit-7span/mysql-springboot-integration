package inheritance.mapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable // It's not an entity, but it tells hibernate it will be stored into another table
public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
