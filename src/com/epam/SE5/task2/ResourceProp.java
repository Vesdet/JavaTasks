package com.epam.SE5.task2;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by Vesdet on 22.10.2015.
 */
public class ResourceProp {
    private ResourceBundle bundle;

    public ResourceProp(String path, Locale locale) {
        try {
            bundle = ResourceBundle.getBundle(path, locale);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public ResourceProp(String path){
        try {
            bundle = ResourceBundle.getBundle(path);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public String getValue(String key){
        try {
            return bundle.getString(key);
        } catch (NullPointerException e) {
            System.out.println("File isn't found");
        } catch (MissingResourceException e) {
            System.out.println("Incorrect value of a key");
        }
        return "error";
    }
}
