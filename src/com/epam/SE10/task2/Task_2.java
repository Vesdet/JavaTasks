package com.epam.SE10.task2;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Task_2 {
    public static void main(String[] args) throws SQLException{
        OracleDB bd = new OracleDB();
        Set<Ships> ships = new HashSet<>();
        Set<Classes> classes = new HashSet<>();

        ships = Ships.executeSelect(bd, "SELECT * FROM Ships WHERE launched < 1915");
        classes = Classes.executeSelect(bd, "SELECT * FROM Classes");

        Ships.printSet();
        Classes.printSet();

        Ships ship = new Ships("Kongo", "Kongo", 1913);
//        ship.insertInto(bd);
        ship.deleteFrom(bd);

        ships = Ships.executeSelect(bd, "SELECT * FROM Ships WHERE launched < 1915");
        Ships.printSet();

        bd.closeConnection();
    }
}
