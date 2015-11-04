package com.epam.SE10.task2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Task_2 {
    public static void main(String[] args) throws SQLException {
        OracleDB bd = new OracleDB();
        Ships ships = new Ships(bd);
        Classes classes = new Classes(bd);
        List<Ship> listShips;
        List<ShipClass> listClasses;

        listShips = ships.executeSelect("SELECT * FROM Ships");
        listClasses = classes.executeSelect("SELECT * FROM Classes WHERE numGuns<10");

        for (Ship x : listShips) {
            System.out.println(x);
        }
        System.out.println();

        for (ShipClass x : listClasses) {
            System.out.println(x);
        }
        System.out.println();

        Ship ship = new Ship("Kongo", "Kongo", 1913);
       // ships.deleteFrom("Kongo");
       // ships.insertInto(ship);

        listShips = ships.executeSelect("SELECT * FROM Ships");

        for (Ship x : listShips) {
            System.out.println(x);
        }
        System.out.println();

        bd.closeConnection();
    }
}
