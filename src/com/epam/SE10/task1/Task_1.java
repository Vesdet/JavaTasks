package com.epam.SE10.task1;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Task_1 {
    public static void main(String[] args) throws SQLException {

        OracleDB bd = new OracleDB();
        ResultSet rs;

        bd.execute("DROP Table EXAMPLE");
        bd.execute("CREATE Table EXAMPLE(ID NUMBER, NAME VARCHAR(20))");
        bd.execute("INSERT INTO EXAMPLE(ID, NAME) VALUES ('13', 'Vesdet')");
        bd.execute("INSERT INTO EXAMPLE(ID, NAME) VALUES ('14', 'pxjoke')");
        bd.execute("INSERT INTO EXAMPLE(ID, NAME) VALUES ('15', 'ginvaell')");

        rs = bd.executeQuery("SELECT * FROM EXAMPLE");
        while (rs.next()) {

            String userid = rs.getString("ID");
            String username = rs.getString("NAME");

            System.out.print("ID : " + userid);
            System.out.println("    NAME : " + username);
        }
        System.out.println();

        bd.execute("DELETE EXAMPLE WHERE ID = 13");
        bd.execute("UPDATE EXAMPLE SET NAME = 'pxjoke_dima' WHERE ID = 14");

        rs = bd.executeQuery("SELECT * FROM EXAMPLE");
        while (rs.next()) {

            String userid = rs.getString("ID");
            String username = rs.getString("NAME");

            System.out.print("ID : " + userid);
            System.out.println("    NAME : " + username);
        }

        rs.close();
        bd.closeConnection();
    }
}
