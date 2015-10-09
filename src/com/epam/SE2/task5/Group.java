package com.epam.SE2.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.epam.SE2.task5.Subject.*;

/**
 * Created by Vesdet on 09.10.2015.
 */
public final class Group {
    private static List<Group> groups = new ArrayList<>();
    private Subject subject;
    private Map list = new HashMap<>();
    private boolean marksIsInteger;

    public Group(Subject subject) {
        this.subject = subject;
        marksIsInteger = subject.isInteger();
        groups.add(this);
    }

    public void addStudent(Student student, double mark) {
        if (marksIsInteger) {
            list.put(student.getName(), (int) mark);
        } else {
            list.put(student.getName(), mark);
        }
    }

    public Map getList() {
        System.out.print(subject + "    ");
        return list;
    }

    public Subject getSubject() {
        return subject;
    }

    public static void printAll() {
        System.out.println("ALL GROUPS");
        for (Group i : groups) {
            System.out.println(i.getList());
        }
    }

    public static void searchStudent(Student student) {
        System.out.println("Name: " + student.getName() + "    Age: " + student.getAge());
        double max = 0, x;
        int y;
        Subject subject = CHEMISTRY;
        for (Group i : groups) {
            for (Object j : i.list.keySet()) {
                if (j == student.getName()) {
                    if (i.subject.isInteger()) {
                        y = (int) i.list.get(j);
                        if (y>max) subject = i.subject;
                        max = y > max ? y : max;
                    } else {
                        x = (double) i.list.get(j);
                        if (x>max) subject = i.subject;
                        max = x > max ? x : max;
                    }
                    System.out.println(i.subject + "    " + i.list.get(j));
                }
            }
        }
        System.out.println("Max mark: " + subject + "   " + max);
    }
}
