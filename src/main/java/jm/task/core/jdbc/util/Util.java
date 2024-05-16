package jm.task.core.jdbc.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;



import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/catabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Maga1993!";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } return conn;
    }
}

