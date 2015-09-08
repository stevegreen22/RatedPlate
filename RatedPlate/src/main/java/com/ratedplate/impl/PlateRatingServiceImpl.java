package com.ratedplate.impl;

import com.ratedplate.dao.daos.PlateRatingDao;
import com.ratedplate.model.PlateRating;
import com.ratedplate.service.PlateRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Service("PlateRatingService")
public class PlateRatingServiceImpl implements PlateRatingService {

    @Autowired private PlateRatingDao plateRatingDao;

    @Override
    public void addPlateRatingToDatabase(PlateRating platerating) {
        plateRatingDao.persist(platerating);
    }
}
