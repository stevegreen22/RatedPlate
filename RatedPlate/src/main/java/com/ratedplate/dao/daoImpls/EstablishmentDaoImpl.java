package com.ratedplate.dao.daoImpls;

import com.ratedplate.dao.daos.EstablishmentDao;
import com.ratedplate.model.Establishment;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by SteveGreen on 03/09/15.
 */
@Component
public class EstablishmentDaoImpl implements EstablishmentDao {

    @PersistenceContext private EntityManager em;

    @Transactional
    public void persist(Establishment establishment){
        em.persist(establishment);
    }

    @Transactional
    public List<Establishment> getAllEstablishments(){
        TypedQuery<Establishment> query = em.createQuery(
                "SELECT est from Establishment as est order by est.id",
                Establishment.class);
        return query.getResultList();
    }
}
