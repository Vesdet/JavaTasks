package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public final class Album extends PaperItem {
    private int paperDensity;
    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPaperDensity() {

        return paperDensity;
    }

    public Album(int cost, String format, int numberOfPages, int paperDensity){
        super("Album",cost,format);
        this.numberOfPages = numberOfPages;
        this.paperDensity = paperDensity;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("    Number of pages:" + numberOfPages + "   PaperDensity:" + paperDensity + "g/m2");
    }
}
