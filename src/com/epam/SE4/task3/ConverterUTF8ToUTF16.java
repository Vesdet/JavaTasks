package com.epam.SE4.task3;

import java.io.*;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class ConverterUTF8ToUTF16 {
    private File inputFile;
    private File outputFile;
    private String text;

    public ConverterUTF8ToUTF16(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public void readFile() {
        try (InputStream fileInputStream = new FileInputStream(inputFile);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            int sym;
            StringBuilder tmp = new StringBuilder();
            while (true) {
                sym = bufferedReader.read();
                if (sym == -1) break;
                tmp.append((char) sym);
            }
            text = tmp.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile() {
        try (OutputStream fileOutputStream = new FileOutputStream(outputFile);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-16");
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
            bufferedWriter.write(text, 0, text.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printText() {
        System.out.println(text);
    }
}
