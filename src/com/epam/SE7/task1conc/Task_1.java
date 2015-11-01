package com.epam.SE7.task1conc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

            List<Future<Integer>> futures = new ArrayList<>();

            ExecutorService es = Executors.newCachedThreadPool();
            for (int i = 0; i < 3; i++) {
                futures.add(es.submit(new Transaction(in)));
            }
            es.shutdown();
            for (Future<Integer> f : futures) {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Transaction.printInfo();
    }
}
