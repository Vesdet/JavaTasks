package com.epam.SE2.task3_and_task4;

import java.util.Comparator;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class ByCostAndTitleComporator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        int x = o1.getName().compareTo(o2.getName());
        return x!=0 ? x : Integer.compare(o1.getCost(), o2.getCost());
    }
}
