package com.epam.SE2.task1;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class Task_1 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen("helium", "black", "Cross");
        System.out.println(pen1);
        System.out.println(pen2);

        System.out.println("Equals = " + pen1.equals(pen2));
        System.out.println("==  = " + (pen1 == pen2));
        System.out.println("HashCode(pen1) = "+ pen1.hashCode());
        System.out.println("HashCode(pen2) = "+pen2.hashCode());
    }
}
