package com.ratedplate.dao.daos;

import com.ratedplate.model.PlateRating;

import java.util.List;

/**
 * Created by SteveGreen on 06/09/15.
 */
public interface PlateRatingDao {

    void persist(PlateRating plateRating);
    List<PlateRating> getAllPlateRatings();
    PlateRating getPlateRatingByPlateId(int plateId);
    PlateRating getPlateRatingByRatingId(int ratingId);
}
