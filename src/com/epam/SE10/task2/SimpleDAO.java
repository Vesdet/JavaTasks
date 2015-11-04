package com.epam.SE10.task2;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vesdet on 04.11.2015.
 */
public interface SimpleDAO {

    void insertInto (Object t);

    void deleteFrom (String name);

    <T> List<T> executeSelect(String request) throws SQLException;
}
