package himmash.local.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static himmash.local.database.Config.*;

public class DBHandler {
    private Connection connection = null;

    public Connection getConnection(boolean autoCommit) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":" + dbPort +
                    "/" + dbName + dbParam, dbUser, dbPass);
            connection.setAutoCommit(autoCommit);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
