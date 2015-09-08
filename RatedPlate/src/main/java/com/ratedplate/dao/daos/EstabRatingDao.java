package com.ratedplate.dao.daos;


import com.ratedplate.model.EstabRating;

import java.util.List;

/**
 * Created by SteveGreen on 06/09/15.
 */
public interface EstabRatingDao {

    void persist(EstabRating estabRating);
    List<EstabRating> getAllEstabRatings(int estabId);
}
