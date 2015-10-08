package com.epam.SE2.task2;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class Task_2 {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya");
        person1.addItem("Pen", 25, 3);
        person1.addItem("Pencel", 6, 5);
        person1.addItem("Scissors", 250, 1);
        System.out.println(person1);
        person1.totalCost();
    }
}
