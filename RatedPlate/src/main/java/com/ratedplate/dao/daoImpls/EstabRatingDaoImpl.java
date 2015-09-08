package com.ratedplate.dao.daoImpls;

import com.ratedplate.dao.daos.EstabRatingDao;
import com.ratedplate.model.EstabRating;
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
public class EstabRatingDaoImpl implements EstabRatingDao {

    @PersistenceContext private EntityManager em;

    @Transactional
    public void persist(EstabRating estabRating){
        em.persist(estabRating);
    }

    @Transactional
    public List<EstabRating> getAllEstabRatings(int estabId){
        TypedQuery<EstabRating> query = em.createQuery(
                "SELECT er from EstabRating as er " +
                "WHERE er.id = :estabId order by er.id",
                EstabRating.class);
        return query.setParameter("estabId", estabId).getResultList();
    }

}
