package com.ratedplate.dao.daos;

import com.ratedplate.model.Plate;

import java.util.List;

/**
 * Created by SteveGreen on 06/09/15.
 */
public interface PlateDao {

    void persist(Plate plate);
    List<Plate> getAllPlates();
    List<Plate> getAllPlatesByEstabId();
    List<Plate> getAllPlatesByHighestRating();
    Plate getPlateById(int id);
}
