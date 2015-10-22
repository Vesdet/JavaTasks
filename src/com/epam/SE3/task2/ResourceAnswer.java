package com.epam.SE3.task2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Vesdet on 22.10.2015.
 */
public class ResourceAnswer {
    private ResourceBundle bundle;
    public ResourceAnswer(Locale locale){
        bundle = ResourceBundle.getBundle("com.epam.SE3.task2.resources.answer", locale);
    }
    public String getValue(String key){
        return bundle.getString(key);
    }
}
