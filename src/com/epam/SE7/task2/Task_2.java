package com.epam.SE7.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vesdet on 03.11.2015.
 */
public class Task_2 {
    public static void main(String[] args) {
        String path = "com.epam.SE7.task2.prop";

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            threads.add(new Thread(new GetProperties(path)));
        }

        for (Thread x : threads) x.start();

        try {
            for (Thread x : threads) {
                x.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
