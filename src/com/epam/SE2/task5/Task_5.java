package com.epam.SE2.task5;

import static com.epam.SE2.task5.Subject.*;

/**
 * Created by Vesdet on 09.10.2015.
 */
public class Task_5 {
    public static void main(String[] args) {
        Student dima = new Student("Dima", 20);
        Student nikita = new Student("Nikita", 20);
        Student sasha = new Student("Sasha", 19);
        Student natasha = new Student("Natasha", 20);
        Student albert = new Student("Albert", 20);

        Group math = Group.newGroup(MATHEMATICS);
        math.addStudent(dima, 4.8);
        math.addStudent(nikita, 4.0);
        math.addStudent(natasha, 5.0);
        math.addStudent(albert, 2.0);

        Group rus = Group.newGroup(RUSSIAN);
        rus.addStudent(dima, 5);
        rus.addStudent(nikita, 4);
        rus.addStudent(sasha, 5);

        Group phisic = Group.newGroup(PHYSICS);
        phisic.addStudent(albert, 3.2);
        phisic.addStudent(nikita, 5.0);
        phisic.addStudent(sasha, 4.2);

        //  Group.printAll();
        Group.searchStudent(nikita);
        Group.searchStudent(sasha);
        Group.searchStudent(albert);
    }
}
