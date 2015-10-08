package com.epam.SE2.task3_and_task4;

/**
 * Created by Vesdet on 08.10.2015.
 */
public class Task_3 {
    public static void main(String[] args) {
        /*Pen pen = new Pen(25, 0.5, "blue", "ballpoint");
        pen.print();

        Pencil pencil = new Pencil(8, 0.3, "red", "2B");
        pencil.print();

        Notepad notepad = new Notepad(150, "A6", 80);
        notepad.print();

        Album album = new Album(200, "A4", 100, 80);
        album.print();*/

        BeginnerSet lalka = new BeginnerSet();
        lalka.printAll();

        lalka.sortedByCost();
        lalka.printAll();

        lalka.sortedByTitle();
        lalka.printAll();

        lalka.sortedByCostAndTitle();
        lalka.printAll();
    }
}
