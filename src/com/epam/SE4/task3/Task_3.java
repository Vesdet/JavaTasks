package com.epam.SE4.task3;

import java.io.File;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class Task_3 {
    public static void main(String[] args) {
        File inputFile = new File("src\\com\\epam\\SE4\\task3\\input.txt");
        File outputFile = new File("src\\com\\epam\\SE4\\task3\\output.txt");
        ConverterUTF8ToUTF16 need = new ConverterUTF8ToUTF16(inputFile, outputFile);

        need.readFile();
        need.writeFile();
        need.printText();
    }
}
