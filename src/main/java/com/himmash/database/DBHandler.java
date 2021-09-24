package com.himmash.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {
    private Connection connection = null;

    public Connection getConnection(boolean autoCommit) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + Config.dbHost + ":" + Config.dbPort +
                    "/" + Config.dbName + Config.dbParam, Config.dbUser, Config.dbPass);
            connection.setAutoCommit(autoCommit);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
