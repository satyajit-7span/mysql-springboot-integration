package inheritance.mapping.repository;

import inheritance.mapping.entity.License;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository // It will be treated as custom repository
public class CustomRepository {

    private EntityManager entityManager;

    public /*List<License>*/ long getData() {
        //Query query = entityManager.createQuery("SELECT * FROM License l");
        Query query = entityManager.createQuery("SELECT COUNT(l.id) FROM License l");
        long count = (long) query.getSingleResult();
        return count;
        //List<License> licenseList = query.getResultList();
        //return licenseList;
    }
}
