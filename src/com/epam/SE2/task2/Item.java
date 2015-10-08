package com.epam.SE2.task2;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class Item {
    private String name;
    private int cost;
    private int quantity;

    public Item ( String name, int cost, int quantity){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
}
