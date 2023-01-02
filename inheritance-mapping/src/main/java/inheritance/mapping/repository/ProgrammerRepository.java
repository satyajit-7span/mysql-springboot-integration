package inheritance.mapping.repository;

import inheritance.mapping.entity.Programmer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

    @Procedure(procedureName = "programmer_procedure")
    List<Programmer> findAllByStoredProcedure();

    @Modifying
    @Query(value = "DELETE FROM programmer_view WHERE id=:id", nativeQuery = true)
    void deleteProgrammer(@Param("id") int id);
}
