package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public final class Notepad extends PaperItem {
    private int numberOfPages;

    public Notepad(int cost, String format, int numberOfPages) {
        super("Notepad", cost, format);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("    Number of pages:" + numberOfPages);
    }
}
