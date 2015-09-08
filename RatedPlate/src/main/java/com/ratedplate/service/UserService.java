package com.ratedplate.service;

import com.ratedplate.model.User;

import java.util.List;

/**
 * Created by SteveGreen on 05/09/15.
 */
public interface UserService {

    void deleteAllTestUsers(); //update this.
    void addUserToDatabase(User user) throws Exception; //Todo: Write exception class
    List<User> getAllUsers();
    User getUserById(int id);

}
