package com.epam.SE7.task1conc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Vesdet on 31.10.2015.
 */
public class Transaction implements Callable {
    private static List<Account> accounts = null;
    private static Lock lock = new ReentrantLock();
    private Scanner in;
    private int from;
    private int to;
    private int amount;

    public static void addAccounts(Collection<Account> collection) {
        accounts = new ArrayList<>();
        accounts.addAll(collection);
    }

    public Transaction(Scanner in) {
        this.in = in;
    }

    private boolean readTransaction() {
        try {
            lock.lock();
            if (in.hasNextInt()) from = in.nextInt();
            else return false;
            to = in.nextInt();
            amount = in.nextInt();
        } finally {
            lock.unlock();
        }
        return true;
    }

    private Account findAccount(int id) {
        if (accounts == null) return null;
        for (Account x : accounts) {
            if (x.getId() == id) return x;
        }
        return null;
    }

    private void doTransaction() {
        try {
            lock.lock();
            findAccount(from).withdraw(amount);
            findAccount(to).deposit(amount);

        } catch (NullPointerException e) {
            System.err.println("Account don't found.");
        } finally {
            lock.unlock();
        }
    }

    public static void printInfo() {
        for (Account x : accounts) {
            System.out.println("Account ID: " + x.getId() + "   Balance: " + x.getBalance());
        }
    }

    @Override
    public Integer call() {
        while (readTransaction()) {
            doTransaction();
            System.out.println("From: " + from + "  to: " + to + "  amount: " + amount);
        }
        return 1;
    }
}
