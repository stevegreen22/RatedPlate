package com.ratedplate.service;

import com.ratedplate.model.Establishment;

import java.util.List;

/**
 * Created by SteveGreen on 03/09/15.

 Interface for any and all Establishment commands

 */
public interface EstablishmentService {

    List<Establishment> getAllEstablishments();
    void addEstabToDatabase(Establishment estab);
}
