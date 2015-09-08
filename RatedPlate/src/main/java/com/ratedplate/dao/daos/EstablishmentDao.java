package com.ratedplate.dao.daos;

import com.ratedplate.model.Establishment;
import java.util.List;

/**
 * Created by SteveGreen on 06/09/15.
 */
public interface EstablishmentDao {

    void persist(Establishment establishment);
    List<Establishment> getAllEstablishments();

}
