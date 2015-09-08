package com.ratedplate.dao.daoImpls;

import com.ratedplate.dao.daos.UserRatingDao;
import com.ratedplate.model.UserRating;
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
public class UserRatingDaoImpl implements UserRatingDao {

    @PersistenceContext private EntityManager em;

    @Transactional
    public void persist(UserRating userRating){
        em.persist(userRating);
    }

    @Transactional
    public List<UserRating> getAllUserRatings(){
        TypedQuery<UserRating> query = em.createQuery(
                "SELECT u from UserRating as u order by u.id",
                UserRating.class);
        return query.getResultList();
    }

    @Transactional
    //todo: this will be the sum of all ratings
    public UserRating getUserRatingByUserId(int userId){
        TypedQuery<UserRating> query = em.createQuery(
                "select ur from UserRating as ur where ur.id = :userId",
                UserRating.class);
        return query.setParameter("userId", userId).getSingleResult();
    }


}
