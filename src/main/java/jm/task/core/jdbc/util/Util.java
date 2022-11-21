package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/user";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    // реализуйте настройку соеденения с БД
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection: OK");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection: ERROR");
            throw new RuntimeException(e);
        }
        return connection;
    }
}