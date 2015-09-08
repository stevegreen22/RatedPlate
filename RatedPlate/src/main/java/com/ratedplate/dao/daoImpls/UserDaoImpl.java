package com.ratedplate.dao.daoImpls;

import com.ratedplate.dao.daos.UserDao;
import com.ratedplate.model.User;
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
public class UserDaoImpl implements UserDao {

    @PersistenceContext private EntityManager em;

    @Transactional
    public void persist(User user){
        em.persist(user);
    }

//    @Transactional
    public List<User> getAllUsers(){
        TypedQuery<User> query = em.createQuery(
                "SELECT u from User as u order by u.id",
                User.class);
        return query.getResultList();
    }

    @Transactional
    public User getUserById(int id){
        TypedQuery<User> query = em.createQuery(
                "select u from User as u where u.id = :userid",
                User.class);
        return query.setParameter("userid", id).getSingleResult();
    }

    @Transactional
    public void removeAllTestUsers() {
        TypedQuery<User> query = em.createQuery(
                "DELETE FROM User",
                User.class);
        query.executeUpdate();
        em.flush();
    }
}
