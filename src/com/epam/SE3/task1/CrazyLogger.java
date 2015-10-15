package com.epam.SE3.task1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
        if (c.get(DAY_OF_MONTH)/10 == 0) log.append(String.format("0%d-", c.get(DAY_OF_MONTH)));
        else log.append(String.format("%d-", c.get(DAY_OF_MONTH)));
        if (c.get(MONTH)/10 == 0) log.append(String.format("0%d-", c.get(MONTH)));
        else log.append(String.format("%d-", c.get(MONTH)));
        log.append(String.format("%d:", c.get(YEAR)));
        if (c.get(HOUR)/10 == 0) log.append(String.format("0%d-", c.get(HOUR)));
        else log.append(String.format("%d-", c.get(HOUR)));
        if (c.get(MINUTE)/10 == 0) log.append(String.format("0%d-", c.get(MINUTE)));
        else log.append(String.format("%d-", c.get(MINUTE)));
        if (c.get(SECOND)/10 == 0) log.append(String.format("0%d--", c.get(SECOND)));
        else log.append(String.format("%d--", c.get(SECOND)));
        log.append(String.format("%s\n", str));
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
