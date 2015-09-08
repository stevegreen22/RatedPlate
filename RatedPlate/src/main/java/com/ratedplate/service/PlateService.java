package com.ratedplate.service;

import com.ratedplate.model.Plate;

import java.util.List;

/**
 * Created by SteveGreen on 05/09/15.
 */
public interface PlateService {

    void addPlateToDatabase(Plate plate);
    List<Plate> getAllPlates();
    Plate getPlateById(int id);
}
