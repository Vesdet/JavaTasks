package com.epam.SE7.task1synch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class Task_1 {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new Account(1, 5000));
        list.add(new Account(2, 5000));
        list.add(new Account(3, 5000));
        list.add(new Account(4, 5000));

        Transaction.addAccounts(list);

        File file = new File("src\\com\\epam\\SE7\\task1synch\\transactions.txt");
        try (Scanner in = new Scanner(file)) {
            List<Thread> threads = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                threads.add(new Thread(new Transaction(in)));
            }

            for (Thread x : threads) x.start();

            try {
                for (Thread x : threads) {
                    x.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Transaction.printInfo();
    }
}
