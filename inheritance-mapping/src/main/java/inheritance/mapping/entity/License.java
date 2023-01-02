package inheritance.mapping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String type;

    private LocalDate validFrom;

    private LocalDate validTo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) // Default it's EAGER type
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Two parameters are internalId, secretKey
    @JoinColumn(name = "person_id")
    private Person person;
}
