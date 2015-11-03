package com.epam.SE7.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vesdet on 03.11.2015.
 */
public class SharedResource {
    private List<Integer> list;

    public SharedResource() {
        list = new ArrayList<>();
    }

    public void setElement(Integer element) {
        list.add(element);
    }

    public Integer getElement() {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

}

