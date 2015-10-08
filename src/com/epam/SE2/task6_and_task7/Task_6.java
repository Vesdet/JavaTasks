package com.epam.SE2.task6_and_task7;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class Task_6 {
    public static void main(String[] args) {
        AtomicSubmarine shinima = new AtomicSubmarine();

        shinima.startSwim();
        System.out.println(shinima);
        shinima.endSwim();
        System.out.println(shinima);
    }
}
