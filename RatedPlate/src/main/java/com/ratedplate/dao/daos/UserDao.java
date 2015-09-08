package com.ratedplate.dao.daos;

import com.ratedplate.model.User;

import java.util.List;

/**
 * Created by SteveGreen on 06/09/15.
 */
public interface UserDao {

    void persist(User user);
    List<User> getAllUsers();
    User getUserById(int id);
    void removeAllTestUsers();
}
