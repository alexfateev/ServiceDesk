package com.himmash.utils;

public class SystemInfo {

    public static String javaVersion() {
        return System.getProperty("java.version");
    }

    public static String javafxVersion() {
        return System.getProperty("javafx.version");
    }

    public static String getUserDomain() {
        return System.getenv("USERDOMAIN");
    }

    public static String getComputerName() {
        return System.getenv("COMPUTERNAME");
    }

    public static String getUserName() {
        return System.getenv("USERNAME");
    }

    public static String getFullUserName() {
        return System.getenv("USERDOMAIN")+"\\" + System.getenv("USERNAME");
    }

}