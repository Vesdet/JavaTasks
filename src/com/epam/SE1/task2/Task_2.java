package com.epam.SE1.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Vesdet on 01.10.2015.
 */
public class Task_2 {
    public static void main(String[] args) {
        double num = 0;
        int i = 0;

        double a;
        try (Scanner in = new Scanner(System.in)) {
            num = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input, try again.");
            return;
        }
        do {
            i++;
            a = 1.0 / (Math.pow((i + 1), 2));
            System.out.print("a"+i+"="+a+"\n");
        } while (a >= num);
        System.out.print("N="+i);
    }
}
