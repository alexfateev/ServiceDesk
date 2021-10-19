package com.himmash.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static final String CONFIG_NAME = "config.properties";
    private static final Properties CONFIG = new Properties();

    public static void initConfig() throws IOException {
        initConfig(null);
    }

    public static void initConfig(String name) throws IOException {
        if (name != null && !name.trim().isEmpty()) {
            CONFIG.load(new FileReader(name));
        } else {
            CONFIG.load(new FileReader(CONFIG_NAME));
        }
    }

    public static String getProperty(String propertyName) {
        return CONFIG.getProperty(propertyName);
    }

    public static final String dbHost = "192.168.128.60";
    public static final String dbPort = "3306";
    public static final String dbName = "db_service_desk_cat_edition";
    public static final String dbUser = "user_cat";
    public static final String dbPass = "";
    public static final String dbParam = "?useUnicode=true&serverTimezone=UTC";

    public static final String dbUrl = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + dbParam;

}
