package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public final class Pencil extends WritingItem {
    private String hardness;

    public Pencil(int cost, double finePoint, String color, String hardness){
        super("Pencil",cost,finePoint,color);
        this.hardness = hardness;
    }

    public String getHardness() {
        return hardness;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("    Hardness:" + hardness);
    }
}
