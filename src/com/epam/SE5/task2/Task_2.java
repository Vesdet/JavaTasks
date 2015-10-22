package com.epam.SE5.task2;

import java.util.ResourceBundle;

/**
 * Created by Vesdet on 22.10.2015.
 */
public class Task_2 {
    public static void main(String[] args) {

        ResourceProp prop = new ResourceProp("com.epam.SE5.task2.prop");

        String value = prop.getValue("value3");

        System.out.println(value);
    }
}
