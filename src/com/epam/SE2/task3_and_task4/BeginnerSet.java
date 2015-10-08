package com.epam.SE2.task3_and_task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class BeginnerSet {
    public static List<Item> things = new ArrayList<>();

    static {
        things.add(new Pen(50, 0.5, "black", "helium"));
        things.add(new Pen(20, 0.7, "blue", "ballpoint"));
        things.add(new Pencil(10, 1.0, "grey", "2H"));
        things.add(new Notepad(200, "A6", 45));
        things.add(new Album(345, "A4", 120, 80));
        things.add(new Notepad(90, "A7", 30));
    }

    public static void printAll() {

        for (Item i : things) {
            i.print();
        }
    }

    public static void sortedByCost(){
        System.out.println("Sorted by Cost");
        Collections.sort(things);
    }
    public static void sortedByTitle(){
        System.out.println("Sorted by Title");
        Collections.sort(things, new ByTitleComporator());
    }

    public static void sortedByCostAndTitle(){
        System.out.println("Sorted be Cost and Title");
        Collections.sort(things, new ByCostAndTitleComporator());
    }
}
