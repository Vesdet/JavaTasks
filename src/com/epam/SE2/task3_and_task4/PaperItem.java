package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class PaperItem extends Item {
    private String format;

    public PaperItem(String name, int cost, String format) {
        super(name, "Paper", cost);
        this.format = format;
    }
    public String getFormat() {
        return format;
    }

    @Override
    public void print(){
        super.print();
        System.out.print("    Format:" + format);
    }
}
