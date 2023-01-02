package inheritance.mapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL) // When it is loaded child object will be loaded, default is lazy loading
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Set<PhoneNumber> phoneNumber;
}
