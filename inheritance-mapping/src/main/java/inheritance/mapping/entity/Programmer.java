package inheritance.mapping.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NamedStoredProcedureQuery(name = "testProcedure", procedureName = "programmer_procedure")
public class Programmer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int salary;

    @ManyToMany(cascade = CascadeType.ALL) // By default it's lazy
    @JoinTable(name = "programmers_projects",
                joinColumns = @JoinColumn(name = "programmer_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))
    private Set<Project> project = new HashSet<>();
}
