package com.epam.SE10.task2;

/**
 * Created by Vesdet on 04.11.2015.
 */
public class ShipClass{
    private String name;
    private String type;
    private String country;
    private int numGuns;
    private int bore;
    private int displacement;

    public ShipClass(String name, String type, String country, int numGuns, int bore, int displacement) {
        this.name = name;
        this.type = type;
        this.country = country;
        this.numGuns = numGuns;
        this.bore = bore;
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "ShipClass{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", numGuns=" + numGuns +
                ", bore=" + bore +
                ", displacement=" + displacement +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public int getNumGuns() {
        return numGuns;
    }

    public int getBore() {
        return bore;
    }

    public int getDisplacement() {
        return displacement;
    }
}
