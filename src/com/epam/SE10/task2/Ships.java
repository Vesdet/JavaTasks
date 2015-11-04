package com.epam.SE10.task2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Ships implements SimpleDAO {
    private static Set<Ships> ships;
    private String name;
    private String classShip;
    private int launched;

    public Ships(String name, String classShip, int launched) {
        this.name = name;
        this.classShip = classShip;
        this.launched = launched;
    }

    @Override
    public void insertInto (OracleDB db) {
        db.execute("INSERT INTO " +
                "Ships(name, class, launched) " +
                "VALUES ('" + name + "', '"+ classShip + "', "+ launched + ")");
    }

    @Override
    public void deleteFrom(OracleDB db) {
        db.execute("DELETE Ships " +
                "WHERE name='" + name + "'");
    }

    public static Set<Ships> executeSelect(OracleDB db ,String request) throws SQLException {
        ships = new HashSet<>();
        ResultSet rs = db.executeQuery(request);
        while (rs.next()) {
            String name = rs.getString("name");
            String classShip = rs.getString("class");
            int launched = rs.getInt("launched");
            ships.add(new Ships(name, classShip, launched));
        }
        rs.close();
        return ships;
    }

    public static void printSet() {
        for (Ships x: ships) {
            System.out.print("Name : " + x.getName());
            System.out.print("    Class : " + x.getClassShip());
            System.out.println("    Launched : " + x.getLaunched());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getClassShip() {
        return classShip;
    }

    public int getLaunched() {
        return launched;
    }
}
