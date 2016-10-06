package com.rh.Internship.task.Daos;

import com.rh.Internship.task.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 * @author Saeed Zarinfam
 */
public class UserDaoJdbc implements UserDao {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public UserDaoJdbc() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "masoum", "myjava123");
    }

    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }

    @Override
    public Optional<User> insertUser(User user) {
        return null;
    }

    @Override
    public Optional<User> updateUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(long userId) {
        return false;
    }

    @Override
    public List<User> selectAllUser() throws Exception {
        ArrayList<User> arrayList = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getLong("id"));
            user.setName(resultSet.getString("name"));
            arrayList.add(user);

        }

        return arrayList;

    }


}



