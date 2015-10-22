package com.epam.SE3.task2;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Vesdet on 16.10.2015.
 */
public class ResourceQuestion {
    private ResourceBundle bundle;
    public ResourceQuestion(Locale locale){
        bundle = ResourceBundle.getBundle("com.epam.SE3.task2.resources.question", locale);
    }
    public String getValue(String key){
        return bundle.getString(key);
    }
}
