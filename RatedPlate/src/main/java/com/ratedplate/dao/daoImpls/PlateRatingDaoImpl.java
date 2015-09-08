package com.ratedplate.dao.daoImpls;

import com.ratedplate.dao.daos.PlateRatingDao;
import com.ratedplate.model.PlateRating;
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
public class PlateRatingDaoImpl implements PlateRatingDao {

    @PersistenceContext private EntityManager em;

    @Transactional
    public void persist(PlateRating plateRating){
        em.persist(plateRating);
    }

    @Transactional
    public List<PlateRating> getAllPlateRatings(){
        TypedQuery<PlateRating> query = em.createQuery(
                "SELECT pr from PlateRating as pr order by pr.id",
                PlateRating.class);
        return query.getResultList();
    }

    @Transactional
    public PlateRating getPlateRatingByPlateId(int plateId){
        TypedQuery<PlateRating> query = em.createQuery(
                "select pr from PlateRating as pr where pr.platedId = :plateId",
                PlateRating.class);
        return query.setParameter("plateId", plateId).getSingleResult();
    }

    @Transactional
    public PlateRating getPlateRatingByRatingId(int ratingId){
        TypedQuery<PlateRating> query = em.createQuery(
                "select pr from PlateRating as pr where pr.id = :ratingId",
                PlateRating.class);
        return query.setParameter("ratingId", ratingId).getSingleResult();
    }

}
