package com.epam.SE2.task3_and_task4;

import java.util.Comparator;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class ByTitleComporator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
