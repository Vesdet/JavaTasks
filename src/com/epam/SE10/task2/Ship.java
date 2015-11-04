package com.epam.SE10.task2;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class Ship {
    private String name;
    private String classShip;
    private int launched;

    public Ship(String name, String classShip, int launched) {
        this.name = name;
        this.classShip = classShip;
        this.launched = launched;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", classShip='" + classShip + '\'' +
                ", launched=" + launched +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getClassShip() {
        return classShip;
    }

    public int getLaunched() {
        return launched;
    }
}
