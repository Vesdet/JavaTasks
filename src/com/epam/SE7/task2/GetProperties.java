package com.epam.SE7.task2;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Created by Vesdet on 03.11.2015.
 */
public class GetProperties implements Runnable {
    private ResourceBundle bundle = null;
    private String path = null;
    private Locale locale = null;

    public void setBundle() {
        try {
            bundle = ResourceBundle.getBundle(path);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public void setBundleWithLocale() {
        try {
            bundle = ResourceBundle.getBundle(path, locale);
        } catch (MissingResourceException e) {
            System.out.println("File isn't found");
        }
    }

    public GetProperties(String path) {
        this.path = path;
    }

    public GetProperties(String path, Locale locale) {
        this.path = path;
        this.locale = locale;
    }

    public void printAll() {
        Set<String> z = bundle.keySet();
        for (String key : z) {
            System.out.println(key + " = " + bundle.getString(key));
        }
        System.out.println();
    }

    @Override
    public void run() {
        if (locale != null) setBundleWithLocale();
        else setBundle();
        synchronized (bundle) {
            printAll();
        }
    }
}
