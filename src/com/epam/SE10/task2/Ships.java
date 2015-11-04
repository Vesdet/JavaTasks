package com.epam.SE10.task2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Ships implements SimpleDAO {
    private OracleDB db;

    public Ships(OracleDB db) {
        this.db = db;
    }

    @Override
    public void insertInto (Object t) {
        Ship ship = (Ship)t;
        db.execute("INSERT INTO " +
                "Ships(name, class, launched) " +
                "VALUES ('" + ship.getName() + "', '" + ship.getClassShip() + "', " + ship.getLaunched() + ")");
    }

    @Override
    public void deleteFrom(String name) {
        db.execute("DELETE Ships " +
                "WHERE name='" + name + "'");
    }

    @Override
    public List<Ship> executeSelect(String request) throws SQLException {
        List<Ship> ships = new ArrayList<>();
        ResultSet rs = db.executeQuery(request);
        while (rs.next()) {
            String name = rs.getString("name");
            String classShip = rs.getString("class");
            int launched = rs.getInt("launched");
            ships.add(new Ship(name, classShip, launched));
        }
        rs.close();
        return ships;
    }
}
