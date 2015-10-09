package com.epam.SE2.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.epam.SE2.task5.Subject.*;

/**
 * Created by Vesdet on 09.10.2015.
 */
public final class Group<T> {
    private static List<Group> groups = new ArrayList<>();
    private Subject subject;
    private Map<String, T> list = new HashMap<>();

    private Group(Subject subject) {
        this.subject = subject;
        groups.add(this);
    }

    public static Group newGroup(Subject subject){
        if (subject.isInteger()){
            Group<Integer> group = new Group<>(subject);
            return group;
        }
        else{
            Group<Double> group = new Group<>(subject);
            return group;
        }
    }

    public void addStudent(Student student, T mark) {
        list.put(student.getName(), mark);
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
        double x, max = 0;
        Subject subject = CHEMISTRY;
        for (Group i : groups) {
            if (i.list.get(student.getName()) != null) {
                if (i.subject.isInteger()) {
                    x = (int) i.list.get(student.getName());
                } else {
                    x = (double) i.list.get(student.getName());
                }
                if (x > max) {
                    subject = i.subject;
                    max = x;
                }
                System.out.println(i.subject + "    " + i.list.get(student.getName()));
            }
        }
        System.out.println("Max mark: " + subject + "   " + max);
    }
}
