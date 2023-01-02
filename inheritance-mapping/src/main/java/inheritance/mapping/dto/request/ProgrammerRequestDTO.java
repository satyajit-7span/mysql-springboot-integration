package inheritance.mapping.dto.request;

import inheritance.mapping.entity.Project;
import lombok.Data;

import java.util.Set;

@Data
public class ProgrammerRequestDTO {

    private String name;
    private int salary;

    private Set<Project> projects;
}
