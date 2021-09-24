package com.himmash.dao;

public class ConnectionBuilderFactory {
    public static ConnectionBuilder getConnectionBuilder(){
        return new SimpleConnectionBuilder();
    }
}
