package com.ratedplate.dao.daoImpls;

import com.ratedplate.dao.daos.PlateDao;
import com.ratedplate.model.Plate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Component
public class PlateDaoImpl implements PlateDao {

    @PersistenceContext private EntityManager em;

    @Transactional
    public List<Plate> getAllPlates(){
        TypedQuery<Plate> query = em.createQuery(
                "SELECT p from Plate as p order by p.id",
                Plate.class);
        return query.getResultList();
    }

    @Transactional
    public Plate getPlateById(int plateid){
        TypedQuery<Plate> query = em.createQuery(
                "select p from Plate as p where p.id = :plateid",
                Plate.class);
        return query.setParameter("plateid", plateid).getSingleResult();
    }

    @Transactional
    public void persist(Plate plate) {
        em.persist(plate);
    }

    @Override
    public List<Plate> getAllPlatesByEstabId() {
        return null;
    }

    @Override
    public List<Plate> getAllPlatesByHighestRating() {
        return null;
    }
}
