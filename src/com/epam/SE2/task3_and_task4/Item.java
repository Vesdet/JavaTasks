package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public abstract class Item implements Comparable<Item> {
    private String name;
    private String type;
    private int cost;

    public Item(String name, String type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Item o) {
        return cost - o.getCost();
    }

    public void print(){
        System.out.print(name + ".  Type:" + type + "   Cost:" + cost);
    }
}
