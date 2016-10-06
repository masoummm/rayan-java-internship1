package com.rh.Internship.task.services;

import com.rh.Internship.task.Daos.UserDaoJdbc;
import com.rh.Internship.task.models.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Saeed Zarinfam
 */
public class UserServiceImpl implements UserService {

    @Override
    public Optional<User> createUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUser() throws Exception {
        UserDaoJdbc userDaoJdbc = new UserDaoJdbc();
        List<User> mylist = userDaoJdbc.selectAllUser();
        userDaoJdbc.close();
        return mylist;
    }
}
