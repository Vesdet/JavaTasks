package com.epam.SE10.task2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Classes implements SimpleDAO {
    private OracleDB db;

    public Classes(OracleDB db) {
        this.db = db;
    }

    @Override
    public void insertInto(Object t) {
        ShipClass shipClass = (ShipClass)t;
        db.execute("INSERT INTO " +
                "Classes(class, types, country, numGuns, bore, displacement) " +
                "VALUES (" + shipClass.getName() + ", "+ shipClass.getType() + ", "+ shipClass.getCountry()
                    + ", "+ shipClass.getNumGuns() + ", "+ shipClass.getBore() + ", "+ shipClass.getDisplacement() +  ")");
    }

    @Override
    public void deleteFrom(String name) {
        db.execute("DELETE Classes " +
                "WHERE name=" + name);
    }

    @Override
    public List<ShipClass> executeSelect(String request) throws SQLException {
        List<ShipClass> classes = new ArrayList<>();
        ResultSet rs = db.executeQuery(request);
        while (rs.next()) {
            String name = rs.getString("class");
            String type = rs.getString("types");
            String country = rs.getString("country");
            int numGuns = rs.getInt("numGuns");
            int bore = rs.getInt("bore");
            int displacement = rs.getInt("displacement");
            classes.add(new ShipClass(name, type, country, numGuns, bore, displacement));
        }
        rs.close();
        return classes;
    }
}
