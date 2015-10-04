package com.epam.SE1.task6;
import java.util.Calendar;

/**
 * Created by Vesdet on 01.10.2015.
 */
public class Record {
    private int num;
    private String name;
    private String text;
    private Calendar data;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
