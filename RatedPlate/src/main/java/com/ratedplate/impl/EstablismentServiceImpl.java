package com.ratedplate.impl;

import com.ratedplate.dao.daos.EstablishmentDao;
import com.ratedplate.model.Establishment;
import com.ratedplate.service.EstablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SteveGreen on 03/09/15.
 */
@Service("EstablishmentService")
public class EstablismentServiceImpl implements EstablishmentService {

    @Autowired private EstablishmentDao establishmentDao;

    @Override
    public void addEstabToDatabase(Establishment estab) {
        establishmentDao.persist(estab);
    }

    @Override
    public List<Establishment> getAllEstablishments() {
        return establishmentDao.getAllEstablishments();
    }
}
