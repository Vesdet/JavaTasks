package com.epam.SE4.task1_and_task2;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vesdet on 29.10.2015.
 */
public class Task_1 {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\com\\epam\\SE4\\task1_and_task2\\output.txt");
        WordsCounterSymbol need = new WordsCounterSymbol("src\\com\\epam\\SE4\\task1_and_task2\\example.txt");
        need.printAll();
       // need.printToFileWithWriter(file);

        WordsCounterByte need2 = new WordsCounterByte("src\\com\\epam\\SE4\\task1_and_task2\\example.txt");
        need2.printAll();
        need2.printToFileWithStream(file);
    }
}
