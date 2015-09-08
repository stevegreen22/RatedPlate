package com.ratedplate.impl;

import com.ratedplate.dao.daos.UserDao;
import com.ratedplate.model.User;
import com.ratedplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired private UserDao userDao;
    private List<User> users = new ArrayList<User>();

    @Override
    public void deleteAllTestUsers() {
        users = null;
        userDao.removeAllTestUsers();
    }

    @Override
    public void addUserToDatabase(User user) throws Exception {
        userDao.persist(user);
    }

    @Override
    public List<User> getAllUsers() {
        users.addAll(userDao.getAllUsers());
        return users;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
