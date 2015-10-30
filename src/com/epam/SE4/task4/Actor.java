package com.epam.SE4.task4;

import java.io.Serializable;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class Actor implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public Actor(String name) {
        this.name = name;
    }

    public String info() {
        return name + '\n';
    }

    @Override
    public String toString() {
        return "Actor{" +
                " Name='" + name + "\'" +
                '}';
    }
}
