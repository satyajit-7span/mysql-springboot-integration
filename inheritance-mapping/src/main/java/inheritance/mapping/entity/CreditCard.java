package inheritance.mapping.entity;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
//@DiscriminatorValue("cc")
public class CreditCard extends Payment {

    private String cardNumber;
}
