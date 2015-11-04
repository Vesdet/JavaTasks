package com.epam.SE10.task2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Classes implements SimpleDAO {
    private static Set<Classes> classes;
    private String name;
    private String type;
    private String country;
    private int numGuns;
    private int bore;
    private int displacement;

    public Classes(String name, String type, String country, int numGuns, int bore, int displacement) {
        this.name = name;
        this.type = type;
        this.country = country;
        this.numGuns = numGuns;
        this.bore = bore;
        this.displacement = displacement;
    }

    @Override
    public void insertInto(OracleDB db) {
        db.execute("INSERT INTO " +
                "Classes(class, types, country, numGuns, bore, displacement) " +
                "VALUES (" + name + ", "+ type + ", "+ country
                    + ", "+ numGuns + ", "+ bore + ", "+ displacement +  ")");
    }

    @Override
    public void deleteFrom(OracleDB db) {
        db.execute("DELETE Classes " +
                "WHERE name=" + name);
    }

    public static Set<Classes> executeSelect(OracleDB db ,String request) throws SQLException {
        classes = new HashSet<>();
        ResultSet rs = db.executeQuery(request);
        while (rs.next()) {
            String name = rs.getString("class");
            String type = rs.getString("types");
            String country = rs.getString("country");
            int numGuns = rs.getInt("numGuns");
            int bore = rs.getInt("bore");
            int displacement = rs.getInt("displacement");
            classes.add(new Classes(name, type, country, numGuns, bore, displacement));
        }
        rs.close();
        return classes;
    }

    public static void printSet() {
        for (Classes x: classes) {
            System.out.print("Class : " + x.getName());
            System.out.print("    Type : " + x.getType());
            System.out.print("    Country : " + x.getCountry());
            System.out.print("    NumGuns : " + x.getNumGuns());
            System.out.print("    Bore : " + x.getBore());
            System.out.println("    Displacement : " + x.getDisplacement());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public int getNumGuns() {
        return numGuns;
    }

    public int getBore() {
        return bore;
    }

    public int getDisplacement() {
        return displacement;
    }
}
