package com.epam.SE6.task2;

import java.util.*;

/**
 * Created by Vesdet on 26.10.2015.
 */
public class GetProperties {
    private Map<String, String> map = new HashMap<>();
    private ResourceBundle bundle;

    public GetProperties(String path){
        try {
            bundle = ResourceBundle.getBundle(path);
            fillingMap();
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public GetProperties(String path, Locale locale) {
        try {
            bundle = ResourceBundle.getBundle(path, locale);
            fillingMap();
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public Map<String, String> getMap() {
        return map;
    }

    private void fillingMap() {
        Set<String> z  = bundle.keySet();
        for (String key : z) {
            map.put(key, bundle.getString(key));
        }
    }

    public void printMap() {
        Set<String> z  = map.keySet();
        for (String key : z){
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println();
    }
}
