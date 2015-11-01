package com.epam.SE7.task1synch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Vesdet on 31.10.2015.
 */
public class Transaction implements Runnable {
    private static List<Account> accounts = null;
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
        synchronized (in) {
            if (in.hasNextInt()) from = in.nextInt();
            else return false;
            to = in.nextInt();
            amount = in.nextInt();
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
            synchronized (findAccount(from)) {
                findAccount(from).withdraw(amount);
            }
            synchronized (findAccount(to)) {
                findAccount(to).deposit(amount);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void printInfo() {
        for (Account x: accounts) {
            System.out.println("Account ID: " + x.getId() + "   Balance: " + x.getBalance());
        }
    }

    @Override
    public void run() {
        while (readTransaction()) {
            doTransaction();
            System.out.println("From: " + from + "  to: " + to + "  amount: " + amount);
        }
    }
}
