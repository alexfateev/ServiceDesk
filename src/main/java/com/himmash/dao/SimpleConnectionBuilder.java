package com.himmash.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionBuilder implements ConnectionBuilder{

    public SimpleConnectionBuilder() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/service_desk";
        String login= "root";
        String pass= "Vecrek";
        return DriverManager.getConnection(url,login, pass);
    }
}
