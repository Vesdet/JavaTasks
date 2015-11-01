package com.epam.SE7.task1conc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Vesdet on 31.10.2015.
 */
public class Account {
    private int id;
    private AtomicInteger balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = new AtomicInteger(balance);
    }

    public void deposit(int amount) {
        balance.addAndGet(amount);
    }

    public void withdraw(int amount) {
        balance.addAndGet(-1 * amount);
    }


    public int getBalance() {
        return balance.get();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
