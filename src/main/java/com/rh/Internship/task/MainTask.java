package com.rh.Internship.task;

import com.rh.Internship.task.models.User;
import com.rh.Internship.task.services.UserServiceImpl;

import java.util.ArrayList;

/**
 * @author Saeed Zarinfam
 */
public class MainTask {
    // JDBC database URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/task_db?characterEncoding=UTF-8&useSSL=false";

    // Database credentials
    static final String USER = "test";
    static final String PASS = "p";

    public static void main(String[] args) throws Exception {
        UserServiceImpl personManager = new UserServiceImpl();
        ArrayList<User> list = (ArrayList<User>) personManager.getAllUser();
        for (User user : list) {
            System.out.println(user.getId() + "  " + user.getName());


      /*  try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            try (Statement stmt = conn.createStatement()) {
                String sql = "SELECT * FROM task";
                ResultSet rs = stmt.executeQuery(sql);
                //STEP 3: Extract data from result set
                while (rs.next()) {
                    //Retrieve by column name
                    String name = rs.getString("name");

                    //Display values
                    System.out.println("name: " + name);
                }
                rs.close();
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }*/
        }
    }
}
