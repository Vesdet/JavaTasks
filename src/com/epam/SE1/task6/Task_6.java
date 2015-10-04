package com.epam.SE1.task6;
import java.util.Calendar;

/**
 * Created by Vesdet on 01.10.2015.
 */
public class Task_6 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Notepad base = new Notepad();

        c.set(2015, 6, 25);
        base.AddRecord("Dima", "I am Lalka", c);
        c=Calendar.getInstance();
        c.set(2015, 3, 24);
        base.AddRecord("Natasha", "I am Lalka2", c);
        c=Calendar.getInstance();
        c.set(2015, 7, 13);
        base.AddRecord("Nikita", "I am Lalka3", c);
        base.PrintAllRecords();

        base.DeleteRecord(2);
        base.PrintAllRecords();

        c=Calendar.getInstance();
        c.set(2025, 7, 10);
        base.EditRecord(0,"Vasya", "I am nubasik", c);
        base.PrintAllRecords();
    }
}
