package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CityDaoJDBC {

    public static Connection SqlConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "sql91");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
