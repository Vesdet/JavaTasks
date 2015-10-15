package com.epam.SE3.task1;

import java.util.Calendar;
import java.util.Formatter;

import static java.util.Calendar.*;

/**
 * Created by Vesdet on 15.10.2015.
 */
public class CrazyLogger {
    private String name;
    private StringBuilder log;

    public CrazyLogger (String name){
        log = new StringBuilder();
        this.name = name;
    }

    public void addNewMessage(String str){
        Calendar c = getInstance();
        Formatter formatter = new Formatter();
        formatter.format("%td-%tm-%tY:%tH-%tM-%tS--%s\n",c,c,c,c,c,c,str);
        log.append(formatter);
    }

    public String searchMessage(String str){
        int x = log.indexOf(str);
        if (x == -1) return "Message isn't found";
        String tmp = log.substring(0,x);
        x = tmp.lastIndexOf("--");

        tmp = log.substring(x - 19, log.indexOf("\n", x - 19));
        return "Message: " + tmp;
    }

    public StringBuilder getLog() {
        return log;
    }

    @Override
    public String toString() {
        return "CrazyLogger{" +
                "name='" + name + '\'' +
                ", log:\n" + log +
                '}';
    }
}
