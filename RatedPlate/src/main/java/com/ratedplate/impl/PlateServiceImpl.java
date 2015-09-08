package com.ratedplate.impl;

import com.ratedplate.dao.daos.PlateDao;
import com.ratedplate.model.Plate;
import com.ratedplate.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Service("PlateService")
public class PlateServiceImpl implements PlateService {

    @Autowired
    private PlateDao plateDao;
    private List<Plate> plates = new ArrayList<Plate>();

    @Override
    public void addPlateToDatabase(Plate plate) {
        plateDao.persist(plate);
    }

    @Override
    public Plate getPlateById(int id) {
        return null;
    }

    @Override
    public List<Plate> getAllPlates() {
        plates.addAll(plateDao.getAllPlates());
        return plates;
    }

}
