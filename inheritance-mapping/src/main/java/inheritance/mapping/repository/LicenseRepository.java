package inheritance.mapping.repository;

import inheritance.mapping.entity.License;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LicenseRepository extends CrudRepository<License, Integer> {

    @Query("SELECT l FROM License l INNER JOIN FETCH l.person")
    List<License> getAllData();
}
