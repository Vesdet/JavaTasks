package com.epam.SE2.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class Person {
    private String name;
    private Map<String, Item> things = new HashMap<>();

    public Person(String name) {
        this.name = name;
    }

    public void addItem(String itemName, int itemCost, int itemQuantity) {
        Item item = new Item(itemName, itemCost, itemQuantity);
        things.put(item.getName(), item);
    }

    public void totalCost() {
        int totalCost = 0;
        for (String i : things.keySet()) {
            totalCost += things.get(i).getCost() * things.get(i).getQuantity();
        }
        System.out.println("Total cost of things of " + name + ": " + totalCost);
    }

    @Override
    public String toString() {
        String x = "  ";
        for (String i : things.keySet()) {
            x += things.get(i).getName() + "    Cost: " + things.get(i).getCost() + "    Quantity: " + things.get(i).getQuantity() + "\n  ";
        }
        return "Person. " + "Name= " + name + "\nThings:\n" + x;
    }
}
