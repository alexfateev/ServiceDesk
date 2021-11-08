package com.himmash.dao;

import com.himmash.utils.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionBuilder implements ConnectionBuilder {

    private Connection connection;

    public SimpleConnectionBuilder() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Config.dbUrl, Config.dbUser, Config.dbPass);
    }

    public Connection getConnection(boolean autoCommit) throws SQLException {
        if(connection==null) {
            connection = DriverManager.getConnection(Config.dbUrl, Config.dbUser, Config.dbPass);
            System.out.println("Connected to database");
        }
        connection.setAutoCommit(autoCommit);
        return connection;
    }

    public void commit() throws SQLException {
        if(connection.getAutoCommit()==false){
            connection.commit();
            System.out.println("commit");
        }
    }

    public void rollback() throws SQLException {
        if(connection.getAutoCommit()==false){
            connection.rollback();
            System.out.println("rollback");
        }
    }

    public void closeConnection() throws SQLException {
        if(!connection.isClosed()){
            connection.close();
            System.out.println("Connection closed");
        }
    }
}
