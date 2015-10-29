package com.epam.SE6.task2;

import java.util.Map;
import java.util.Set;

/**
 * Created by Vesdet on 26.10.2015.
 */
public class Task_2 {

    public static void main(String[] args) {

        GetProperties prop = new GetProperties("com.epam.SE6.task2.prop");
        prop.printMap();

        Map<String, String> map = prop.getMap();
        map.put("value5","Replacement");

        Set<String> z  = map.keySet();
        for (String key : z){
            System.out.println(key + " = " + map.get(key));
        }
    }
}
