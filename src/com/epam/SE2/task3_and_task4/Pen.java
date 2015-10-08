package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public final class Pen extends WritingItem {
    private String refill;

    public Pen(int cost, double finePoint, String color, String refill){
        super("Pen", cost, finePoint, color);
        this.refill = refill;
    }

    public String getRefill() {
        return refill;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("    Refill:" + refill);
    }
}
