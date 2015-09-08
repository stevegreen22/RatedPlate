package com.ratedplate.dao.daos;

import com.ratedplate.model.UserRating;

import java.util.List;

/**
 * Created by SteveGreen on 06/09/15.
 */
public interface UserRatingDao {

    void persist(UserRating userRating);
    List<UserRating> getAllUserRatings();
    UserRating getUserRatingByUserId(int userId);
}
