package com.ratedplate.impl;

import com.ratedplate.dao.daos.EstabRatingDao;
import com.ratedplate.model.EstabRating;
import com.ratedplate.service.EstabRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Service("EstabRatingService")
public class EstabRatingServiceImpl implements EstabRatingService {

    @Autowired EstabRatingDao estabRatingDao;

    @Override
    public void addEstabRatingToDatabase(EstabRating estabRating) {
        estabRatingDao.persist(estabRating);
    }
}
