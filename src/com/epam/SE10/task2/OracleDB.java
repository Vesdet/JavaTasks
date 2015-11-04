package com.epam.SE10.task2;

import java.sql.*;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class OracleDB {
    private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    private static final String username = "Vesdet";  //schema name; user:'Vesdet';
    private static final String password = "!68251Nik";
    private Connection connection = null;
    private Statement statement = null;

    public OracleDB() {
        if (connectionToDB()) System.out.println("Connection is good.");
        else System.out.println("Connection error.");
    }

    private boolean connectionToDB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Locale.setDefault(Locale.ENGLISH);
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int execute(String request) {
        try {
            statement.execute(request);
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public ResultSet executeQuery(String request) {
        ResultSet set;
        try {
            set = statement.executeQuery(request);
            return set;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection() {
        try {
            if (statement != null) {
                statement.close();
                connection.close();
                System.out.println("Connection close!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
