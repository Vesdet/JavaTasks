package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class WritingItem extends Item {
    private String color;
    private double finePoint;

    public WritingItem(String name, int cost, double finePoint, String color) {
        super(name, "Writing", cost);
        this.finePoint = finePoint;
        this.color = color;
    }

    public double getFinePoint() {
        return finePoint;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print(){
        super.print();
        System.out.print("    Color:" + color + " FinePoint:" + finePoint);
    }
}
