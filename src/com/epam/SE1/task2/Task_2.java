package com.epam.SE1.task2;
import java.util.Scanner;

/**
 * Created by Vesdet on 01.10.2015.
 */
public class Task_2 {
    public static void main(String[] args) {
        double e;
        int i = 0;

        double a;
        Scanner in = new Scanner(System.in);
        e = in.nextDouble();
        do {
            i++;
            a = 1.0 / (Math.pow((i + 1), 2));
            System.out.print("a"+i+"="+a+"\n");
        } while (a >= e);
        System.out.print("N="+i);
    }
}
