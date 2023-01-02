package inheritance.mapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="bankcheck")
//@DiscriminatorValue("ch")
public class Cheque extends Payment {

    private String chequeNumber;
}
